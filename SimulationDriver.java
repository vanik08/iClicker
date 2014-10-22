/*
 * Vanik Gevorgyan
   iClickerSimulator
   CS356, Yu Sun
 */

package iclickersimulator;

import java.util.ArrayList;

public class SimulationDriver {
 
    private int type; //0 - mutianswer, 1- right/wrong
    private ArrayList<Question> questionList;
    private ArrayList<Character> correctAnswerList;
    private ArrayList<Character> studentAnswers;
   
    
    public int getQuestionType() {
        
        return type;
        
    }//questionType()
    public void setQuestionType(int type) {
        
        this.type = type;
        
    }//setQuestionType
    public ArrayList<Question> getQuestionList() {
       
        return questionList;
    
    }//getQuestionList()
    public void setQuestionList(ArrayList<Question> questions) {
        
        for(int i=0; i < questionList.size(); i++) {
            
            questionList.add(questions.get(i));
            correctAnswerList.add(questions.get(i).getCorrectAnswer());
            
        }//for     
        
    }//setQuestionList()
    public void takeAnswers() {
        
        for(int i=0; i < questionList.size(); i++) {
            
            char ans = studentAnswers.get(i);
            char correctAns = questionList.get(i).correctChoice;
            
            
        }//for
        
    }//takeAnswers()
    public static void main(String[] args) {
        
        
        multianswerQuestion question = generateMultiChoiceQuestion();
        
        
        Student[] students = new Student[30];
        
        iClickerService iclicker = new iClickerService(question);
        
        for(int i=0; i < 30; i++) {           
            students[i] = new Student(i + "");
            students[i].setStudentAnswer(getRandomMultiAnswer());
            iclicker.submitAnswer(students[i].getStudentID(), students[i].getStudentAnswer());
                    
        }//for
        System.out.println(iclicker.toString());
        
        //OTHER QUESTIN TYPE
        rightwrongQuestion question2 = generateRightwrongQuestion();
        Student[] students2 = new Student[30];
        iClickerService iclicker2 = new iClickerService(question);
        
        for(int i=0; i < 30; i++) {           
            students2[i] = new Student(i + "");
            students2[i].setStudentAnswer(getRandomRightWrongAnswer());
            iclicker2.submitAnswer(students2[i].getStudentID(), students2[i].getStudentAnswer());
                    
        }//for
        System.out.println(iclicker2.toString());
        
        
        
        
    
    }//main()
    public static multianswerQuestion generateMultiChoiceQuestion() {
        multianswerQuestion q1 = new multianswerQuestion();
        q1.setContent("Who is the 4th President of the United States?");
        
        String[] answers = new String[4];
        answers[0] = "Thomas Jefferson";
        answers[1] = "John Adams";
        answers[2] = "John Quincy Adams";
        answers[3] = "James Madison";
        
        q1.setAnswers(answers);
        q1.setCorrect("D");
        
        return q1;
    }//newMultipleChoiceQuestion
    public static rightwrongQuestion generateRightwrongQuestion() {
        
        rightwrongQuestion q1 = new rightwrongQuestion();
        q1.setContent("Was Napoleon over 6 feet tall?");
        q1.setCorrect("2");
        return q1;
        
    }//generateRightWrongQuestion
    public static char getRandomMultiAnswer() {
        
        int randomChoice = (int)(Math.random()*4);
        switch(randomChoice) {
                case 0:
                    return 'A';
                case 1:
                    return 'B';
                case 2:
                    return 'C';
                case 3:
                    return 'D';
            
            }//switch
            return 'X'; //invalid result
    }//getRandomMultiAnswer()
    public static char getRandomRightWrongAnswer() {
        
        int randomChoice = (int)(Math.random()*2);
        switch(randomChoice) {
                case 0:
                    return '1';
                case 1:
                    return '2';          
            }//switch
            return 'X'; //invalid result
    }//getRandomAnswer()
}//iClickerService
