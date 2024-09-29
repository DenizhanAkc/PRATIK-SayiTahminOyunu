import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner inp = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;


        while (right < 5){
            System.out.print("Lutfen Tahmininizi Giriniz : ");
            selected = inp.nextInt();

            if(selected < 0 || selected > 99){
                System.out.println("Lutfen 0 ile 100 arasinda bir Sayi Giriniz!");
                if(!isWrong ){
                    isWrong = true;
                    System.out.println("Bir dahaki HATALI girisinizde Hakkinizdan Dusulecektir!");
                }else{
                    right++;
                    System.out.println("Cok Fazla Hatali Giris Yaptiniz, Kalan Hakkiniz : " +(5-right));
                }
                continue;
            }

            if( selected == number){
                System.out.println("Tebrikler, Dogru Tahmin! Tahmin Ettigin Sayi : " +number);
                isWin = true;
                break;
            }else{
                System.out.println("Hatali Bir Sayi Girdiniz!!!");
                if(selected > number){
                    System.out.println(selected + " Sayisi, Tahmin etmeye calistiginiz Sayidan Buyuktur! ");
                }else{
                    System.out.println(selected + " Sayisi, Tahmin etmeye calistiginiz Sayidan Kucuktur!");
                }
                wrong[right++] = selected;
                System.out.println("Kalan Hak : " +(5-right));

            }
        }
                if(!isWin && !isWrong){
                    System.out.println("Kaybettiniz ! ");
                    System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
                }


        System.out.println("Tahmin Etmeye Calistiginiz Sayi : " +number);
    }
}