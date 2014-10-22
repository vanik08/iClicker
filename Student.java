/*
 * Vanik Gevorgyan
   iClickerSimulator
   CS356, Yu Sun
 */

package iclickersimulator;


public class Student {
    
    private String studentID;
    private char studentAnswer;

    public Student() {
        this.studentID = "UNASSIGNED";
    }//Student()
    public Student(String studentID) {
        this.studentID = studentID;
    }//Student(StudentID)
    public char submitAnswer(Question q) {
         return studentAnswer;        
    }//submitAnswer
    public char getStudentAnswer() {
        return studentAnswer;
    }//getStudentAnswer
    public void setStudentAnswer(char studentAnswer) {
        this.studentAnswer = studentAnswer;
    }//setStudentAnswer
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    
}//Student
