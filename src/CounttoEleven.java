import java.util.Scanner;

public class  CounttoEleven {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
       
    System.out.println("Enter a number less than 11" );
    int start = Integer.valueOf(scanner.nextLine());
    int end = 11;
for (int i = start; i <= end; i++) {
        System.out.println(i);
}
    scanner.close();
}
    }
