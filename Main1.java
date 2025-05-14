class TransactionHistory
{
    int id;
    String sname;
    String rname;
    String status;
    String date;

    TransactionHistory(int ID,String s,String r,String stat, String d)
    {
        id=ID;
        sname=s;
        rname=r;
        status=stat;
        date=d;
    }

    public void show()
    {
        System.out.println("Transaction ID: "+id);
        System.out.println("Sender Name: "+sname);
        System.out.println("Reciver Name: "+rname);
        System.out.println("Transaction Status: "+status);
        System.out.println("Transaction Date: "+date);
    }

}
public class Main1 {
    public static void main(String[] args) {
        BankCustomer c= new BankCustomer("Ram", 1001, 30);
        c.display();
   

        TransactionHistory t=new TransactionHistory(101,"laxman","Ram", "Successful", "01-5-2025");
        t.show();
    }
}
