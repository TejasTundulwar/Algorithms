#include<stdio.h>
#include<conio.h>
int arr[20],n,no;
int linear(int);
int main()
{
int i,j=0;
clrscr();

printf("Enter No of elements:");
scanf("%d",&n);

printf("Enter values of each element:");
for(i=0;i<n;i++)
scanf("%d",&arr[i]);

printf("Enter the No to be searched:");
scanf("%d",&no);

linear(j);

getch();
return(0);
}

linear(int j)
{

if(no==arr[j])
printf("The No %d is at the position %d",no,j+1);
else
{
  if(j>n)
  {
   printf("INVALID NUMBER....TRY AGAIN ");
   goto stop;
  }
  linear(j+1);
}
stop:
return(0);
}
