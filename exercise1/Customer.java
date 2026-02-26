public class Customer {
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
    String firstName;
    String lastName;
    String socSecurityNum;
    Address billingAddress;
    Address shippingAddress;

    public Customer (String firstName, String lastName, String socSecurityNum){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecurityNum = socSecurityNum;
    }

    public String toString() {
        return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum + "]";
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocSecurityNum() {
        return socSecurityNum;
    }

    public void setSocSecurityNum(String socSecurityNum) {
        this.socSecurityNum = socSecurityNum;
    }
}
