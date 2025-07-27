import java.nio.file.attribute.UserPrincipal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // this is lesson Reassign value

        User user = new User();
        user.name = "Ali";
        user.surname = "Ali";
        user.age = 23;

        String name = String.format("name: %s surname: %s and age: %d", user.name,user.surname,user.age);

        System.out.println(name);




    }
}

