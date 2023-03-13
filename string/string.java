import java.util.*;
public class Str 
{

 public static void main(String[] args){
  String str1 = "Helloo";
        String str2 = "hello";
        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equalsIgnoreCase(str2));//true
        System.out.println(str1.length()); //5
        System.out.println(str1.substring(0)); //Hello
        System.out.println(str1.substring(1,5)); //ello
        System.out.println(str1.concat(str2)); 
        System.out.println(str1.contains("do you know")); //false
        System.out.println(str1.contains("Hello")); //true
        String s1="java by ethnus"; 
        System.out.println(s1.endsWith("s")); //true
        System.out.println(s1.endsWith("ethnus")); //ture

    }

}