#include <stdio.h>
int main(void)
{
	int isNum(char array[]);
	char x[20];
	scanf("%s", x);
	isNum(x);
	printf("End");
}
int isNum(char array[])
{
	int i = 0, j = 0;
	char numbers[] = 
		{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
	
		for (j = 0; j < 10; j++)
		{
			if ((array[i] != '\0') && (array[i] == numbers[j]))
			{
				printf("%c", array[i] );
				break;
			}
			if (j == 10)
			{
				++i;
			}		
		}
		
	return -1;
}