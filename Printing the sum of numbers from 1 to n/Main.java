

#include <stdio.h>
int main() {
 int n, sum = 0, c;
 
  
  scanf("%d", &n);
 
 
  for (c = 1; c <= n; c++)
  {
    sum = sum + c;
  }
 
  printf("%d\n", sum);
	return 0;
}