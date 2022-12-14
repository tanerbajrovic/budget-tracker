package ba.unsa.etf.rpr.income;

public class Income {

    private int incomeId;
    private int accountId; // FK
    private double amount;
    // private Date date;

    public int getIncomeId() {
        return incomeId;
    }

    public int getAccountId() {
        return accountId;
    }

    public double getAmount() {
        return amount;
    }

    public void setIncomeId(int incomeId) {
        this.incomeId = incomeId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
