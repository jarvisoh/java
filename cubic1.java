
interface swap
{
    public abstract void swapping(int var1,int var2);
}
class mai implements swap
{   
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
     public void swapping(int a,int b)
    {
        int temp;
        temp=a;
        a=b;
        b=temp;
        print(a,b);
    }
        void print(int a,int b)
        {
            System.out.println("After Swapping A:"+a);
            System.out.println("After Swapping B:"+b);
        }
        public static void main(String args[])
        {
            System.out.println("Enter A:");
            System.out.println("Enter B:");
            mai m=new mai();
            m.swapping(m.a,m.b);
        }
    }
