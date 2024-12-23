public class SecondHighestCGPA {
    public static void main(String[] args) {
        // Array of CGPAs
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        // Variables to store highest and second-highest CGPA
        double highest = 0;
        double secondHighest = 0;

        // Loop to find the highest and second-highest CGPA
        for (double score : cgpa) {
            if (score > highest) {
                // Update second-highest before changing highest
                secondHighest = highest;
                highest = score;
            } else if (score > secondHighest && score < highest) {
                // Update second-highest only
                secondHighest = score;
            }
        }

        // Output the result
        System.out.println("The second-highest CGPA is: " + secondHighest);
    }
}
