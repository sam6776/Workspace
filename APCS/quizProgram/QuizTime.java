package APCS.quizProgram;

import java.io.FileNotFoundException;
import java.io.IOException;

public class QuizTime {
    public static void main(String[] args) throws FileNotFoundException {
        Question q1 = new Question("What is the meaning of life?", "42");
        Question q2 = new Question("What does f(x)=2x+3 equal when x = 3?", "9");
        Question q3 = new Question("How many feet in a mile?", "5280 feet");
        Question q4 = new Question("What is the capital of Pennsylvania?", "Harrisburg");
        Question q5 = new Question("What state is the city Welch is?", "West Virginia");
        Question q6 = new Question("What is the cake?", "A lie");
        Question q7 = new Question("Who wrote The Art of War?", "Sun Tzu");
        Question q8 = new Question("What is the world record for a 5K?", "12:35.26");
        Question q9 = new Question("What company made the Model M keyboard?", "IMB");
        Question q10 = new Question("What grade does Sam deserve for this?", "A+");
        Question q11 = new Question("How many questions was this quiz?", "11");
        Quiz quiz = new Quiz();
        try {
            quiz.addQuestion(q1, 10);
            quiz.addQuestion(q2, 3);
            quiz.addQuestion(q3, 5);
            quiz.addQuestion(q4, 1);
            quiz.addQuestion(q5, 7);
            quiz.addQuestion(q6, 4);
            quiz.addQuestion(q7, 6);
            quiz.addQuestion(q8, 9);
            quiz.addQuestion(q9, 3);
            quiz.addQuestion(q10, 0);
            quiz.addQuestion(q11, 11);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        int score = quiz.giveQuiz();
        System.out.println("You got: " + score + "/11!");
    }
}
