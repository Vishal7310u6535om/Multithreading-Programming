class ThreadPriority{
    public static void main(String[] args) {
        A threadA=new A();
        B threadB=new B();
        C threadC=new C();
        threadC.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(threadA.getPriority()+1);
        threadA.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Start thread A:");
        threadA.start();

        System.out.println("Start thread B:");
        threadB.start();
        System.out.println("Start thread C:");
        threadC.start();
        System.out.println("End of main Thread:");

    }
}
class A extends Thread{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("\t From Thread A:="+i);
        }
        System.out.println("\t Exit from thread A");
    }
}
class B extends Thread{
    public void run()
    {
        System.out.println("\t Start Thread B:");
        for(int j=1;j<=10;j++)
        {
            System.out.println("\t From thread B:="+j);
        }
        System.out.println("\t Exit from Thread B");
    }
}
class C extends Thread{
    public void run()
    {
        System.out.println("\t Start Thread C");
        for(int k=1;k<=10;k++)
        {
            System.out.println("\t From Thread C:="+k);
        }
        System.out.println("\t Exit from Thread C:");
    }
}
