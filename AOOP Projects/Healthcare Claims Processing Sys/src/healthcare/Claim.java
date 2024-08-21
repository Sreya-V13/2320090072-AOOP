package healthcare;

public class Claim {
    private String claimId;
    private double amount;
    private String patientName;
    private ClaimStatus status;

    public Claim(String claimId, double amount, String patientName) {
        this.claimId = claimId;
        this.amount = amount;
        this.patientName = patientName;
        this.status = ClaimStatus.SUBMITTED;
    }

    public String getClaimId() {
        return claimId;
    }

    public double getAmount() {
        return amount;
    }

    public String getPatientName() {
        return patientName;
    }

    public ClaimStatus getStatus() {
        return status;
    }

    public void setStatus(ClaimStatus status) {
        this.status = status;
    }
}
