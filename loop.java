public class loop {
    public static void main(String[] args) {
       
    //   int i = 1,n = 10, prod = 1; 
    //    while(i <=n){
    //     prod *= i;
    //     i++;
    //    }
      
    //    System.out.println(prod);
        
        // int n = 123;
        // int rev = 0;

        // while(n != 0){
        //     int rem = n%10;
        //     rev = rev*10+rem;
        //     n = n/10;
        // }
        // System.out.println(rev);

    //     int n = 373,rev =0;
    //     int dummy = n;
    //     while(n >0){
    //         rev = rev*10+(n%10);

    //         n/=10;
    //     }
    //     if(rev == dummy ){
    //     System.out.println("palindrome");
    // }else {
    //     System.out.println("not palindrome");
    // }


    // int n = 734, sum =0;
    // while(n>0){
    //     sum+=(n%10);
    //     n/=10;
    // }
    //     System.out.println(sum%7 == 0);


    // int n = 7;
    // boolean check = true;
    // for(int i = 2; i<n; i++){
    //     if(n%i ==0){
    //         check = false;
    //         break;
    //     }
    // }
    // if (check == true) {
    //     System.out.println("prime");
    // }
    // else{
    //     System.out.println("not prime");
    // }

    // int n = 17, i = 1, count = 0;
    // while(i<=n){
    //     if(n%i == 0) count++;
    //     i++;
    // }
    // System.out.println(count == 2);

//    int n = 234, m = 32;
//    int rev1 = 0;
//    while(n>0){
//     rev1 = 10*rev1+(m%10);
//     m/=10;
//    }
//    while(rev1 >0){
// n = 10*n+(rev1%10);
// rev1/=10;
//    }

// int n = 17;
// int a = 0;
// int b = 1;
// int sum = 0;
// System.out.println(a);
// System.err.println(b);
// for(int i = 3; i<=n; i++){
//  sum = a+b;
//  System.out.println(sum);;
//  a=b;
//  b=sum;
   
    // }


//fibonacci series
//     int a =0,b =1, i=2;

//     while(i<=10){
//         int c=a+b;
//        a=b;
//        b=c;
//         i++;
//     }
// System.out.println(b);


//GCD/HCF
//  int a = 18,b=9;
//  int i = Math.min(a,b);
//  while(i>=1){
//     if(a%i == 0 && b%i == 0){
//         System.out.println(i);
//         break;
//     }
//     i--;
//  }

//LCM OF TWO NUMBERS
// int a =5,b=8;
// int i = Math.min(a,b);
// while(i>=1){
//     if(a%i==0 && b%i==0){
//         System.out.println(a*b/i);
//         break;
//     }
//     i--;
// }

//perfect square
boolean ans = false;
int n = 64,i = 1;
while (i*i <= n){
    if(i*i==n) ans = true;
    i++;
}
System.out.println(ans);
}  
}
