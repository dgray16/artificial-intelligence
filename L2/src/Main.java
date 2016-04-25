

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {

    /**
     * Зобразити ієрархію Національної Поліції України
     */

    public static int bundleNumber;

    public static PrintStream printStream;


    public static void main(String[] args) throws UnsupportedEncodingException {

        Scanner scanner = new Scanner(System.in);
        printStream = new PrintStream(System.out, true, "UTF-8");

        List<Policeman> policemenList = new ArrayList<>();

        printStream.println("Choose bundle: 1 - EN, 2 - UA");
        bundleNumber = scanner.nextInt();

        switch ( bundleNumber ){
            case 1:
                Ranks.bundle = ResourceBundle.getBundle("i18n/ranks_en");
                break;

            case 2:
                Ranks.bundle = ResourceBundle.getBundle("i18n/ranks_ua");
                break;
        }

        printStream.println("How many policemen do you want to create?");
        int policemens = scanner.nextInt();

        for ( int i = 0; i < policemens; i++ ){
            Policeman policeman = new Policeman();

            printStream.println("\nPoliceman: " + i + " -- set his name");
            String name = scanner.next();
            policeman.setName(name);

            printStream.println("\nPoliceman: " + i + " -- set his rank");
            policeman.setRank(findRankByScore(scanner.nextInt()));

            policemenList.add(policeman);
        }

        getPolicemenStatus(policemenList);
    }

    private static void getPolicemenStatus(List<Policeman> policemen) throws UnsupportedEncodingException {

        for (Policeman currentPoliceman : policemen){
            final String currentPolicemanType = currentPoliceman.getRank().getLocalizedRankType();
            final Integer currentPolicemanScore = currentPoliceman.getRank().getRankScore();

            // Java 8 code
            policemen.stream().filter(nextPoliceman -> currentPoliceman != nextPoliceman).forEach(nextPoliceman -> {

                String nextPolicemanType = null;
                try {
                    nextPolicemanType = nextPoliceman.getRank().getLocalizedRankType();
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }

                Integer nextPolicemanScore = nextPoliceman.getRank().getRankScore();

                if ( currentPolicemanScore < nextPolicemanScore )
                    printStream.println("\n" + currentPolicemanType + " " + currentPoliceman.getName() +
                            " is higher than " + nextPolicemanType + " " + nextPoliceman.getName());
                else printStream.println("\n" + currentPolicemanType + " " + currentPoliceman.getName() +
                        " is lower than " + nextPolicemanType + " " + nextPoliceman.getName());
            });

            // Java 6 code
            /*for (Policeman nextPoliceman : policemen ){
                if ( currentPoliceman != nextPoliceman ) {
                    String nextPolicemanType = nextPoliceman.getRank().getRankType();
                    Integer nextPolicemanScore = nextPoliceman.getRank().getRankScore();

                    if ( currentPolicemanScore > nextPolicemanScore )
                        printStream.println("\n" + currentPolicemanType + " " + currentPoliceman.getName() +
                                " is higher than " + nextPolicemanType + " " + nextPoliceman.getName());
                    else printStream.println("\n" + currentPolicemanType + " " + currentPoliceman.getName() +
                            " is lower than " + nextPolicemanType + " " + nextPoliceman.getName());
                }
            }*/

        }
    }

    private static Ranks findRankByScore(int score){
        for (Ranks currentRank : Ranks.values())
            if ( currentRank.getRankScore() == score )
                return currentRank;

        return null;
    }
}
