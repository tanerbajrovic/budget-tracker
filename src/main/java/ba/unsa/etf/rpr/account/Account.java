package ba.unsa.etf.rpr.account;

import java.util.Objects;

/**
 * Account for storing current balance, budget specifications
 * and the date of the last balance update.
 * @author Taner Bajrovic
 */
public class Account {

    private int accountId;
    private double currentBalance;
    private double monthlyBudget;
    private double yearlyBudget;
    // private Date lastUpdate;

    public int getAccountId() {
        return accountId;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public double getMonthlyBudget() {
        return monthlyBudget;
    }

    public double getYearlyBudget() {
        return yearlyBudget;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public void setMonthlyBudget(double monthlyBudget) {
        this.monthlyBudget = monthlyBudget;
    }

    public void setYearlyBudget(double yearlyBudget) {
        this.yearlyBudget = yearlyBudget;
    }

}
