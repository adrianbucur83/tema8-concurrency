package com.siit.adi;

import java.util.ArrayList;
import java.util.Collections;
import static com.siit.adi.TicketType.*;

public class FestivalGate {

    ArrayList<TicketType> tickets = new ArrayList<>();

    public void addTicket(TicketType ticketType){
        tickets.add(ticketType);
    }

    void countTickets(){

        //    FULLVIP, FULL, FREEPASS, ONEDAY, ONEDAYVIP

        System.out.println();

        System.out.println("----------------- LIVE STATS ---------------");
        System.out.println("Total tickets sold: " + tickets.size());
        System.out.println("FULLVIP " + Collections.frequency(tickets, FULLVIP));
        System.out.println("FULL " + Collections.frequency(tickets, FULL));
        System.out.println("FREEPASS " + Collections.frequency(tickets, FREEPASS));
        System.out.println("ONEDAY " + Collections.frequency(tickets, ONEDAY));
        System.out.println("ONEDAYVIP " + Collections.frequency(tickets, ONEDAYVIP));

        System.out.println();

    }

}
