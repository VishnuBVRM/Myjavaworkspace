public class MobilePhoneBatteryTest {
	
    public static void main(String[] args) {
        // Create a Battery object
    	
    	// 5000mAh capacity, 50% charge
    	Battery battery = new Battery(5000, 50); 
        
        // Create a MobilePhone object with the battery
        MobilePhone phone = new MobilePhone("SmartPhoneX", battery);
        
        // Checking the Battery Level Status
        phone.checkBatteryStatus();
        
        // Usage of Mobile phone, Discharges Level of battery
        phone.usePhone(20);
        
        // Charging Level of Mobile phone
        phone.chargePhone(30);
    }
}