class BankCustomer
{
    String name;
    int accno;
    int age;

    BankCustomer(String n,int acc,int Age)
    {
        name=n;
        accno=acc;
        age=Age;
    }

    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Account NO: "+accno);
        System.out.println("Age: "+age);
    }
}
public class Main {
    public static void main(String[] args) {
        BankCustomer c= new BankCustomer("Ram", 1001, 30);
        c.display();
    }
}