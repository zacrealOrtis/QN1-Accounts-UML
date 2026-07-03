
package isaacwandyakaortis.qn1.accounts.uml;

    public abstract class Accounts implements Statement {

    protected String accountNo;
    protected double balance;

    public Accounts (String accountNo, double opening) {
        this.accountNo = accountNo;
        this.balance = opening;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public abstract boolean withdraw(double amount);

    public double getBalance() {
        return balance;
    }

    @Override
    public String generateStatement() {
        return "Account Number: " + accountNo +
               "\nCurrent Balance: " + balance;
    }
}