#include <stdio.h>
int main()
{
  int n;
  scanf("%d" ,&n);
  for(int currrow=1;currrow<=n;currrow++)
  {
  for(int currcol=1;currcol<=currrow;currcol++)
  {
    printf("%d",currrow);
  }
    printf("\n");
  }
	return 0;
}