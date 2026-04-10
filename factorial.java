import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        int num=sc.nextInt();
        long fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println(fact);
            
        }
    }
