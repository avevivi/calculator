import java.util.Scanner;

public class Main  {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a arithmetical expression (use spaces between literals, integers only, from 1 to 10 inclusive): " );
        String userInput = scanner.nextLine();
        String[] splitInput = userInput.split("\\s+");

        //Necessary methods and classes
        Checks inputChecker = new Checks();
        ArithmeticalOperations calculation = new ArithmeticalOperations();

        //Checking array length
        inputChecker.checkArrayLength(splitInput);

        // Assign split elements to variables for sending this to ArithmeticalOp
        // 2 numbers case
        try {
            if (splitInput.length == 3) {
                int x = Integer.parseInt(String.valueOf(splitInput[0]));
                char o = splitInput[1].charAt(0);
                int y = Integer.parseInt(String.valueOf(splitInput[2]));
                // checker
                inputChecker.checkScannerInput(x, y);
                calculation.calculation(x, o, y);
                System.out.println("Answer is: " + calculation.result);
                // 3 numbers case
            } else if (splitInput.length == 5) {
                int x = Integer.parseInt(splitInput[0]);
                char o = splitInput[1].charAt(0);
                int y = Integer.parseInt(splitInput[2]);
                char o2 = splitInput[3].charAt(0);
                int z = Integer.parseInt(splitInput[4]);
                // checker
                inputChecker.checkScannerInput(x, y, z);
                calculation.calculation(x, o, y, o2, z);
                System.out.println("Answer is: " + calculation.result);
            }
        } catch (ArithmeticException e) {
            System.err.println("Can't be divided by 0");
        }
    }
}
