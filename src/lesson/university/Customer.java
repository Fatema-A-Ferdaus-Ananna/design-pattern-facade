package lesson.university;

public class Customer extends Person {

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void customer_information(){
        System.out.print("             Customer Information :\n"+
                         "            =======================\n" );
        System.out.print("Customer Email           : "+ email +
                         "\nCustomer Name            : "+ getName() +
                         "\nCustomer Address         : "+ getAddress() +
                         "\nCustomer Contact Number  : "+ getContact_no());
    }
}
