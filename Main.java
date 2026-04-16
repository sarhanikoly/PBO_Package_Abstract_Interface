import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // --- MASUKKAN DI SINI ---
        // Pilih salah satu merk yang ingin diaktifkan:
        
        //Laptop merkLaptop = new Lenovo(); // Jika ingin pakai Lenovo
        //Laptop merkLaptop = new Toshiba();   // Jika ingin pakai Toshiba
        Laptop merkLaptop = new MacBook(); // Jika ingin pakai MacBook

        LaptopUser sarhani = new LaptopUser(merkLaptop);
        // -------------------------
        
        Scanner input = new Scanner(System.in);
        String aksi;

        System.out.println("=== APLIKASI KONTROL LAPTOP ===");
        
        while (true) {
            System.out.println("\nMenu: [ON] [OFF] [UP] [DOWN] [EXIT]");
            System.out.print("Pilih aksi: ");
            
            aksi = input.nextLine().toUpperCase(); 

            if (aksi.equals("ON")) {
                sarhani.turnOnLaptop();
            } else if (aksi.equals("OFF")) {
                sarhani.turnOffLaptop();
            } else if (aksi.equals("UP")) {
                sarhani.makeLaptopLouder();
            } else if (aksi.equals("DOWN")) {
                sarhani.makeLaptopSilent();
            } else if (aksi.equals("EXIT")) {
                break;
            } else {
                System.out.println("Aksi tidak dikenal!");
            }
        }
        System.out.println("Program Berhenti.");
        input.close();
    }
}