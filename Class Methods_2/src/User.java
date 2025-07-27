public class User{

    String name;
    String surname;
    int age;


    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }

    public String toUpperCase() {
        return name.toUpperCase();
    }

    public int summaAgeNumber() {
        int summa = 0;

        while (age != 0){
            summa += age % 10;
            age /= 10;
        }
        return summa;
    }
}
