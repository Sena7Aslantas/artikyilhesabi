import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int yil;
        System.out.print("Yil giriniz:");
        Scanner input = new Scanner(System.in);
        yil = input.nextInt();

        if (yil % 100 == 0&&yil%400==0) {
            System.out.print("Artık yıldır");
        }
        else if(yil%100!=0&&yil%4==0){
            System.out.print("Artık yıldır");
        }
        else{
            System.out.print("Artık yıl degildir.");
        }
    }
}