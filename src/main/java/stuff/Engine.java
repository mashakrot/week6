package stuff;

public class Engine {
    private String name;
    private int power;

    public Engine(String name, int power) {
        this.name = name;
        this.power = power;
    }
    
    public String getEnName() {
        String nameEn = "Engine: " + name + " " + Integer.toString(power) + "kw";
        return nameEn;
    }
}
