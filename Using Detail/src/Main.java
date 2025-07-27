import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // this is lesson using detail

        /*int age = getAge();
        System.out.println("Your age is: " + age);*/

        Object [] infoPerson = getInfoPerson();

        System.out.println(Arrays.toString(infoPerson));

        String name = infoPerson[0].toString();
        String surname = infoPerson[1].toString();
        int age = Integer.parseInt(infoPerson[2].toString());

        System.out.println("Name: " + name + "\nSurname: " + surname + "\nAge: " + age);


    }

    private static int getAge() {

        System.out.print("Enter your age: ");

        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        return age;

    }


    public static Object[] getInfoPerson() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.next();

        System.out.print("Enter surname: ");
        String surname = input.next();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        Object [] infoPerson = {name, surname, age};
        return infoPerson;
    }
}