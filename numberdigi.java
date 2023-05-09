import java.util.*;
class js{

    public static void main(String[] args)
    {
int n=56701557;
int dig,hig=0;

while(n>0)
{
dig=n%1000;
//    while (number > 0) {
//             digit = number % 10;
//             if (digit > maxDigit && digit <= 9) {
//                 maxDigit = digit;
//             }
//             number /= 10;
// }


if((hig<dig))
{
    hig=dig;
//
}
  n=n/10;
}
System.out.print(hig);
  
}

       

}
