class RedditUserRegistration {

    static String email = "user@reddit.com";
    static int dataCenter = 16;

    public static void main(String[] args) {
        registerRedditUser("rd_user","Rd@12345","Email","rd111token","rd_user_001");
    }

    static void registerRedditUser(String username,String password,String authMethod,String token,String userId) {
        System.out.println("Email: " + email);
        System.out.println("Data Center: " + dataCenter);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Auth Method: " + authMethod);
        System.out.println("Token: " + token);
        System.out.println("User ID: " + userId);
    }
}
