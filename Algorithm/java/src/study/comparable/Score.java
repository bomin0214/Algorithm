package study.comparable;

public class Score implements Comparable<Score> {
    public int english;
    public int math;

    public Score(int english, int math){
        this.english=english;
        this.math=math;
    }

    @Override
    public String toString(){
        return "Score{" + "english" + english + ", math=" + math + "}";
    }

    @Override
    public int compareTo(Score o){
        if(this.english == o.english)
            return o.math - this.math;
        return o.english-this.english;
    }
}
