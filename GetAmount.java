public class GetAmount {
    public static void main(String[] args) {
        Customer c=new Customer(50000);
        new Thread(){
            public void run(){
                c.withdraw(300000);
            }
        }.start();
        new Thread(){
            public void run(){
                c.deposit(1000);
            }
        }.start();
    }
    
}
