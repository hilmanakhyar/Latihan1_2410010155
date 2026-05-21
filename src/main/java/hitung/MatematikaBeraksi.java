package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika hilman = new Matematika(5,5);
        
        System.out.println("Hasil Penjumlahan : "+hilman.setPenjumlahan());
        System.out.println("Hasil Pengurangan : "+hilman.setPengurangan());
        System.out.println("Hasil Perkalian : "+hilman.setPerkalian());
        System.out.println("Hasil Pembagian : "+hilman.setPembagian());
    }
}
