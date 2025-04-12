package com.comparison.app;

public class Runner {
    public static void main(String[] args) {
        Adapter adapter = new Adapter("M", "default", 1);
        Adapter adapter1 = new Adapter("M", "default", 1);
        System.out.println("they are same :" + adapter1.equals(adapter));

        Bag bag = new Bag("M", "adidas", 20);
        Bag bag1 = new Bag("M", "adidas", 20);
        System.out.println("they are same :" + bag1.equals(bag));

        Ball ball = new Ball("5", "nike", 3);
        Ball ball1 = new Ball("5", "nike", 3);
        System.out.println("they are same :" + ball1.equals(ball));

        Basket basket = new Basket("M", "default", 1);
        Basket basket1 = new Basket("M", "default", 1);
        System.out.println("they are same :" + basket1.equals(basket));

        Bat bat = new Bat("M", "default", 1);
        Bat bat1 = new Bat("M", "default", 1);
        System.out.println("they are same :" + bat1.equals(bat));

        Biscuit biscuit = new Biscuit("M", "default", 1);
        Biscuit biscuit1 = new Biscuit("M", "default", 1);
        System.out.println("they are same :" + biscuit1.equals(biscuit));

        Board board = new Board("M", "default", 1);
        Board board1 = new Board("M", "default", 1);
        System.out.println("they are same :" + board1.equals(board));

        Book book = new Book("M", "default", 1);
        Book book1 = new Book("M", "default", 1);
        System.out.println("they are same :" + book1.equals(book));

        Bottle bottle = new Bottle("1L", "milton", 2);
        Bottle bottle1 = new Bottle("1L", "milton", 2);
        System.out.println("they are same :" + bottle1.equals(bottle));

        Bracelet bracelet = new Bracelet("M", "default", 1);
        Bracelet bracelet1 = new Bracelet("M", "default", 1);
        System.out.println("they are same :" + bracelet1.equals(bracelet));

        Broom broom = new Broom("M", "default", 1);
        Broom broom1 = new Broom("M", "default", 1);
        System.out.println("they are same :" + broom1.equals(broom));

        Brush brush = new Brush("Small", "colgate", 4);
        Brush brush1 = new Brush("Small", "colgate", 4);
        System.out.println("they are same :" + brush1.equals(brush));

        Bucket bucket = new Bucket("20L", "asian", 1);
        Bucket bucket1 = new Bucket("20L", "asian", 1);
        System.out.println("they are same :" + bucket1.equals(bucket));

        Bulb bulb = new Bulb("40W", "philips", 6);
        Bulb bulb1 = new Bulb("40W", "philips", 6);
        System.out.println("they are same :" + bulb1.equals(bulb));

        Cable cable = new Cable("M", "default", 1);
        Cable cable1 = new Cable("M", "default", 1);
        System.out.println("they are same :" + cable1.equals(cable));

        Camera camera = new Camera("DSLR", "canon", 1);
        Camera camera1 = new Camera("DSLR", "canon", 1);
        System.out.println("they are same :" + camera1.equals(camera));

        Canvas canvas = new Canvas("M", "default", 1);
        Canvas canvas1 = new Canvas("M", "default", 1);
        System.out.println("they are same :" + canvas1.equals(canvas));

        Carpet carpet = new Carpet("M", "default", 1);
        Carpet carpet1 = new Carpet("M", "default", 1);
        System.out.println("they are same :" + carpet1.equals(carpet));

        Chain chain = new Chain("M", "default", 1);
        Chain chain1 = new Chain("M", "default", 1);
        System.out.println("they are same :" + chain1.equals(chain));

        Chair chair = new Chair("Standard", "nilkamal", 6);
        Chair chair1 = new Chair("Standard", "nilkamal", 6);
        System.out.println("they are same :" + chair1.equals(chair));

        Charger charger = new Charger("Fast", "samsung", 2);
        Charger charger1 = new Charger("Fast", "samsung", 2);
        System.out.println("they are same :" + charger1.equals(charger));

        Clip clip = new Clip("M", "default", 1);
        Clip clip1 = new Clip("M", "default", 1);
        System.out.println("they are same :" + clip1.equals(clip));

        Clock clock = new Clock("Wall", "seiko", 1);
        Clock clock1 = new Clock("Wall", "seiko", 1);
        System.out.println("they are same :" + clock1.equals(clock));

        Comb comb = new Comb("M", "default", 1);
        Comb comb1 = new Comb("M", "default", 1);
        System.out.println("they are same :" + comb1.equals(comb));

        Crayon crayon = new Crayon("M", "default", 1);
        Crayon crayon1 = new Crayon("M", "default", 1);
        System.out.println("they are same :" + crayon1.equals(crayon));

        Cup cup = new Cup("Mug", "ceramic", 3);
        Cup cup1 = new Cup("Mug", "ceramic", 3);
        System.out.println("they are same :" + cup1.equals(cup));

        Curtain curtain = new Curtain("Long", "spaces", 4);
        Curtain curtain1 = new Curtain("Long", "spaces", 4);
        System.out.println("they are same :" + curtain1.equals(curtain));

        Cushion cushion = new Cushion("Soft", "homecentre", 2);
        Cushion cushion1 = new Cushion("Soft", "homecentre", 2);
        System.out.println("they are same :" + cushion1.equals(cushion));

        Document document = new Document("M", "default", 1);
        Document document1 = new Document("M", "default", 1);
        System.out.println("they are same :" + document1.equals(document));

        Door door = new Door("Wooden", "greenply", 1);
        Door door1 = new Door("Wooden", "greenply", 1);
        System.out.println("they are same :" + door1.equals(door));

    }
}