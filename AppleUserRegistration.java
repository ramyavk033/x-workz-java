class AppleUserRegistration {

    static String email = "user@apple.com";
    static int dataCenter = 8;

    public static void main(String[] args) {
        registerAppleUser("apple_user","Ap@12345","FaceID","ap333token","ap_user_001");
    }

    static void registerAppleUser(String username,String password,String authMethod,String token,String userId) {
        System.out.println("Email: " + email);
        System.out.println("Data Center: " + dataCenter);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Auth Method: " + authMethod);
        System.out.println("Token: " + token);
        System.out.println("User ID: " + userId);
    }
}
