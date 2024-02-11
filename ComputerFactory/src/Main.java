public class Main {
    public static void main(String[] args) {

        Dimensions motherboardDimensions = new Dimensions(9.75, 5,8);
        Dimensions computerCaseDimensions = new Dimensions(524, 800, 400);
        Dimensions monitorDimensions = new Dimensions(19, 15, 2);

        Motherboard myMotherboard = new Motherboard("2208", "Asus", 6, 2,
                motherboardDimensions, "v3.45");
        ComputerCase myComputerCase = new ComputerCase("2107", "Dell",
                computerCaseDimensions, 350);
        DigitalProduct myDigitalProduct = new DigitalProduct("2501", "Microsoft",
                "v10.05", "15/15/2022");
        Monitor myMonitor = new Monitor("5000", "Samsung", "1920x1280",
                19, monitorDimensions);

        PersonalComputer semiComputer = new PersonalComputer("2023", "CleverComputer",
                myMotherboard, myComputerCase, myDigitalProduct, myMonitor);

//        semiComputer.getComputerCase().pressPowerButton();
//        semiComputer.getMonitor().printSomething();
//        semiComputer.getMotherboard().loadProgram();
//        semiComputer.getDigitalProduct().runProgram("CS:GO");

        semiComputer.openPc();
        semiComputer.openProgram("CS:GO");
    }
}