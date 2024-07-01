package lesson.university;

public class PBkash implements Payment{

    private Double price;

    public PBkash(Double price){
        this.price = price;
    }


    @Override
    public double calculate_charge(Double price) {
        return price * 0.012;
    }

    @Override
    public void payment_information(){

        System.out.print("\n\n        Transaction\n" +
                          "       ==============\n");

        System.out.print("Total Product Price     :  " + price + " BDT" +
                         "\nBKash Charge(1.2%)      :  " + calculate_charge(price) + " BDT" +
                         "\nTotal Payable           :  " +(price+calculate_charge(price)) + " BDT" );

    }
}
