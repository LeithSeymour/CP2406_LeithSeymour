package Prac6;

class DebugCustomer
{
    private int idNumber;
    private String name;
    private double credit;
    double creditLimit;
    private int purchases;


    DebugCustomer(int id, String name, double credit, int purchases)
    {
       idNumber = id;
       this.name = name;
       this.credit = credit;
       this.purchases = purchases;
    }
     void display()
    {
       System.out.println("Customer #" + idNumber +
          " Name: " +  name + "\nCredit limit $" + creditLimit);
    }
}
