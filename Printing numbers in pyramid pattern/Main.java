#include <stdio.h>
int main()
{
  int n;
 scanf("%d" ,&n);
  int v=1;
 for(int currrow=1;currrow<=n;currrow++)
 {
   for(int space=1;space<=(n-currrow);space++)
 {
 printf(" ");
 }
 for(int currcol=1;currcol<=currrow;currcol++)
 {
  printf("%d " ,v);
   v++;
 }
   printf("\n");
 }
	return 0;
}
	