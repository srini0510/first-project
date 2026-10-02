import java.util.Scanner;
class harshadno{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        int ld=0;
        while(temp!=0){
            ld=ld+num%10;
            sum+=ld;

        }
        if (sum%num==0){
            System.out.println(num+" is a harshad number");
        }
       else{
        System.out.println(num+" is not a harshad number");
    }
}
}