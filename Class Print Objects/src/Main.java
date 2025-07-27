import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // this is lesson class in print objects


        User userName = getUser();

        /*System.out.println("User Name: " + userName.name);
        System.out.println("User Surname: " + userName.surname);
        System.out.println("User Age: " + userName.age);*/

        String surname = Arrays.toString(userName.name.split(" "));
        System.out.println(surname);


    }

    public static User getUser() {
        User user = new User();

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        user.name = input.nextLine();
        System.out.print("Please enter your surname: ");
        user.surname = input.nextLine();
        System.out.print("Please enter your age: ");
        user.age = input.nextInt();


        return user;
    }
}

