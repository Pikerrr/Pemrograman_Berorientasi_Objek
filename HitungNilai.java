public class HitungNilai{

    static class Nilai {
        private String nama;
        private double nilai;

        public Nilai(String nama, double nilai) {
            this.nama = nama;
            this.nilai = nilai;
        }

        public String getNama() {
            return nama;
        }

        public double getNilai() {
            return nilai;
        }
    }

    private Nilai[] dataNilai;
    private int jumlahData;

    public HitungNilai(int kapasitas) {
        dataNilai = new Nilai[kapasitas];
        jumlahData = 0;
    }

    public void tambahNilai(String nama, double nilai) {
        if (jumlahData < dataNilai.length) {
            dataNilai[jumlahData] = new Nilai(nama, nilai);
            jumlahData++;
        } else {
            System.out.println("Kapasitas array penuh!");
        }
    }

    public void daftarNilai() {
        System.out.println("Daftar Nilai:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Nama: " + dataNilai[i].getNama() + ", Nilai: " + dataNilai[i].getNilai());
        }
    }

    public static void main(String[] args) {
        HitungNilai hitung = new HitungNilai(5); // Kapasitas array 5

        hitung.tambahNilai("Andi", 85.5);
        hitung.tambahNilai("Budi", 92.0);
        hitung.tambahNilai("Citra", 78.5);
        hitung.tambahNilai("Dedi", 88.0);
        hitung.tambahNilai("Eka", 95.0);

        hitung.daftarNilai();
    }
}