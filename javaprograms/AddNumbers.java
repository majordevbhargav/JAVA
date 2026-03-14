public class AddNumbers {
    public static void main(String[] args) {
        // Check if two arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide two numbers as command line arguments.");
            return;
        }

        try {
            // Parse the command line arguments to integers
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Calculate the sum
            int sum = num1 + num2;

            // Print the result
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide two valid numbers.");
        }
    }
}
