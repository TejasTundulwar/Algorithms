import java.io.*;
import java.util.*;
class sort1234
{
public static void main(String args[])
{
int pos,i,p=1,temp,j,ch;
int a[]=new int[10];
Scanner s=new Scanner(System.in);
System.out.println("Menu driven program ");
while(p==1)
{
System.out.println("Enter number of elements :");
int n= s.nextInt();
System.out.println("Enter elements :");
for(i=0;i<n;i++)
a[i]=s.nextInt();
System.out.println("1. Insertion Sort   2. Selection Sort   3. Exit");
System.out.println("Enter choice");
 ch=s.nextInt();
switch(ch)
{
case 1: 
for(i=0;i<=n-1;i++)
{
j=c;
while(j>0 && a[j]<a[j-1])
{
temp=a[j];
a[j]=a[j-1];
a[j-1]=temp;
j--;
}
}
case 2:

for(i=0;i<n-1;i++)
{
pos=i;

for(j=i+1;j<n;j++)
{
if(a[pos]>a[j])
pos=j;
}
if(pos!=i)
{
temp=a[i];
a[i]=a[pos];
a[pos]=temp;
}
}


System.out.println("Sorted array :");
for(i=0;i<n;i++)
System.out.println(""+a[i]);
break;


}
}
}
}