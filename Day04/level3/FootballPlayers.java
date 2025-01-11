import java.util.Random;

public class FootballPlayers {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random random = new Random();

        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150; // Random heights between 150 and 250
			                                        // this is a formula=> (random. nextInt(max-min+1)+min)
        }

        int sum = findSum(heights);
        int mean = sum / heights.length;
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Heights of players: ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println("\nSum: " + sum);
        System.out.println("Mean: " + mean);
        System.out.println("Shortest: " + shortest);
        System.out.println("Tallest: " + tallest);
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
