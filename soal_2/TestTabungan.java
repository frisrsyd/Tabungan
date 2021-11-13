package soal_2;

import soal_2.Haji;
import soal_2.Bisnis;

public class TestTabungan 
{
    public static void main(String[] args) {
        //Tabungan Bisnis
        System.out.println("Tabungan Bisnis");
        Bisnis user = new Bisnis("faris", 123123123, 1000000);
        System.out.println(user.getSaldo());
        user.simpanUang(50000);
        System.out.println(user.getSaldo());
        user.tarikUang(40000);
        System.out.println(user.getSaldo());
        user.simpanUang(10000);
        System.out.println(user.getSaldo() + "\n");

        // Tabungan Haji
        System.out.println("Tabungan Haji");
        Haji user2 = new Haji("daffa", 112353212, 50000);
        
        Haji user3 = new Haji("abdul", 112353212, 500000);
        System.out.println(user3.getSaldo());
        user3.simpanUang(100000);
        System.out.println(user3.getSaldo());
        user3.tarikUang(40000);
        System.out.println(user3.getSaldo());
        user3.simpanUang(10000);
        System.out.println(user3.getSaldo());
        user3.tarikUang(560000);
        System.out.println(user3.getSaldo());
        user3.tarikUang(60000);
        System.out.println(user3.getSaldo());
        
    }    
}
