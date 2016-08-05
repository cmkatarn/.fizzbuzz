#include <iostream>

int main() {
    int i=1;
    for(i = 1; i<101; i++){
        if(i%3==0){
            printf("Fizz");
        }
        if(i%5==0){
            printf("Buzz");
        }
        if((i%3!=0)&&(i%5!=0)){
            printf("%d",i);
        }
        printf("\n");
    }
    return 0;
}