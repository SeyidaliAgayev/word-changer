package utils;

import java.util.Scanner;

public class InputUtil {
    public static String inputRequiredString(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(title);
        return scanner.nextLine();
    }
}
