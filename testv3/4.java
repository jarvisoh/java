// You are given M number of coins and P number of notes.
// Write a program to separate the two forms of money without creating two separate classes for notes and coins.
// (The order of the output should be the same as that of the input).
// Input format
// First line : N
// Next N lines : Space-separated string S and an integer Val (where S is a Note and Val denotes the denomination of a coin or a note)
// either
// a Coin or
// Output
// Print the string Coins : followed by M lines, each of which contains an integer denoting the denominations of the coins. Print the string Notes : followed by P lines, each of which contains an integer denoting the denominations of the notes.
// Constraints 1≤N≤102 1≤Val≤102
// Description of Classes:
// You need to design 3 classes:
// • Bag • Coin • Note
// Note and Coin Class
// Both the classes have common attributes as well as common methods.
// Attributes:
// Val: refers to the denomination of the coin or note
// Methods:
// setvalue(int val): Set the denomination of the coin to the value which is passed as a parameter.
// Bag
// This should be a generic class.
// Methods
// add(Type t): Add the coin or Display(): Display the denomination of the coin or note.
// Sample Input
// note to
// Class the bag.
// format
//  7
// Note 83
// Coin 19
// Coin 85
// Note 8
// Note 30
// Coin 56
// Coin 53 Sample Output Coins :
// 19
// 85
// 56
// 53
// Notes :
// 83
// 8
// 30
// public class GenericsTester 
// {
//    public static void main(String[] args) 
//    {
//       Box<Integer> integerBox = new Box<Integer>();
//       Box<String> stringBox = new Box<String>();

//       integerBox.add(new Integer(10));
//       stringBox.add(new String("Hello World"));

//       System.out.printf("Integer Value :%d\n", integerBox.get());
//       System.out.printf("String Value :%s\n", stringBox.get());
//    }
// }

// // type = T
// class Box<T> {
//    private T t;

//    public void add(T t) {
//       this.t = t;
//    }

//    public T get() {
//       return t;
//    }   
// }

import java.util.*;

class GenericsTester
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
     
        while(n-->0)
        {
               sc.next();
        String str=sc.nextLine();

      money<Integer> smoney = new money<Integer>();
        money<Integer> smon = new money<Integer>();
       
        String[] str = sc.nextLine().split(" ");
               String type = input[0];
            int denomination = Integer.parseInt(input[1]);

  System.out.println(denomination);
      
         if (type.equals("Coin")) 
      {
     smoney.add(new Integer(denomination));
      }
      else
      {
       
       smon.add(new Integer(denomination));
      }
   
  for (int denomination1 : smoney.get()) 
        {
            System.out.println(denomination1);
        }

        System.out.println("Notes:");
        for (int denomination1 : smon.get())
         {
            System.out.println(denomination1);
        }
 
    }
    }
    

}

class money<T> {
    private List<T> denominations;

    public money() {
        denominations = new ArrayList<>();
    }

    public void add(T denomination) {
        denominations.add(denomination);
    }

    public List<T> get() {
        return denominations;
    }
}