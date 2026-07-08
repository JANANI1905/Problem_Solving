import java.util.Scanner;
public class ATM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int balance = 0;
        int notes[] = {2000,500,200,100,50,20,10};
        for (int i= 0;i<notes.length;i++){
            if(amount >= notes[i]){
                int count = amount/notes[i];
                amount = amount%notes[i];
                System.out.println(notes[i]+" : "+count);
            }
            else{
                System.out.println(notes[i]+" : 0");
            }
        }
    
    }
    
}
