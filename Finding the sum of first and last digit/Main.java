#include <stdio.h>
int main() {
	
  int x,sum=0;
  scanf("%d",&x);
  sum=sum+x%10;
  while(x>10){
  
    x=x/10;		
  }
  printf("%d",sum+x);
	return 0;
}