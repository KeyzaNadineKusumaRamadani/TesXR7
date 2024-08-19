public class Karyawan {
    int id;
    String nama;
    String unit;
    String alamat;

    // Constructor Parameter
    public Karyawan (int id, String nama, String unit, String alamat){
       //variabel = parameter 
       
    this.id = id;
    this.nama= nama;
    this.unit = unit;
    this.alamat = alamat; 
    }
        

    //method print 
    public void print(){
        System.out.println("ID: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("unit: " + unit);
        System.out.println("Alamat: " + alamat);
    }
}

