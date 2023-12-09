import java.util.Scanner;
import java.util.Date;

public class withFunction {
    
    static Date todayDate = new Date();
    static Scanner sc = new Scanner(System.in);
    static int option, bed;
    static int harga = 0;
    static int lama, haMa, hari, bulan, tahun, baris = 2, counter = 0, user = -2, word = -1, uName = 2, passW = 2;
    static double haTot = 0, haDis;
    static float disc = 0.0f;
    static String daftar = "";
    static String nPass = "";
    static String pesanLagi, cetakData, backMenu, namaLog, passLog;
    static String namaUser[] = { "Rio", "Necha" };
    static String passUser[] = { "test", "bisa" };
    static String namaBussines[]={"Rizqi"};
    static String passBussines[]={""};
    static String[] hotel = { "aria", "montana" };
    static String namaHotel = "";
    static int jenisKamar[][] = {
            { 100000, 300000, 400000, 600000 },
            { 150000, 400000, 550000, 800000 }
    };

    // Rio
    static void SignUp() {
        System.out.println(
                "\n================================== APLIKASI BOOKING HOTEL ===================================");
        // daftar input
        System.out.print("Daftarkan User Anda: ");
        daftar = sc.nextLine();

        // Checking Duplicate
        for (int i = 0; i < uName; i++) {
            if (daftar.equals(namaUser[i])) {
                SignUp();
                System.out.println("Username Telah Digunakan");
            }
        }

        // new password input
        System.out.println("Masukan Password: ");
        nPass = sc.nextLine();

        // Upgrading array
        String[] newNama = new String[uName + 1];
        uName++;
        for (int i = 0; i < namaUser.length; i++) {
            newNama[i] = namaUser[i];
        }
        namaUser = newNama;
        String[] newPass = new String[passW + 1];
        passW++;
        for (int i = 0; i < passUser.length; i++) {
            newPass[i] = passUser[i];
        }
        passUser = newPass;

        // filling array with new name and pass
        namaUser[uName - 1] = daftar;
        passUser[passW - 1] = nPass;
        LogIn();
    }

    // Rio
    static void LogIn() {
        System.out.println(
                "\n=============================================================================================");
        System.out.println("\t\t\t\t\t LOGIN");
        System.out.println("\t\t\t Silahkan masukkan username dan password Anda");
        System.out.println(
                "=============================================================================================");
        // namaLog input
        System.out.print("Username : ");
        namaLog = sc.nextLine();

        // search
        for (int i = 0; i < namaUser.length; i++) {
            if (namaLog.equals(namaUser[i])) {
                user = i;
            }
        }

        // password input
        System.out.print("Password : ");
        passLog = sc.nextLine();

        // is it password correct?
        for (int i = 0; i < passUser.length; i++) {
            if (passLog.equals(passUser[i])) {
                word = i;
            }
        }

        // handling correct and incorrect
        if (user == word) {
            MainMenu();
        } else {
            LogIn();
            System.out.println("Username atau Password salah!");
        }
    }

    // Rio
    static void RegistHotel() {
        // inputing newHotel
        System.out.print("Masukan Nama Hotel: ");
        String newHotel = sc.nextLine();
        
        String[] newArray = new String[baris + 1];
        baris++;
        for (int i = 0; i < hotel.length; i++) {
            newArray[i] = hotel[i];
        }
        hotel = newArray;
        hotel[baris - 1] = newHotel;

        // Upgrading the length of jenisKamar
        int[][] newKamar = new int[baris + 1][4];
        baris++;
        for (int i = 0; i < jenisKamar.length; i++) {
            for (int j = 0; j < jenisKamar[i].length; j++) {
                newKamar[i][j] = jenisKamar[i][j];
            }
        }
        jenisKamar = newKamar;

        System.out.println("masukan harga single Bed");
        jenisKamar[baris - 1][0] = sc.nextInt();
        System.out.println("masukan harga Double Bed");
        jenisKamar[baris - 1][1] = sc.nextInt();
        System.out.println("masukan harga Queens Bed");
        jenisKamar[baris - 1][2] = sc.nextInt();
        System.out.println("masukan harga Kings Bed");
        jenisKamar[baris - 1][3] = sc.nextInt();

        MainMenu();
    }

    // Rizqi
    static void HotelList() {
        HeadLine();
        if (counter == 3) {
            disc += 0.03f;
            System.out.println("Selamat anda mendapatkan discount loyalty sebesar 3%");
        }
        if (hotel.length < 5) {
            System.out.println("+" + "-".repeat(hotel.length * 15 - 1) + "+");
        } else {
            System.out.println("+" + "-".repeat(5 * 15 - 1) + "+");
        }
        System.out.print("|");
        for (int i = 0; i < hotel.length; i++) {
            counter++;
            if (counter % 6 == 0) {
                System.out.println();
                System.out.printf("|%2d. %-10s|", (i + 1), hotel[i]);
            } else
                System.out.printf("%2d. %-10s|", (i + 1), hotel[i]);
        }
        System.out.printf("\n|%2d. %-10s|\n", (hotel.length + 1), "Back");
        System.out.println(namaLog + " Mau nginep dimana?");
        option = sc.nextInt();
    }

    // Necha
    static void RoomType() {
        int jenisKamar[][] = {
                { 100000, 300000, 400000, 600000 },
                { 150000, 400000, 550000, 800000 }
        };

        System.out.println("Pilih jenis kasur: ");
        System.out.println("1. Single Bed");
        System.out.println("2. Double Bed");
        System.out.println("3. Queens Bed");
        System.out.println("4. Kings Bed");
        int bed = sc.nextInt();
        sc.nextLine();
        harga += jenisKamar[option - 1][bed - 1];
    }

    // Necha
    static void loyalty() {

    }

    static void Harga(int price) {
        RoomType();
        ExtraBed();
        Discount();
    }

    // ada yang mau?
    static void ExtraBed() {

    }

    // Rizqi
    static void Discount() {
        if () {
            
        } else {
            
        }
    }

    static void Run() {
        ClearScreen();
        HeadLine();
        System.out.println("1. Signn up jika belum memiliki akun");
        System.out.println("2. Login jika sudah memiliki akun");
        System.out.println("3. keluar applikasi");
        option = sc.nextInt();
        sc.nextLine();
        ClearScreen();
        switch (option) {
            case 1:
                SignUp();
            case 2:
                LogIn();
            case 3:
                Exit();
            default:
                System.out.println("pilah anda salah!");
                Run();
        }
    }

    static void Exit() {

    }

    static void HeadLine() {
        System.out.println("+----------------+");
        System.out.println("|    Traveloki   |");
        System.out.println("+----------------+");
    }

    static void MainMenu() {
        HeadLine();
        System.out.println("1. Daftar hotel");
        System.out.println("2. Booking hotel");
        System.out.println("3. Ganti akun");
        System.out.print("(1/2/3) : ");
        option = sc.nextInt();
        sc.nextLine();
        switch (option) {
            case 1:
                ClearScreen();
                RegistHotel();
            case 2:
                ClearScreen();
                HotelList();
            case 3:
                ClearScreen();
                Run();
            default:
                ClearScreen();
                System.out.println("pilihan Salah!");
                MainMenu();
        }
    }

    static void ClearScreen() {
        System.out.print("\033[H\033[2J");
    }

    public static void main(String[] args) {
        Run();
    }
}