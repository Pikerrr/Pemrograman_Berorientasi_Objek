public class Array1{
    public static void main(String[] args) {
        int[] data = {68, 7, 28, 90, 32};
        int jumlahData = data.length;

        System.out.println("Jumlah Data : " + jumlahData);

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data ke - " + (i + 1) + " = " + data[i]);
        }

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Hasil nilai[" + i + "]=" + data[i]);
        }
    }
}