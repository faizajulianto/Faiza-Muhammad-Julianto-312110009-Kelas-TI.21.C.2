class Person
{

  String Nama;

  char JenisKelamin;

  int Umur;

}

public class Main
{

  public static void main (String[]args)
  {

    Person Anton = new Person ();

      Anton.Nama = "Anton";

      Anton.JenisKelamin = 'L';

      Anton.Umur = 19;

    Person Riko = new Person ();

      Riko.Nama = "Riko";

      Riko.JenisKelamin = 'L';

      Riko.Umur = 20;

      System.out.println ("Nama : " + Anton.Nama);

      System.out.println ("Jenis Kelamin : " + Anton.JenisKelamin);

      System.out.println ("Umur : " + Anton.Umur);

      System.out.println ("Nama : " + Riko.Nama);

      System.out.println ("Jenis Kelamin : " + Riko.JenisKelamin);

      System.out.println ("Umur : " + Riko.Umur);

  }
}
