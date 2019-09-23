package Gau;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello, world!");

        int[] a = new int[4];
        int[] a1= {1,2,3,4};

        for(int i=0; i < a1.length; i++){
            System.out.println(a1[i]);
        }

        Random random = new Random();
        System.out.println(random.nextInt(100));

        String s;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        System.out.println(s + " nice");
    }
}
