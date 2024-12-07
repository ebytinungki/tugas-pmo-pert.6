public class PerhitunganAritmatikaArray {
    public static void main(String[] args) {
        // Array dengan tipe data int
        int[] angkaInt = {10, 20, 30, 40, 50};
        // Array dengan tipe data double
        double[] angkaDouble = {10.5, 20.75, 30.25, 40.0, 50.5};

        // Variabel untuk menyimpan hasil penjumlahan
        int totalInt = 0;
        double totalDouble = 0;

        // Menggunakan perulangan for untuk menghitung penjumlahan array int
        for (int i = 0; i < angkaInt.length; i++) {
            totalInt += angkaInt[i];  // Penjumlahan elemen array int
        }

        // Menggunakan perulangan for untuk menghitung penjumlahan array double
        for (int i = 0; i < angkaDouble.length; i++) {
            totalDouble += angkaDouble[i];  // Penjumlahan elemen array double
        }

        // Menampilkan hasil penjumlahan
        System.out.println("Total penjumlahan array int: " + totalInt);  // Output: 150
        System.out.println("Total penjumlahan array double: " + totalDouble);  // Output: 151.0

        // Perhitungan rata-rata untuk array int
        double rataRataInt = totalInt / (double) angkaInt.length;
        // Perhitungan rata-rata untuk array double
        double rataRataDouble = totalDouble / angkaDouble.length;

        // Menampilkan rata-rata
        System.out.println("Rata-rata array int: " + rataRataInt);  // Output: 30.0
        System.out.println("Rata-rata array double: " + rataRataDouble);  // Output: 30.2
    }
}