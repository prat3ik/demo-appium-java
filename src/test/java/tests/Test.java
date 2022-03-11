package tests;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        char c = 'l';
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (c == s.toCharArray()[i])
                count++;
        }
        System.out.println(count);
    }
}
