public class TableSync {
    public synchronized void PrintTable(int n) {
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
            try {
                Thread.sleep(100);
                
            } catch (Exception e) {
            }
        }


    }
}
    class First extends Thread{
        TableSync t;
        public First(TableSync t){

            this.t=t;
        }
        public void run(){
            t.PrintTable(20);
        }

    }
     class Second extends Thread{
        TableSync t;
        public Second(TableSync t){

            this.t=t;
        }
        public void run(){
            t.PrintTable(40);
        }

    } class Third extends Thread{
        TableSync t;
        public Third(TableSync t){

            this.t=t;
        }
        public void run(){
            t.PrintTable(60);
        }

    }
   
    
    

