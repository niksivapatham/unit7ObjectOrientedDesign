public class ChoiceQuestion extends Question
{
    private int numberOfChoices;
    public ChoiceQuestion()
    {
        super();
        numberOfChoices = 0;        
    }
    
    public void addChoice( String choice, boolean correct)
    {
        numberOfChoices++;
        
        super.addText( "\n" + numberOfChoices + ")" + choice);
        
        if (correct)
        {
            String choiceAnswer = "" + numberOfChoices;
            super.setAnswer( choiceAnswer );
        }
        
    }
}
