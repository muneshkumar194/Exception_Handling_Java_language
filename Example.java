// Custom Exception Class
class AgeInvalidException extends Exception {
    public AgeInvalidException(String message) {
        super(message);
    }
}

// Main Class
public class Example {
    public static void main(String args[]) {
        System.out.println("Started..");

        try {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            System.out.println("We have two numbers...");

            int result = n1 / n2;

            System.out.println("Division is: " + result);

            if (n2 < 10) {
                throw new AgeInvalidException("My age is invalid!!");
            }

        } catch (ArithmeticException e) {
            System.out.println("n2 cannot be 0 !!");
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide two numbers as arguments.");
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers.");
        } catch (AgeInvalidException e) {
            System.out.println("Custom Exception Caught!");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("General Error !!");
            System.out.println(e.getMessage());
        }

        System.out.println("Terminated..");
    }
}


