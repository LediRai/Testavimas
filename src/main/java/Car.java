public class Car {
    //sukurti nauja klase, kurios vpavadinimas Car(automobilis)
//si klase turi tureti 3 parametrus
//sukurkite metodus start , drive ir stop
//su start metodu jus turite uzkurti automobli
//su stop uzgesinti
//
    //try{salyga}
    //cach(Exception e){
    //system.out.printl("car cant start" +e)}
    //mymobl.setModel(nul)
    String model;
    int speed;

    String destination;

    public static void main(String[] args) {
        Car auto1 = new Car();
        auto1.start();
        auto1.drive();
        auto1.stop();
        auto1.setModel("BMW");
        System.out.println(auto1.getModel());
        auto1.setSpeed(150);
        System.out.println(auto1.getSpeed());
        auto1.setDestination("Kaunas");
        System.out.println(auto1.getDestination());
        try {
            auto1.setModel(null);
        } catch (IllegalArgumentException e) {
            System.out.println("car cant start" + e.getMessage());
            return;
        }
    }
    // jei rasau string, int ar  boolean visada bus return
    // jei rasau void return negali buti
    public String setModel(String modelParametrer) {
        this.model = modelParametrer;
        return model;
    }

    public String getModel() {
        return this.model;
    }

    public int setSpeed(int speedParameter) {
        this.speed = speedParameter;
        return speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setDestination(String destinationParameter) {
        this.destination = destinationParameter;
    }

    public String getDestination() {
        return this.destination;
    }
        // triju metodu kurimas
    public void start() {
        System.out.println("uzkurti automobili ");
    }

    public void drive() {
        System.out.println("driving");
    }

    public void stop() {
        System.out.println("stopping");
    }


}
