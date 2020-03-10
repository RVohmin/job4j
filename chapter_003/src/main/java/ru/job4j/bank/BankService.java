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
        if (findByPassport(passport) != null) {
            users.get(findByPassport(passport)).add(account);
        }
    }

    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(e -> e.getPassport().equals(passport))
                .findFirst().orElse(null);
    }

    public Account findByRequisite(String passport, String requisite) {
        List<Account> accList = users.get(findByPassport(passport));
        return accList.stream().filter(e -> e.getRequisite().equals(requisite)).findFirst().orElse(null);
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String outPassport, String outRequisite,
                                 double amount) {
        boolean rsl = true;
        Account account = findByRequisite(srcPassport, srcRequisite);
        Account outAccount = findByRequisite(outPassport, outRequisite);
        if (account == null || outAccount == null || account.getBalance() < amount) {
            rsl = false;
        }
        assert account != null;
        account.setBalance(account.getBalance() - amount); // списание с отправителя
        assert outAccount != null;
        outAccount.setBalance(outAccount.getBalance() + amount); // зачисление на счет получателя
        return rsl;
    }
}
