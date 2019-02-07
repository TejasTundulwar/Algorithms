import java.io.*;
import java.util.*;
class prac3
{
    public static void sort(int [] a,int low,int high)
    {
	
	int N=high-low;
 	if(N<=1)
	 return;
	int mid=low+N/2;
	//recursive sort
	sort(a,low,mid);//Sort 1st half
	sort(a,mid,high);//Sort 2nd half
	int [] temp = new int [N];\\array of total no of elements
                 int i = low, j = mid;
                 for (int k = 0; k < N; k++) 
                     {
                         if (i == mid)  
                           temp[k] = a[j++]; //if elements in other half of mid are to be sorted fill temp with second half
                            else if (j == high) 
                             temp[k] = a[i++];//If elemets in 1st half are to be sorted fill temp with first half
                                    else if (a[j]<a[i]) 
                                    temp[k] = a[j++];
                               else 
                                 temp[k] = a[i++];
                       }    
	for (int k = 0; k < N; k++) 
            a[low + k] = temp[k];         
            }
      
 public static void main(String args[])
  {
    int i;
    int rep1[]=new int[20];
    int rep2[]=new int[20];
    int mer[]=new int[25];
    Scanner s= new Scanner(System.in);
    System.out.println("Enter Annual values for each month respectively for Year 2013: ");
    for(i=1;i<13;i++)
     {
       rep1[i]=s.nextInt();
     }
     System.out.println("Enter Annual values for each month respectively for Year 2014: ");
    for(i=1;i<13;i++)
     {
       rep2[i]=s.nextInt();
     } 
    for(i=1;i<13;i++)
      {
         mer[i]=rep1[i];  
       }
    for(i=1;i<13;i++)
       {
          mer[12+i]=rep2[i];	
        }
     System.out.println("Sorted values: ");
      sort (mer,0,24);
     for(i=1;i<=24;i++)
       System.out.println(mer[i]);
      sort (mer,0,24);         
}
}