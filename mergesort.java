

import java.io.*;
import java.util.*;


class merge
{ 

  public static void mer(int a[],int p,int q,int r)
  { int n1=q-p+1, l=n1++;
    int n2=r-q, x=n2++;
     int j,i,k;   		
     int []L= new int[l];
      int []R= new int[r];

  for(i=0;i<n1;i++)
    { 
      L[i]=a[p+i-1];
     }

    
  for(j=0;j<n2;j++)
    { 
      R[i]=a[q+j];
     }
      L[n1+1]=32768;
      R[n2+1]=32768;
      i=1;
      j=1;
  
   for(k=p;k<r;k++)
      { if(L[i]<=R[j])
         	
	  {
	     a[k]=L[i];
              i++;	
	  }

         else 
	{ 
           a[k]=R[j];
           j++;
	}

       }
     
    }
}    

class sort extends merge
 {  //public static int q;
       public static void sor(int a[],int p,int r)
      { int q;
         merge z= new merge();
             if(p<r)
         { 
		q=(p+r)/2;
         sor( a, p, q);
           sor( a, q+1, r);
           z.mer( a, p, q, r); }
           
        }
  }


class MS
 { public static void main(String args[])
    { 
          sort c= new sort();
            


  int j,i;
  int [] a=new int[11];
  Scanner s= new Scanner(System.in);
   
  System.out.println("Enter the nos of elements (<10)");  
   j=s.nextInt();
   
     for(i=1;i<=j;i++)
      { 
	a[i]=s.nextInt();
      
	}

            c.sor(a,1,j);

             System.out.println("Sorted Array is");
            for(i=0;i<j;i++)
        {System.out.println("\n"+a[i]);
         }
            }
}
