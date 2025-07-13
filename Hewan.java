package GalihYudhaHaryanto_2310010440_4c_PBO1;

//KRITERIA : CLASS dan KRITERIA 7 ENCAPSULATION
public abstract class Hewan {
    //KRITERIA 3: ATRIBUT
    private String nama;//Atribut private 
    private int umur;
    protected String jenis;
    
    //KRITERIA 4 CONSTRUCTOR
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    
    //KRITERIA 5: MUTATOR
    public void setUmur(int umurBaru) {
        this.umur = umurBaru;
    }
    
    //KRITERIA 6: ACCESSOR
    public String getNama() { return nama; }
    public int getUmur() { return umur; }
    
    //[KRITERIA 9: POLYMORPHISM
    public abstract String suara();
    public abstract String caraMerawat();
}

