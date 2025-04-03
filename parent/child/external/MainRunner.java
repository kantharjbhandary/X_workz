package parent.child.external;

import parent.child.internal.*;

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
        System.out.println("====================");
        Apple apple=new Apple();
        apple.bestSeason();
        apple.commonFruits();
        apple.nutrition();
        apple.popularBrands();
        apple.totalVarieties();
        System.out.println("====================");
        Fruits fruits=new Fruits();
        fruits.bestSeason();
        fruits.commonFruits();
        fruits.nutrition();
        fruits.popularBrands();
        fruits.totalVarieties();
        System.out.println("===================");

        Fruits fruits1=new Apple();
        fruits1.bestSeason();
        fruits1.commonFruits();
        fruits1.nutrition();
        fruits1.popularBrands();
        fruits1.totalVarieties();

        System.out.println("====================");

        Fruits fruits2=new Mango();
        fruits2.bestSeason();
        fruits2.commonFruits();
        fruits2.nutrition();
        fruits2.popularBrands();
        fruits2.totalVarieties();

        System.out.println("=======================");
        Fruits fruits3=new Blueberry();
        fruits3.bestSeason();
        fruits3.commonFruits();
        fruits3.nutrition();
        fruits3.popularBrands();
        fruits3.totalVarieties();

        System.out.println("=======================");
        Fruits fruits4=new Coconut();
        fruits4.bestSeason();
        fruits4.commonFruits();
        fruits4.nutrition();
        fruits4.popularBrands();
        fruits4.totalVarieties();

        System.out.println("=======================");
        Fruits fruits5=new Cherry();
        fruits5.bestSeason();
        fruits5.commonFruits();
        fruits5.nutrition();
        fruits5.popularBrands();
        fruits5.totalVarieties();

        System.out.println("=======================");
        Fruits fruits6=new Banana();
        fruits6.bestSeason();
        fruits6.commonFruits();
        fruits6.nutrition();
        fruits6.popularBrands();
        fruits6.totalVarieties();

        System.out.println("=======================");
        Fruits fruits7=new Guava();
        fruits7.bestSeason();
        fruits7.commonFruits();
        fruits7.nutrition();
        fruits7.popularBrands();
        fruits7.totalVarieties();

        System.out.println("=======================");
        Fruits fruits8=new JackFruit();
        fruits8.bestSeason();
        fruits8.commonFruits();
        fruits8.nutrition();
        fruits8.popularBrands();
        fruits8.totalVarieties();

        System.out.println("=======================");
        Fruits fruits9=new Kivi();
        fruits9.bestSeason();
        fruits9.commonFruits();
        fruits9.nutrition();
        fruits9.popularBrands();
        fruits9.totalVarieties();

        System.out.println("=======================");
        Fruits fruits10=new Banana();
        fruits10.bestSeason();
        fruits10.commonFruits();
        fruits10.nutrition();
        fruits10.popularBrands();
        fruits10.totalVarieties();

        System.out.println("=======================");
        Fruits fruits11=new Pinapple();
        fruits11.bestSeason();
        fruits11.commonFruits();
        fruits11.nutrition();
        fruits11.popularBrands();
        fruits11.totalVarieties();

        System.out.println("=======================");
        Fruits fruits12=new Watermelon();
        fruits12.bestSeason();
        fruits12.commonFruits();
        fruits12.nutrition();
        fruits12.popularBrands();
        fruits12.totalVarieties();

        System.out.println("=======================");
        Fruits fruits13=new Pomegranate();
        fruits13.bestSeason();
        fruits13.commonFruits();
        fruits13.nutrition();
        fruits13.popularBrands();
        fruits13.totalVarieties();
        System.out.println("=============");
        Sport sport=new Sport();
        sport.entertainmentValue();
        sport.scoringSystem();
        sport.skillAndStrategy();
        sport.sportsmanship();
        sport.trainingAndPractice();

        System.out.println("==============");
        Sport sport1=new Boxing();
        sport1.entertainmentValue();
        sport1.scoringSystem();
        sport1.skillAndStrategy();
        sport1.sportsmanship();
        sport1.trainingAndPractice();


        System.out.println("==============");
        Sport sport2=new Cycling();
        sport2.entertainmentValue();
        sport2.scoringSystem();
        sport2.skillAndStrategy();
        sport2.sportsmanship();
        sport2.trainingAndPractice();

        System.out.println("==============");
        Sport sport3=new Golf();
        sport3.entertainmentValue();
        sport3.scoringSystem();
        sport3.skillAndStrategy();
        sport3.sportsmanship();
        sport3.trainingAndPractice();

        System.out.println("==============");
        Sport sport4=new Boxing();
        sport4.entertainmentValue();
        sport4.scoringSystem();
        sport4.skillAndStrategy();
        sport4.sportsmanship();
        sport4.trainingAndPractice();

        System.out.println("==============");
        Sport sport5=new Rugby();
        sport5.entertainmentValue();
        sport5.scoringSystem();
        sport5.skillAndStrategy();
        sport5.sportsmanship();
        sport5.trainingAndPractice();

        System.out.println("==============");
        Sport sport6=new Tennis();
        sport6.entertainmentValue();
        sport6.scoringSystem();
        sport6.skillAndStrategy();
        sport6.sportsmanship();
        sport6.trainingAndPractice();


        System.out.println("==============");
        Sport sport7=new Basketball();
        sport7.entertainmentValue();
        sport7.scoringSystem();
        sport7.skillAndStrategy();
        sport7.sportsmanship();
        sport7.trainingAndPractice();


        System.out.println("==============");
        Sport sport8=new Football();
        sport8.entertainmentValue();
        sport8.scoringSystem();
        sport8.skillAndStrategy();
        sport8.sportsmanship();
        sport8.trainingAndPractice();

        System.out.println("==============");
        Sport sport9=new Wrestling();
        sport9.entertainmentValue();
        sport9.scoringSystem();
        sport9.skillAndStrategy();
        sport9.sportsmanship();
        sport9.trainingAndPractice();

        System.out.println("==============");
        Sport sport10=new TableTennis();
        sport10.entertainmentValue();
        sport10.scoringSystem();
        sport10.skillAndStrategy();
        sport10.sportsmanship();
        sport10.trainingAndPractice();

        System.out.println("==============");
        Sport sport11=new Golf();
        sport11.entertainmentValue();
        sport11.scoringSystem();
        sport11.skillAndStrategy();
        sport11.sportsmanship();
        sport11.trainingAndPractice();
    }
}
