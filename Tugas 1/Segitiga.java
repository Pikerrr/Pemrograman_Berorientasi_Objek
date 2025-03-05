public class Segitiga {

    public static void main(String[] args) {
        int alas = 6; 
        int tinggi = 8; 
        int sisi1 = 5; 
        int sisi2 = 7; 
        int sisi3 = 8; 
        double luas = 0.5 * alas * tinggi;
        int keliling = sisi1 + sisi2 + sisi3;

        System.out.println("Luas Segitiga: " + luas);
        System.out.println("Keliling Segitiga: " + keliling);
    }
}