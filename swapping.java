// Your First Program

class swap {

    public void swapp()
    {
        int a=10,b=20,temp;
  System.out.println("a value is:"+a);
        System.out.println("b value is:"+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("aftr swap ");
        System.out.println("a value is:"+a);
        System.out.println("b value is:"+b);
        
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
       
        swap js=new swap();
        js.swapp();
    }
}