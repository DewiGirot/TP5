package Partie1;

public class EntierNaturel {

  private int a;

  public EntierNaturel(int a) throws MauvaiseConstanteException {
    if (a < 0)
      throw new MauvaiseConstanteException("Erreur");
    this.a = a;
  }

  public int getNaturel(int a) {
    return (int) a;
  }

  public int inverse(int a) {
    int r = 0;

    if (a > 1) {
      while (a != 0) {
        r = r * 10;
        r = r + a % 10;
        a = a / 10;
      }
      return r;
    } else {
      return 0;
    }

  }

}