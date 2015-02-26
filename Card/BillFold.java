public class BillFold
{
    private Card card1;
    private Card card2;

    public BillFold()
    {

    }

    public void addCard(Card card)
    {
        if (card1 == null){
            card1 = card;
        } else if (card2 == null){
            card2 = card;
        }
    }

    public String formatCards()
    {
        String message = card1.format() + "\n" + card2.format();
        return message;
    }
    
}
