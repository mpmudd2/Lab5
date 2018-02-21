import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;
    private static final double INTEREST_RATE = .5;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        accountType = accountCategory;
        ownerName = name;
        interestRate = INTEREST_RATE;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    public void setAccountType(final BankAccountType toSet) {
        accountType = toSet;
    }

    public void setAccountBalance(final double toSet) {
        accountBalance = toSet;
    }

    public void setOwnerName(final String toSet) {
        ownerName = toSet;
    }

    public void setInterestRate(final double toSet) {
        interestRate = toSet;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankAccountType getAccountType() {
        return accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getInterestEarned() {
        return interestEarned;
    }

}