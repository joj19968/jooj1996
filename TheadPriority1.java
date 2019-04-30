/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theadpriority1;

/**
 *
 * @author Jawaher
 */

    class A extends Thread{
        public void run(){ 
            System.out.println("thread A started");
                    for(int i=0;i<2;i++){
             
                System.out.println("from A =i"+i);}
                    System.out.println("thread A exit");
                
            }
        }
      class B extends Thread{
        public void run(){ 
            System.out.println("thread B started");
                    for(int j=0;j<2;j++){
             
                System.out.println("from B =j"+j);}
                    System.out.println("thread b exit");
                
            }
        }
        class C extends Thread{
        public void run(){ 
            System.out.println("thread C started");
                    for(int k=0;k<2;k++){
             
                System.out.println("from C =k"+k);}
                    System.out.println("thread C exit");
                
            }
        }
            
    
public class TheadPriority1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A ThreadA = new A();
        B ThreadB = new B();
        C ThreadC = new C();
        //ThreadC.setPriority(Thread.MAX_PRIORITY);
        //ThreadB.setPriority(ThreadA.getPriority()+1);
        //ThreadA.setPriority(Thread.MIN_PRIORITY);
        System.out.println("started Thread A");
        ThreadA.start(); 
        ThreadA.setPriority(Thread.MAX_PRIORITY);
         int x=ThreadA.getPriority();
          System.out.println("the prioprity of thread A"+x);
          
        
        
        System.out.println("started Thread B");
        ThreadB.start();
        ThreadB.setPriority(Thread.MIN_PRIORITY);
        int y =ThreadB.getPriority();
         System.out.println("the prioprity of thread "+y);
         
        System.out.println("started Thread C");
        
        ThreadC.start();
       int z= ThreadC.getPriority();
       System.out.println("the prioprity of thread "+z);
       int w=z+3;
        ThreadC.setPriority(w);
       int v=ThreadC.getPriority();
        System.out.println("the prioprity of thread c"+v);
       
    }
    
    
}
