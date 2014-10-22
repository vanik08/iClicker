/*
 * Vanik Gevorgyan
   iClickerSimulator
   CS356, Yu Sun
 */

package iclickersimulator;

/**
 *
 * @author vanik
 */
public class multianswerQuestion extends Question{
    
    final private char[] possibleAnswers = {'A', 'B', 'C', 'D'};
    private String[] answersContent;

 
    public multianswerQuestion() {
        
        answersContent = new String[4];
        
    }//constructor
    public String[] getIncorrectAnswers() {
        return answersContent;
    }
    public void setAnswers(String[] inAnswers) {
        
        for(int i=0; i < this.answersContent.length; i++)
            this.answersContent[i] = inAnswers[i];
    }//setIncorrectAnswers
    public boolean isCorrect() {
        
        boolean isCorrect = false;
        for(char c: possibleAnswers) {
            
            if(c == super.correctChoice)
                isCorrect = true;
            
        }//for
        return isCorrect;
        
        
    }//checkCorrect()
    public String toString() {
        
        
        String result = super.toString() + "\n";
        for(String s: answersContent)
            result += s + "\n";
        
        return result;
 
    }//toString
    
}
