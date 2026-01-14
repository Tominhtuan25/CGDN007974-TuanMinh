package ss1_introduction.bai_tap;
import java.util.Scanner;
public class NumberToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đọc (0-999): ");
        int num = Integer.parseInt(scanner.nextLine());
        if (num < 0 || num > 999) {
            System.out.println("out of ability");
        } else {
            System.out.println(changenumber(num));
        }
    }
    public static String changenumber(int num) {
        if (num < 10) {
            return changeonenumber(num);
        } else if (num < 20) {
            return changetwonumberlessthan20(num);
        } else if (num < 99) {
            return changetwonumber(num);
        }
        return changethreenumber(num);
    }
    public static String changeonenumber(int num) {
        switch (num) {
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
        }
        return "out of ability";
    }
    public static String changetwonumberlessthan20(int num) {
        switch (num) {
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
        }
        return "out of ability";
    }
    public static String changetwonumber(int num) {
        int tens = num / 10;
        int unit = num % 10;
        String hangChuc = "";
        switch (tens) {
            case 2: hangChuc = "twenty"; break;
            case 3: hangChuc = "thirty"; break;
            case 4: hangChuc = "forty"; break;
            case 5: hangChuc = "fifty"; break;
            case 6: hangChuc = "sixty"; break;
            case 7: hangChuc = "seventy"; break;
            case 8: hangChuc = "eighty"; break;
            case 9: hangChuc = "ninety"; break;
        }
        if (unit == 0) {
            return hangChuc;
        }
        return hangChuc + " + " + changeonenumber(unit);
    }
    public static String changethreenumber(int num) {
        int hundred = num / 100;
        int remainder = num % 100;
        String result = changeonenumber(hundred) + " hundred ";
        if (remainder != 0) {
            result += " and " + changenumber(remainder);
        }
        return result;
    }
}
