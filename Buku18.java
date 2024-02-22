public class Buku18 {
    String judul, pengarang;
    int halaman, stok, harga;
    
    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang " + pengarang);
        System.out.println("Jumlah halaman: " +halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
        } else {
            System.out.println("Stok sudah habis.");
        }
    }
    
    void restock(int jml) {
        stok += jml;
    }
    void gantiHarga(int hrg) {
        harga = hrg;
    }

   int hitungHargaTotal(int jumlahTerjual) {
    return harga * jumlahTerjual;
   }

   int hitungDiskon(int hargaTotal) {
    int diskon = 0;
    if (hargaTotal > 150000) {
        diskon = (int) (0.12 * hargaTotal);
    } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
        diskon = (int) (0.05 * hargaTotal);
    }
    return diskon;
   }
 int hitungHargaBayar(int hargaTotal, int diskon) {
    return hargaTotal - diskon;
 }

    public Buku18() {

    }

    public Buku18(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
}

