class SnapchatUserRegistration {

    static String email = "user@snapchat.com";
    static int dataCenter = 14;

    public static void main(String[] args) {
        registerSnapchatUser("snap_user","Sc@12345","Mobile","sc999token","sc_user_001");
    }

    static void registerSnapchatUser(String username,String password,String authMethod,String token,String userId) {
        System.out.println("Email: " + email);
        System.out.println("Data Center: " + dataCenter);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Auth Method: " + authMethod);
        System.out.println("Token: " + token);
        System.out.println("User ID: " + userId);
    }
}
