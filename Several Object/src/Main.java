//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // this is lesson several objects

        // create objects more

        User user1 = new User();
        user1.name = "Ali";
        user1.surname = "Aliyev";
        user1.age = 23;

        System.out.println(user1.name + " " +  user1.surname + " " + user1.age);

        User user2 = new User();
        user2.name = "Alibek";
        user2.surname = "Alijonov";
        user2.age = 25;

        System.out.println(user2.name + " " +  user2.surname + " " + user2.age);


        User user3 = new User();
        user3.name = "Asadbek";
        user3.surname = "Asadov";
        user3.age = 35;

        System.out.println(user3.name + " " +  user3.surname + " " + user3.age);


        System.out.println("------Change object user3 name------");

        user3.name = "Axrorbek";

        System.out.println(user3.name + " " +  user3.surname + " " + user3.age);




    }
}