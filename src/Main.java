import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gun, ay;
        String burc = "";
        boolean isError = false;

        System.out.print("Doğduğunuz Günü Giriniz : ");
        gun = scan.nextInt();
        System.out.print("Doğduğunuz Ayı Giriniz : ");
        ay = scan.nextInt();
        if ((ay >= 1) && (ay <= 12)) {
            if (ay == 1) {
                if (gun < 22 && gun >= 1) {
                    burc = "Oğlak";
                } else if (gun >= 22 && gun <= 31) {
                    burc = "Kova";
                } else {
                    isError = true;
                }
            } else if (ay == 2) {
                if (gun < 20 && gun >= 1) {
                    burc = "Kova";
                } else if (gun >= 20 && gun <= 28) {
                    burc = "Balık";
                } else {
                    isError = true;
                }
            } else if (ay == 3) {
                if (gun < 21 && gun >= 1) {
                    burc = "Balık";
                } else if (gun >= 21 && gun <= 31) {
                    burc = "Koç";
                } else {
                    isError = true;
                }
            } else if (ay == 4) {
                if (gun < 21 && gun >= 1) {
                    burc = "Koç";
                } else if (gun >= 21 && gun <= 30) {
                    burc = "Boğa";
                } else {
                    isError = true;
                }
            } else if (ay == 5) {
                if (gun < 22 && gun >= 1) {
                    burc = "Boğa";
                } else if (gun >= 22 && gun <= 31) {
                    burc = "İkizler";
                } else {
                    isError = true;
                }
            } else if (ay == 6) {
                if (gun < 23 && gun >= 1) {
                    burc = "İkizler";
                } else if (gun >= 23 && gun <= 30) {
                    burc = "Yengeç";
                } else {
                    isError = true;
                }
            } else if (ay == 7) {
                if (gun < 23 && gun >= 1) {
                    burc = "Yengeç";
                } else if (gun >= 23 && gun <= 31) {
                    burc = "Aslan";
                } else {
                    isError = true;
                }
            } else if (ay == 8) {
                if (gun < 23 && gun >= 1) {
                    burc = "Aslan";
                } else if (gun >= 23 && gun <= 31) {
                    burc = "Başak";
                } else {
                    isError = true;
                }
            } else if (ay == 9) {
                if (gun < 23 && gun >= 1) {
                    burc = "Başak";
                } else if (gun >= 23 && gun <= 30) {
                    burc = "Balık";
                } else {
                    isError = true;
                }
            } else if (ay == 10) {
                if (gun < 23 && gun >= 1) {
                    burc = "Terazi";
                } else if (gun >= 23 && gun <= 31) {
                    burc = "Akrep";
                } else {
                    isError = true;
                }
            } else if (ay == 11) {
                if (gun < 22 && gun >= 1) {
                    burc = "Akrep";
                } else if (gun >= 22 && gun <= 30) {
                    burc = "Yay";
                } else {
                    isError = true;
                }
            } else {
                if (gun < 22 && gun >= 1) {
                    burc = "Yay";
                } else if (gun >= 20 && gun <= 28) {
                    burc = "Oğlak";
                } else {
                    isError = true;
                }
            }

            if (isError) {
                    System.out.println("Hatalı Gün Girdiniz");
            } else {
                System.out.println("Burcunu : " + burc);
            }


        } else {
            System.out.println("Hatalı ay girdiniz...");
        }


    }
}
