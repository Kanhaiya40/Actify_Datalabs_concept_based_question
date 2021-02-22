package java_questions_1;

/**
 * Entity Class
 */
public class NameSorter implements Comparable{

    private int id;
    private String name;

    public NameSorter(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        NameSorter prevTech = (NameSorter) o;
        int prevLength = prevTech.name.length();
        int afterLength = this.name.length();

        return Integer.compare(prevLength, afterLength);
    }
}
