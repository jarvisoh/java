

import java.util.*;

class js1{

	public static int bulb(int[] a, int N)
	{
		
		int count = 0;
		for (int i = 0; i < N; i++) {
			if (a[i] == 0) 
            {
				a[i] = 1;
				for (int j = i + 1; j < N; j++) 
                {
					if (a[j] == 1) {
						a[j] = 0;
					}
					else {
						a[j] = 1;
					}
				}
				count++;
			}
		}
		return count;
	}

	public static void main(String[] ar gs)
	{
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
	


		System.out.print(bulb(arr, N));
	}
}


