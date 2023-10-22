import java.util.Scanner;
import java.util.regex.*;

public class Registration {


    public static void register(){
        System.out.print("UserID : ");
        Scanner c_ID = new Scanner(System.in);
        String customerID = c_ID.nextLine();

        System.out.print("Password : ");
        Scanner pass_word = new Scanner(System.in);
        String password = pass_word.nextLine();
        if(!isAlphaNumeric(customerID) || !isAlphaNumeric(password)){
            System.out.println("Enter the username and password in alphaNumeric keywords..!");
            register();
        }

    }




    public static void main(String[] args) {
        register();
        System.out.println("-----------------------\nSuccessfully Signed up\n-----------------------");
    }
}
