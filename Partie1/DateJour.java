package Partie1;

public class DateJour {

  private int day, month, year;

  public DateJour(int day, int month, int year) throws DateException {
    if ((day < 1 || day > 31) || (month < 1 || month > 12) || (year < 1900 || year > 2022)) {
      throw new DateException("Date erreur");
    }
    this.day = day;
    this.month = month;
    this.year = year;
  }
}