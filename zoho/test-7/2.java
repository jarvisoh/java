
import java.util.*;
public class js1
{


static int countValidPairs(String str, int N)
{

	
	int ans = 0;


	for (int l = 0, r; l < N; l = r) {

		
		r = l;

		Character c1 = str.charAt(l);
		Character c2 = str.charAt(r);
		while (r < N && c1.equals(c2)) 
        {
			r++;
		}

	
		ans += ((r - l) * (r - l - 1)) / 2;
	}


	return ans;
}

// Driver Code
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
	String str = sc.nextLine();
	System.out.print(countValidPairs(str, str.length()));
}
}

// This code is contributed by Samim Hossain Mondal.
