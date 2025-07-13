# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data manajemen petshop menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan jenis/ras , dan memberikan output berupa informasi detail dari seperti nama hewan, umur hewan, jenis/ras hewan, suara.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Hewan`, `Kucing`, `anjing` dan `MainProgram` adalah contoh dari class.

```bash
public abstract class Hewan {
    ...
}

public class Kucing extends Hewan {
    ...
}

public class Anjing extends Hewan {

    ...
}

public class MainProgram {

    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `daftarHewan.add(new Kucing(nama, umur, ras));` dan `daftarHewan.add(new Anjing(nama, umur, jenisAnjing))` adalah contoh pembuatan object.

```bash
daftarHewan.add(new Anjing(nama, umur, jenisAnjing))
    ...
daftarHewan.add(new Kucing(nama, umur, ras))
    ...
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` `umur` dan `jenis` adalah contoh atribut.

```bash
String nama;
int umur;
String jenis;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Hewan` `Kucing` dan `Anjing`.

```bash
 public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

public Kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.jenis = "Kucing";
        this.ras = ras;
    }

public Anjing(String nama, int umur, String ras) {
        super(nama, umur);  
        this.jenis = "Anjing";
        this.ras = ras;
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setUmur` adalah contoh method mutator.

```bash
public void setUmur(int umurBaru) {
        this.umur = umurBaru;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, dan `getUmur` adalah contoh method accessor.

```bash
public String getNama() { return nama; }
    public int getUmur() { return umur; }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `umur` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama; 
private int umur;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Kucing` dan `Anjing` mewarisi `Hewan` dengan sintaks `extends`.

```bash
public class Kucing extends Hewan {
    ...
}

public class Anjing extends Hewan {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `Suara(String)` di `Kucing`dan `Anjing` merupakan overloading method `Suara` dan `CaraMerawat` di `Kucing` dan `Anjing` merupakan override dari method `suara` dan `caramerawat` di `Hewan`.

```bash
public String suara() { return "GUK GUK!"; }
    
    @Override
    public String caraMerawat() { 
        return "Grooming mingguan"; 
    }

public String suara() { return "Meong!"; }
    
    @Override
    public String caraMerawat() { 
        return "Grooming mingguan"; 
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` 

```bash
switch(pilihan) {
                case 1:
                    tambahHewan();
                    break;
                case 2:
                    tampilkanHewan();
                    break;
                case 3:
                    System.out.println("Keluar dari sistem...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Pilih 1-3.");
            }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(Hewan h : daftarHewan) {
            System.out.println(
                h.getNama() + " (" + h.jenis + ") - " + 
                h.getUmur() + " tahun | Suara: " + h.suara()
            );
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
 static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
    System.out.println("=== SISTEM PETSHOP ===");
    System.out.println("Dibuat oleh: Galih Yudha");
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MahasiswaDetail[] mahasiswas = new MahasiswaDetail[2];` adalah contoh penggunaan array.

```bash
static ArrayList<Hewan> daftarHewan = new ArrayList<>();
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
      ```
    } catch(Exception e) {
            //KRITERIA 14: ERROR HANDLING
            System.out.println("Error: Input harus angka oii! (1-3)!");
            input.nextLine(); //Membersihkan
            pilihan = 0; //Reset nilai pilihan
        }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Galih Yudha Haryanto
NPM: 2310010440
