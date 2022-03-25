import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Scanner;

public class login {
    public void getLogin() {
        HashMap<Integer, Integer> data = new HashMap<>();
        Scanner input = new Scanner(System.in);
        backEnd access = new backEnd();

        int x = 1;
        do {
            try {
                data.put(1234567, 1234);
                data.put(7654321, 4321);

                System.out.println("The ATM System.");
                System.out.print("Enter your ID: ");
                int ID = input.nextInt();
                access.setID(ID);
                System.out.print("Enter your Password: ");
                int password = input.nextInt();
                access.setPassword(password);

                for (Entry<Integer, Integer> entry : data.entrySet()) {
                    // The for loop allow us to access each key and value that has been put into
                    // data.
                    // The Entry class here is used so that we can recieve key and value together.
                    if (entry.getKey() == access.getID() && entry.getValue() == access.getPassword()) {
                        System.out.println("You have gained access to the ATM System.");
                        // A new Funtion needs to appear here to avoid the error.
                        // The new Function will be the Continuation of this program.
                    }
                }
            } catch (Exception e) {
                // Appears when a non integer data is put into the system.
                System.out.println("Wrong input.");
                x = 2;
            }
            input.close();

        } while (x == 1);

        System.out.println("goodbye");
    }
}
