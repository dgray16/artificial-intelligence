import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 09.03.2016.
 */
public class Initializer {

    private City chernivtsi;

    private City franyk;

    private City uzhhorod;

    private City khmelnytskiy;

    private City ternopil;

    private City lviv;

    private List<City> passedWay = new ArrayList<City>();


    public Initializer(){
        this.chernivtsi = new City("Chernivtsi");
        this.franyk = new City("Ivano-Frankivsk");
        this.uzhhorod = new City("Uzhhorod");
        this.khmelnytskiy = new City("Khmelnytskiy");
        this.ternopil = new City("Ternopil");
        this.lviv = new City("Lviv");

        initializeLvivDistances();
        initializeTernopilDistances();
        initializeKhmelnytskiyDistances();
        initializeChernivtsiDistances();
        initializeFranykDistances();
        initializeUzhhorodlDistances();
    }


    private void initializeLvivDistances(){

        Distance lvivToTernopil = new Distance(lviv, ternopil, 118);
        Distance lvivToFranyk = new Distance(lviv, franyk, 113);
        Distance lvivToUzhhorod = new Distance(lviv, uzhhorod, 185);
        Distance lvivToKhmelnytskiy = new Distance(lviv, khmelnytskiy, 218);
        Distance lvivToChernivtsi = new Distance(lviv, chernivtsi, 219);

        lviv.getCloseNeighbors().add(lvivToUzhhorod);
        lviv.getCloseNeighbors().add(lvivToFranyk);
        lviv.getCloseNeighbors().add(lvivToTernopil);

        lviv.getFarNeighbors().add(lvivToChernivtsi);
        lviv.getFarNeighbors().add(lvivToKhmelnytskiy);
    }

    private void initializeTernopilDistances(){

        Distance ternopilToLviv = new Distance(ternopil, lviv, 118);
        Distance ternopilToKhmelnytskiy = new Distance(ternopil, khmelnytskiy, 102);
        Distance ternopilToFranyk = new Distance(ternopil, franyk, 94);
        Distance ternopilToChernivtsi = new Distance(ternopil, chernivtsi, 142);
        Distance ternopilToUzhhorod = new Distance(ternopil, uzhhorod, 259);

        ternopil.getCloseNeighbors().add(ternopilToLviv);
        ternopil.getCloseNeighbors().add(ternopilToKhmelnytskiy);
        ternopil.getCloseNeighbors().add(ternopilToFranyk);

        ternopil.getFarNeighbors().add(ternopilToChernivtsi);
        ternopil.getFarNeighbors().add(ternopilToUzhhorod);
    }

    private void initializeKhmelnytskiyDistances(){

        Distance khmelnytskiyToTernopil = new Distance(khmelnytskiy, ternopil, 102);
        Distance khmelnytskiyToChernivtsi = new Distance(khmelnytskiy, chernivtsi, 146);
        Distance khmelnytskiyToFranyk = new Distance(khmelnytskiy, franyk, 174);
        Distance khmelnytskiyToLviv = new Distance(khmelnytskiy, lviv, 218);
        Distance khmelnytskiyToUzhhorod = new Distance(khmelnytskiy, uzhhorod, 350);

        khmelnytskiy.getCloseNeighbors().add(khmelnytskiyToTernopil);
        khmelnytskiy.getCloseNeighbors().add(khmelnytskiyToFranyk);
        khmelnytskiy.getCloseNeighbors().add(khmelnytskiyToChernivtsi);

        khmelnytskiy.getFarNeighbors().add(khmelnytskiyToLviv);
        khmelnytskiy.getFarNeighbors().add(khmelnytskiyToUzhhorod);
    }

    private void initializeChernivtsiDistances(){

        Distance chernivtsiToKhmelnytskiy = new Distance(chernivtsi, khmelnytskiy, 146);
        Distance chernivtsiToFranyk = new Distance(chernivtsi, franyk, 112);
        Distance chernivtsiToUzhhorod = new Distance(chernivtsi, uzhhorod, 267);
        Distance chernivtsiToTernopil = new Distance(chernivtsi, ternopil, 142);
        Distance chernivtsiToLviv = new Distance(chernivtsi, lviv, 219);

        chernivtsi.getCloseNeighbors().add(chernivtsiToUzhhorod);
        chernivtsi.getCloseNeighbors().add(chernivtsiToFranyk);
        chernivtsi.getCloseNeighbors().add(chernivtsiToKhmelnytskiy);

        chernivtsi.getFarNeighbors().add(chernivtsiToTernopil);
        chernivtsi.getFarNeighbors().add(chernivtsiToLviv);
    }

    private void initializeFranykDistances(){
        
        Distance franykToChernivtsi = new Distance(franyk, chernivtsi, 112);
        Distance franykToUzhhorod = new Distance(franyk, uzhhorod, 179);
        Distance franykToKhmelnytsiy = new Distance(franyk, khmelnytskiy, 174);
        Distance franykToTernopil = new Distance(franyk, ternopil, 94);
        Distance franykToLviv = new Distance(franyk, lviv, 113);

        franyk.getCloseNeighbors().add(franykToUzhhorod);
        franyk.getCloseNeighbors().add(franykToLviv);
        franyk.getCloseNeighbors().add(franykToTernopil);
        franyk.getCloseNeighbors().add(franykToKhmelnytsiy);
        franyk.getCloseNeighbors().add(franykToChernivtsi);
    }

    private void initializeUzhhorodlDistances(){

        Distance uzhhorodToFranyk = new Distance(uzhhorod, franyk, 179);
        Distance uzhhorodToLviv = new Distance(uzhhorod, lviv, 185);
        Distance uzhhorodToChernivtsi= new Distance(uzhhorod, chernivtsi, 267);
        Distance uzhhorodToTernopil = new Distance(uzhhorod, ternopil, 259);
        Distance uzhhorodToKhmelnytskiy = new Distance(uzhhorod, khmelnytskiy, 350);

        uzhhorod.getCloseNeighbors().add(uzhhorodToFranyk);
        uzhhorod.getCloseNeighbors().add(uzhhorodToLviv);
        uzhhorod.getCloseNeighbors().add(uzhhorodToChernivtsi);

        uzhhorod.getFarNeighbors().add(uzhhorodToTernopil);
        uzhhorod.getFarNeighbors().add(uzhhorodToKhmelnytskiy);
    }

    public City findCityByNumber(String number){
        if ( number.equals("1") )
            return uzhhorod;
        else if ( number.equals("2") )
            return lviv;
        else if ( number.equals("3") )
            return franyk;
        else if ( number.equals("4") )
            return ternopil;
        else if ( number.equals("5") )
            return khmelnytskiy;
        else if ( number.equals("6") )
            return chernivtsi;

        return null;
    }

    public String findWay(City from, City to){

        // if from city has to as close neighbor, show distance between them as result
        if ( findToCityInFromCloseNeighbors(from, to) != null ){
            return findWayIfCloseNeighbors(from, to);
        }

        if ( findToCityInFromFarNeighbors(from, to) != null ){
            return generateResultString(findWayIfFarNeighbors(from, to));
        }

    return "";
    }

    private String generateResultString(List<City> result){
        String resultString = "Shortest way from " + result.get(0).getName() + " to "
                + result.get(result.size() - 1).getName() + " equals: ";

        for (City item : result)
            resultString += " - " + item.getName();



        return resultString;
    }

    private Distance findToCityInFromFarNeighbors(City from, City to){
        for ( Distance current : from.getFarNeighbors() )
            if ( current.getTo().equals(to) )
                return current;
        return null;
    }

    private List<City> findWayIfFarNeighbors(City from, City to){

        List<City> resultWay = new ArrayList<City>();

        resultWay.add(from);
        passedWay.add(from);

        City next = from;

        while ( next != to ){

            next = findWayIfFarNeighborsMethod(next, to);

            resultWay.add(next);

            passedWay.add(next);

        }

        return resultWay;
    }

    private City findWayIfFarNeighborsMethod(City from, City to){
        Map<City, Integer> closeCalculations = new HashMap<City, Integer>();

        for ( Distance closeDistance : from.getCloseNeighbors() ){
            Integer value = closeDistance.getAmount() +
                    closeDistance.getFrom().findDistanceFromStartPointToEndPoint(to).getAmount();
            City key = closeDistance.getTo();

            if ( !passedWay.contains(key) )
                closeCalculations.put(key, value);
        }
        if ( closeCalculations.containsKey(to) )
            return to;

        return findMin(closeCalculations);
    }

    private City findMin(Map<City, Integer> calculations){

        Integer min = 0;
        City minCity = null;
        for ( Map.Entry<City, Integer> item : calculations.entrySet() ){
            min = item.getValue();
            minCity = item.getKey();
            break;
        }

        for ( Map.Entry<City, Integer> item : calculations.entrySet() ){
            if ( item.getValue() < min ){
                min = item.getValue();
                minCity = item.getKey();
            }
        }

        return minCity;
    }

    private String findWayIfCloseNeighbors(City from, City to){
        Distance distance = findToCityInFromCloseNeighbors(from, to);
        return "Shortest way from " + from.getName() + " to " + to.getName() + " equals: " + distance.getAmount() +
                " because, they are neighbors.";
    }

    private Distance findToCityInFromCloseNeighbors(City from, City to){
        for ( Distance current : from.getCloseNeighbors() )
            if ( current.getTo().equals(to) )
                return current;
        return null;
    }


    public City getChernivtsi() {
        return chernivtsi;
    }

    public City getFranyk() {
        return franyk;
    }

    public City getUzhhorod() {
        return uzhhorod;
    }

    public City getKhmelnytskiy() {
        return khmelnytskiy;
    }

    public City getTernopil() {
        return ternopil;
    }

    public City getLviv() {
        return lviv;
    }
}
