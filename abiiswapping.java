interface swap{
    
    public void app();
    }
class app implements swap
{
      public void app()
    {
        int a=10;
        in t b=20; 
       int temp;
         temp=a;
        a=b;
        b=temp;
         System.out.println("a value is:"+a);
        System.out.println("b value is:"+b);

    }
 
        public static void main(String[] args) {
        System.out.println("Hello, World!"); 
       
        app js=new app();
        js.app();
       
       
    }
}

///     System.out.printf("%-15s%03d",s1,x);