package healthcare;

public class ClaimValidator {

    public boolean validate(Claim claim) {
        if (claim.getAmount() <= 0) {
            return false;
        }
        if (claim.getPatientName() == null || claim.getPatientName().isEmpty()) {
            return false;
        }
        return true;
    }
}
