class Battery {
	// Capacity in mAh
    private int capacity;
 // Charge level as a percentage (0-100)
    private int chargeLevel; 
    
    // Constructor
    public Battery(int capacity, int chargeLevel) {
        this.capacity = capacity;
        this.chargeLevel = chargeLevel;
    }
    
    // The Current Charging Level
    public int getChargeLevel() {
        return chargeLevel;
    }
    
    // Charging Level of battery
    public void chargeBattery(int amount) {
        this.chargeLevel += amount;
        if (this.chargeLevel > 100) {
            this.chargeLevel = 100;
        }
    }
    
    // Discharge Level of battery
    public void dischargeBattery(int amount) {
        this.chargeLevel -= amount;
        if (this.chargeLevel < 0) {
            this.chargeLevel = 0;
        }
    }
}