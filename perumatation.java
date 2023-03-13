public class PermutationExample2  
{  
//main() method  
public static void main(String args[])   
{  
//the number to be permutate      
int number = 123;  
findPermutation(number);  
}  
//static method to find the permutation  
static void findPermutation(int number)   
{  
int temp = number, count = 0;  
//iteration over the specified digit   
while (temp > 0)   
{  
//increments the count variable by 1 i the above condition returns true      
count++;  
//divides the variable temp by 10  
temp = temp / 10;  
}  
//using vector to print the permutation of N  
int[] num = new int[count];  
// Store digits of N  
// in the vector num  
while (number > 0)  
{  
//finds the remainder and store the digit in vector num  
num[count-- - 1] = number % 10;  
number = number / 10;  
}  
//iterate over each permutation and find the permutations that are greater than N  
while (findsNextpermutation(num))   
{  
  
for (int i = 0; i < num.length; i++)  
//print all the permutations of N  
System.out.print(num[i]);  
 
System.out.print("\n");  
}  
}  
static boolean findsNextpermutation(int[] p)   
{  
for (int a = p.length - 2; a >= 0; --a)  
if (p[a] < p[a + 1])  
for (int b = p.length - 1;; --b)  
if (p[b] > p[a])   
{  
  
int t = p[a];  
p[a] = p[b];  
p[b] = t;  
for (++a, b = p.length - 1; a < b; ++a, --b)  
{  

t = p[a];  
p[a] = p[b];  
p[b] = t;  
}  
return true;  
}  
return false;  
}  
}  