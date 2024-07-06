package Collection;

import java.util.HashSet;

public class HashSetex {
	public static void main(String[] args) {
        HashSet<String> a = new HashSet<>();

        a.add("Apple");
        a.add("Banana");
        a.add("Mango");
        a.add("Orange");

        System.out.println("HashSet: " + a);

        boolean containsMango = a.contains("Mango");
        System.out.println("Contains 'Mango': " + containsMango);

        a.remove("Banana");
        System.out.println("HashSet after removing 'Banana': " + a);

        System.out.println("Iterating over the HashSet:");
        for (String fruit : a) {
            System.out.println(fruit);
        }

      int size = a.size();
        System.out.println("Size of the HashSet: " + size);

      a.clear();
        System.out.println("HashSet after clearing all elements: " + a);
    }
}

