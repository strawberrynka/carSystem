import java.util.ArrayList;
import java.util.Date;

public class Exhibition {
    private ArrayList<Car> cars;
    private Date date;
    private DayOfWeek dayOfWeek;
    public Exhibition (ArrayList<Car> cars, Date date, DayOfWeek dayOfWeek) {
        this.cars = cars;
        this.date = date;
        this.dayOfWeek = dayOfWeek;
    }
    public static enum DayOfWeek {
        MONDAY ("Понедельник"),
        TUESDAY("Вторник"),
        WEDNESDAY("Среда"),
        THURSDAY("Четверг"),
        FRIDAY("Пятница"),
        SATURDAY("Суббота"),
        SUNDAY("Воскресенье");
        public final String title;
        DayOfWeek(String title) {
            this.title = title;
        }
    }
    public void viewBriefInformation () {
        System.out.println("Дата выставки: " + date.toString());
        System.out.println("День недели: " + dayOfWeek);
        System.out.println("Имена экспонатов: ");
        for (Car car : cars) {
            System.out.println(car.name);
        }
        System.out.println();
    }
    public void viewAllCars () {
        for (Car car : cars) {
            car.specificView();
        }
    }
}
