import org.joda.time.LocalDate;

public class DateOut {
    LocalDate ld = new LocalDate();
    public static void main(String[] args){
        DateOut doi = new DateOut();
        doi.dateNow();
        doi.resultDate();

    }

    public LocalDate dateNow(){
        LocalDate ld = new LocalDate();
        return ld;
    }

    public LocalDate resultDate(){
        LocalDate result = ld.plusDays(15);
        return result;
    }

}