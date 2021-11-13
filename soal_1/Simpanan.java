package soal_1;
public class Simpanan extends Tabungan
{
    private double SALDO_AWAL_MINIMUM = 500000;
    private double SALDO_MINIMUM = 10000;
    private double SETORAN_MINIMUM = 50000;
    
    public Simpanan(String nama, long noRekening, double saldoAwal)
    {
        super(nama, noRekening);
        super.setSaldoMinimum(SALDO_MINIMUM);
        super.setSetoranMinimum(SETORAN_MINIMUM);
        if (saldoAwal >= SALDO_AWAL_MINIMUM){
            super.setSaldo(saldoAwal);
        }else System.out.println("Saldo awal kurang dari ketentuan saldo awal minimum!");
    } 
}

