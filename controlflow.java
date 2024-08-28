import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n>0){
            System.out.println("Positive");
        }
        else if(n<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
        switch(n){
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Wednesday");
            break;
            case 5:
            System.out.println("Thursday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("Saturday");
            break;
        default:
            System.out.println("No valid");
        }
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
        while(n!=0){
            System.out.println(n);
            n=n-1;
        }
        do{
            System.out.print("1234");
        }while(n!=0);
    }
}