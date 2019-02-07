import java.util.*;
import java.io.*;
import java.lang.*;
class base
{
	int[] profit=new int[10];
	int[] dead=new int[10];
	int[] slot=new int[10];
int [] a=new int[10];
	int n,i,j,total;
	Scanner s=new Scanner(System.in);
	void read()
	{
		System.out.println("enter the no of jobs");
		n=s.nextInt();
		System.out.println("enter the profits for jobs: ");
		for(i=0;i<n;i++)
		{
			profit[i]=s.nextInt();		
		}
		System.out.println("enter the deadlines for the jobs: ");
		for(i=0;i<n;i++)
		{
			dead[i]=s.nextInt();
		}
	}
	void sort()
	{
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(profit[i]<profit[j])
				{
					int temp;
					temp=profit[i];
					profit[i]=profit[j];
					profit[j]=temp;
					temp=dead[i];
					dead[i]=dead[j];
					dead[j]=temp;
				}
			}
		}
	 System.out.println("Profits"+"\t"+"\t"+"deadline");
                  for(i=0;i<n;i++)
                
                
        System.out.println(profit[i]+"\t"+"\t"+dead[i]);  
               }

	int check(int p)
      	{ 
		 int ptr=0;
           		for(int i=0;i<n;i++)
           		{
			if(slot[i]==p)
               				ptr++;
     		 }           
            		if(ptr==0)
            			return 1;
            		else
            			return 0;
       	 }  
	void working()
	{
		for(i=0;i<n;i++)
			slot[i]=0;
		for(i=0;i<n;i++)
         		{
			for(j=dead[i];j>0;j--)
             			{
				if(check(j)==1)
                				{
					slot[i]=j;
                					break;
				}
			}
		}
		System.out.println("\n profits are=");      
     		for(i=0;i<n;i++)
    		{
			if(slot[i]>0)
     				System.out.println(profit[i]);
		}

for(i=0;i<n;i++)
		{
				
			if(slot[i]>0)		
			total=total+profit[i];
			
		}	
		System.out.println("total=");
		System.out.println(total);










	}  
	
}
public class greedy
{
	public static void main(String args[])
	{
		base b=new base();
		b.read();
		b.sort();
		b.working();		
	}
}