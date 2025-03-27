package classes;

import exceptions.MyException;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input extends MyException {
    static Scanner sc = new Scanner(System.in);

    public Input() {
    }
    public static byte readByte(String missatge) {
        Byte result = null;
        while (result == null) {
            try {
                System.out.println(missatge);
                result = sc.nextByte();
            } catch (InputMismatchException e) {
                System.out.print("Error format. ");
                sc.nextLine();
            }
        }
        return result;
    }
    public static int readInt(String missatge) {
        Integer result = null;
        while (result == null) {
            try {
                System.out.println(missatge);
                result = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Error format. ");
                sc.nextLine();
            }
        }
        return result;
    }
    public static float readFloat(String missatge) {
        Float result = null;
        while (result == null) {
            try {
                System.out.println(missatge);
                result = sc.nextFloat();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.print("Error format. ");
                sc.nextLine();
            }
        }
        return result;
    }
    public static double readDouble(String missatge) {
        Double result = null;
        while (result == null) {
            try {
                System.out.println(missatge);
                result = sc.nextDouble();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.print("Error format. ");
                sc.nextLine();
            }
        }
        return result;
    }
    public static char readChar(String missatge, String... words) {
        char result = '\0';
        while (result == '\0') {
            try {
                System.out.println(missatge);
                String input = sc.nextLine().toUpperCase();
                if (input.length() == 1 && Arrays.stream(words).toList().contains(input)) {
                    result = input.charAt(0);
                } else {
                    throw new MyException("Error format. Only a single character is allowed. Type: "
                            + Arrays.stream(words).toList().toString());
                }
            } catch (MyException e) {
                System.out.print(e.getMessage());
                sc.nextLine();
            }
        }
        return result;
    }
    public static String readString(String missatge) {
        String result = "";
        while (result.isEmpty()) {
            try {
                System.out.println(missatge);
                result = sc.next();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.print("Error format. ");
                sc.nextLine();
            }
        }
        return result;
    }
    public static boolean readBoolean(String missatge) {
        Boolean result = null;
        while (result == null) {
            try {
                System.out.println(missatge);
                String input = sc.nextLine().toLowerCase();
                if (input.length() == 1 && (input.charAt(0) == 'y' || input.charAt(0) == 'n')) {
                    result = input.charAt(0) == 'y';
                } else {
                    throw new MyException("Error format. Only takes \"y\" or \"n\". ");
                }
            } catch (MyException e) {
                System.out.print(e.getMessage());
            }
        }
        return result;
    }
}