import java.util.Scanner;

public class Lab02_Q2 {
    
    public static void main( String[] args) {

        Scanner scan = new Scanner(System.in);

        String small_jar_string;
        int small_jar;
        String large_jar_string;
        int large_jar;
        int index_whitespace;
        String order_string;
        int order;
        int small_jar_needed;
        int large_jar_litre;

        System.out.print("Input the number of small and large jars available and the order size: ");
        String jars_and_order = scan.nextLine();
        scan.close();

        index_whitespace = jars_and_order.indexOf(" "); 

        small_jar_string = jars_and_order.substring(0, index_whitespace);
        small_jar = Integer.valueOf(small_jar_string);

        String jars_and_order_afterwhitespace_1 = jars_and_order.substring(index_whitespace + 1);
        index_whitespace = jars_and_order_afterwhitespace_1.indexOf(" ");

        large_jar_string = jars_and_order_afterwhitespace_1.substring(0,index_whitespace);


        
        large_jar = Integer.valueOf(large_jar_string);
        String jars_and_order_afterwhitespace_2 = jars_and_order_afterwhitespace_1.substring(index_whitespace+1);

        order_string = jars_and_order_afterwhitespace_2;
        order = Integer.valueOf(order_string);

        if (order < 5) {
            System.out.println("Order must be larger than 5 litres");
        }


        large_jar_litre = large_jar * 5; 

        if (large_jar_litre <= order) {

            small_jar_needed = order - large_jar_litre;
        }
        else {
            large_jar_litre = (large_jar - 1) * 5;
            small_jar_needed = order - large_jar_litre;

        }

        if ((small_jar_needed <= small_jar) & (order >= 5))   {

            System.out.printf("Order of %d litres will contain %d small(1 litre)jars", order, small_jar_needed);
        }
        if ((small_jar_needed > small_jar) & (order >= 5)) {
            System.out.println("You do not have enough jars to complete the order");
        }

        
    }
}
