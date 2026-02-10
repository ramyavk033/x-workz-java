class MicrosoftUserRegistration {

    static String email = "user@microsoft.com";
    static int dataCenter = 7;

    public static void main(String[] args) {
        registerMicrosoftUser("ms_user","Ms@12345","SSO","ms222token","ms_user_001");
    }

    static void registerMicrosoftUser(String username,String password,String authMethod,String token,String userId) {
        System.out.println("Email: " + email);
        System.out.println("Data Center: " + dataCenter);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Auth Method: " + authMethod);
        System.out.println("Token: " + token);
        System.out.println("User ID: " + userId);
    }
}
