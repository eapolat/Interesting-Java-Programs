import java.util.Scanner;

public class Lab02_Q3 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char first;
        char last;
        char middle;
        int distance_of_last_and_middle;
        int distance_of_first_and_last;
        int distance_of_first_and_middle;
        String special_test;
        boolean uppercase_test;
        boolean letter_test;
        int whitespace_test;

        System.out.print("Enter string: ");
        String given_String = scan.nextLine();
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


        distance_of_last_and_middle = Math.abs(last - middle);
        distance_of_first_and_middle = Math.abs(first-middle);
        distance_of_first_and_last = Math.abs(first-last);

        whitespace_test = given_String.indexOf(" ");

        if ((given_String.length() >= 3) & (!uppercase_test) & (letter_test) & (whitespace_test == -1)) {

            System.out.printf("first: %c middle: %c last: %c %n", first, middle, last);


        }

        if ((distance_of_first_and_last <= 1) & (distance_of_first_and_middle >= 2) & (distance_of_last_and_middle >= 2) & (given_String.length() >= 3) & (!uppercase_test) & (letter_test)){

            special_test = "True";
            System.out.printf("String is special: %s", special_test);


        }
        else {
            if ((distance_of_first_and_middle <= 1) & (distance_of_first_and_last >= 2) & (distance_of_last_and_middle >= 2) & (given_String.length() >= 3) & (!uppercase_test) & (letter_test)){

            special_test = "True";
            System.out.printf("String is special: %s", special_test);


            }
            else {
                
                if ((given_String.length() >= 3) & (!uppercase_test) & (letter_test)) {
                special_test = "False";
                System.out.printf("String is special: %s", special_test);

                }
            
            }

        }

        
    }
}
