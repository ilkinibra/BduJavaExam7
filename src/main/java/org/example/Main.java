import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("1 ilə 10 arasında bir ədəd daxil edin: ");
    int eded = scanner.nextInt();
    String sozleQarsiliq = "";
    switch (eded) {
        case 1:
            sozleQarsiliq = "bir";
            break;
        case 2:
            sozleQarsiliq = "iki";
            break;
        case 3:
            sozleQarsiliq = "üç";
            break;
        case 4:
            sozleQarsiliq = "dörd";
            break;
        case 5:
            sozleQarsiliq = "beş";
            break;
        case 6:
            sozleQarsiliq = "altı";
            break;
        case 7:
            sozleQarsiliq = "yeddi";
            break;
        case 8:
            sozleQarsiliq = "səkkiz";
            break;
        case 9:
            sozleQarsiliq = "doqquz";
            break;
        case 10:
            sozleQarsiliq = "on";
            break;
        default:
            System.out.println("Daxil etdiyiniz ədəd 1 ilə 10 arasında deyil.");
            return;
    }
    System.out.println("Sözlə qarşılığı: " + sozleQarsiliq);
    scanner.close();
    }
}