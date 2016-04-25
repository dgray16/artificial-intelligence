/**
 * Created by Administrator on 09.03.2016.
 */
public class Distance {

    private City from;

    private City to;

    private int amount;

    public Distance(City from, City to, int amount){
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public City getFrom() {
        return from;
    }
    public void setFrom(City from) {
        this.from = from;
    }

    public City getTo() {
        return to;
    }
    public void setTo(City to) {
        this.to = to;
    }

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
