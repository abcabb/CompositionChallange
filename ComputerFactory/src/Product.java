import java.security.DigestException;

public class Product {
    private String model;
    private String manufacturer;

    public Product(String model, String manufacturer){
        this.model= model;
        this.manufacturer = manufacturer;
    }
}

class Dimensions{
    private double height;
    private double length;
    private double weight;

    public Dimensions(double height, double length, double weight){
        this.length = length;
        this.height = height;
        this.weight = weight;
    }
}


class Motherboard extends Product{
    private int cardSlots;
    private int ramSlots;
    private Dimensions dimensions;
    private String bios;

    public Motherboard(String model, String manufacturer, int cardSlots, int ramSlots,
                       Dimensions dimensions, String bios){
        super(model, manufacturer);
        this.cardSlots = cardSlots;
        this.ramSlots = ramSlots;
        this.dimensions = dimensions;
        this.bios = bios;
    }

    public void loadProgram(){
        System.out.println("Programs loading...");
    }
}

class Monitor extends Product{
    private String resolution;
    private int size;
    private Dimensions dimensions;

    public Monitor(String model, String manufacturer, String resolution, int size, Dimensions dimensions) {
        super(model, manufacturer);
        this.resolution = resolution;
        this.size = size;
        this.dimensions = dimensions;
    }

    public void printSomething(){
        System.out.println("A logo appears.");
    }
}

class ComputerCase extends Product{
    private Dimensions dimensions;
    private int powerSupply;

    public ComputerCase(String model, String manufacturer, Dimensions dimensions, int powerSupply) {
        super(model, manufacturer);
        this.dimensions = dimensions;
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed.");
    }
}

class DigitalProduct extends Product{

    private String version;
    private String releaseDate;

    public DigitalProduct(String model, String manufacturer, String version, String releaseDate) {
        super(model, manufacturer);
        this.version = version;
        this.releaseDate = releaseDate;
    }

    public void runProgram(String name){
        System.out.println(String.format("%s loading...", name));
    }
}