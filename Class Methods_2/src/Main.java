//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // this is lesson class methods 2

        User user = new User();
        user.name = "James";
        user.surname = "Smith";
        user.age = 25;
        user.isEmployee = false;

        System.out.println("user = " + user.toString());
        System.out.println("userToUpperCase = " + user.toUpperCase());
        System.out.println("userAge summa number = " + user.summaAgeNumber());
        System.out.println("user is Employee = " + user.checkIsEmployee());

    }
}

