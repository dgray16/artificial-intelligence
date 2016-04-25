import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        System.out.println("1 - Uzhhorod");
        System.out.println("2 - Lviv");
        System.out.println("3 - Ivano-Frankivsk");
        System.out.println("4 - Ternopil");
        System.out.println("5 - Khmelnytskiy");
        System.out.println("6 - Chernivtsi");

        System.out.println(" ");

        System.out.println("Choose from city:");

        String from = "";
        String to = "";
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            from = bufferedReader.readLine();

            System.out.println(" ");

            System.out.println("Choose to city:");
            to = bufferedReader.readLine();

        } catch (IOException e){
            e.printStackTrace();
        }

        Initializer initializer = new Initializer();

        City fromCity = initializer.findCityByNumber(from);
        City toCity = initializer.findCityByNumber(to);

        System.out.println(" ");

        System.out.println(initializer.findWay(fromCity, toCity));

    }

}
