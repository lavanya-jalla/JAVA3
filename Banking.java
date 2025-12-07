public class Banking {
    static void valid(int bal) throws InsufficientFundsException{
        int fixedbal=2000;
       
        if(bal>fixedbal){
            throw new InsufficientFundsException("Withdrawl not possible");
        }
        else{

            // bal+=fixedbal;
            System.out.println("Adding to your Account" +bal);
        }

    }
    public static void main(String[] args) {
        try {
            
            valid(25000);
            valid(100);
        } catch (Exception e) {
            System.out.println("Withdrwal not possible");
        }
    }
    
}
