package ThirdPartyAuthLib;

public class ThirdPartyTokenValidator {
    
    public boolean isSignatureValid(String token) {
        System.out.println("Fetching Public Certificate");
        System.out.println("Validatating Token");
        return true;
    }

    public boolean isTokenExpired(String token) {
        decryptToken(token);
        System.out.println("Comparing expiry time with current time");
        return true;
    }

    public boolean validateClaims(String token, String[] claims) {
        decryptToken(token);
        System.out.println("Comparing with claims");
        return true;
    }

    public String[] decryptToken(String token) {
        System.out.println("Decrypting token");
        return null;
    }
}
