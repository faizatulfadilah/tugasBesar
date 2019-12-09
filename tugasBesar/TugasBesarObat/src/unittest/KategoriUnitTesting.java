/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

/**
 *
 * @author ASUS
 */
public class KategoriUnitTesting {
    public static void main(String[] args) {
        Kategoritest kt = new Kategoritest();
        kt.setId_kategori("1234");
        kt.setNama_kategori("Obat Keras");
        kt.setDosis("65%");
        kt.showKategori();
    }
}
