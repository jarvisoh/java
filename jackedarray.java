class jss{
    public static void main(String[] args)
    {
        int arr[][]={{100,200,300},{100},{100,200},{400,500,900,400},{900}};
        for (int i=0;i<arr.length;i++)
        {
            System.out.print("\n");
            for(int j=0;j<arr[i].length;j++)
            {
                
            System.out.print(arr[i][j]+" ");
            }
        }
    }
}