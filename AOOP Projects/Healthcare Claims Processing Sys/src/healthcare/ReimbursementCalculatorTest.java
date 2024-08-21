package healthcare;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReimbursementCalculatorTest {

    @Test
    public void testCalculateReimbursement() {
        Claim claim = new Claim("008", 1000, "Eve");
        claim.setStatus(ClaimStatus.APPROVED);
        ReimbursementCalculator calculator = new ReimbursementCalculator();
        double reimbursement = calculator.calculateReimbursement(claim);
        assertEquals(800, reimbursement);
    }

    @Test
    public void testCalculateReimbursementForNonApprovedClaim() {
        Claim claim = new Claim("009", 500, "Frank");
        claim.setStatus(ClaimStatus.SUBMITTED);
        ReimbursementCalculator calculator = new ReimbursementCalculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateReimbursement(claim));
    }
}
