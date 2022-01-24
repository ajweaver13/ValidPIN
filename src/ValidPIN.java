import java.util.Scanner;

/*
Create a function that will test if a string is a valid PIN or not via a regular expression.

A valid PIN has:

Exactly 4 or 6 characters.
Only numeric characters (0-9).
No whitespace.
Examples
validate("121317") ➞ true

validate("1234") ➞ true

validate("45135") ➞ false

validate("89abc1") ➞ false

validate("900876") ➞ true

validate(" 4983") ➞ false

Notes:
Empty strings should return 'false' when tested.
 */
public class ValidPIN {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("----------------------------------------------");
        System.out.println("|                  Welcome!                  |");
        System.out.println("| This program will check if a PIN is valid. |");
        System.out.println("|        Enter * to exit the program.        |");
        System.out.println("----------------------------------------------\n");
        System.out.print("Please enter a pin: ");
        String pin = scan.nextLine();
        while (!pin.equals("*")) {
            System.out.println(validate(pin)+"\n");
            System.out.print("Please enter a pin: ");
            pin = scan.nextLine();
        }
    }

    public static boolean validate (String pin) {
        int number;
        try {
            int length1 = pin.length();
            if (length1 == 6 || length1 == 4) {
                number = Integer.parseInt(pin);
            } else {
                throw new Exception();
            }

            int length2 = String.valueOf(number).length();
            if (length2 == 6 || length2 == 4) {
                return true;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            return false;
        }
    }
}
