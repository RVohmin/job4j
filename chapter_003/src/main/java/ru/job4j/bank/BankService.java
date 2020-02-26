package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        for (Map.Entry<User, List<Account>> entry : users.entrySet()) {
            User key = entry.getKey();
            List<Account> value = entry.getValue();
            if (key.equals(findByPassport(passport))) {
                value.add(account);
                break;
            }
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        for (Map.Entry<User, List<Account>> entry : users.entrySet()) {
            User key = entry.getKey();
            List<Account> value = entry.getValue();
            if (user.equals(key)) {
                for (Account acc : value) {
                    if (acc.getRequisite().equals(requisite)) {
                        return acc;
                    }
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String outPassport, String outRequisite,
                                 double amount) {
        Account account = findByRequisite(srcPassport, srcRequisite);
        Account outAccount = findByRequisite(outPassport, outRequisite);
        if (account == null || outAccount == null || account.getBalance() < amount) {
            return false;
        }
        account.setBalance(account.getBalance() - amount); // списание с отправителя
        outAccount.setBalance(outAccount.getBalance() + amount); // зачисление на счет получателя
        return true;
    }
}
