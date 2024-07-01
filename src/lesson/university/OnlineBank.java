package lesson.university;

import java.util.Scanner;

public class OnlineBank{


    public void payment_option(Double price){

        System.out.print("\n\n\n          Payment \n" +
                         "        ==================\n");
        System.out.print("Chose Your Payment Option:\n" +
                          "---------------------------\n");
        System.out.print("BKash  ------------- B\n"+
                         "Nogod  ------------- N\n"+
                         "Rocket ------------- R\n" + ":");


        Scanner payment_chose = new Scanner(System.in);
        char chose = payment_chose.next().charAt(0);

        switch (chose){
            case  'B' :
                PBkash pBkash = new PBkash(price);
                pBkash.payment_information();
                break;

            case  'N' :
                PNogod pNogod = new PNogod(price);
                pNogod.payment_information();
                break;

            case  'R' :
                PRocket pRocket = new PRocket(price);
                pRocket.payment_information();
                break;
        }
    }

}
