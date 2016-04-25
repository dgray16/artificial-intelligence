import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 09.03.2016.
 */
public class City {

    private String name;

    private List<Distance> closeNeighbors = new ArrayList<Distance>();

    private List<Distance> farNeighbors = new ArrayList<Distance>();

    public City(String name){
        this.name = name;
    }


    public Distance findDistanceFromStartPointToEndPoint(City endPoint){
        for ( Distance closeNeighbor : closeNeighbors ){
            if ( closeNeighbor.getTo().equals(endPoint) )
                return closeNeighbor;
        }
        for ( Distance farNeighbor : farNeighbors ){
            if ( farNeighbor.getTo().equals(endPoint) )
                return farNeighbor;
        }
        return null;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<Distance> getCloseNeighbors() {
        return closeNeighbors;
    }

    public List<Distance> getFarNeighbors() {
        return farNeighbors;
    }
}
