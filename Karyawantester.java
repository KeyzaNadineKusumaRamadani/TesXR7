//Driver Class
public class Karyawantester {
    public static void main(String[] args) {
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
    