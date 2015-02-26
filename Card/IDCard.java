public class IDCard extends Card
{  
    public String idNumber;
    
    public IDCard(String n, String id){
        super(n);
        idNumber = id;
    }
    
    public String format(){
        String message = super.format();
        message += "\nID Number:" + idNumber;
        return message;
    }
}