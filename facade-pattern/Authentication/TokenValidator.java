package Authentication;

import ThirdPartyAuthLib.ThirdPartyTokenValidator;

public class TokenValidator {
    ThirdPartyTokenValidator thirdPartyTokenValidator;

    public TokenValidator() {
        System.out.println("Initializing class");
        thirdPartyTokenValidator = new ThirdPartyTokenValidator();
    }

    public boolean isTokenValid(String token) {
        return thirdPartyTokenValidator.isSignatureValid(token) && thirdPartyTokenValidator.isTokenExpired(token) && thirdPartyTokenValidator.validateClaims(token, new String[2]);
    }
}