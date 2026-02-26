public class Main {
    /* Problem: 1 – Class & Objects
Create your own Customer class. A Customer has a firstName, lastName,
socSecurityNum (which you can represent as a String), also it has billingAddress and a
shippingAddress(which you can represent as a type of Address. Initialize billingAddress
and shippingAddress through its setter from Customer class.
Create a constructor for your Customer class to initialize firstName, lastName and
socSecurityNum. Create getter, and setter methods for all five attributes.
Create an Address class with the attributes such as street, city, state and zip(which you
can represent as a String). Create a constructor to initialize fields of Address class.
Your Customer class should have a toString() method that provides a string
representation of the customer. A typical toString() output would be "[Joe, Smith, ssn:
332-221-4444]". Just copy this code in your Customer class.
public String toString() {
return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum + "]";
}
In the main method of a Main class, create three instances of Customer (be sure to create
instances of Address to populate their billingAddress and shippingAddress fields using
setters). Add these instances to an array. Then loop through the array and print to the
console all those Customers whose billingAddress is located in the city of Chicago (when
you create instances of Customer initially, be sure to create at least one Customer whose
billing address is in Chicago). */
    public static void main(String[] args) {

        //Customer 1,2 and 3
        Customer customer1 = new Customer("Damian","Riot", "123123123123");
        Customer customer2 = new Customer("Andrew","Ronda","987987987987");
        Customer customer3 = new Customer("Joe","Doe","76776767676767");

        //Billing and shipping addresses for customer 1,2 and 3

        Address billAddCst1 = new Address("Louis St", "Iowa City", "IA", "70998");
        Address shipAddCst1 = new Address("Charlie St", "Iowa City", "IA", "70998");

        customer1.setBillingAddress(billAddCst1);
        customer1.setShippingAddress(shipAddCst1);

        Address billAddCst2 = new Address("Catlin St", "Chicago", "TX", "78654");
        Address shipAddCst2 = new Address("Catlin St","Houston","TX","78654");

        customer2.setBillingAddress(billAddCst2);
        customer2.setShippingAddress(shipAddCst2);

        Address billAddCst3 = new Address("Foxtroth St", "Chicago", "IL", "75432");
        Address shipAddCst3 = new Address("Swan St", "Chicago", "IL", "75432");

        customer3.setBillingAddress(billAddCst3);
        customer3.setShippingAddress(shipAddCst3);

        Customer [] cusArray = {customer1,customer2,customer3};

        for (int i =0; i<cusArray.length; i++){
            String billAddress = cusArray[i].getBillingAddress().city.toString();
            if (billAddress.equals("Chicago")){
                System.out.println(cusArray[i].firstName + " " + cusArray[i].lastName + " Billing Address on Chicago.");
            }
        }

    }
}