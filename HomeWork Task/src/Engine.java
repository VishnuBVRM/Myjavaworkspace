class Engine {
    private int horsepower;
    private boolean isRunning;

    // Constructor
    public Engine(int horsepower) {
        this.horsepower = horsepower;
        
     // Engine is off by default
        this.isRunning = false; 
    }

    // Start the Engine
    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("Engine started....");
        } else {
            System.out.println("Engine is already running....");
        }
    }

    // Stop the Engine
    public void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println("Engine stopped....");
        } else {
            System.out.println("Engine is already off....");
        }
    }

    // Checking the Engine is running
    public boolean isRunning() {
        return isRunning;
    }
}