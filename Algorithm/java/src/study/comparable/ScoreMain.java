package study.comparable;

import study.comparator.ScoreComparator;

import java.util.ArrayList;
import java.util.Collections;

public class ScoreMain {
    public static void main(String[] args) {
        ArrayList<Score> myarr = new ArrayList<>();
        myarr.add(new Score(80, 100));
        myarr.add(new Score(100, 50));
        myarr.add(new Score(70, 100));
        myarr.add(new Score(80, 90));

//        Collections.sort(myarr);
        Collections.sort(myarr, new ScoreComparator());
        for(Score s : myarr)
            System.out.println(s.toString());
    }
}
