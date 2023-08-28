package ClassesObjects;

class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}

public class CommandLineArguments {
    public static void main(String[] args) {
        try {
            if (args.length < 5) {
                throw new CheckArgumentException("Insufficient number of arguments");
            } else {
                int sum = 0;
                for (int i = 0; i < 5; i++) {
                    sum += Integer.parseInt(args[i]);
                }
                System.out.println("Sum of the numbers: " + sum);
            }
        } catch (CheckArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
