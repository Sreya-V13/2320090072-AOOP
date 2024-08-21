package healthcare;

public class ClaimsProcessor {

    private ClaimValidator validator = new ClaimValidator();
    private ReimbursementCalculator reimbursementCalculator = new ReimbursementCalculator();

    public void processClaim(Claim claim) {
        if (validator.validate(claim)) {
            claim.setStatus(ClaimStatus.VALIDATED);

            // Approve or reject based on a simple rule
            if (claim.getAmount() < 1000) {
                claim.setStatus(ClaimStatus.APPROVED);
            } else {
                claim.setStatus(ClaimStatus.REJECTED);
            }
        } else {
            claim.setStatus(ClaimStatus.REJECTED);
        }
    }

    public double reimburseClaim(Claim claim) {
        if (claim.getStatus() == ClaimStatus.APPROVED) {
            double reimbursement = reimbursementCalculator.calculateReimbursement(claim);
            claim.setStatus(ClaimStatus.REIMBURSED);
            return reimbursement;
        }
        throw new IllegalStateException("Claim is not approved for reimbursement.");
    }

    public static void main(String[] args) {
        ClaimsProcessor processor = new ClaimsProcessor();

        // Creating a valid claim
        Claim validClaim = new Claim("001", 500, "John Doe");
        processor.processClaim(validClaim);
        System.out.println("Claim Status: " + validClaim.getStatus());

        // Reimbursement
        if (validClaim.getStatus() == ClaimStatus.APPROVED) {
            double reimbursement = processor.reimburseClaim(validClaim);
            System.out.println("Reimbursed Amount: " + reimbursement);
            System.out.println("Final Claim Status: " + validClaim.getStatus());
        }

        // Creating an invalid claim
        Claim invalidClaim = new Claim("002", 0, "Jane Doe");
        processor.processClaim(invalidClaim);
        System.out.println("Claim Status: " + invalidClaim.getStatus());
    }
}
