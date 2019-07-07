#include <stdio.h>
void main()
{  
  int a;
  scanf("%d",&a);
  switch(a%4){
    case 0:
      printf("Leap year");
      break;
    default:
      printf("Not Leap year");
  }
}
