#include <stdio.h>
int main()
{
   int n,v;
 scanf("%d" ,&n);
  v=n;
 for(int currcol=1;currcol<=n;currcol++)
 {
 for(int currrow=v;currrow>=1;currrow--)
 {
   printf("%d" ,currrow);
 }
   v--;
   printf("\n");
 }
	return 0;
} 