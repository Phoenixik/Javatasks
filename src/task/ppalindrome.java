/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ppalindrome {

    public static void main(String[] args) {

        int odd = 1;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("insert palindrome permutation");
        String str = sc.nextLine();
        //String str = "taco cat";
        int count = 0;
        char arr[] = str.replaceAll("\\s", "").toLowerCase().toCharArray();

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (char ch : arr) {
            count = 1;
            if (map.containsKey(ch)) {
                count = map.get(ch);
                count++;
            }

            map.put(ch, count);

        }

        for (char ch : map.keySet()) {

            int value = map.get(ch);
            if (value % 2 == 1) {
                odd++;
                if (odd > 2) {
                    break;
                }
            }

        }
        if (odd > 2) {
            System.out.println("not a palindrome permutation ");
        } else {

            System.out.println("palindrome permutation spotted");
        }

    }

}
