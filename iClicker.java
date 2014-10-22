/*
 * Vanik Gevorgyan
   iClickerSimulator
   CS356, Yu Sun
 */

package iclickersimulator;

import java.util.HashMap;

/**
 *
 * @author vanik
 */
public interface iClicker {
    
    public void submitAnswer(String studentID, char choice);
    public void countChoice(char choice);
    public Question getQuestion();
    public void setQuestion(Question question);
    
}//iClicker
