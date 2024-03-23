import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pilih bentuk yang ingin dihitung luasnya:");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan pilihan Anda: ");
        
        int pilihan = scanner.nextInt();
        
        switch (pilihan) {
            case 1:
                hitungLuasPersegiPanjang();
                break;
            case 2:
                hitungLuasSegitiga();
                break;
            case 3:
                hitungLuasLingkaran();
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
        
        scanner.close();
    }
    
    public static void hitungLuasPersegiPanjang() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan panjang: ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebar = scanner.nextDouble();
        
        double luas = panjang * lebar;
        System.out.println("Luas persegi panjang adalah: " + luas);
        
        scanner.close();
    }
    
    public static void hitungLuasSegitiga() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan alas: ");
        double alas = scanner.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = scanner.nextDouble();
        
        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas segitiga adalah: " + luas);
        
        scanner.close();
    }
    
    public static void hitungLuasLingkaran() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jari-jari: ");
        double jariJari = scanner.nextDouble();
        
        double luas = Math.PI * jariJari * jariJari;
        System.out.println("Luas lingkaran adalah: " + luas);
        
        scanner.close();
    }
}
