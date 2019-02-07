import java.util.*;
class heap
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		int i;
		int a[]= new int[50];
		System.out.print("Enter the no. of elements : ");
		int n=s1.nextInt();
		System.out.println("Enter "+n+" elements : ");
		for(i=1;i<=n;i++)
		{	
			a[i]=s1.nextInt();
		}
		System.out.println("Sorted elements : ");
		heap_sort(a, n);//calling heap sort function.
		for(i=1;i<=n;i++)
		{
			System.out.println(a[i]+" ");	
		}
		System.out.print("Enter value of k(printing largest till n) :");
                int k = s1.nextInt();
                for(i=n-k+1;i<=n;i++)
                {
                       System.out.println(a[i]);
                }
	}

	public static void heap_sort(int a[], int n)
	{
		int k,x;
		build_heap(a,n);//calling build heap function.	
		for(k=n;k>=2;k--)
		{
			x=a[k];
			a[k]=a[1];
			insert_heap(a,x,1,k-1);
		}
	}
	
	public static void build_heap(int a[], int n)//build heap function
	{
		int k,x;
		for(k=n/2;k>=1;k--)
		{
			x=a[k];
			insert_heap(a,x,k,n);
		}
	}

	public static void insert_heap(int a[], int x, int i, int j)//insert heap function
	{
		int m;
		m=2*i;
		while(m<=j)
		{
			if(m<j)
				if(a[m]<a[m+1])
					m=m+1;
			if(x>=a[m])
				m=j+1;
			else
			{
				a[i]=a[m];
				i=m;
				m=2*i;
			}
		}
		a[i]=x;
	}
}