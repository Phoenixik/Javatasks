/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class away {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("insert first string");
        String fs = sc.nextLine();
        System.out.println("insert second string");
        String ss = sc.nextLine();

        if (fs.length() == ss.length()) {
            boolean flag = oneEditAway(fs, ss);
            if (flag) {
                System.out.println("Strings are one replace away");
            } else {
                System.out.println("strings aint one replace away");
            }
        } else if (fs.length() + 1 == ss.length()) {
            boolean flag1 = oneEditInsert(fs, ss);
            if (flag1) {
                System.out.println("Strings aint one insert away");
            } else {
                System.out.println("strings are one insert away");
            }
        } else if (fs.length() - 1 == ss.length()) {
            boolean flag2 = oneEditInsert(ss, fs);
            if (flag2) {
                System.out.println("Strings aint one insert away");
            } else {
                System.out.println("strings are one insert away");
            }
        } else {
            System.out.println("Strings are more than one edit or replace away");
        }
    }

    //to replace since replace is only one edit away
    static boolean oneEditAway(String s1, String s2) {
        boolean difference = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                difference = false;
                //return false;
            } else {
                difference = true;

            }
        }
        return difference;

    }

    //to insert one character
    static boolean oneEditInsert(String s1, String s2) {
        boolean diff = false;
        int index1 = 0, index2 = 0;
        while (index1 < s1.length() && index2 < s2.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (index1 != index2) {
                    diff = false;
                } else {
                    index2++;
                    diff = true;
                }
            } else {
                index1++;
                index2++;
            }
        }

        return diff;

    }
}
