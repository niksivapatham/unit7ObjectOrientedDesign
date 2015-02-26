import java.util.GregorianCalendar;

public class DriverLicense extends Card
{
    private String exp;
    private int current_year;

    public DriverLicense(String n, String expiration)
    {
        super(n);
        exp = expiration;
        GregorianCalendar calendar = new GregorianCalendar();
        current_year = calendar.get(Calendar.YEAR);
    }

    public String format(){
        String message = super.format();
        message += "\nExpiration Year: " + exp;
        return message;
    }

    public boolean isExpired()
    {
        int expirationYear = Integer.parseInt(exp);
        if (expirationYear>current_year){
            return false;
        } else {
            return true;
        }
    }
}
