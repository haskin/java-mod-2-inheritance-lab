public class MainRunner {
    public static void main(String[] args) {
        Screen screen = new Screen(24, 20, "16:9");
        System.out.println(screen);

        Monitor monitor = new Monitor(32, 29, "3:2", 120);
        System.out.println(monitor);

        Television television = new Television(72, 60, "16:9", "OLED");
        System.out.println(television);
    }
}

class Screen {
    private int width;
    private int length;
    private String aspectRatio;

    public Screen(int width, int length, String aspectRatio) {
        this.width = width;
        this.length = length;
        this.aspectRatio = aspectRatio;
    }

    @Override
    public String toString() {
        return String.format("I am a %s. I am %s inches by %s inches. My aspect ration is %s.",
                this.getClass().getName(),
                width, length, aspectRatio);
    }
}

class Monitor extends Screen {
    private int refreshRate;

    public Monitor(int width, int length, String aspectRatio, int refreshRate) {
        super(width, length, aspectRatio);
        this.refreshRate = refreshRate;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" I have a %s Hz refresh rate.", refreshRate);
    }
}

class Television extends Screen {
    private String displayTechnology;

    public Television(int width, int length, String aspectRatio, String displayTechnology) {
        super(width, length, aspectRatio);
        this.displayTechnology = displayTechnology;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" I use %s technology.", displayTechnology);
    }
}