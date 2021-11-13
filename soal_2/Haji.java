package soal_2;

public class Haji extends Tabungan
{
    private double SALDO_AWAL_MINIMUM = 500000;    
    private double SALDO_MINIMUM = 500000;    
    private double SETORAN_MINIMUM = 100000;
    
    public Haji(String nama, long noRekening, double saldoAwal)
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
        if (jumlahPenarikan <= (0.1 * super.getSaldo()) ){
            super.tarikUang(jumlahPenarikan);
        }
        else{
            super.tarikUang(jumlahPenarikan + 50000);
        }
    }
}
