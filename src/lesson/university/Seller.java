package lesson.university;

import java.util.ArrayList;
import java.util.Random;

public class Seller extends Person {


    ArrayList<Product> product_list = new ArrayList<Product>();

    public void product_insertion() {

        for(int count = 1; count<=10; count++){
            Product product = new Product();
            product.setProduct_id("p00"+count);
            product.setProduct_price((double)getRandomNumberUsingNextInt(80, 2000));
            product_list.add(product);
        }

    }
    public ArrayList<Product> getProduct_list() {
        return product_list;
    }

    public void print_product_info(ArrayList<Product> product_list){
        System.out.println("         Product List\n" +
                            "     ===================");
        System.out.println(" ProductID        Product Price \n"+
                           "------------      -------------");
        for (Product product : product_list){
            System.out.println("   " +product.getProduct_id() + "\t\t\t\t\t" + product.getProduct_price());
        }

    }

    private int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public void seller_information(){
        System.out.print("\n\n\n");
        System.out.print("              Seller Information :\n"+
                         "            =======================\n" );
        System.out.print("Seller Name            : "+ getName() +
                         "\nShop Address           : "+ getAddress() +
                         "\nSeller Contact Number  : "+ getContact_no()+"\n\n"
        );
        print_product_info(product_list);
    }

}
