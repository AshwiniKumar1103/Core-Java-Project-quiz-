import java.util.Scanner;
public class questionService {
    int [] UserInput=new int[5];
    Question [] questionz = new Question[5];
    questionService(){
        questionz[0]=new  Question(1,"what is capital of India",new String[]{"delhi","kolkata","goa","bangalore"},1);
        questionz[1]=new  Question(2,"what is capital of India",new String[]{"delhi","kolkata","goa","bangalore"},1);
        questionz[2]=new  Question(3,"what is capital of India",new String[]{"delhi","kolkata","goa","bangalore"},1);
        questionz[3]=new  Question(4,"what is capital of India",new String[]{"delhi","kolkata","goa","bangalore"},1);
        questionz[4]=new  Question(5,"what is capital of India",new String[]{"delhi","kolkata","goa","bangalore"},1);
    }
    public void Continue(int a,int _z){
        if(a>4){
            System.out.println("Invalid input, Try again");
            Scanner sc = new Scanner(System.in);
            Continue(sc.nextInt(),_z);
        }
        else{
        UserInput[_z]=a;
        }
    }
    public void displayQuestion(){
       for(Question q:questionz){
        int z=0;
        System.out.println(q.getId()+":"+q.getQuestions());
        for(int i=0;i<4;i++){
            System.out.println(" "+(i+1)+" "+q.getOption()[i]);
        }
        Scanner sc = new Scanner(System.in);
        Continue(sc.nextInt(),z);
         z++;
        System.out.println();
       }
    }
}
