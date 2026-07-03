
package isaacwandyakaortis.qn1.accounts.uml;

    import java.util.ArrayList;
import java.util.List;

public class Customers {
    


    private String name;
    private List<Accounts> accounts;

    public Customers(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    public void addAccount(Accounts a) {
        accounts.add(a);
    }

    public double totalWorth() {

        double total = 0;

        for (Accounts acc : accounts) {
            total += acc.getBalance();
        }

        return total;
    }
}
 
