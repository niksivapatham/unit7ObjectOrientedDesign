
public class CallingCard extends Card
{
    public String cardNumber;
    public String pin;
    
    public CallingCard(String n, String cardNumber, String pin)
    {
        super(n);
        cardNumber = cardNumber;
        pin = pin;
    }
    
    public String format(){
        String message = super.format();
        message += "\nCard Number:" + cardNumber;
        message += "\nPin: " + pin;
        return message;
    }
}
