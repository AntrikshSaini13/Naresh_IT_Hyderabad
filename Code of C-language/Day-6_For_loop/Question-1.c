// Write a program in C to display n terms of natural numbers and their sum. 

// Test Data : 7

// Expected Output :

// The first 7 natural number is :

// 1 2 3 4 5 6 7

// The Sum of Natural Numbers upto 7 terms : 28

#include<stdio.h>
int main(){

int num,sum=0,i,j;
    printf("Enter the number \n");
    scanf("%d",&num);
    for(i=1;i<=num;i++){
        for(j=i;j<=i;j++){
        sum+=j;
        }
    }
    printf("sum is = %d",sum);
    return 0;
}