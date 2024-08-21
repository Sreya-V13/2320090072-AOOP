package healthcare;

public class ReimbursementCalculator {

    public double calculateReimbursement(Claim claim) {
        if (claim.getStatus() != ClaimStatus.APPROVED) {
            throw new IllegalArgumentException("Claim must be approved for reimbursement.");
        }

        // Example logic: reimburses 80% of the claimed amount
        return claim.getAmount() * 0.8;
    }
}
