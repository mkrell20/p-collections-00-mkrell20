package cat.daw.m3.main;

import cat.daw.m3.nivell1.teatre.Theater1;
import cat.daw.m3.nivell2.teatre.Seat2;
import cat.daw.m3.nivell2.teatre.Theater2;
import cat.daw.m3.nivell2.teatre.Theater2HashSet;
import cat.daw.m3.nivell2.teatre.Theater2LinkedHashSet;
import cat.daw.m3.nivell2.teatre.Theater2LinkedList;
import cat.daw.m3.nivell2.teatre.Theater2TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        /** Nivell 1 */
        //nivell1IntWrapper();
        //nivell1CharWrapper();
        teatre1();

        //** Nivell 2 */
        //nivell2Generics();
        //teatre2Collections();
        //teatre2LinearSearch();

    }


    //************ Nivell 1 *****************
    private static void nivell1IntWrapper(){
        //TODO
    }

    private static void nivell1CharWrapper(){
        //TODO
    }

    private static void teatre1(){
        Theater1 teatre = new Theater1("Apollo", 7, 10);
        teatre.printSeats();
        
        String seatNumber = "A04";
        if(teatre.reserveSeat(seatNumber)){
            System.out.printf("Paga%n");
        } 

        if(teatre.reserveSeat(seatNumber)){
            System.out.printf("Paga%n");
        } 

        seatNumber = "A06";
        if(teatre.reserveSeat(seatNumber)){
            System.out.printf("Paga%n");
        } 

        teatre.printReservedSeats();

        teatre.cancelSeatReservation(seatNumber);

        teatre.cancelSeatReservation(seatNumber);

        teatre.printReservedSeats();
    }

    //************ Nivell 2 *****************
    private static void nivell2Generics(){
        //TODO
    }

    private static void teatre2Collections(){
        //TODO        
    }

    private static void teatre2LinearSearch(){
        //TODO
    }
}
