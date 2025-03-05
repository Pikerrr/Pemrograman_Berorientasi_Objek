public class Lingkaran {

    public static void main(String[] args) {
        int jariJari = 7; 
        double phi = 3.14; 

        double luas = phi * jariJari * jariJari;
        double keliling = 2 * phi * jariJari;

        System.out.println("Luas Lingkaran: " + luas);
        System.out.println("Keliling Lingkaran: " + keliling);
    }
}