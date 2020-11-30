package correcter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ErrorEmulator errorEmulator = new ErrorEmulator(scanner.nextLine());
        System.out.println(errorEmulator.getErrorStr());

//        char in[] = scanner.nextLine().toCharArray();
//        System.out.println(ErrorEmulator.createError("Ver"));
    }
}