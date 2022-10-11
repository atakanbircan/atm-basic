import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        int right = 3;
        int balance=1500;
        int select;
        while (right>0) {
            Scanner input = new Scanner(System.in);
            System.out.println("kullanıcı adı giriniz : ");
            userName = input.nextLine();
            System.out.println("şifre giriniz : ");
            password = input.nextLine();
            if (userName.equals("patika")&&password.equals("dev123")){
                System.out.println("sisteme girş yaptınız.");
                System.out.println("xxx bankasına hoşgeldiniz");
               do {


                   System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
                   System.out.println("1-Para yatırma\n" +
                           "2-Para Çekme\n" +
                           "3-Bakiye Sorgula\n" +
                           "4-Çıkış Yap");
                   select = input.nextInt();

                   if (select == 1) {
                       System.out.println("para miktarı : ");
                       int price = input.nextInt();
                       balance += price;
                       System.out.println("güncel bakiyeniz : " +balance);
                   } else if (select == 2) {
                       System.out.println("para miktarı : ");
                       int price=input.nextInt();
                       if (price > balance) {
                           System.out.println("miktar bakiyeden fazla lütfen tekrar deneyiniz.");
                       }
                       else {
                           balance -= price;
                           System.out.println("güncel bakiyeniz : "+balance);
                       }
                   } else if (select==3) {
                       System.out.println("Bakiyeniz : "+balance+ " dir.");
                   } else if (select>4) {
                       System.out.println("1-4 aralığında işlme seçiniz");
                   }

               }
               while (select!=4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            }

            else {
                System.out.println("hatalı kullanıcı adı veya şifre.Tekrar deneyiniz.");
                System.out.println("Kalan hakkınız :" + --right);
                if (right==0){
                    System.out.println("hesabınız bloke olmuştur,lütfen banka ile iletişime geçiniz.");
                }
            }

        }
        }

}