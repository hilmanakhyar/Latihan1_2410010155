package hitung;

public class Matematika {
    //membuat variabel
    private double bil1;
    private double bil2;
    
    //membuat constructor
    public Matematika(double bil1, bil2){
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    
    public double setPenjumlahan(){
        return bil1 + bil2;
    }
   
    public double setPengurangan(){
        return bil1 - bil2;
    }
    
    public double setPerkalian(){
    return bil1 * bil2;
    }
    
    public double setPembagian(){
        return bil1 / bil2;
    }    
}
