public class Car {
    protected String name;
    protected int wheels;
    protected int maxSpeed;
    protected int engineVolume;
    public Car(String name, int wheels, int maxSpeed, int engineVolume) {
        this.name = name;
        this.wheels = wheels;
        this.maxSpeed = maxSpeed;
        this.engineVolume = engineVolume;
    }
    public void specificView () {
        System.out.println("Название: " + this.name);
        System.out.println("Количество колес: " + this.wheels);
        System.out.println("Максимальная скорость: " + this.maxSpeed);
        System.out.println("Объем двигателя: " + this.engineVolume);
    }
}

class PremiumCar extends Car {
    private String seatMaterial;
    public PremiumCar(String name, int wheels, int maxSpeed, int engineVolume, String seatMaterial) {
        super(name, wheels, maxSpeed, engineVolume);
        this.seatMaterial = seatMaterial;
    }
    public void seatMaterialView () {
        System.out.println("Материал сидений: " + this.seatMaterial);
    }
    public void putOnAutopilot () {
        System.out.println("Вы покатались на премиум машине в режиме автопилота");
    }
}

class HandmadeCar extends Car {
    private String carMaterial;
    public HandmadeCar(String name, int wheels, int maxSpeed, int engineVolume, String carMaterial) {
        super(name, wheels, maxSpeed, engineVolume);
        this.carMaterial = carMaterial;
    }
    public void carMaterialView () {
        System.out.println("Материал кузова: " + this.carMaterial);
    }
    public void failToRide () {
        System.out.println("Врум-врум... К сожалению, самодельная машина так и не завелась");
    }
}

class CrazyCar extends Car {
    private String painting;
    public CrazyCar(String name, int wheels, int maxSpeed, int engineVolume, String painting) {
        super(name, wheels, maxSpeed, engineVolume);
        this.painting = painting;
    }
    public void paintingView () {
        System.out.println("Раскраска машины: " + painting);
    }
    public void crazyRide () {
        System.out.println("Вы совершили дикую поездку на лютом коуче!");
    }
}

class TimeMachine extends Car {
    private int yearToGo;
    public TimeMachine(String name, int wheels, int maxSpeed, int engineVolume, int yearToGo) {
        super(name, wheels, maxSpeed, engineVolume);
        this.yearToGo = yearToGo;
    }
    public void yearToGoView () {
        System.out.println("Благодаря машине времени вы побывали в " + yearToGo + " году");
    }
    public void timeParadox () {
        System.out.println("Из-за разрыва пространственно-временного континуума вы теперь находитесь в параллельной реальности, созданной из-за вашего путешествия");
    }
}

class Bus extends Car {
    private boolean conditioner;
    public Bus(String name, int wheels, int maxSpeed, int engineVolume, boolean conditioner) {
        super(name, wheels, maxSpeed, engineVolume);
        this.conditioner = conditioner;
    }
    public void isConditionerView () {
        if (conditioner) {
            System.out.println("Есть кондиционер");
        } else {
            System.out.println("Нет кондиционера");
        }
    }
    public void goToMuseum() {
        System.out.println("Автобус довёз вас до городского музея");
    }
}