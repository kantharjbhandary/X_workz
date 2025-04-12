package com.comparison.app;

public class Runner {
    public static void main(String[] args) {
        Adapter adapter = new Adapter("blue", 10, "redmi");
        Adapter adapter1 = new Adapter("blue", 10, "redmi");
        System.out.println("they are same :" + adapter1.equals(adapter));

        Bag bag = new Bag("leather", 15, "brown");
        Bag bag1 = new Bag("leather", 15, "brown");
        System.out.println("they are same :" + bag1.equals(bag));

        Ball ball = new Ball("football", 5, "white");
        Ball ball1 = new Ball("football", 5, "white");
        System.out.println("they are same :" + ball1.equals(ball));

        Basket basket = new Basket("fruit", 8, "green");
        Basket basket1 = new Basket("fruit", 8, "green");
        System.out.println("they are same :" + basket1.equals(basket));

        Bat bat = new Bat("cricket", 6, "wooden");
        Bat bat1 = new Bat("cricket", 6, "wooden");
        System.out.println("they are same :" + bat1.equals(bat));

        Biscuit biscuit = new Biscuit("oreo", 2, "chocolate");
        Biscuit biscuit1 = new Biscuit("oreo", 2, "chocolate");
        System.out.println("they are same :" + biscuit1.equals(biscuit));

        Board board = new Board("whiteboard", 3, "white");
        Board board1 = new Board("whiteboard", 3, "white");
        System.out.println("they are same :" + board1.equals(board));

        Book book = new Book("math", 7, "blue");
        Book book1 = new Book("math", 7, "blue");
        System.out.println("they are same :" + book1.equals(book));

        Bottle bottle = new Bottle("water", 1, "transparent");
        Bottle bottle1 = new Bottle("water", 1, "transparent");
        System.out.println("they are same :" + bottle1.equals(bottle));

        Bracelet bracelet = new Bracelet("silver", 2, "metallic");
        Bracelet bracelet1 = new Bracelet("silver", 2, "metallic");
        System.out.println("they are same :" + bracelet1.equals(bracelet));

        Broom broom = new Broom("plastic", 3, "brown");
        Broom broom1 = new Broom("plastic", 3, "brown");
        System.out.println("they are same :" + broom1.equals(broom));

        Brush brush = new Brush("paint", 5, "yellow");
        Brush brush1 = new Brush("paint", 5, "yellow");
        System.out.println("they are same :" + brush1.equals(brush));

        Bulb bulb = new Bulb("LED", 2, "white");
        Bulb bulb1 = new Bulb("LED", 2, "white");
        System.out.println("they are same :" + bulb1.equals(bulb));

        Camera camera = new Camera("nikon", 6, "black");
        Camera camera1 = new Camera("nikon", 6, "black");
        System.out.println("they are same :" + camera1.equals(camera));

        Canvas canvas = new Canvas("cotton", 5, "cream");
        Canvas canvas1 = new Canvas("cotton", 5, "cream");
        System.out.println("they are same :" + canvas1.equals(canvas));

        Chair chair = new Chair("office", 10, "black");
        Chair chair1 = new Chair("office", 10, "black");
        System.out.println("they are same :" + chair1.equals(chair));

        Clock clock = new Clock("wall", 3, "white");
        Clock clock1 = new Clock("wall", 3, "white");
        System.out.println("they are same :" + clock1.equals(clock));

        Comb comb = new Comb("plastic", 2, "black");
        Comb comb1 = new Comb("plastic", 2, "black");
        System.out.println("they are same :" + comb1.equals(comb));

        Crayon crayon = new Crayon("wax", 1, "multicolor");
        Crayon crayon1 = new Crayon("wax", 1, "multicolor");
        System.out.println("they are same :" + crayon1.equals(crayon));

        Cup cup = new Cup("tea", 2, "white");
        Cup cup1 = new Cup("tea", 2, "white");
        System.out.println("they are same :" + cup1.equals(cup));

        Cushion cushion = new Cushion("soft", 3, "red");
        Cushion cushion1 = new Cushion("soft", 3, "red");
        System.out.println("they are same :" + cushion1.equals(cushion));

    }
}