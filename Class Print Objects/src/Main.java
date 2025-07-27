import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // this is lesson class in print objects


        String userName = getUser().name;
        String userSurName = getUser().surname;
        int userAge = getUser().age;

        System.out.println("User Name: " + userName);
        System.out.println("User SurName: " + userSurName);
        System.out.println("User Age: " + userAge);

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

