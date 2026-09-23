public class BuggyAverage {
    public static void main(String[] args) {
        int[] scores = {70, 85, 90, 60};
        int total = 0;
        for (int i = 0; i <= scores.length; i++) {
            total = total + scores[i];
        }
        int average = total / scores.length
        System.out.println("Average score is: " average);
    }
}
