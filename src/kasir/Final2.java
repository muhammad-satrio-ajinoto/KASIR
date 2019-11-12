/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author tio
 */
public class Final2 {

    public static void main(String[] args) {

        int input;
        int kelamin;
        int merk;
        int tipe;
        int warna;
        int ukuran;
        int adidas = 500000;
        int nike = 700000;
        int puma = 200000;
        int nb = 300000;
        int converse = 500000;
        int skechers = 50000;
        int jordan = 800000;
        int s = 500000;
        int ardiles = 1000000;
        int beli;
        boolean running = true;
        int counter = 0;

        //VARIABEL UNTUK HARI TANGGAL & TAHUN
        String pola = null;
        String hasil = null;
        Locale lokal = null;
        Date tanggalDanWaktu = new Date();
        //LOOPING
        while (running) {
            Scanner sat = new Scanner(System.in);
            System.out.println(" === MAX PEMBELIAN 3 === ");
            System.out.println("=========================");
            System.out.println("|| MENU PILIHAN SEPATU ||");
            System.out.println("|| [1] ADIDAS          ||");
            System.out.println("|| [2] NIKE            ||");
            System.out.println("|| [3] PUMA            ||");
            System.out.println("|| [4] NB              ||");
            System.out.println("|| [5] CONVERSE        ||");
            System.out.println("|| [6] SKECHERS        ||");
            System.out.println("|| [7] JORDAN          ||");
            System.out.println("|| [8] 3 S             ||");
            System.out.println("|| [9] ARDILES         ||");
            System.out.println("=========================");
            System.out.println("|| SEPATU YANG KOSONG  ||");
            System.out.println("||  ADIDAS UKURAN 4    ||");
            System.out.println("||  PUMA UKURAN 3      ||");
            System.out.println("=========================");
            System.out.println("||  BELI 1 GA DISKON   ||");
            System.out.println("||  BELI 2 DISKON      ||");
            System.out.println("||  BELI 3 JUGA DISKON ||");
            System.out.println("=========================");
            System.out.println(" === MAX PEMBELIAN 3 === ");
            merk = sat.nextInt();

            if (merk == merk) ;            
            System.out.println("=========================");
            System.out.println("||  [1] PRIA           ||");
            System.out.println("||  [2] WANITA         ||");
            System.out.println("=========================");
            kelamin = sat.nextInt();
            if (kelamin == kelamin);
            System.out.println("========================");
            System.out.println("||  [1] RUNNING       ||");
            System.out.println("||  [2] KANTORAN      ||");
            System.out.println("||  [3] CASUAL        ||");
            System.out.println("||  [4] SANDAL        ||");
            System.out.println("========================");
            tipe = sat.nextInt();
            if (tipe == tipe);
            System.out.println("========================");
            System.out.println("||  [1] BLUE          ||");
            System.out.println("||  [2] RED           ||");
            System.out.println("||  [3] GOLD          ||");
            System.out.println("||  [4] SILVER        ||");
            System.out.println("||  [5] WHITE         ||");
            System.out.println("||  [6] BLACK         ||");
            System.out.println("========================");
            warna = sat.nextInt();
            if (warna == warna);
            System.out.println("========================");
            System.out.println("||  [1] 37            ||");
            System.out.println("||  [2] 38            ||");
            System.out.println("||  [3] 39            ||");
            System.out.println("||  [4] 40            ||");
            System.out.println("||  [5] 41            ||");
            System.out.println("||  [6] 42            ||");
            System.out.println("========================");
            ukuran = sat.nextInt();
            //STRUK PEMBELIAN
            System.out.println("\n"+"\n");
            System.out.println("===== BARANG YANG DI BELI =====");
            System.out.println("===============================");
            //INHERITANCE
            Kasir2 r = new Kasir2("JAYA BARU", "JL. SAWOJAJAR", "098764", "PAK IPIN");
            r.info();

            if (merk == 1) {
                System.out.println("MERK\t: ADIDAS");
            }

            if (merk == 2) {
                System.out.println("MERK\t: NIKE");
            }
            if (merk == 3) {
                System.out.println("MERK\t: PUMA");
            }
            if (merk == 4) {
                System.out.println("MERK\t: NB");
            }
            if (merk == 5) {
                System.out.println("MERK\t: CONVERSE");
            }
            if (merk == 6) {
                System.out.println("MERK\t: SKECHERS ");
            }
            if (merk == 7) {
                System.out.println("MERK\t: JORDAN");
            }
            if (merk == 8) {
                System.out.println("MERK\t: 3 S ");
            }
            if (merk == 9) {
                System.out.println("MERK\t: ARDILES");
            }
            if (kelamin == 1) {
                System.out.println("JENIS\t: PRIA");
            }
            if (kelamin == 2) {
                System.out.println("JENIS\t: WANITA");
            }
            if (tipe == 1) {
                System.out.println("TIPE\t: RUNNING");
            }
            if (tipe == 2) {
                System.out.println("TIPE\t: KANTORAN");
            }
            if (tipe == 3) {
                System.out.println("TIPE\t: CASUAL");
            }
            if (tipe == 4) {
                System.out.println("TIPE\t: SANDAL");
            }
            if (warna == 1) {
                System.out.println("WARNA\t: BLUE");
            }
            if (warna == 2) {
                System.out.println("WARNA\t: RED");
            }
            if (warna == 3) {
                System.out.println("WARNA\t: GOLD");
            }
            if (warna == 4) {
                System.out.println("WARNA\t: SILVER");
            }
            if (warna == 5) {
                System.out.println("WARNA\t: WHITE");
            }
            if (warna == 6) {
                System.out.println("WARNA\t: BLACK");
            }
            if (ukuran == 1) {
                System.out.println("UKURAN\t: 37");
            }
            if (ukuran == 2) {
                System.out.println("UKURAN\t: 38");
            }
            if (ukuran == 3) {
                System.out.println("UKURAN\t: 39");
            }
            if (ukuran == 4) {
                System.out.println("UKURAN\t: 40");
            }
            if (ukuran == 5) {
                System.out.println("UKURAN\t: 41");
            }
            if (ukuran == 6) {
                System.out.println("UKURAN\t: 42");
            }
            System.out.print("JUMLAH BARANG YANG DIBELI : ");
            beli = sat.nextInt();
            System.out.println("===============================");
            System.out.println("\n");

            //DISKON
            int diskon = 50000;
            int diskon2 = 100000;
            int kali = 2;
            int kali2 = 3;
            int total;
            int td;
            switch (merk) {

                case 1:
                    if (merk == 1) ;
                    if (beli == 1) {
                        System.out.println("TIDAK ADA DISKON");

                        System.out.println("TOTAL\t: " + adidas);
                        break;

                    }

                    if (beli == 2) {
                        System.out.println("DISKON 50 K");
                        total = (adidas * kali);
                        td = (total - diskon);
                        System.out.println("JUMLAH PEMBAYARAN : " + td);
                        break;
                    }
                    if (beli == 3) {
                        System.out.println("DISKON 100 K");
                        total = (adidas * kali2);
                        td = (total - diskon2);
                        System.out.println("JUMLAH PEMBAYARAN : " + td);
                        break;
                    }
                case 2:
                    if (merk == 2) ;
                    if (beli == 1) {
                        System.out.println("TIDAK ADA DISKON");

                        System.out.println("TOTAL\t: " + nike);
                        break;

                    }

                    if (beli == 2) {
                        System.out.println("DISKON 50 K");
                        total = (nike * kali);
                        td = (total - diskon);
                        System.out.println("JUMLAH PEMBAYARAN : " + td);
                        break;
                    }
                    if (beli == 3) {
                        System.out.println("DISKON 100 K");
                        total = (nike * kali2);
                        td = (total - diskon2);
                        System.out.println("JUMLAH PEMBAYARAN : " + td);
                        break;
                    }
                case 3:
                    if (merk == 3) ;
                    if (beli == 1) {
                        System.out.println("TIDAK ADA DISKON");

                        System.out.println("TOTAL\t: " + puma);
                        break;

                    }

                    if (beli == 2) {
                        System.out.println("DISKON 50 K");
                        total = (puma * kali);
                        td = (total - diskon);
                        System.out.println("JUMLAH PEMBAYARAN : " + td);
                        break;
                    }
                    if (beli == 3) {
                        System.out.println("DISKON 100 K");
                        total = (puma * kali2);
                        td = (total - diskon2);
                        System.out.println("JUMLAH PEMBAYARAN : " + td);
                        break;
                    }
                case 4:
                    if (merk == 4) ;
                    if (beli == 1) {
                        System.out.println("TIDAK ADA DISKON");

                        System.out.println("TOTAL\t: " + nb);
                        break;

                    }

                    if (beli == 2) {
                        System.out.println("DISKON 50 K");
                        total = (nb * kali);
                        td = (total - diskon);
                        System.out.println("JUMLAH PEMBAYARAN : " + td);
                        break;
                    }
                    if (beli == 3) {
                        System.out.println("DISKON 100 K");
                        total = (nb * kali2);
                        td = (total - diskon2);
                        System.out.println("JUMLAH PEMBAYARAN : " + td);
                        break;
                    }
                case 5:
                    if (merk == 5) ;
                    if (beli == 1) {
                        System.out.println("TIDAK ADA DISKON");

                        System.out.println("TOTAL\t: " + converse);
                        break;

                    }

                    if (beli == 2) {
                        System.out.println("DISKON 50 K");
                        total = (converse * kali);
                        td = (total - diskon);
                        System.out.println("JUMLAH PEMBAYARAN : " + td);
                        break;
                    }
                    if (beli == 3) {
                        System.out.println("DISKON 100 K");
                        total = (converse * kali2);
                        td = (total - diskon2);
                        System.out.println("JUMLAH PEMBAYARAN : " + td);
                        break;
                    }
                case 6:
                    if (merk == 6) ;
                    if (beli == 1) {
                        System.out.println("TIDAK ADA DISKON");

                        System.out.println("TOTAL\t: " + skechers);
                        break;

                    }

                    if (beli == 2) {
                        System.out.println("DISKON 50 K");
                        total = (skechers * kali);
                        td = (total - diskon);
                        System.out.println("JUMLAH PEMBAYARAN : " + td);
                        break;
                    }
                    if (beli == 3) {
                        System.out.println("DISKON 100 K");
                        total = (skechers * kali2);
                        td = (total - diskon2);
                        System.out.println("JUMLAH PEMBAYARAN : " + td);
                        break;
                    }
                case 7:
                    if (merk == 7) ;
                    if (beli == 1) {
                        System.out.println("TIDAK ADA DISKON");

                        System.out.println("TOTAL\t: " + jordan);
                        break;

                    }

                    if (beli == 2) {
                        System.out.println("DISKON 50 K");
                        total = (jordan * kali);
                        td = (total - diskon);
                        System.out.println("JUMLAH PEMBAYARAN : " + td);
                        break;
                    }
                    if (beli == 3) {
                        System.out.println("DISKON 100 K");
                        total = (jordan * kali2);
                        td = (total - diskon2);
                        System.out.println("JUMLAH PEMBAYARAN : " + td);
                        break;
                    }
                case 8:
                    if (merk == 8) ;
                    if (beli == 1) {
                        System.out.println("TIDAK ADA DISKON");

                        System.out.println("TOTAL\t: " + s);
                        break;

                    }

                    if (beli == 2) {
                        System.out.println("DISKON 50 K");
                        total = (s * kali);
                        td = (total - diskon);
                        System.out.println("JUMLAH PEMBAYARAN : " + td);
                        break;
                    }
                    if (beli == 3) {
                        System.out.println("DISKON 100 K");
                        total = (s * kali2);
                        td = (total - diskon2);
                        System.out.println("JUMLAH PEMBAYARAN : " + td);
                        break;
                    }
                case 9:
                    if (merk == 9) ;
                    if (beli == 1) {
                        System.out.println("TIDAK ADA DISKON");

                        System.out.println("TOTAL\t: " + ardiles);
                        break;

                    }

                    if (beli == 2) {
                        System.out.println("DISKON 50 K");
                        total = (ardiles * kali);
                        td = (total - diskon);
                        System.out.println("JUMLAH PEMBAYARAN : " + td);
                        break;
                    }
                    if (beli == 3) {
                        System.out.println("DISKON 100 K");
                        total = (ardiles * kali2);
                        td = (total - diskon2);
                        System.out.println("JUMLAH PEMBAYARAN : " + td);
                        break;
                    }
                default:
                    System.out.println("MAAF MAX PEMBELIAN 3 PASANG SAJA");
            }
            //LOOPING / PENGULANGAN
            String plh;
            System.out.print("APAKAH ANDA YAKIN [YA / TIDAK] : ");
            plh = sat.next();
            if (plh.equalsIgnoreCase("ya")) {
                running = false;
            }

            //HARI,TANGGAL & TAHUN
            pola = "dd/MM/yy";
            hasil = Final2.tampilkanTanggalDanWaktu(tanggalDanWaktu, pola, lokal);
            System.out.println("TANGGAL : " + tanggalDanWaktu);

            System.out.println(pola + "  " + hasil);

        }
    }

    protected static String tampilkanTanggalDanWaktu(Date tanggalDanWaktu, String pola, Locale lokal) {
        String tanggalStr = null;
        SimpleDateFormat formatter = null;
        if (lokal == null) {
            formatter = new SimpleDateFormat(pola);

        } else {
            formatter = new SimpleDateFormat(pola, lokal);
        }
        tanggalStr = formatter.format(tanggalDanWaktu);
        return tanggalStr;
    }
}
