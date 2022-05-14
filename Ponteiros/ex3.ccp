#include <stdio.h>

int main () {

   int x, y;  

   printf("Entre com um valor para x: ");
   scanf("%d", &x);

   printf("Entre com um valor para y: ");
   scanf("%d", &y);

   printf("\n");

   if (&x > &y) {
       printf("%d É o maior endereço da memoria", x);
   } else {
       printf("%d É o maior endereço da memoria", y);

   }

}
