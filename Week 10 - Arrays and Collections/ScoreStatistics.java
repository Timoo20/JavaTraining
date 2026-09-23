public class ScoreStatistics {
    public static void main(String[] args) {
        int[] scores = {70, 85, 90, 60, 75};

        int total = 0;
        int highest = scores[0];
        int lowest = scores[0];

        for (int score : scores) {
            total += score;
            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
        }

        double average = (double) total / scores.length;

        System.out.println("Average score: " + average);
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
    }
}
