package parent.child.external;

import parent.child.internal.Cricket;
import parent.child.internal.TestMatch;

public class TestMatchRunner {
    public static void main(String[] args) {
        Cricket cricket=new Cricket();
        cricket.matchLocation();
        cricket.sponsers();
        cricket.matchTime();
        cricket.totalRuns();
        cricket.totalWickets();
        System.out.println("===================");
        TestMatch testMatch=new TestMatch();
        testMatch.matchLocation();
        testMatch.matchTime();
        testMatch.sponsers();
        testMatch.totalRuns();
        testMatch.totalWickets();
        System.out.println("===================");

        Cricket cricket1=new TestMatch();
        cricket1.matchLocation();
        cricket1.matchTime();
        cricket1.sponsers();
        cricket1.totalRuns();
        cricket1.totalWickets();
        System.out.println("===================");
    }
}
