package gameMenu;

import java.util.Random;
import java.util.Scanner;

public class CoinFlipGame {

    public static void coinFlipMethod() {

        // create needed instances
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();

        int count;

        System.out.println("How many times would you like to flip a coin? ");
        count = keyboard.nextInt();

        int lastSide = -1;
        int consecutive = 1;
        int longestRunHeads = 0;
        int longestRunTails = 0;
        int oddsHeads = 2;
        int oddsTails = 2;

        for (int i = 0; i < count; i++) {

            int coin = rand.nextInt(2);

            System.out.println(headsOrTails(coin));

            if (coin == lastSide) {

                consecutive++;

                if (consecutive > longestRunHeads && coin == 0) {

                    longestRunHeads = consecutive;
                    oddsHeads = longestRunHeads * 2;
                } else if (consecutive > longestRunTails && coin == 1) {

                    longestRunTails = consecutive;
                    oddsTails = longestRunTails * 2;
                }

            } else {

                // reset the consecutive count if the
                // chain is broken.
                consecutive = 1;
            }

            lastSide = coin;
        }

        System.out.println("The longest run of heads was " +longestRunHeads + " The odds of that are 1 in " + oddsHeads +".\n" +
                           "The longest run of tails was " + longestRunTails + " The odds of that are 1 in " + oddsTails + ".\n");
    }

    private static String headsOrTails(int i) {

        if (i == 0) {

            return "heads";
        } else {

            return "tails";
        }
    }
}
