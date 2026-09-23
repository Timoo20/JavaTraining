import java.util.ArrayList;

public class ClassmatesList {
    public static void main(String[] args) {
        ArrayList<String> classmates = new ArrayList<>();

        classmates.add("Brian Otieno");
        classmates.add("Faith Achieng");
        classmates.add("Kevin Mutua");
        classmates.add("Mercy Wanjiru");
        classmates.add("Peter Kamau");

        classmates.remove("Kevin Mutua");

        System.out.println("Classmates: " + classmates);
        System.out.println("Number of classmates: " + classmates.size());
    }
}
