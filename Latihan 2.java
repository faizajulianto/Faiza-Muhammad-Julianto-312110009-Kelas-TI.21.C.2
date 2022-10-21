class AkunBank
{
  private double saldo;

  public AkunBank ()
  {
    saldo = 100000;
  }

  public void simpanUang (double jumlah)
  {
    saldo = saldo + jumlah;
  }

  public void ambilUang (double jumlah)
  {
    saldo = saldo - jumlah;
  }

  public double cekSaldo ()
  {
    return saldo;
  }
}

public class Main
{
  public static void main (String[]args)
  {
    AkunBank objek = new AkunBank ();

      System.out.println ("Selamat Datang di Bank ABC");
      System.out.println ("Saldo saat ini: Rp. " + objek.cekSaldo ());
      System.out.println ();

      objek.simpanUang (500000);
      System.out.println ("Simpan uang: Rp. 500000");
      System.out.println ("Saldo saat ini: Rp. " + objek.cekSaldo ());
      System.out.println ();

      objek.ambilUang (150000);
      System.out.println ("Ambil uang: Rp. 150000");
      System.out.println ("Saldo saat ini: Rp. " + objek.cekSaldo ());
      System.out.println ();
  }
}
