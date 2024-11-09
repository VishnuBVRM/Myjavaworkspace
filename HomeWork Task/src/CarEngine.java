
public class CarEngine {
	    public static void main(String[] args) {
	        // Create the Engine object
	    	
	    	// 300 horsepower engine
	        Engine engine = new Engine(300);

	        // Create a Car object with the engine
	        Car car = new Car("SportsCarX", engine);

	        // Start the Car, Starts the Engine
	        car.startCar();

	        // Check the Engine Status
	        car.checkEngineStatus();

	        // Stop the Car, Stops the Engine
	        car.stopCar();

	        // Check the Engine Status Again
	        car.checkEngineStatus();
	    }
	}
