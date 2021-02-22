package java_questions_1;


import java.util.TreeSet;

/**
 * Sort the below list based on name string length using java8
 * [{id : 1, name : “JAVA”},{id:2,name : ”C”,{id:5,name:”C++”},{id:3,name:”JS”},{id:4,name:”Angular”}]
 */
public class Main {

    public static void main(String[] args) {
        TreeSet<NameSorter> list = new TreeSet<>();
        list.add(new NameSorter(1, "Java"));
        list.add(new NameSorter(2, "C"));
        list.add(new NameSorter(5, "C++"));
        list.add(new NameSorter(3, "JS"));
        list.add(new NameSorter(4, "Angular"));
        System.out.println(list);
    }
}
