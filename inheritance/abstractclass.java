abstract class js{
    abstract void add();
}
class ex extends js{
    void add()
    {
        System.out.print("js");
    }
}
class exx extends js{
    void add()
    {
        System.out.print("js1");
    }
}
class js1{
   
    public static void main(String[] args)
    {

js d=new exx();
js e=new ex();

e.add();
d.add();
    }

}
