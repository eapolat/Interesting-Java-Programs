import java.util.Scanner;

public class Lab02_Revision {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char first;
        char last;
        char middle;
        int distance_of_last_and_given;
        int distance_of_first_and_given;
        int distance_of_middle_and_given;
        String super_special_test;
        boolean uppercase_test;
        boolean letter_test;
        int whitespace_test;

        System.out.print("Enter string: ");
        String given_String = scan.nextLine();

        System.out.print("Enter a character: ");
        Character given_character = scan.next().charAt(0);
        scan.close();

        first = given_String.charAt(0);
        last = given_String.charAt(given_String.length()-1);
        middle = given_String.charAt(given_String.length() / 2);

        if (given_String.length() < 3) {

            System.out.println("Length of string not sufficient");
        }
        
        uppercase_test = (Character.isUpperCase(first)) | (Character.isUpperCase(middle)) | (Character.isUpperCase(last));

        if (uppercase_test) {

            System.out.println("Characters not lowercase letters...");
        }

        letter_test = (Character.isLetter(first)) & (Character.isLetter(middle)) & (Character.isLetter(last));

        if (!letter_test) {

            System.out.println("Characters not lowercase letters...");
        }


        distance_of_last_and_given = Math.abs(last - given_character);
        distance_of_first_and_given = Math.abs(first - given_character);
        distance_of_middle_and_given = Math.abs(middle- given_character);

        whitespace_test = given_String.indexOf(" ");

        if ((given_String.length() >= 3) & (!uppercase_test) & (letter_test) & (whitespace_test == -1)) {

            System.out.printf("first: %c middle: %c last: %c %n", first, middle, last);


        }

        if ((distance_of_first_and_given <= 1) & (distance_of_last_and_given >= 2) & (distance_of_middle_and_given >= 2) & (given_String.length() >= 3) & (!uppercase_test) & (letter_test)){

            super_special_test = "True";
            System.out.printf("String is super special: %s", super_special_test);


        }
        else {
            if ((distance_of_last_and_given <= 1) & (distance_of_first_and_given >= 2) & (distance_of_middle_and_given >= 2) & (given_String.length() >= 3) & (!uppercase_test) & (letter_test)){

            super_special_test = "True";
            System.out.printf("String is super special: %s", super_special_test);


            }
            else {

                if ((distance_of_middle_and_given <= 1) & (distance_of_first_and_given >= 2) & (distance_of_last_and_given >= 2) & (given_String.length() >= 3) & (!uppercase_test) & (letter_test)){

                    super_special_test = "True";
                    System.out.printf("String is super special: %s", super_special_test);

                }

                else {
                    
                    if ((given_String.length() >= 3) & (!uppercase_test) & (letter_test)) {
                super_special_test = "False";
                System.out.printf("String is super special: %s", super_special_test);

                }
            }
            
            }

        }

        
    }
}