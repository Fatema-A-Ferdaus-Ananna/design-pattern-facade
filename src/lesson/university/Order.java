package lesson.university;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {

    private static ArrayList<Product> order_list = new ArrayList<>();

    public static void order_insertion(ArrayList<Product> list){


        System.out.print("\n\n             ~Ordering Process~\n"+
                         "             -------------------");

        int choice=1;
        while(choice == 1){
            System.out.print("\nEnter Product ID from Product List for Order :  ");
            Scanner scanner = new Scanner(System.in);
            String product_id_insertion = scanner.nextLine();

            boolean result = search(list,product_id_insertion);
            if(result){

                System.out.println("Product Added to the Order List!\n");
            }
            else {
                System.out.println("Product not Found\n");
            }

            System.out.print("Slect 1 : For Continue Ordering\n" +
                             "Slect 0 : For Exit Ordering ---- : ");
            choice = scanner.nextInt();
            System.out.println("");
        }

        print_order_info(order_list);
    }

    private static boolean search(ArrayList<Product> list, String product_id_insertion){
        for (Product product : list){
            if (product_id_insertion.equals(product.getProduct_id())){
                order_list.add(product);
                return true;
            }
        }
        return false;
    }


    public static ArrayList<Product> getOrder_list() {
        return order_list;
    }


    public static double total_price(ArrayList<Product> order_list){

        double total_price = 0;
        for (Product product : order_list){

            total_price = total_price +  product.getProduct_price();
        }
        return total_price;
    }

    public static void print_order_info(ArrayList<Product> order_list){
        System.out.println("         Order List\n" +
                "     ===================");
        System.out.println(" ProductID        Product Price \n"+
                "------------      -------------");
        for (Product product : order_list){
            System.out.println("   " +product.getProduct_id() + "\t\t\t\t\t" + product.getProduct_price());
        }
        System.out.println("-------------------------------");
        System.out.print("TotalCost ------------  " + total_price( order_list) + " BDT");

    }
}
