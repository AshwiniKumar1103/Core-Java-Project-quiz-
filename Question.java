public class Question {
    private int id;
    private String questions;
    private String Option1;
    private String Option2;
    private String Option3;
    private String Option4;
    private String Answer;

    public void setValue(int _id,String _questions,String _option1,String _option2,String _option3,String _option4,String _Answer ){
        this.id=_id;
        this.questions=_questions;
        this.Option1=_option1;
        this.Option2=_option2;
        this.Option3=_option3;
        this.Option4=_option4;
        this.Answer=_Answer;
    }

    public int getId() {
        return id;
    }

    public String getQuestions() {
        return questions;
    }

    public String getOption1() {
        return Option1;
    }

    public String getOption2() {
        return Option2;
    }

    public String getOption3() {
        return Option3;
    }

    public String getOption4() {
        return Option4;
    }

    public String getAnswer() {
        return Answer;
    }

    
    
}
