import java.nio.file.attribute.UserPrincipal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // this is lesson Reassign value

        User ali = new User();
        ali.name = "Ali";
        ali.surname = "Ali";
        ali.age = 23;

        String name = String.format("name: %s surname: %s and age: %d", ali.name,ali.surname,ali.age);

        System.out.println(name);

        User alibek = new User();
        alibek.name = "Alibek";
        alibek.surname = "Alijonov";
        alibek.age =28;

        String strAlibek = String.format("name: %s surname: %s and age: %d", alibek.name,alibek.surname,alibek.age);

        System.out.println(strAlibek);





    }
}

