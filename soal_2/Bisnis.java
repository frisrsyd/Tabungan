package soal_2;

public class Bisnis extends Tabungan
{
    private double SALDO_AWAL_MINIMUM = 1000000;
    private double SALDO_MINIMUM = 1000000;
    private double SETORAN_MINIMUM = 50000;

    public Bisnis(String nama, long noRekening, double saldoAwal)
    {
        super(nama, noRekening);
        super.setSaldoMinimum(SALDO_MINIMUM);
        super.setSetoranMinimum(SETORAN_MINIMUM);
        if (saldoAwal >= SALDO_AWAL_MINIMUM){
            super.setSaldo(saldoAwal);
        }else System.out.println("Saldo awal kurang dari ketentuan saldo awal minimum!");
    }
}
