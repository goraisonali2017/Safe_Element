import java.util.*;


public class Matrix_safe_Element {
	public static void main(String str[])
	{
		Scanner s = new Scanner(System.in);
		int m=s.nextInt();
		int n= s.nextInt();
		Integer a[][]=new Integer [m][n];
		int max1=0 ,max2=0, min1=0,min2=0;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
			
		}
		int maxx=a[0][0];
		int	minn=a[0][0];
		for(int i=0;i<m;i++) 
		{
			int max=Collections.max(Arrays.asList(a[i]));
			int min =Collections.min(Arrays.asList(a[i]));
			if(max>maxx)
			{
				maxx=max;
				max1=i;
				max2=Arrays.asList(a[i]).indexOf(maxx);
				
			
		   }
		   if(min<minn)
		   {
			   minn=min;
			   min1=i;
			   min2=Arrays.asList(a[i]).indexOf(minn);
		   }
		
		
	   }
	   for(int i=0;i<m;i++)
	   {
		   if(i==max1 || i==min1)
			   continue;
		   for(int j=0;j<n;j++)
		   {
			   if(j==max2 || j==min2)
			   
				   continue;
			   System.out.printf(a[i][j] +" ");
		   }
	   }

   }
}

