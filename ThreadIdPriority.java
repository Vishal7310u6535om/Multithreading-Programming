class ThreadIdPriority{
    public static void main(String[] args) {
     A threadA=new A();
     B threadB=new B();
     threadA.setPriority(Thread.MIN_PRIORITY);
     threadB.setPriority(Thread.MAX_PRIORITY);   
        System.out.println("This is the main Thread \t Thread ID:"+Thread.currentThread().getId()+"\t Thread Priority:"+Thread.currentThread().getPriority()+"\n");
    System.out.println("Lets call other Thread in sequence A->B->C\n");
    threadA.start();
    threadB.start();
    }
}
class A extends Thread{
    public void run()
    {
    System.out.println("This is Thread A\t Thread ID:"+Thread.currentThread().getId()+"\t Thread Priority:"+Thread.currentThread().getPriority());
    }
}

class B extends Thread{
    public void run()
    {
    System.out.println("This is Thread B\t Thread ID:"+Thread.currentThread().getId()+"\t Thread Priority:"+Thread.currentThread().getPriority());
    }
}
