package interfaces;

import classes.Branch;

import java.util.ArrayList;

public interface IBank {
    boolean addBranch(String branchName);
    boolean addCustomer(String branchName, String customerName, double initialTransaction);
    boolean addCustomerTransaction(String branchName, String customerName, double transaction);

}
