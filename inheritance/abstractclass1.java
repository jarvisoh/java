abstract class js{
    js()
    {
        System.out.println("abstarct");  
    }
    abstract void add();
    void run()
    {
        System.out.println("tsadfaf");  
    }
}
class ex extends js{
    void add()
    {
        System.out.println("js");
    }
}

class js1{
   
    public static void main(String[] args)
    {

//js e=new exx();
js e=new ex();

e.add();
e.run();
    }

}
