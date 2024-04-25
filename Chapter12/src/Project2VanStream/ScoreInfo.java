package Project2VanStream;

public class ScoreInfo {
    int score;
    Student student;

    public ScoreInfo(int score, Student student){
        this.score=score;
        this.student=student;
    }

    public int getScore() {
        return score;
    }

    public Student getStudent() {
        return student;
    }

    @Override
    public String toString(){
        return student.toString()+" - Score: "+score;
    }
}
