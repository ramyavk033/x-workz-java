class SlackUserRegistration {

    static String email = "user@slack.com";
    static int dataCenter = 19;

    public static void main(String[] args) {
        registerSlackUser("sl_user","Sl@12345","Workspace","sl444token","sl_user_001");
    }

    static void registerSlackUser(String username,String password,String authMethod,String token,String userId) {
        System.out.println("Email: " + email);
        System.out.println("Data Center: " + dataCenter);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Auth Method: " + authMethod);
        System.out.println("Token: " + token);
        System.out.println("User ID: " + userId);
    }
}
