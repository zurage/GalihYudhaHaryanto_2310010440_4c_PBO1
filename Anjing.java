package GalihYudhaHaryanto_2310010440_4c_PBO1;

//KRITERIA 1: CLASS dan KRITERIA 8: INHERITANCE
public class Anjing extends Hewan {
    //KRITERIA 3: ATRIBUT
    private String ras;
    
    public Anjing(String nama, int umur, String ras) {
        super(nama, umur); //KRITERIA 4: CONSTRUCTOR
        this.jenis = "Anjing";
        this.ras = ras;
    }
    
    //KRITERIA 9: POLYMORPHISM
    public String suara() { return "GUK GUK!"; }
    
   
    public String caraMerawat() { 
        return "Grooming mingguan"; 
    }
    
    //KRITERIA 6: ACCESSOR
    public String getRas() { return ras; }
}
