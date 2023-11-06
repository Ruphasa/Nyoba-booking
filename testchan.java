import java.util.Arrays;
import java.util.Scanner;

public class testchan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usign = 3, psign = 3;
        String[] Log = { "Necha", "Rizqi", "Rio" };
        String[] pass = { "test", "pasti", "bisa" };
        int[][] kamar = {
                { 100000, 300000, 400000, 600000 },
                { 150000, 400000, 550000, 800000 }
        };
        String[] hotel = { "aria", "montana" };
        String[][] dateNonKabisat = {
                { "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis",
                        "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu",
                        "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu" },
                { "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu",
                        "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu",
                        "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu" },
                { "Kamis", "Jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu",
                        "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu",
                        "Kamis", "jum'at", "Sabtu", "Minggu", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin" },
                { "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at",
                        "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin",
                        "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu" },
                { "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu",
                        "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu",
                        "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu" },
                { "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu",
                        "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu",
                        "Minggu", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu" },
                { "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu",
                        "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu",
                        "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu" },
                { "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu",
                        "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu",
                        "Minggu", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis" },
                { "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin",
                        "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis",
                        "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu" },
                { "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu",
                        "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu",
                        "Minggu", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis" },
                { "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin",
                        "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis",
                        "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu" },
                { "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu",
                        "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu",
                        "Minggu", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis" }
        };
        String[][] dateKabisat = {
                { "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis",
                        "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu",
                        "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu" },
                { "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu",
                        "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu",
                        "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis" },
                { "Jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin",
                        "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis",
                        "jum'at", "Sabtu", "Minggu", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa" },
                { "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis",
                        "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu",
                        "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa" },
                { "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu",
                        "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa",
                        "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jum'at" },
                { "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa",
                        "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at",
                        "Sabtu", "Minggu", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa" },
                { "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu",
                        "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa",
                        "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jum'at" },
                { "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa",
                        "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at",
                        "Sabtu", "Minggu", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu" },
                { "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu",
                        "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu",
                        "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jum'at" },
                { "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa",
                        "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at",
                        "Sabtu", "Minggu", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu" },
                { "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu",
                        "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu",
                        "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jum'at" },
                { "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa",
                        "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "jum'at",
                        "Sabtu", "Minggu", "Rabu", "Kamis", "jum'at", "Sabtu", "Minggu", "Senin", "Selasa", "Rabu" }
        };
        boolean signUp = false, login = false, menuLog = true, menu = true, lagi = true;
        String namaLog = "", passLog, bed, date = "", again, namaSignup, passSignup = "", passSignup1;
        String namaHotel = "";
        int harga = 0, option, lama, haMa, hari, bulan, tahun, repreat = 0, counter = 0, user = -1, banyak = 2;
        int weekend[] = { 0, 100000, 150000 };
        int extra[] = { 0, 100000, 150000 };
        double haTot, haDis;
        float disc;
        do {
            System.out.print("\033[H\033[2J");
            System.out.println(" ----------------");
            System.out.println("|    Traveloki   |");
            System.out.println(" ----------------");
            System.out.println("1. Signn up jika belum memiliki akun");
            System.out.println("2. Login jika sudah memiliki akun");
            System.out.println("3. keluar applikasi");
            option = sc.nextInt();
            System.out.print("\033[H\033[2J");
            switch (option) {
                case 1:
                    do {
                        signUp = false;
                        System.out.println(" ----------------");
                        System.out.println("|    Sign Up     |");
                        System.out.println(" ----------------");
                        System.out.print("Daftarkan username : ");
                        namaSignup = sc.next();
                        if (namaSignup.length() < 3) {
                            System.out.println("Minimal 3 Huruf");
                            continue;
                        }
                        for (int i = 0; i < usign; i++) {
                            if (namaSignup.equals(Log[i])) {
                                repreat = i;
                                System.out.println("Username telah digunakan");
                                break;
                            }
                        }
                        if (namaSignup.equals(Log[repreat])) {
                            continue;
                        }
                        System.out.print("Masukan password yang anda inginkan : ");
                        passSignup1 = sc.next();
                        System.out.print("Repeat password : ");
                        passSignup = sc.next();
                        if (passSignup.equals(passSignup1)) {
                            signUp = true;
                            System.out.print("\033[H\033[2J");
                            break;
                        } else {
                            System.out.print("\033[H\033[2J");
                            System.out.println("!!!password tidak syncron!!!");
                        }
                    } while (signUp != true); {
                    String[] newNama = new String[usign + 1];
                    usign++;
                    for (int i = 0; i < Log.length; i++) {
                        newNama[i] = Log[i];
                    }
                    Log = newNama;
                    String[] newPass = new String[psign + 1];
                    psign++;
                    for (int i = 0; i < pass.length; i++) {
                        newPass[i] = pass[i];
                    }
                    pass = newPass;
                    Log[usign - 1] = namaSignup;
                    pass[psign - 1] = passSignup;
                    System.out.print("\033[H\033[2J");
                    System.out.println("akun anda berhasil terdaftar");
                }
                case 2:
                    do {
                        login = false;
                        user = -1;
                        System.out.println(" ----------------");
                        System.out.println("|     Login      |");
                        System.out.println(" ----------------");
                        System.out.print("Masukan username : ");
                        namaLog = sc.next();
                        for (int i = 0; i < Log.length; i++) {
                            if (namaLog.equals(Log[i])) {
                                user = i;
                                break;
                            }
                        }
                        System.out.print("Masukan Password : ");
                        passLog = sc.next();
                        if (user == -1) {
                            System.out.print("\033[H\033[2J");
                            System.out.println("username atau password salah");
                            continue;
                        }
                        if (passLog.equals(pass[user])) {
                            login = true;
                        } else {
                            System.out.print("\033[H\033[2J");
                            System.out.println("username atau password salah");
                        }
                    } while (login != true);
                    System.out.print("\033[H\033[2J");
                    break;
                case 3:
                    menuLog = false;
                    continue;
                default:
                    System.out.print("\033[H\033[2J");

                    System.out.println("SATU!1!1!, DUA!2!, KALO GA 3!");
                    continue;
            }
            do {
                System.out.println(" ----------------");
                System.out.println("|    Traveloki   |");
                System.out.println(" ----------------");
                System.out.println("1. Daftar hotel");
                System.out.println("2. Booking hotel");
                System.out.println("3. Ganti akun");
                System.out.print("(1/2/3) : ");
                option = sc.nextInt();
                sc.nextLine();
                switch (option) {
                    case 3:
                        menu = false;
                        continue;
                    case 1:
                        System.out.print("nama hotel yang didaftarkan : ");
                        namaHotel = sc.nextLine();
                        banyak++;
                        String[] newHotel = new String[banyak];
                        for (int i = 0; i < hotel.length; i++) {
                            newHotel[i] = hotel[i];
                        }
                        hotel = newHotel;
                        hotel[banyak - 1] = namaHotel;
                        lagi = false;
                        continue;
                    case 2:
                        do {
                            disc = 0.0f;
                            harga = 0;
                            System.out.println(" ----------------");
                            System.out.println("|    Traveloki   |");
                            System.out.println(" ----------------");
                            if (counter == 3) {
                                disc += 0.03f;
                                System.out.println("Selamat anda mendapatkan discount loyalty sebesar 3%");
                            }
                            System.out.println(namaLog + " Mau nginep dimana?");
                            for (int i = 0; i < hotel.length; i++) {
                                System.out.print("\t" + (i + 1) + ". " + hotel[i] + "\t");
                                counter++;
                                if (counter == 5) {
                                    System.out.println("");
                                }
                            }
                            counter = 0;
                            System.out.println("\n" + (hotel.length + 1) + ". Back");
                            option = sc.nextInt();
                            if (option == hotel.length + 1) {
                                lagi = false;
                                System.out.print("\033[H\033[2J");
                                continue;
                            }
                            System.out.println("Kamar Jenis apa?");
                            System.out.println("1. Single Bed");
                            System.out.println("2. Double Bed");
                            System.out.println("3. Queen Bed");
                            System.out.println("4. King Bed");
                            System.out.print("(1/2/3/4 : )");
                            int jenis = sc.nextInt();
                            System.out.print("\033[H\033[2J");
                            System.out.print(namaLog + ", kamu tanggal berapa mau nginep ? ");
                            hari = sc.nextInt();
                            System.out.print("itu bulan keberapa ya ? ");
                            bulan = sc.nextInt();
                            System.out.println("Tahun berapa ?");
                            tahun = sc.nextInt();
                            System.out.print("berapa malam ? ");
                            lama = sc.nextInt();
                            if (tahun % 4 == 0) {
                                if (tahun % 100 != 0) {
                                    date = dateKabisat[bulan - 1][hari - 1];
                                    if (date.equalsIgnoreCase("Minggu") || date.equalsIgnoreCase("Sabtu")) {
                                        harga += weekend[option - 1];
                                    } else {
                                        harga += weekend[0];
                                    }
                                } else {
                                    date = dateNonKabisat[bulan - 1][hari - 1];
                                    if (date.equalsIgnoreCase("Minggu") || date.equalsIgnoreCase("Sabtu")) {
                                        harga += weekend[option];
                                    } else {
                                        harga += weekend[0];
                                    }
                                }
                            } else {
                                date = dateNonKabisat[bulan - 1][hari - 1];
                                if (date.equalsIgnoreCase("Minggu") || date.equalsIgnoreCase("Sabtu")) {
                                    harga += weekend[option];
                                } else {
                                    harga += weekend[0];
                                }
                            }
                            if (date.equals("Minggu") || date.equals("Sabtu")) {
                                harga += weekend[option];
                            }
                            do {
                                System.out.print("\033[H\033[2J");
                                System.out.println("Mau tambah extra bed ? ");
                                System.out.print("y/t ? ");
                                bed = sc.next();
                                if (bed.equalsIgnoreCase("y")) {
                                    harga += extra[option];
                                    System.out.print("\033[H\033[2J");
                                    break;
                                } else if (bed.equalsIgnoreCase("t")) {
                                    harga += extra[0];
                                    System.out.print("\033[H\033[2J");
                                    break;
                                } else {
                                    System.out.print("\033[H\033[2J");
                                    System.out.println("pilihan anda salah");
                                    continue;
                                }
                            } while (!bed.equalsIgnoreCase("y" + "t"));
                            switch (option) {
                                case 1:
                                    if (hari == 17 && bulan == 8) {
                                        disc += 0.1f;
                                    }
                                    break;
                                case 2:
                                    if (hari == 25 && bulan == 12) {
                                        disc += 0.12f;
                                    }
                                    break;
                                default:
                                    System.out.print("\033[H\033[2J");
                                    System.out.println("pilihan anda salah");
                            }
                            System.out.print("\033[H\033[2J");
                            haMa = (kamar[option - 1][jenis - 1] + harga) * lama;
                            haDis = haMa * disc;
                            haTot = haMa - haDis;
                            System.out.println("Total tagihannya " + haTot);
                            counter++;
                            do {
                                System.out.println("Mau booking lagi ?");
                                System.out.print("y/t : ");
                                again = sc.next();
                                if (again.equalsIgnoreCase("y")) {
                                    System.out.print("\033[H\033[2J");
                                    lagi = true;
                                    break;
                                } else if (again.equalsIgnoreCase("t")) {
                                    lagi = false;
                                    System.out.print("\033[H\033[2J");
                                    break;
                                } else {
                                    System.out.print("\033[H\033[2J");
                                    System.out.println("pilihan anda salah");
                                    continue;
                                }
                            } while (!again.equalsIgnoreCase("y" + "t"));
                        } while (lagi != false);
                        System.out.print("\033[H\033[2J");
                }
            } while (menu != false);
        } while (menuLog != false);
        System.out.print("\033[H\033[2J");
    }
}