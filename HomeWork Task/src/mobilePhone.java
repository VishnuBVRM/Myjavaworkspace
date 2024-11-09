class MobilePhone {
    private String model;
 // Composition: mobile phone battery
    private Battery battery; 
    
    // Constructor
    public MobilePhone(String model, Battery battery) {
        this.model = model;
        this.battery = battery;
    }
    
    // Check the Battery Status
    public void checkBatteryStatus() {
        System.out.println("Battery level: " + battery.getChargeLevel() + "%");
    }
    
    // usage of Mobile Phone, Discharge Level of Battery
    public void usePhone(int usage) {
        System.out.println("Using the phone...");
        battery.dischargeBattery(usage);
        checkBatteryStatus();
    }
    
    // Charging the Mobile Phone
    public void chargePhone(int amount) {
        System.out.println("Charging the phone...");
        battery.chargeBattery(amount);
        checkBatteryStatus();
    }
}