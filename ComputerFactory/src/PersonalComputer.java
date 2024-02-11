public class PersonalComputer extends Product{

    private Motherboard motherboard;
    private ComputerCase computerCase;
    private Monitor monitor;
    private DigitalProduct digitalProduct;

    public PersonalComputer(String model, String manufacturer, Motherboard motherboard,
    ComputerCase computerCase, DigitalProduct digitalProduct, Monitor monitor)
    {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
        this.digitalProduct = digitalProduct;
    }

//    public Motherboard getMotherboard(){
//        return motherboard;
//    }
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//    public Monitor getMonitor() {
//        return monitor;
//    }
//    public DigitalProduct getDigitalProduct() {
//        return digitalProduct;
//    }

    public void openPc(){
        this.computerCase.pressPowerButton();
        this.monitor.printSomething();
    }

    public void openProgram(String name){
        this.motherboard.loadProgram();
        this.digitalProduct.runProgram(name);
    }
}