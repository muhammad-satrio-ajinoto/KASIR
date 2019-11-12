/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir;

/**
 *
 * @author tio
 */
public class KASIR {

    private String toko;
    private String jalan;
    private String kasir;

    public KASIR(String toko, String jalan, String kasir) {
        this.toko = toko;
        this.jalan = jalan;
        this.kasir = kasir;
    }

    public void info() {
        System.out.println("NAMA TOKO  : " + this.toko);
        System.out.println("NAMA JALAN : " + this.jalan);
        System.out.println("NAMA KASIR : " + this.kasir);

    }
}
