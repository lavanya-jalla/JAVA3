public class Customer {
    double bal;
    public Customer(double bal ){
        this.bal=bal;

    }
    public void getbal(){
        System.out.println("Balnce: "+bal);
    }
    public synchronized void withdraw(double amount){
        System.out.println("Going to withdrawlll");
        if(amount>bal){
            System.out.println("Less balance");
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        bal=bal-amount;
        System.out.println("Withdrawl completed");
        getbal();
    }
    public synchronized void deposit(double amount){
        System.out.println("going to deposit");
        bal=bal+amount;
        System.out.println("Deposit completed");
        getbal();
        notify();

    }
    
}
