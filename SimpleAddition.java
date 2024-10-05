// Simple Java program to add two numbers
public class SimpleAddition {

    // Method to add two numbers and return the result
    public int addNumbers(int a, int b) {
        return a + b;
    }

    // Main method - entry point of the program
    public static void main(String[] args) {
        // Create an instance of the SimpleAddition class
        SimpleAddition addition = new SimpleAddition();
        
        // Define two numbers
        int num1 = 10;
        int num2 = 20;
        
        // Call the addNumbers method and store the result
        int sum = addition.addNumbers(num1, num2);
        
        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
