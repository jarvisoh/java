interface js{
   void add();
}
class ex implements js{
   public void add()
    {
        System.out.print("js");
    }
}
class js1{
   
    public static void main(String[] args)
    {

ex e=new ex();
e.add();
    }

}
