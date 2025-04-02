package parent.child.external;

import parent.child.internal.Cloth;
import parent.child.internal.Cricket;
import parent.child.internal.Jeans;
import parent.child.internal.TestMatch;

public class MainRunner {
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


        Cloth cloth=new Cloth();
        cloth.cost();
        cloth.durability();
        cloth.material();
        cloth.warrenty();
        cloth.size();
        System.out.println("===================");
        Jeans jeans=new Jeans();
        jeans.cost();;
        jeans.durability();
        jeans.material();
        jeans.size();
        jeans.warrenty();
        System.out.println("===================");
        Cloth cloth1=new Jeans();
        cloth1.size();
        cloth1.material();
        cloth1.warrenty();
        cloth1.cost();
        cloth1.warrenty();
    }
}
