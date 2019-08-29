#include <stdio.h>
int main() 
{
 int n;
 scanf("%d" ,&n);
  for(int currrow=1;currrow<=n;currrow++)
  {
   for(int currcol=1;currcol<=n;currcol++)
   {
     if(((currrow%2==0)&&(currcol==1))||((currrow%2==1)&&(currcol==n)))
     {
       printf("%d" ,currrow+1);
     }
     else
     {
       printf("%d" ,currrow);
     }
   }
    printf("\n");
  }
	return 0;
}