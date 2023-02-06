import java.util.*;
class Student{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
int[][][] student_arr= {
{
{10, 20, 30},
{20, 30, 40}
},
{
{40, 50, 60},
{10, 70, 80},
}
};
int[][][] arr= new int[2][2][2];
arr[0][0][0]=sc.nextInt();
arr[0][0][1]=sc.nextInt();
arr[0][0][2]=sc.nextInt();
for (int tables = 0; tables<2; tables++)
{
for (int rows= 0; rows <2; rows++)
{
for (int columns= 0; columns<3; columns++)
{
System.out.print("student_arr[" +tables+ "][" +rows+ "][" +columns+ "] = "
+student_arr[tables][rows][columns]+ "\t");
}
System.out.println();
}
System.out.println();
}
}
}