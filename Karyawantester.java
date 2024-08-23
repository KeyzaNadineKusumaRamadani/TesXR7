//Driver Class
import java.util.Scanner;

public class Karyawantester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inputan Nama Karyawan");
        String nama = input.nextLine();
        System.out.println("Inputan Unit Karyawan");
        String unit = input.nextLine();
        System.out.println("Inputan Alamat Karyawan");
        String alamat = input.nextLine();
        System.out.println("Inputan ID Karyawan");
        int id = input.nextInt();

        Karyawan memey = new Karyawan(145, "MEMEY", "KURIKULUM", "BANYUWANGI" );
        
        //Object
        //Class Object = new Constructor
        Karyawan Nadine = new Karyawan(123,"Nadine", "TU", "Surabaya");
        Karyawan Tania = new Karyawan(378,"Tania", "Kurikulum", "Jember");
        Karyawan Hada = new Karyawan(345,"Hada","kesiswaan","Blitar");
        Karyawan Icha = new Karyawan(567,"Icha","BK","Tulungagung");
        Karyawan Firsya = new Karyawan(789,"Firsya","Sapra","Kepanjen");
        
    
        Nadine.print();
        Tania.print();
        Hada.print();
        Icha.print();
        Firsya.print();
    }

}
    