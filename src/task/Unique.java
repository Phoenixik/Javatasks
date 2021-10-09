package task;

import java.util.Scanner;

public class Unique {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("insert first string");
        String value = sc.nextLine();

        // String value = "hellllo";
        char[] values = value.toCharArray();
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            count = 0;
            for (int j = 0; j < values.length; j++) {
                if (values[i] == values[j]) {

                    count++;
                }
            }
           
            if (count > 1) {

                System.out.println(values[i] + "  Occurs more than once");
                break;

            } 
             
        }
        if (count <= 1 ) {System.out.println("unique characters spotted");
               
            }
        
    }

}
