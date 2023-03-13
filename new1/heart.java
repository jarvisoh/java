class test{
    public static void heart()
    {
    int n=7;
    int x=7;
    int y=14;
        for(int i=0;i<7;i++)

        {
            System.out.print("\n");

            for(int j=0;j<20;j++)
            {
                
                if(((j>=x)&&(j<=y)&&((i!=0)||(j!=14)&&(j!=7))))
                {
                   if((i==6)&&(j!=1))
                   {
                    System.out.print(j);
                   }
                   
             System.out.print("*");
                }
                else
                {
                      
                }
            }
             if(i<=5)
                {
                    x=x-1;
                    y=y+1;
                }
                else
                {
                    x=x-1;
                    y=y-1;
                }
        }
       
    }
    public static void sub()
    {

    }
        
    public static void main(String args[])
    {
        test ts=new test();
        ts.heart();
      
    }
}