/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priority;

/**
 *
 * @author Jawaher
 */
class priority implements Runnable{ 
    public void run(){
        for(int x=1;x<=3;x++)
             System.out.println(x+" this is thread"+Thread.currentThread().getName());
        
    }
    
}
public class Priority {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread t1 = new Thread(new priority(),"  thread A");
        Thread t2= new Thread(new priority(),"Thread B");
        Thread t3=new Thread(new priority(),"ThreadC");
        t3.setPriority(10);
        t1.start();
        t2.start();
        t3.start();
        
    }
    
}
