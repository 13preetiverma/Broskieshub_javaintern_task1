import java.util.Scanner;

public class even_odd{

    public static void even_or_odd(int num){
        if(num%2==0){
            System.out.println(num+" is even");
        }else{
            System.out.println(num + " is odd");
        }
        
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check even or odd");
        while(1<2){
            int num=sc.nextInt();
            System.out.println(num);
            even_or_odd(num);
        }

      

    }
}