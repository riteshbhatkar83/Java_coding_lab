abstract class RBI {
    // abstract method (no body)
    abstract float getInterestRate();

    // concrete method (same for all banks)
    public void KYC() {
        System.out.println("KYC documents: Aadhar, PAN, etc.");
    }
}

// SBI class
class SBI extends RBI {
    @Override
    float getInterestRate() {
        return 4.5f;   // savings interest
    }

    public float getLoanInterest() {
        return 8.5f;
    }
}

// BOI class
class BOI extends RBI {
    @Override
    float getInterestRate() {
        return 5.5f;
    }

    public float getLoanInterest() {
        return 9.5f;
    }
}

// Main class
public class BankDemo {
    public static void main(String[] args) {
        RBI r;

        r = new SBI();
        System.out.println("SBI Interest: " + r.getInterestRate());

        r = new BOI();
        System.out.println("BOI Interest: " + r.getInterestRate());

        // calling common method
        r.KYC();
    }
}