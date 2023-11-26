package SecondAccount;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();

    Client clients = new Client(100,"Nurudeen","+23471232");
        accounts.add(new Account(1,1290, 1.48, clients));
//        accounts.add(new Account(2,9290, 2.3, clients));

        accounts.get(0).withdraw(2000);
        accounts.get(0).withdraw(1000);

        accounts.get(0).deposit(2000);
        accounts.get(0).deposit(1000);



        System.out.println(accounts.get(0));
        for (Account account: accounts) {
            System.out.printf("Their " + clients.getName() +" your Account : "+ account.getId() + ":" );
            System.out.println("W:" + account.countTransactions('W'));
            System.out.println("D: " + account.countTransactions('D'));
        }
    }
}
