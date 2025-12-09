public class CTableDisplayUsingthread {
     public synchronized void PrintTable(int n){

     
    for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
            try {
                Thread.sleep(100);
                
            } catch (Exception e) {
            }
        }


    }
    public static void main(String[] args) {
        CTableDisplayUsingthread t=new CTableDisplayUsingthread();
        Thread t1=new Thread(){
             public void run(){
            t.PrintTable(20);
        }

        };
        t1.start();
         Thread t2=new Thread(){
             public void run(){
            t.PrintTable(10);
        }

        };
        t2.start();


    }

}



    
    

