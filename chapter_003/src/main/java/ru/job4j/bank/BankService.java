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
        users.get(findByPassport(passport)).add(account);
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
        List<Account> accList = users.get(findByPassport(passport));
        for (Account account : accList) {
            if (account.getRequisite().equals(requisite)) {
                return account;
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
