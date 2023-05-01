import java.util.Scanner;

class Bank {
    double ROI;
    
    void findROI() {
        System.out.println("The rate of interest for the bank is: " + ROI + "%");
    }
}

class HDFC extends Bank {
    HDFC() {
        ROI = 7.5;
    }
    
    void findROI() {
        System.out.println("The rate of interest for HDFC bank is: " + ROI + "%");
    }
    
    void calculateInterest(double principal, double time) {
        double interest = (principal * ROI * time) / 100;
        System.out.println("The simple interest for HDFC bank is: " + interest);
    }
}

class ICICI extends Bank {
    ICICI() {
        ROI = 6.5;
    }
    
    void findROI() {
        System.out.println("The rate of interest for ICICI bank is: " + ROI + "%");
    }
    
    void calculateInterest(double principal, double time) {
        double interest = (principal * ROI * time) / 100;
        System.out.println("The simple interest for ICICI bank is: " + interest);
    }
}

class BOI extends Bank {
    BOI() {
        ROI = 5.5;
    }
    
    void findROI() {
        System.out.println("The rate of interest for BOI bank is: " + ROI + "%");
    }
    
    void calculateInterest(double principal, double time) {
        double interest = (principal * ROI * time) / 100;
        System.out.println("The simple interest for BOI bank is: " + interest);
    }
}

public class BankInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the principal amount: ");
        double principal = sc.nextDouble();
        
        System.out.println("Enter the time period (in years): ");
        double time = sc.nextDouble();
        
        Bank[] banks = new Bank[3];
        banks[0] = new HDFC();
        banks[1] = new ICICI();
        banks[2] = new BOI();
        
        for(int i=0; i<banks.length; i++) {
            banks[i].findROI();
            banks[i].calculateInterest(principal, time);
            System.out.println();
        }
    }
}