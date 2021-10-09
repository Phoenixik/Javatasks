/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

import java.util.Scanner;

public class compress {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("insert values");
        String values = sc.nextLine();
        //String values = "aaaaaigggkkl";
        char arr[] = values.toUpperCase().toCharArray();
        String arrbuf = "";
        int count = 1;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[(i + 1)]) {
                count++;
            } else {
                arrbuf = arrbuf + arr[i] + count;
                count = 1;
            }
        }
        arrbuf = arrbuf + arr[(arr.length - 1)] + count;
        if (arrbuf.length() < values.length()) {
            System.out.println(arrbuf);
        } else {
            System.out.println(values);

        }

    }
}
