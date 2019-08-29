#include<stdio.h>
int main()
{
 int n;
  scanf("%d" ,&n);
  int result=Sum(n);
  printf("%d" ,result);
 	return 0;
}
int Sum(int n)
{
  int sum=(n*(n+1))/2;
  return sum;
}
  
  
  
  