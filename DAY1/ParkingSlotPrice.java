import java.util.Scanner;
public class ParkingSlotPrice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int price = 0;
        if(hours <= 2){
            price = hours*20;
        }
        else if(hours <=5){
            price = 40 + (hours-2)*15;
        }
        else{
            price = 40 + 45 + (hours-5)*10;
        }
        System.out.println(price);
    }
}
