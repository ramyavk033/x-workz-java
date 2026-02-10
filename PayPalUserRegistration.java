class PayPalUserRegistration {

    static String email = "user@paypal.com";
    static int dataCenter = 13;

    public static void main(String[] args) {
        registerPayPalUser("pp_user","Pp@12345","PIN","pp888token","pp_user_001");
    }

    static void registerPayPalUser(String username,String password,String authMethod,String token,String userId) {
        System.out.println("Email: " + email);
        System.out.println("Data Center: " + dataCenter);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Auth Method: " + authMethod);
        System.out.println("Token: " + token);
        System.out.println("User ID: " + userId);
    }
}
