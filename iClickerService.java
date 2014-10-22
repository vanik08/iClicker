/*
 * Vanik Gevorgyan
   iClickerSimulator
   CS356, Yu Sun
 */

package iclickersimulator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author vanik
 */
public class iClickerService implements iClicker {

    private Question question;
    private char correctChoice;
    private int numAs, numBs, numCs, numDs, num1s, num2s;
    HashMap<String, Character> uniqueAnswers = new HashMap<String, Character>();
    

    public void submitAnswer(String studentID, char choice) {
        
        countChoice(choice);
        
        if(uniqueAnswers.containsKey(studentID)) {
            uniqueAnswers.remove(studentID);
            uniqueAnswers.put(studentID, choice);
        }//if
        else
            uniqueAnswers.put(studentID, choice);
      
    }//submitAnswer
    public void countChoice(char choice) {
        
        switch(choice) {
            case 'A':
                numAs +=1;
                break;
            case 'B':
                numBs +=1;
                break;
            case 'C':
                numCs +=1;
                break;
            case 'D':
                numDs +=1;
                break;
            case '1':
                num1s +=1;
                break;
            case '2':
                num2s +=1;
                break;
            
        }//switch
        
    }//countChoice()
    public iClickerService(Question question) {
        this.question = question;
        correctChoice = question.correctChoice;
    }//Question(question)
    public Question getQuestion() {
        return question;
    }//getQuestion()
    public void setQuestion(Question question) {
        this.question = question;
    } 
    public String toString() {   
        
        if(num1s < 1 && num2s < 2)
            return "A: " + numAs + " B: " + numBs + " Cs " + numCs + " Ds " + numDs; 
        else
            return "Right: " + num1s + " Wrong: " + num2s;
     
    }//toString()
    
 
}
