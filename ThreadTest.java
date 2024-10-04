class ThreadTest{
    public static void main(String[] args) {
        A threadA=new A();
        B threaB=new B();
        C threadC=new C();
        threadA.run();
        threaB.run();
        threadC.run();
    }
}
class A extends Thread{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
        System.out.println("From thread A:"+i);
     
       }
       System.out.println("Exit from thread A");
    }
}
class B extends Thread{
    public void run()
    {
        for(int j=5;j<=20;j++)
        {
            System.err.println("\t From Thread B :"+j);
        }
        System.out.println("Exit from thread B");
    }
}
class C extends Thread{
    public void run()
    {
        for(int k=1;k<50;k++)
        {
            System.out.println("\t From thread C"+k);
        }
        System.err.println("Exit from thread C");
    }
}