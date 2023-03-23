package application;

import entities.Account;
import entities.BusinessAccount;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //Upcasting
        Account acc1 = bacc; //é possível atribuir uma bussinessAccount a uma Account, pq uma B.A é uma (relação proveniente da herança) A.
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0)
    }
}