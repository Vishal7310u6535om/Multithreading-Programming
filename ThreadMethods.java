class ThreadMethods{
    public static void main(String args[]){
A threadA=new A();
B threadB=new B();
C threadC=new C();
threadA.start();
threadB.start();
threadC.start();
System.out.println("End of main Thread");

    }
}
class A extends Thread{
    public void run()
    {
        for(int i=1;i<=10;i++){
            if(i==1)
            yield();
            System.out.println("\t From Thread A: i="+i);
        }
        System.out.println("Exit from thread A:");
    }
}
class B extends Thread{
    public void run()
    {
        for(int j=1;j<=10;j++)
        {
            System.out.println("\t From Thread B: J="+j);
            if(j==3)
            stop();
        }
        System.out.println("Exit from Thread B:");
    }
}
class C extends Thread{
    public void run()
    {
        for(int k=1;k<=10;k++)
        {
            System.out.println("\t From Thread C:k="+k);
            if(k==1)
            try {
                sleep(1000);
            } catch (Exception e) {
            }
        }System.out.println("Exit from C");
    }
}