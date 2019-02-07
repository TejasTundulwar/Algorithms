#include<stdio.h>
#include<conio.h>
int arr[20],no;
int binary(int,int);
int main()
{
int i,j=0,n;
clrscr();

printf("Enter No of elements:");
scanf("%d",&n);

printf("Enter sorted list of elements:");
for(i=0;i<n;i++)
scanf("%d",&arr[i]);

printf("Enter the No to be searched:");
scanf("%d",&no);

if(no<=arr[n/2])
binary(j,n/2);
else if(no>arr[n/2])
binary(n/2,n);

getch();
return(0);
}

binary(int j,int n)
{
if(no==arr[j])
printf("The No %d is at the position %d",no,j+1);
else
{
  if(j>n)
  {
   printf("INVALID NUMBER");
   goto stop;
  }
  binary(j+1,n);
}
stop:
return(0);
}
