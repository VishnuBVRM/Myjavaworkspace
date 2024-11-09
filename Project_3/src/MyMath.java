public class MyMath {
    public static int reverseNumber(int num) {
        int reverse = 0;
        if(num > 0) {
            while(num != 0) {
                int r = num % 10;
                reverse = reverse * 10 + r;
                num = num/10;                
            }
        }else {
            System.out.println("can't reverse it.");
        }
        return reverse;
    }
    
    public static int sumOfDigits(int num) {
        int sum = 0;
        if(num > 0) {
            while(num != 0) {
                int r = num % 10;
                sum = sum+r;
                num = num/10;                
            }
        }else {
            System.out.println("can't reverse it.");
        }
        return sum;
    }
    
    public static int noOfDigits(int num) {
        int count = 0;
        if(num > 0) {
            while(num != 0) {
                int r = num % 10;
                count++;
                num = num/10;                    
            }
        }else {
            System.out.println("can't reverse it.");
        }
        return count;
    }
    
    public static void main(String[] args) {
        int num = 12345;
        
        int reverse = MyMath.reverseNumber(num);        
        System.out.println(reverse);
        
        int sum = MyMath.sumOfDigits(num);
        System.out.println(sum);
        
        int count = MyMath.noOfDigits(num);
        System.out.println(count);        
    }
}