

 abstract class swap{
    int a=10;
    int b=20; 
    abstract void swapp();
    }
class swapp extends swap
{
      public void swapp()
    {
       int temp;
         temp=a;
        a=b;
        b=temp;
         System.out.println("a value is:"+a);
        System.out.println("a value is:"+b);

    }
 
        public static void main(String[] args) {
        System.out.println("Hello, World!"); 
       
        swap js=new swapp();
        js.swapp();
       
       
    }
}
