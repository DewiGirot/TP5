package Partie2;

public class ex1 {

  private int[] tab;

  public ex1(int[] tab) {
    this.tab = tab;
  }

  public void insertTab(int i, int index) {
    if (this.tab[index] == null)
      this.tab[index] = i;

  }

  public int[] getTab() {
    return this.tab;
  }

}