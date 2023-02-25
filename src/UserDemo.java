import java.util.ArrayList;
import java.util.List;

public class UserDemo {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        List<User> old = new ArrayList<>();
        List<User> young = new ArrayList<>();

        users.add(new User("Roman", 24));
        users.add(new User("Tigran", 45));
        users.add(new User("Hayk", 60));
        users.add(new User("Babken", 63));
        users.add(new User("Armen", 19));
        users.add(new User("Hovo", 59));
        users.add(new User("Hrach", 31));
        users.add(new User("Mikael", 50));
        users.add(new User("Ashot", 21));
        users.add(new User("Grig", 16));
        users.add(new User("Emil", 32));


        System.out.println("User with greatest sum of digits in age: ");
        System.out.println(UserChecker.greatestSum(users));

        System.out.println("----------------------------");

        UserChecker.ageSeparator(users, young, old);

        System.out.println("Users younger than 50 : ");
        for (User u : young) {
            System.out.println(u);
        }
        System.out.println("----------------------------");

        System.out.println("Users older than 50 : ");
        for (User u : old) {
            System.out.println(u);
        }

        System.out.println("----------------------------");

        UserChecker.babkenFinder(users);
    }
}
