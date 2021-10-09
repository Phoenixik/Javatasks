/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package task;

import java.util.Arrays;
import java.util.Scanner;


public class permutate {

      public static void main(String[] args) {
          
        Scanner sc = new Scanner(System.in);
        System.out.println("insert first string");
        String p1 = sc.nextLine();
        System.out.println("insert second string");
        String p2 = sc.nextLine();
       
//        String p1 = "phoenix";
//        String p2 = "ixheopn";
        
        String myp1 = p1.toLowerCase().trim();
        String myp2 = p2.toLowerCase().trim();
        
        int flag = 0;
        
        int n1 = myp1.length();
        int n2 = myp2.length();
        
        if (n1 != n2) {
            System.out.println("Strings must be the same length");
        }
        else{
            char ch1[] = myp1.toCharArray();
            char ch2[] = myp2.toCharArray();
            
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            
            for (int i = 0; i < n1; i++) {
                if(ch1[i] != ch2[i] ) {
                    
                    flag = 1;
                }
              
        }
              if (flag == 0) {
                    System.out.println("they are permutations");
                }
              if (flag == 1) {
                  System.out.println("they are not permutations");
              }
        }
    }
    
}
