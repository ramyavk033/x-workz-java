class PinterestUserRegistration {

    static String email = "user@pinterest.com";
    static int dataCenter = 20;

    public static void main(String[] args) {
        registerPinterestUser("pin_user","Pn@12345","Email","pn555token","pn_user_001");
    }

    static void registerPinterestUser(String username,String password,String authMethod,String token,String userId) {
        System.out.println("Email: " + email);
        System.out.println("Data Center: " + dataCenter);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Auth Method: " + authMethod);
        System.out.println("Token: " + token);
        System.out.println("User ID: " + userId);
    }
}
