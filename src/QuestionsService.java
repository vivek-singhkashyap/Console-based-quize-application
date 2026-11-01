import java.util.Scanner;

public class QuestionsService {

    Questions question [] = new Questions[5];
    String selection[] = new String[5];
    QuestionsService() {
        question[0] = new Questions(1, "default value of boolean", "true", "false", "0", "null", "false");
        question[1] = new Questions(2, "size of short", "1 byte", "2 bytes", "4 bytes", "8 bytes", "2 bytes");
        question[2] = new Questions(3, "size of float", "2 bytes", "4 bytes", "8 bytes", "16 bytes", "4 bytes");
        question[3] = new Questions(4, "size of byte", "1 byte", "2 bytes", "4 bytes", "8 bytes", "1 byte");
        question[4] = new Questions(5, "default value of int", "0", "1", "null", "garbage", "0");
        System.out.println(question[0].getQuestion());
    }

    public void displayQuestions() {
        int i = 0;
        for (Questions q : question) {
            System.out.println("Question no " + q.getId() + ": " + q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            System.out.println();

            Scanner sc = new Scanner(System.in);
             selection[i] = sc.nextLine();
             i++;
        }
        for (String s : selection) {
            System.out.print("Answer given: " + s + " ");
            System.out.println();
        }
    }
    public void printScores() {
        int score = 0;
        for (int  i = 0; i < question.length; i++ ) {
            Questions que = question[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];

            if (actualAnswer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your Score: " + score );
    }
}
