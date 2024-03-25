public class Booking {
  private HolidayPackage holidayPackage;
  private String name;
  private int numberPersons;
  private String bookingDate;

  public Booking(HolidayPackage holidayPackage, String name, int numberPersons, String bookingDate) {  //constructor of the class Booking
      this.holidayPackage = holidayPackage;
      this.name = name;
      this.numberPersons = numberPersons;
      this.bookingDate = bookingDate;
  }

  public HolidayPackage getHolidayPackage() {
      return holidayPackage;
  }

  public String getName() {
      return name;
  }

  public int getNumberPersons() {
      return numberPersons;
  }

  private String getBookingDate() {
      return bookingDate;
  }

  @Override
    public String toString() {
      return "Booking Details: " +
              "\nCustomer Name: " + name +
              "\nNumber of Persons: " + numberPersons +
              "\nBooking Date: " + bookingDate +
              "\nPackage Details: " + holidayPackage;
  }
}
