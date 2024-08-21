package healthcare;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClaimValidatorTest {

    @Test
    public void testValidClaim() {
        Claim claim = new Claim("001", 500, "John Doe");
        ClaimValidator validator = new ClaimValidator();
        assertTrue(validator.validate(claim));
    }

    @Test
    public void testInvalidClaimAmount() {
        Claim claim = new Claim("002", 0, "Jane Doe");
        ClaimValidator validator = new ClaimValidator();
        assertFalse(validator.validate(claim));
    }

    @Test
    public void testInvalidClaimPatientName() {
        Claim claim = new Claim("003", 300, "");
        ClaimValidator validator = new ClaimValidator();
        assertFalse(validator.validate(claim));
    }
}
