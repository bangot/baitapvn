import java.util.Scanner;

public class nhappttaomang {
    public static void main (String[] args){
        int n ,tempSort ,c,i;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhap so phan tu mang");
            n=scanner.nextInt();
        }while (n<0);
        int arry[] = new int[n];
        System.out.println("Nhap cac phan tu mang");
        for ( i = 0;i<n;i++){
            System.out.print("nhap phan tu thu " +i );
            arry[i]=scanner.nextInt();
        }
        System.out.println("ta co mang");
        for ( i=0; i<n;i++){
            System.out.print(arry[i]);
        }
        for ( i=0;i<n -1;i++){
            for (int j = i + 1; j <= n - 1; j++) {
                if (arry[i] > arry[j]) {
                    tempSort = arry[i];
                    arry[i] = arry[j];
                    arry[j] = tempSort;
                }
            }
        }
        System.out.println("thu tu sap xep trong mang la :");
        for ( i=0;i<n;i++) {
            System.out.print(arry[i] );
        }
        System.out.println("Nhập số nguyên k: ");
        int k = scanner.nextInt();
        for ( c = i = 0; i < n; i++) {
            if (arry[i] != k) {
                arry[c] = arry[i];
                c++;
            }
        }

        n = c;
        System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
        for (i = 0; i < n; i++) {
            System.out.print(arry[i] + "\t");
        }
    }
    }

