package ru.sagomonov;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

public class Matches23 {

    public static void main(String[] args) {



        IStrategy bot = new BotStrategy();
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

            if ( bot.test(nMatches)) {
                System.out.println("It's " + nMatches + " on a table");


                int nBot = bot.apply(nMatches);
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