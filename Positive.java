import java.util. *;
class Positive {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter number:");
        num=sc.nextInt();
        if (num>0) 
        System.out.println("Positive");
        else
        System.out.println("NEGATIVE");
    }
}