package java101;
import java.util.Scanner;

public class kullaniciGiris {
    public static void main(String[] args) {
        String userName , password , password2;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();
        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız!");
        }else {
            System.out.println("Hatalı Giriş Yaptınız!!!");
            if(password != "java123"){
                boolean secim = false;
                System.out.println("Şifrenizi sıfırlamak ister misiniz? İstiyorsanız true, istemiyorsanız false yazın.");
                secim = input.nextBoolean();
                if(secim == true){
                    System.out.println("Eski şifre ile aynı olmamak koşulu ile yeni şifrenizi giriniz: ");
                    Scanner yeni = new Scanner(System.in);
                    password2 = yeni.nextLine();
                    password = "java123";
                    if (password2.equals(password)){
                        System.out.println("Şifreniz eski şifreniz ile aynıdır. İşlem yapılmayacaktır.");
                    }else{
                        password = password2;
                        System.out.println("Şifreniz başarıyla güncellenmiştir.");
                    }
                }else {
                    System.out.println("Şifreniz değiştirilmemiştir.");
                }
            }
        }
    }
}
