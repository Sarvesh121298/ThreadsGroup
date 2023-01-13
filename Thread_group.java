package Threadtopic;

public class Thread_group {
    public static void main(String[] args) {
        Threads threadDemo=new Threads(null, null);
        ThreadGroup group1 = new ThreadGroup("Group1");
        Thread t1 = new Thread (group1 ,threadDemo, "1");
        Thread t2 = new Thread (group1 ,threadDemo, "2");
        Thread t3 = new Thread (group1 ,threadDemo, "3");
        Thread t4 = new Thread (group1 ,threadDemo, "4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println( group1.activeCount());
        //group1.destroy();

    }
    
}
