#include <stdio.h>

int main() {
    int t;
    scanf("%d",&t);
    while(t!=0)
    {
        int a,b;
        scanf("%d%d",&a,&b);
        while(a>0&&b>0)
        {
            a=a-1;
           b= b-1;
        }
    if(a==0)
    {
        printf("CHEFINA\n");
    }
    else
    {
        printf("CHEF\n");
    }
    t--;
    }
	return 0;
}

