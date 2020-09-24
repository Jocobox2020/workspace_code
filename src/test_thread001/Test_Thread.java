package test_thread001;

public class Test_Thread {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        Ticket t1 = new Ticket();
        Ticket t2 = new Ticket();
        Ticket t3 = new Ticket();
        t.start();
        t1.start();
        t2.start();
        t3.start();

    }



     static class Ticket extends Thread{
        static private int tic = 100;
         @Override
         public void run(){
           while (true){
               if (tic>0){
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println(tic--);
               }
           }
        }
    }
}

