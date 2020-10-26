package APCS.quizProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class quiz {
    private ArrayList<Question> questions;

    public quiz() throws FileNotFoundException {
        questions = new ArrayList<Question>(10);
        File questionFile = new File("questions");
        File answerFile = new File("answers");
        Scanner questionRead = new Scanner(questionFile);
        Scanner answerRead = new Scanner(answerFile);
        while (questionRead.hasNext() && answerRead.hasNext())
        {
            questions.add(new Question(questionRead.nextLine(), answerRead.nextLine()));
        }
        questionRead.close();
        answerRead.close();
    }

    public void addQuestion(String question, String answer, int complexity) throws IOException
    {
        Question q = new Question(question + " (Level: " + complexity + ")", answer);
        questions.add(q);

        File questionFile = new File("questions");
        File answerFile = new File("answers");
        FileWriter qWrite = new FileWriter(questionFile, true);
        FileWriter aWrite = new FileWriter(answerFile, true);
        qWrite.write(q.getQuestion());
        aWrite.write(q.getAnswer());
        qWrite.close();
        aWrite.close();
    }
    public int giveQuiz()
    {
        int score = 0;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < questions.size(); i++)
        {
            System.out.println(questions.get(i).getQuestion());
            String ans = input.nextLine();
            if(ans == questions.get(i).getAnswer())
            {
                System.out.println("Correct");
                score++;
            }
            else{
                System.out.println("Wrong! The answer is " + questions.get(i).getAnswer());
            }
        }
        input.close();
        return score;
    }
}
