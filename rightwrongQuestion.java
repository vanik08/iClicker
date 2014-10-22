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
public class rightwrongQuestion extends Question{
    
    final private char[] possibleAnswers= {'1', '2'};
    private String incorrectAnswer;

    
    public String getIncorrectAnswer() {
        return incorrectAnswer;
    }//getIncorrectAnswer

    public void setIncorrectAnswer(String incorrectAnswer) {
        this.incorrectAnswer = incorrectAnswer;
    }//setIncorrectAnswer  
    public boolean isCorrect() {
        
        boolean isCorrect = false;
        for(char c: possibleAnswers) {
            
            if(c == super.correctChoice)
                isCorrect = true;
            
        }//for
        return isCorrect;
        
        
    }//checkCorrect()
    
}
