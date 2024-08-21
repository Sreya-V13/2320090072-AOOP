package healthcare;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClaimsProcessorTest {

    @Test
    public void testProcessValidClaim() {
        Claim claim = new Claim("004", 500, "Alice");
        ClaimsProcessor processor = new ClaimsProcessor();
        processor.processClaim(claim);
        assertEquals(ClaimStatus.APPROVED, claim.getStatus());
    }

    @Test
    public void testProcessInvalidClaim() {
        Claim claim = new Claim("005", 0, "Bob");
        ClaimsProcessor processor = new ClaimsProcessor();
        processor.processClaim(claim);
        assertEquals(ClaimStatus.REJECTED, claim.getStatus());
    }

    @Test
    public void testReimburseApprovedClaim() {
        Claim claim = new Claim("006", 500, "Charlie");
        ClaimsProcessor processor = new ClaimsProcessor();
        processor.processClaim(claim);
        double reimbursement = processor.reimburseClaim(claim);
        assertEquals(ClaimStatus.REIMBURSED, claim.getStatus());
        assertEquals(400, reimbursement);
    }

    @Test
    public void testReimburseRejectedClaim() {
        Claim claim = new Claim("007", 2000, "David");
        ClaimsProcessor processor = new ClaimsProcessor();
        processor.processClaim(claim);
        assertThrows(IllegalStateException.class, () -> processor.reimburseClaim(claim));
    }
}
