import java.util.Scanner;

class AccountTest {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Account myAccount = new Account();

        System.out.printf("Initial name: %s%n", myAccount.getName());

        System.out.println("Please enter the name:");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();

        System.out.printf("Name in object myAccount: %s%n", myAccount.getName());
        input.close();

    }

}