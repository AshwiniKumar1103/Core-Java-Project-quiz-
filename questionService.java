
import java.util.Scanner;

public class questionService {
    int[] UserInput = new int[5];
    private int z = 0;
    private int Score=0;
    private int earlyResultCounter=0;
    Question[] questionz = new Question[5];

    questionService() {
        questionz[0] = new Question(1, "what is capital of India",
                new String[] { "delhi", "kolkata", "goa", "bangalore" }, 1);
        questionz[1] = new Question(2, "what is capital of India",
                new String[] { "delhi", "kolkata", "goa", "bangalore" }, 1);
        questionz[2] = new Question(3, "what is capital of India",
                new String[] { "delhi", "kolkata", "goa", "bangalore" }, 1);
        questionz[3] = new Question(4, "what is capital of India",
                new String[] { "delhi", "kolkata", "goa", "bangalore" }, 1);
        questionz[4] = new Question(5, "what is capital of India",
                new String[] { "delhi", "kolkata", "goa", "bangalore" }, 1);
    }

    public int Continue(int a, int _z, int k) {
        if (a > 4) {
            k++;
            if (k > 2) {
                System.out.println("Maximum tries reached");
                for(int i=0;i<earlyResultCounter;i++){
                    CheckResult(UserInput[i], questionz[i].getAnswer());
                }
                earlyResultCounter=0;
                System.out.println("You have Answered "+Score+" questions and Your Score is "+Score*10);
                return 0;
            }
            System.out.println("Invalid input, Try again");
            Scanner sc = new Scanner(System.in);
            return Continue(sc.nextInt(), _z, k);
        } else {
            UserInput[_z] = a;
            earlyResultCounter++;
            return 1;
        }
    }
    public void CheckResult(int _UserInput, int _Answer){
        if(_UserInput==_Answer){
            Score++;
        }
    }

    public int displayQuestion() {
        for (Question q : questionz) {
            int k = 0;
            System.out.println(q.getId() + ":" + q.getQuestions());
            for (int i = 0; i < 4; i++) {
                System.out.println(" " + (i + 1) + " " + q.getOption()[i]);
            }
            Scanner sc = new Scanner(System.in);
            int counter = Continue(sc.nextInt(), z, k);
            System.out.println(counter);
            if (counter == 0) {
                return 0;
            }
            z++;
            System.out.println();
        }
        for(int i=0;i<UserInput.length;i++){
            CheckResult(UserInput[i], questionz[i].getAnswer());
        }
         System.out.println("You have Answered "+Score+" questions and Your Score is "+Score*10);
        return 0;
    }
}
