#include<stdio.h>
int factorial(int n);
int main()
{
  int n,a=1;
  scanf("%d",&n);
  factorial(n);
  printf("%d",factorial(n));
  return 0;
}
int factorial(int n)
{
  if(n==1)
    return 1;
  else if(n>=1)
    return n*factorial(n-1);
}
