package unittest;
/**
 *
 * @author ASUS
 */
public class Kategoritest {
    private String id_kategori, nama_kategori, dosis;
    public String getId_kategori(){
        return id_kategori;
    }
    public void setId_kategori(String id_kategori) {
        this.id_kategori = id_kategori;
    }
    public void setNama_kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }
    public String getNama_kategori(){
        return nama_kategori;
    }
    public void setDosis(String dosis) {
        this.dosis = dosis;
    }
    public String getDosis(){
        return dosis;
    }
    public String kategoriFormat() {
        String kategori = String.format("Hai %s, you have kategori from %s.\n", this.id_kategori, this.nama_kategori, this.dosis);
        return kategori;
    }
    public void showKategori() {
        System.out.println(kategoriFormat());
    }
}
