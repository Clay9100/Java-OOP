public class User{

    // create fields

    String name;
    String surname;
    int age;

    public void infoUser() {

        String str = String.format("name: %s, surname: %s, age: %d", name, surname, age);
        System.out.println(str);
    }



}
