import java.util.Scanner;

public class hienthisontdautien {
    public static void main(String[]args){
        System.out.print("nhap so luong so nt ");
        Scanner scanner =new Scanner(System.in);
        int number =scanner.nextInt();
        int count = 0;
        int n=2;
        while (count<number){
          int i=2;
          boolean chek=true;
          while (i<n){
              if (n%i==0){
                  chek=false;
                  break;
              }i++;
          }
          if (chek){
              System.out.printf(" %d ",n);
              count++;
          }n++;
        }
    }
}
