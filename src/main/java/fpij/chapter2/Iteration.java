package fpij.chapter2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by rafal.wawryk on 20/02/16.
 */
public class Iteration {

    final static List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

    private void loopByIndex() {

    }

    private void loopForEach() {

    }

    public static void main(String[] args) {

        System.out.println("\ngood old indexed iteration over array");
        for (int i = 0; i < friends.size(); i++) {
            System.out.println(friends.get(i));
        }

        System.out.println("\nnew iteration over array");
        for (String name : friends) {
            System.out.println(name);
        }

        System.out.println("\nfor-each using Consumer");
        friends.forEach(new Consumer<String>() {
            public void accept(String name) {
                System.out.println(name);
            }
        });

        System.out.println("\nlambda expression");
        friends.forEach((final String name) -> System.out.println(name));

        System.out.println("\nlambda expression with inferred types");
        friends.forEach((name) -> System.out.println(name));

        System.out.println("\nlambda without parentheses around the single parameter");
        friends.forEach(name -> System.out.println(name));

        System.out.println("\nmethod reference");
        friends.forEach(System.out::println);
    }
}
