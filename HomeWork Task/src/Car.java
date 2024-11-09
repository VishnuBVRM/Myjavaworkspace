class Car {
	
    private String model;
    
 // Composition: Car "has-a" engine
    private Engine engine; 

    // Constructor
    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    // Method to start the car, which starts the engine
    public void startCar() {
        System.out.println("Starting the car....");
        engine.start();
    }

    // Method to stop the car, which stops the engine
    public void stopCar() {
        System.out.println("Stopping the car....");
        engine.stop();
    }

    // Method to check if the engine is running
    public void checkEngineStatus() {
        if (engine.isRunning()) {
            System.out.println("Engine is running....");
        } else {
            System.out.println("Engine is off....");
        }
    }
}