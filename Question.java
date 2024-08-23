public class Question {
    private int id;
    private String questions;
    private String []Option =new String[5];
    private int Answer;

    public Question(int _id,String _questions,String [] _option,int _Answer ){
        this.id=_id;
        this.questions=_questions;
        this.Answer=_Answer;
        this.Option=_option;
        this.Answer=_Answer;
    }

    public int getId() {
        return id;
    }

    public String getQuestions() {
        return questions;
    }

    public String[] getOption() {
        return Option;
    }

    public int getAnswer() {
        return Answer;
    }
}
