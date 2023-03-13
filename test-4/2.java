import java.util.*;
  
class jss {

public static void main(String[] args)
{

ArrayList<Integer> test=new ArrayList<>();

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

int k=5;
test.add(2);
test.add(3);
test.add(2);
test.add(0);
test.add(1);
//System.out.println(test);
while(n-->0)
{
    System.out.print("Aftr days:");
System.out.println(test);
int count=0;


for(int i=0;i<k;i++)
{
   if(test.get(i)>0)
   {
   test.set(i,test.get(i)-1);
   }
   else
   { 
    count++;
     test.set(i,6);
   }
  
}
k=k+1;
for(int j=0;j<count;j++)
{
test.add(8);
}
count=0;

//System.out.print(count);


}

}
}