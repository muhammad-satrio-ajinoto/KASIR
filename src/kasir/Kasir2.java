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
public class Kasir2 extends KASIR {

    private String noPembelian;

    public Kasir2(String toko, String jalan, String noPembelian, String kasir) {
        super(toko, jalan, kasir);
        this.noPembelian = noPembelian;
    }

    public void info() {
        System.out.println("No Pembelian : " + noPembelian);
        super.info();

    }
}
