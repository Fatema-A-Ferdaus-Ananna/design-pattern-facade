package lesson.university;

public class PNogod implements Payment{

    private Double price;

    public PNogod(Double price){
        this.price = price;
    }



    @Override
    public double calculate_charge(Double price) {
        return price * 0.01;
    }

    @Override
    public void payment_information(){
        System.out.print("\n\n        Transaction\n" +
                         "       ==============\n");

        System.out.print("Total Product Price     :  " + price + " BDT" +
                         "\nNogaod Charge(1%)       :  " + calculate_charge(price) + " BDT" +
                         "\nTotal Payable           :  " +(price+calculate_charge(price)) + " BDT" );


    }
}
