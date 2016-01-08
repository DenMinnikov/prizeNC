import java.util.ArrayList;
import java.util.List;

public class Prize {


    private int prizeAge;
    private String prizeName;



    public void setPrizeAge(int prizeAge){
        this.prizeAge = prizeAge;
    }

    public void setPrizeName(String prizeName){
        this.prizeName = prizeName;
    }

    public int getPrizeAge() {return prizeAge;}
    public String getPrizeName() {return prizeName;}


    public String toString(){
        return (getPrizeName() + " " + getPrizeAge());
    }
}
