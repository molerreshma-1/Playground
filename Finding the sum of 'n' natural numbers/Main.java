#include<stdio.h>
int sum(n);
int main()
{        

  int n;
  scanf("%d",&n);
  sum(n);
  printf("%d",sum(n));
  return 0;
}
int sum(n)
{
  if(n!=0)
    return n+sum(n-1);
}
  
  