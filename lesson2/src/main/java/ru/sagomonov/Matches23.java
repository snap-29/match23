package ru.sagomonov;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

public class Matches23 {

    public static void main(String[] args) {
        Supplier<Integer> gen123 = new Generator123(3);
        int nMatches = 23;
        Scanner scanner = new Scanner(System.in);
        int nGamer;
        boolean isPlayer = true;
        while (nMatches > 1) {

            int inputInt = 0;
            do {
                System.out.print("Take one or two or three matches: ");
                inputInt = scanner.nextInt();
            }
            while (!(inputInt > 0 && inputInt < 4 && inputInt < nMatches));

            nGamer = inputInt;
            System.out.println("You took " + nGamer + " match(es)");
            isPlayer = !isPlayer;
            nMatches -= nGamer;

            if (nMatches > 1) {
                System.out.println("It's " + nMatches + " on a table");


                int nBot;
                if (nMatches <= 4) {
                    nBot = nMatches - 1;
                } else {
                    nBot = nMatches % 5;
                    if (nBot == 0 || nBot > 3)
                        nBot = gen123.get();
                }
                System.out.println("I took " + nBot);
                nMatches -= nBot;
                System.out.println("It's " + nMatches + " on a table");
                isPlayer = !isPlayer;
            }
        }
        if (!isPlayer) {
            System.out.println("You won");
        } else {
            System.out.println("Bot won");
        }

    }
}