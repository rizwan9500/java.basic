package printnumbers;

import java.io.*;
import java.util.*;

public class printnumbers {
    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        number = scanner.nextInt();
        System.out.println("Result:");
        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }
    }
}
