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
        System.out.print("js");
    }
}
class js1{
   
    public static void main(String[] args)
    {

ex e=new ex();
exx d=new exx();
e.add();
d.add();
    }

}
