package ba.unsa.etf.rpr.expense;

/**
 * Expense class for storing information about account, amount
 * spent and date.
 * @author Taner Bajrovic
 */
public class Expense {

    private int expenseId;
    private int accountId; // FK
    private double amount;
    // private Date date;


    public int getExpenseId() {
        return expenseId;
    }

    public int getAccountId() {
        return accountId;
    }

    public double getAmount() {
        return amount;
    }

    public void setExpenseId(int expenseId) {
        this.expenseId = expenseId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
