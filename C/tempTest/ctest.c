#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    float pro = 0;
    int random = 0;
    for (int i = 0; i < 1000; ++i){
        random = rand()%2;        
        printf("%d \n", random);
        pro += (random / 1000.0);
        
       
    }
    
    printf("%f\n", pro);
    return 0;
}