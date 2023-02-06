class Cubic {
    public static void main(String[] args) 
    {
        System.out.println("Enter a Number:");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=1;
        for(int i=0;i<a;i++)
        {   
            System.out.println("Cubic:"+(b*b*b));
            b++;
        }
    }
}