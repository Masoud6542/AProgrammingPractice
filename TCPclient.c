#include <stdio.h>
#define pi 3.14159
int main(void){

    int plus (int x, int y);
    int x = 9, y = 115;
    printf("%f",pi*plus (x,y));
    return 0;
}
int plus (int x, int y)
{
    return x+y;
}