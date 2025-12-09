public class MultiThreading extends Thread {
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getPriority());
    
            
            System.out.println(i);
            try {
                
                Thread.sleep(100,100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
    public static void main(String[] args)throws Exception {
        MultiThreading t1=new MultiThreading();
        t1.setPriority(10);
        t1.start();
        t1.join();

        MultiThreading t2=new MultiThreading();
        t2.setName("Two");
        t2.start();//runnable
         MultiThreading t3=new MultiThreading();
         
         t3.setName("Three");
          
        t3.start();

    
       
        }
    

    
}
