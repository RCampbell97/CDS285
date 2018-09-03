public class Main {

    public static void main(String[] args) {
        int Number;         //comp number
        int guess;      // A number entered by user as a guess.

        Number = (int) (1000 * Math.random()) + 1;


        System.out.println();
        System.out.print("What is your first guess? ");
        while (true) {
            guess = TextIO.getInt();  // Get the user's guess.
            if (guess == Number) {
                System.out.println(" My number was " + Number);
                break;
            }

            if (guess < Number)
                System.out.print("That's too low.  Try again: ");
            else if (guess > Number)
                System.out.print("That's too high.  Try again: ");
        }
        System.out.println();
    }
}
