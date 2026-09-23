import java.util.Arrays;

public class SortAndSearch {
    public static void main(String[] args) {
        int[] scores = {70, 85, 90, 60, 75};

        Arrays.sort(scores);
        System.out.println("Sorted scores: " + Arrays.toString(scores));

        int position = Arrays.binarySearch(scores, 85);
        System.out.println("85 is found at position: " + position);
    }
}
