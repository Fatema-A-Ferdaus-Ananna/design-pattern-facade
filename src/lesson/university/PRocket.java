package lesson.university;

public class PRocket implements Payment{

    private Double price;

    public PRocket(Double price){
        this.price = price;
    }


    @Override
    public double calculate_charge(Double price) {
        return price * 0.02;
    }

    @Override
    public void payment_information(){

        System.out.print("\n\n        Transaction\n" +
                "       ==============\n");

        System.out.print("Total Product Price      :  " + price + " BDT" +
                         "\nRocket Charge(2%)      :  " + calculate_charge(price) + " BDT" +
                         "\nTotal Payable            :  " +(price+calculate_charge(price)) + " BDT" );

    }
}
