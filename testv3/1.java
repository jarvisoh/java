// .Given a string S consisting of N, lower case English alphabet, it is also given that a string is encrypted by first replacing every substring of the string consisting of the same character with the concatenation of that character and the hexadecimal representation of the size of the substring and then revering the whole string, the task is to find the encrypted string.
// Examples:
// Input: S=“aaaaaaaaaaa” Output: ba
// Input: S=“abc” Output: 1c1b1a

//    }
// }
import java.util.*;
class js1
{
    public static void main(String[] args)
    {
        String str="baaaaaaaaaa";
        String str1="abc";
        String temp;
       

 char ch[] = str.toCharArray();
      for(int i = 0; i < ch.length; i++) {
         String hexString = Integer.toHexString(ch[i]);
       System.out.println(hexString);
      }
       char ch1[] = str1.toCharArray();
      for(int i = 0; i < ch1.length; i++) {
         String hexString = Integer.toHexString(ch1[i]);
       System.out.println(hexString);
        String result(char) = (int)hexString;
        System.out.println(result);
      }
      
      
    }
}