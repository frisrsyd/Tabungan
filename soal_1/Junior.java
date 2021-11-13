package soal_1;
public class Junior extends Tabungan 
{
    private double SALDO_AWAL_MINIMUM = 50000;
    private double SALDO_MINIMUM = 10000;
    private double SETORAN_MINIMUM = 50000;
    private double MAKS_TARIKAN_PER_HARI = 1000000;
    
    public Junior(String nama, long noRekening, double saldoAwal)
    {
        super(nama, noRekening);
        super.setSaldoMinimum(SALDO_MINIMUM);
        super.setSetoranMinimum(SETORAN_MINIMUM);
        if (saldoAwal >= SALDO_AWAL_MINIMUM){
            super.setSaldo(saldoAwal);
        }else System.out.println("Saldo awal kurang dari ketentuan saldo awal minimum!");
    }
    @Override
    public void tarikUang(double jumlahPenarikan)
    {
        if (jumlahPenarikan <= MAKS_TARIKAN_PER_HARI){
            super.tarikUang(jumlahPenarikan);
        }
    }
}
