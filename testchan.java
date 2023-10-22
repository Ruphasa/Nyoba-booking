import java.util.Scanner;
public class testchan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            boolean signUp = false, login = false;
            String nama="Rizqi", namaLog, pass="rizqi2005", passLog, pass1, hotel, bed, again;
            int harga, option, lama, haMa, hari, bulan, counter = 0;
            double haTot, haDis;
            float disc;
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println(" ----------------");
            System.out.println("|    Traveloki   |");
            System.out.println(" ----------------");
            System.out.println("1. Signn up jika belum memiliki akun");
            System.out.println("2. Login jika sudah memiliki akun");
            option = sc.nextInt();
            System.out.print("\033[H\033[2J");
            System.out.flush();
        switch (option) {
            case 1:
                do{
                    System.out.println(" ----------------");
                    System.out.println("|    Sign Up     |");
                    System.out.println(" ----------------");
                    System.out.print("Daftarkan username : ");
                    nama = sc.next();
                    System.out.print("Masukan password yang anda inginkan : ");
                    pass1 = sc.next();
                    System.out.print("Repeat password : ");
                    pass = sc.next();
                    if (pass.equals(pass1)){
                        signUp=true;
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        break;
                    }else {
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("!!!password tidak syncron!!!");
                    }
                }while (signUp!=true); {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("akun anda berhasil terdaftar");
                }
            case 2:
                do{
                    System.out.println(" ----------------");
                    System.out.println("|     Login      |");
                    System.out.println(" ----------------");
                    System.out.print("Masukan username : ");
                    namaLog = sc.next();
                    System.out.print("Masukan Password : ");
                    passLog = sc.next();
                    if (nama.equalsIgnoreCase(namaLog)&&pass.equals(passLog)) {
                        login=true;
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                    }else{
                        System.out.println("username atau password salah");
                    }
                }while (login!=true);     
            }
            do {
                harga = 0;
                disc = 0.0f;
                System.out.println(" ----------------");
                System.out.println("|    Traveloki   |");
                System.out.println(" ----------------");
                if (counter == 3) {
                    disc += 0.03f;
                    System.out.println("Selamat anda mendapatkan discount loyalty sebesar 3%");
                }
                System.out.println(nama+" Mau nginep dimana?");
                System.out.println("1. aria");
                System.out.println("2. montana");
                System.out.println("3. Exit");
                System.out.print("(1/2/3) : ");
                option = sc.nextInt();
                if (option==3){
                    continue;
                }
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.print(nama+", kamu tanggal berapa mau nginep ? ");
                hari = sc.nextInt();
                System.out.print("itu bulan keberapa ya ? ");
                bulan = sc.nextInt();
                System.out.print("berapa malam ? ");
                lama = sc.nextInt();
                do {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Mau tambah extra bed ? ");
                System.out.print("y/t ? ");
                bed = sc.next();
                if (bed.equalsIgnoreCase("y")) {
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        break;
                    }else if(bed.equalsIgnoreCase("t")){
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        break;
                    }else{
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("pilihan anda salah");
                        continue;
                    }
                } while (!bed.equalsIgnoreCase("y"+"t"));
                switch (option) {
                    case 1:
                    if (hari == 17 && bulan == 8) {
                        disc += 0.1f;
                    }
                    harga += 1000000;
                    if (bed.equalsIgnoreCase("y")) {
                        harga += 100000;
                    } else {
                        harga+=0;
                    }
                        break;
                    case 2:    
                        if (hari == 25 && bulan == 12) {
                            disc += 0.12f;
                        }
                        harga += 2000000;
                        break;
                    case 3:
                        System.out.println("your now exit");
                        break;
                    default:
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("pilihan anda salah");
                    }
                System.out.print("\033[H\033[2J");
                System.out.flush();
                haMa = harga * lama;
                haDis = haMa * disc;
                haTot = haMa - haDis;
                System.out.println("Total tagihannya "+ haTot);
                counter++ ;
                do {
                    System.out.println("Mau booking lagi ?");
                    System.out.print("y/t : ");
                    again = sc.next();
                    if (again.equalsIgnoreCase("y")) {
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        break;
                    }else if(again.equalsIgnoreCase("t")){
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        option = 3;
                        break;
                    }else{
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("pilihan anda salah");
                        continue;
                    }
                } while (!again.equalsIgnoreCase("y"+"t"));
        }while (option!=3);
    }
}