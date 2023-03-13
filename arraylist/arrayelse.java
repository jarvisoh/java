import java.util.*;
  
class jss {
    public void create(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    }

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[],brr[],crr[],drr[],err[];


ArrayList<Integer> demo=new ArrayList<>();


demo.add(1);
demo.add(16);
demo.add(13);
demo.add(14);
demo.add(15);
int n=demo.get(1);

memo.addAll(demo);
//demo.remove(0);

demo.sort(Comparator.naturalOrder());
System.out.println(demo);

demo.set(2,20);
System.out.println(memo);
System.out.println(n);


}
}