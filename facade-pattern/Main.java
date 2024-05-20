import Authentication.TokenValidator;

public class Main {
    public static void main(String[] args) {
        TokenValidator tokenValidator = new TokenValidator();
        System.out.println("Is Token Valid - " + tokenValidator.isTokenValid(""));
    }
}
