#include <stdio.h>
void main()
{  
  int a;
  scanf("%d",&a);
  switch(a){
    case 1:
      printf("One\n");
      break;
      case 2:
      printf("Two\n");
      break;
      case 3:
      printf("Three\n");
      break;
      case 4:
      printf("Hello\n");
      break;
      case 5:
      printf("Five\n");
      break;
    default:
      printf("Invalid\n");
  }
}
