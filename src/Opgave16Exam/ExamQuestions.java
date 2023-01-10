package Opgave16Exam;

import java.util.Random;

public class ExamQuestions {
    private int number;
    private String grade;
    public ExamQuestions(int number){
        this.number = number;
    }
    public void setGrade(){
        String [] grades = {"A","B","C","D","E","F"};
        Random random = new Random();
        grade = grades[random.nextInt(0,6)];

    }
   // public String getGrade(){
     //   return grade;
    // }

    public String toString(){
        return "Question number " + number + " grade: " + grade;
    }

    //-------------------------------------------------//
    public static void main(String[] args) {
        for (int i= 0; i < 14 ; i++){
            ExamQuestions question = new ExamQuestions(i);
            question.setGrade();

            System.out.println(question);


        }
    }






}