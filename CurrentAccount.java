
package isaacwandyakaortis.qn1.accounts.uml;

public class CurrentAccount extends Accounts {
    private double overdraft;

    public CurrentAccount(String accountNo,
                          double opening,
                          double overdraft) {

        super(accountNo, opening);
        this.overdraft = overdraft;
    }

    @Override
    public boolean withdraw(double amount) {

        if (balance - amount >= -overdraft) {
            balance -= amount;
            return true;
        }

        return false;
    }
}
