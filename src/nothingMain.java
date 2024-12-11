import java.util.Scanner;

public class nothingMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // קבלת המחרוזת הראשונה מהמשתמש
        System.out.print("Enter a string as number#1 (or \"quit\" to end the program): ");
        String num1 = scanner.nextLine();
        if (num1.equalsIgnoreCase("quit")) {
            System.out.println("quitting now...");
            return;
        }

        // קבלת המחרוזת השנייה מהמשתמש
        System.out.print("Enter a string as number#2 (or \"quit\" to end the program): ");
        String num2 = scanner.nextLine();
        if (num2.equalsIgnoreCase("quit")) {
            System.out.println("quitting now...");
            return;
        }

        // קבלת בסיס ההמרה מהמשתמש
        System.out.print("Enter a base for output: (a number [2,16]): ");
        int base = scanner.nextInt();

        // הדפסת הערכים של המחרוזות והבדיקה אם הן נכונות
        System.out.println("num1= " + num1 + " is number: " + isNumber(num1) + " , value: " + number2Int(num1));
        System.out.println("num2= " + num2 + " is number: " + isNumber(num2) + " , value: " + number2Int(num2));

        // אם אחת מהמחרוזות אינה חוקית, להפסיק את ההמשך
        if (!isNumber(num1) || !isNumber(num2)) {
            System.out.println("ERR: one or both numbers are in the wrong format!");
            return;
        }

        // חישובים והדפסה של התוצאות
        int value1 = number2Int(num1);
        int value2 = number2Int(num2);
        int sum = value1 + value2;
        int product = value1 * value2;

        System.out.println(num1 + " + " + num2 + " = " + int2Number(sum, base));
        System.out.println(num1 + " * " + num2 + " = " + int2Number(product, base));

        // חיפוש והדפסה של המספר הגדול ביותר במערך
        String[] numbers = {num1, num2, int2Number(sum, base), int2Number(product, base)};
        int maxIndex = maxIndex(numbers);
        System.out.println("Max number over [" + num1 + "," + num2 + "," + int2Number(sum, base) + "," + int2Number(product, base) + "] is: " + numbers[maxIndex]);
    }

    public static boolean isNumber(String a) {
        // Check for null or empty string
        if (a == null || a.isEmpty()) {
            return false;
        }

        // Check if the string has a base part (contains 'b')
        int bIndex = a.indexOf('b');
        if (bIndex > 0 && bIndex < a.length() - 1) {
            // Split the string into the number part and base part
            String numberPart = a.substring(0, bIndex);
            String basePart = a.substring(bIndex + 1);

            // Check if the number part is valid (only hex digits)
            if (!numberPart.matches("[0-9A-Fa-f]+")) {
                return false;
            }

            // Check if the base part is a valid base between 2 and 16
            try {
                int base = Integer.parseInt(basePart, 16);
                return base >= 2 && base <= 16;
            } catch (NumberFormatException e) {
                return false;
            }
        }

        // If the string does not contain 'b', it should be a valid number (hexadecimal or decimal)
        return a.matches("[0-9A-Fa-f]+");
    }


    public static int number2Int(String num) {
        if (!isNumber(num)) {
            return -1;
        }
        int sum = 0;
        int base = 10; // נניח שהברירת מחדל היא 10, אם אין ב'
        if (num.contains("b")) {
            int bIndex = num.indexOf('b');
            String basePart = num.substring(bIndex + 1);
            base = Integer.parseInt(basePart);
            num = num.substring(0, bIndex);
        }

        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            if (c >= '0' && c <= '9') {
                sum = sum * base + (c - '0');
            } else if (c >= 'A' && c <= 'F') {
                sum = sum * base + (c - 'A' + 10);
            }
        }
        return sum;
    }

    public static String int2Number(int num, int base) {
        if (num < 0 || base < 2 || base > 16) {
            return "";
        }
        String digits = "0123456789ABCDEF";
        StringBuilder result = new StringBuilder();
        do {
            result.insert(0, digits.charAt(num % base));
            num /= base;
        } while (num > 0);
        return result.toString();
    }

    public static int maxIndex(String[] arr) {
        int ans = 0;
        for (int i = 1; i < arr.length; i++) {
            if (number2Int(arr[i]) > number2Int(arr[ans])) {
                ans = i;
            }
        }
        return ans;
    }

    public static boolean equals(String n1, String n2) {
        return number2Int(n1) == number2Int(n2);
    }
}