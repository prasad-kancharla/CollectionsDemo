package io.skillsquad.list;

import javax.swing.table.TableRowSorter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {


        Student s1 = new Student(1, "Ash", 21);
        Student s2 = new Student(2, "Ram", 22);
        Student s3 = new Student(3, "Max", 20);

        HashSet<Student> studentHashSet = new HashSet<>();
        studentHashSet.add(s1);
        studentHashSet.add(s2);
        studentHashSet.add(s3);

        System.out.println("Is studentHashSet empty - " + studentHashSet.isEmpty());
        System.out.println("Size of hash set is - " + studentHashSet.size());

        System.out.println(" ");

        // Iterate through set using forEach loop
        for (Student s : studentHashSet) {
            System.out.print(s.getName() + " ");
        }
        System.out.println(" ");
        studentHashSet.remove(s2);

        // Iterate through set using forEach loop
        for (Student s : studentHashSet) {
            System.out.print(s.getName() + " ");
        }
        System.out.println(" ");
        System.out.println(" ");

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Jenny");
        linkedHashSet.add("Emma");
        linkedHashSet.add("Kate");

        // Iterate through set using iterator
        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println(" ");
        System.out.println(" ");

        TreeSet<Integer> integers = new TreeSet<>();
        integers.add(248);
        integers.add(531);
        integers.add(0);
        integers.add(-6);
        integers.add(303);

        integers.forEach(i -> System.out.print(i + " "));
    }
}
