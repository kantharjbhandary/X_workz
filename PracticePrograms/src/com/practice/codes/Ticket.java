package com.march.thu20;

public class Ticket {
    enum TicketType {
        Online, offline, cash;
    }
    void cost()
    {
        System.out.println("cost for "+TicketType.Online+" is : "+1000);
        System.out.println("cost for "+TicketType.offline+" is : "+899);
        System.out.println("cost for "+TicketType.cash+" is : "+799);


    }
    void buy()
    {
        System.out.println("VIP ticket should be taken "+TicketType.Online);
        System.out.println("PREMIUM ticket should be taken " +TicketType.offline);
        System.out.println("NORMAL ticket should be taken "+TicketType.cash);
    }
    void sell()
    {
        System.out.println("Running sell method");
    }
    void watch()
    {
        System.out.println("Running watch method");
    }


}
