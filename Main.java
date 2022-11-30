import Partie1.EntierNaturel;
import Partie1.MauvaiseConstanteException;

class Main {
  public static void main(String[] args) throws MauvaiseConstanteException {
    try {
      EntierNaturel x = new EntierNaturel(2);
    } catch (MauvaiseConstanteException e) {
      e.toString();
    }
  }
}