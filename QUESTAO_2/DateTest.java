public class DateTest {

    public static void main(String[] args) {

        Date d = new Date(10, 4, 2026);

        d.displayDate();

        d.setDay(25);
        d.setMonth(12);
        d.setYear(2030);

        d.displayDate();
    }
}