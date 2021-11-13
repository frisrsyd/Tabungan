package soal_1;

import soal_1.Junior;
import soal_1.Simpanan;

public class TestTabungan 
{
    public static void main(String[] args) {
        //Tabungan Junior
        System.out.println("Tabungan Junior");
        Junior user = new Junior("faris", 123123123, 100000);
        System.out.println(user.getSaldo());
        user.simpanUang(50000);
        System.out.println(user.getSaldo());
        user.tarikUang(40000);
        System.out.println(user.getSaldo());
        user.simpanUang(10000);
        System.out.println(user.getSaldo() + "\n");

        // Tabungan Simpanan
        System.out.println("Tabungan Simpanan");
        Simpanan user2 = new Simpanan("daffa", 112353212, 50000);
        
        Simpanan user3 = new Simpanan("abdul", 112353212, 500000);
        System.out.println(user3.getSaldo());
        user3.simpanUang(50000);
        System.out.println(user3.getSaldo());
        user3.tarikUang(40000);
        System.out.println(user3.getSaldo());
        user3.tarikUang(1000000);
        System.out.println(user3.getSaldo());
        user3.tarikUang(510000);
        System.out.println(user3.getSaldo());
        user3.simpanUang(10000);
        System.out.println(user3.getSaldo());
        
    }    
}
