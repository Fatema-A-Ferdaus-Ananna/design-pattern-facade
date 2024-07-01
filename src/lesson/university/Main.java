package lesson.university;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Seller seller = new Seller();
        seller.setName("Ananna");
        seller.setAddress("Shyamoli Square 2nd Floor, Adabor, Dhaka-1207");
        seller.setContact_no("000066481");
        seller.product_insertion();
        seller.seller_information();

        Customer customer = new Customer();
        customer.setEmail("ferdaus35-2959@diu.edu.bd");
        customer.setName("Fatema-A-Ferdaus");
        customer.setAddress("Golden Street, Ring Road, Adabor, Dhaka-1207");
        customer.setContact_no("012345678911");
        customer.customer_information();
        Order.order_insertion(seller.getProduct_list());

        OnlineBank onlineBank = new OnlineBank();
        onlineBank.payment_option(Order.total_price(Order.getOrder_list()));

    }



}
