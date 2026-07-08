import java.util.Scanner;
public class Spiral {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];

        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int i=0;
        int j=0;
        while(i<n && j!=n-1){
            System.out.print(arr[i][j] + " ");
            i++;
        }
        while(i!=n-1 && j<n){
            System.out.print(arr[i][j] + " ");
            j++;
        }
        while(i<n && j > 0){
            System.out.print(arr[i][j] + " ");
            i--;
        }
        while(i>0 && j<0){
            System.out.print(arr[i][j] + " ");
            j++;
        }
        while(i<n/2 && j<m/2){
            System.out.print(arr[i][j] + " ");
            i++;
        }
    }
}

