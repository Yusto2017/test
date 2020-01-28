import java.util.Scanner;
class IfStatements{
    public static void main(String[] args) {
        int num1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Mark: ");
        num1 = scanner.nextInt();
        System.out.println(num1);


                
             if (num1>80){
                 System.out.println("A");
             }
              else if (num1>70 && num1<79){
                 System.out.println("B");
             }
             else if(num1>60 && num1<69){
                 System.out.println("Good");
             }
             else {
                 System.out.println("Enter Number between 0 and 100");
             }
            
    

        
    }
}