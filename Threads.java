package Threadtopic;

public class Threads extends Thread {
    public Threads(ThreadGroup group1, String name) {
    }
    // public Threads(ThreadGroup group1, String name){
    //     super(group1, new Runnable(),name); 
            
    //     }
    

    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getThreadGroup());
    }
    
    
}
