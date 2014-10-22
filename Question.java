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
public class Question {

   
    private String content;
    protected char correctChoice;
    
    public String getContent() {
        
        return content;
        
    }//getContent()
    public void setContent(String content) {
        
        this.content = content;
        
    }//setContent()
    public char getCorrectAnswer() {
    
        return correctChoice;
    
    }//getString()
    public void setCorrect(String correctanswer) {
        
        this.correctChoice = correctChoice;
        
    }//setCorrect()
    public String toString() {
        
        
        return this.content;
        
    }//toString()
   
    
 
}//Question
