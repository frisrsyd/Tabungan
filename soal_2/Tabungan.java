package soal_2;
public class Tabungan
{
    private String nama;
    private long noRekening;
    private double saldo = 0;
    private double saldo_minimum = 0;
    private double setoran_minimun = 0;

    public Tabungan()
    {

    }
    public Tabungan(String nama, long noRekening)
    {
        this.nama = nama;
        this.noRekening = noRekening;
    }
    protected void setSaldoMinimum(double saldo_minimum){
        this.saldo_minimum = saldo_minimum;
    }
    protected void setSetoranMinimum(double setoran_minimun)
    {
        this.setoran_minimun = setoran_minimun;
    }
    public double getSaldo()
    {
        return this.saldo;
    }
    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }
    public void simpanUang(double uang)
    {   
        if (uang >= setoran_minimun){
            this.saldo += uang;
        }else System.out.println("Uang yang disetor kurang dari setoran minimum!");
    }
    public void tarikUang(double jumlahPenarikan)
    {   
        if(jumlahPenarikan > 0 && jumlahPenarikan <= saldo && (saldo - jumlahPenarikan) >= saldo_minimum){
            this.saldo -= jumlahPenarikan;
        }
        else if (jumlahPenarikan > saldo){
            System.out.println("Saldo anda tidak mencukupi! Silahkan setor uang untuk melakukan penarikan");
        }
        else if ((saldo - jumlahPenarikan) < saldo_minimum){
            System.out.println("Saldo anda kurang dari ketentuan saldo minimum apabila melakukan penarikan ini!");
        }
        else System.out.println("Silahkan periksa lagi saldo, saldo minimum, serta jumlah penarikan anda!");
    }
}