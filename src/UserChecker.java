import java.util.List;

public class UserChecker {

    static int sumOfAge(User u) {
        int n = u.getAge();
        int sum = 0;

        do {
            sum += (n % 10);
            n /= 10;
        } while (n > 0);

        return sum;
    }


    static User greatestSum(List<User> list) {
        User user = list.get(0);


        for (User u : list) {
            if (sumOfAge(u) > sumOfAge(user)) {
                user = u;
            }
        }

        return user;
    }


    static void ageSeparator(List<User> list, List<User> younger, List<User> older) {
        for (User u : list) {
            if (u.getAge() >= 50) {
                older.add(u);
            } else {
                younger.add(u);
            }
        }


    }


    static void babkenFinder(List<User> list) {
        for (User u : list) {
            if (u.getName().equals("Babken")) {
                System.out.println("We found Babken");
                System.out.println("At index: " + list.indexOf(u));
                System.out.println(u);
                return;

            }
        }
        System.out.println("There is no Babken in the list");
    }


}
