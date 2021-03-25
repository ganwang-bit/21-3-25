//#include <stdio.h>
//#include <stdlib.h>
//
//int main()
//{
//    printf("Hello world!\n");
//    return 0;
//}
//#include<stdio.h>
//#include<math.h>
//int main()
//{
//    int n,i,j,k;
//    char a;
//    scanf("%d %c",&n,&a);
//    int arr[30]={0};
//    for(i=1;2*i*i-1<=1100;i++)
//        arr[i-1]=2*i*i-1;
//    for(i=0;i<30;i++)
//        if(arr[i]>n)
//            break;
//    for(j=0;j<2*i-1;j++)
//    {
//        for(k=0;k<i+abs(j-i+1);k++)
//            if(k<abs(i-1-abs(j-i+1)))
//                printf(" ");
//            else
//                printf("%c",a);
//        printf("\n");
//    }
//    printf("%d",n-arr[i-1]);
//    return 0;
//}
//#include<stdio.h>
//int main()
//{
//    char ch;
//    int n,i,j;
//    scanf("%d %c",&n,&ch);
//    for(i=0;i<n;i++)
//    {
//        for(j=0;j<2*n-1+i;j++)
//            if(j==2*n-2+i||j==n-1-i||i==n-1||(!i&&j>=n-1+i))
//                printf("%c",ch+i);
//            else
//                printf(" ");
//        printf("\n");
//    }
//    return 0;
//}
//#include<stdio.h>
//int main()
//{
//    int n,i,j,k,count=0;
//    scanf("%d",&n);
//    for(i=0;i<=9;i++)
//        for(j=0;j<=9;j++)
//            for(k=0;k<=9;k++)
//            {
//                if(i+k+j==n)
//                {
//                    if((count+1)%6==1&&count)
//                    printf("\n");
//                    count++;
//                    printf("%6d",i*100+j*10+k);
//                }
//            }
//
//    return 0;
//}
//#include<stdio.h>
//int main()
//{
//    int count=0,n,i,j,k;
//    scanf("%d",&n);
//    for(i=(n-3)/5;i>=1;i--)
//        for(j=(n-6)/2;j>=1;j--)
//            for(k=(n-7);k>=1;k--)
//                if(i*5+j*2+k==n)
//                {
//                    count++;
//                    printf("fen5:%d, fen2:%d, fen1:%d, total:%d\n",i,j,k,i+j+k);
//                }
//    printf("count = %d",count);
//    return 0;
//}
