package APCS.quizProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions;

    public Quiz() throws FileNotFoundException {
        questions = new ArrayList<Question>(10);
        File questionFile = new File("questions");
        File answerFile = new File("answers");
        File compFile = new File("complexity");
        Scanner questionRead = new Scanner(questionFile);
        Scanner answerRead = new Scanner(answerFile);
        Scanner comp = new Scanner(compFile);
        while (questionRead.hasNext() && answerRead.hasNext() && comp.hasNext())
        {
            Question q = new Question(questionRead.nextLine(), answerRead.nextLine());
            q.setComplexity(Integer.parseInt(comp.nextLine()));
            questions.add(q);
        }
        questionRead.close();
        answerRead.close();
        comp.close();
    }

    public void addQuestion(Question question, int complexity) throws IOException
    {
        File questionFile = new File("questions");
        File answerFile = new File("answers");
        File compFile = new File("complexity");
        Scanner qScan = new Scanner(answerFile);
        FileWriter cWrite = new FileWriter(compFile, true);
        FileWriter qWrite = new FileWriter(questionFile, true);
        FileWriter aWrite = new FileWriter(answerFile, true);
        boolean notCopied = true;
        while(qScan.hasNext())
        {
            if(question.getAnswer().equals(qScan.nextLine()))
            {
                notCopied = false;
                break;
            }
        }
        if(notCopied)
        {
            question.setComplexity(complexity);
            questions.add(question);
            qWrite.write(question.getQuestion() + "\n");
            aWrite.write(question.getAnswer() + "\n");
            cWrite.write(question.getComplexity() + "\n");
        }
        qWrite.close();
        aWrite.close();
        cWrite.close();
        qScan.close();
    }
    /** giveQuiz
     * Gives the user a quiz based on the questions in the quiz arraylist
     * @return The score the user got 
     */
    public int giveQuiz()
    {
        int score = 0;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < questions.size(); i++)
        {
            System.out.println(questions.get(i).getQuestion());
            String ans = input.nextLine();
            if(ans.equals(questions.get(i).getAnswer()))
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
