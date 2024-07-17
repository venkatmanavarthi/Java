public class Question {
    String question;
    int id;
    String options[];
    String answer;
    
    Question(String question, int id, String options[], String answer) {
        this.question = question;
        this.id = id;
        this.options = options;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String[] getOptions() {
        return options;
    }
    public void setOptions(String[] options) {
        this.options = options;
    }
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
