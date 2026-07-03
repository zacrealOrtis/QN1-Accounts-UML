
package isaacwandyakaortis.qn1.accounts.uml;

public class QN1AccountsUML {

   

    public static void main(String[] args) {

        SavingsAccount s =
                new SavingsAccount("SA001", 1000, 5);

        CurrentAccount c =
                new CurrentAccount("CA001", 500, 300);

        Customers customer = new Customers("John");

        customer.addAccount(s);
        customer.addAccount(c);

        s.deposit(500);
        s.withdraw(200);
        s.addInterest();

        c.withdraw(700);

        System.out.println(s.generateStatement());
        System.out.println();

        System.out.println(c.generateStatement());
        System.out.println();

        System.out.println("Customer Total Worth: "
                + customer.totalWorth());
    }
}
