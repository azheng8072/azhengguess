package azheng;
import java.util.Scanner;

public class azhengLib {
    public static void guessGameObj2() {
        int range = 100;
        int half = 50;
        int win = 0;
        int count = 1;
        System.out.println("Pick a number from 1-" + range + ", i will guess. You just tell whether it is correct(type ) or greater(type g) or less than (type l)");
        System.out.println("type in your name");
        Scanner input = new Scanner(System.in);
        String username = input.nextLine();
        System.out.println(username + ", is      " + half + "     greater than, less than, or equal to your number?");
        System.out.println("type in your name");
        while (win == 0) {
            String ans = input.nextLine();
            if (ans.equals("g")) {
                half = half + 100 / (count * 2 + 2);
                System.out.println(username + ", is      " + half + "     greater than, less than, or equal to your number?");
            } else {
                if (ans.equals("l")) {
                    half = half - 100 / (count * 2 + 2);
                    System.out.println(username + ", is      " + half + "     greater than, less than, or equal to your number?");
                } else {
                    if (ans.equals("y")) {
                        win = 1;
                        count++;
                        System.out.println(username + ", tour number is      " + half + ".");
                        System.out.println("I had to guess  " + count + " times.");
                    } else {
                        System.out.println("wrote it wrong, on l, g, or c only");
                    }

                }
            }
        }
    }

}