/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import Koneksi_DB.DBHelper;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author ASUS
 */
public class Kategori {
    private String id_kategori, nama_kategori, dosis;
    
    
    public Kategori() {
    }

    public Kategori(String id_kategori, String nama_kategori, String dosis) {
        this.id_kategori = id_kategori;
        this.nama_kategori = nama_kategori;
        this.dosis=dosis;
    }

    public String getId_kategori() {
        return id_kategori;
    }

    public void setId_kategori(String id_kategori) {
        this.id_kategori = id_kategori;
    }

    public String getNama_kategori() {
        return nama_kategori;
    }

    public void setNama_kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }
    
    public Kategori getById(int id) {
        Kategori kat = new Kategori();
        KatBebas kb = new KatBebas();
        ResultSet rs2 = DBHelper.selectQuery("Select * from kategori " + " where id_kategori = '" + id + "'");

        try {
            while (rs2.next()) {
                kat = new Kategori();
                kat.setId_kategori(rs2.getString("idKategori"));
                kat.setNama_kategori(rs2.getString("namaKategori"));
                kb.setDosis(rs2.getString("dosis"));
              }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Kategori> getAll() {
        ArrayList<Kategori> ListKategori = new ArrayList();

        ResultSet rs2 = DBHelper.selectQuery("Select * from kategori");

        try {
            while (rs2.next()) {
                Kategori kat = new Kategori();
                KatBebas kb = new KatBebas();
                kat.setId_kategori(rs2.getString("idKategori"));
                kat.setNama_kategori(rs2.getString("namaKategori"));
                kb.setDosis(rs2.getString("dosis"));
                
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public ArrayList<Kategori> search(String keyword) {
        ArrayList<Kategori> ListKategori = new ArrayList();

        String sql = "SELECT * FROM kategori where " + " idKategori like '%" + keyword + "%' " + " or namaKategori like '%" + keyword + "%' " + " or dosis like '%" + keyword + "%' ";

        ResultSet rs2 = DBHelper.selectQuery(sql);

        try {
            while (rs2.next()) {
                Kategori kat = new Kategori();
                KatBebas kb = new KatBebas();
                kat.setId_kategori(rs2.getString("idKategori"));
                kat.setNama_kategori(rs2.getString("namaKategori"));
                kb.setDosis(rs2.getString("dosis"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListKategori;
    }
}
