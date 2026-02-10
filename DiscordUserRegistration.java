class DiscordUserRegistration {

    static String email = "user@discord.com";
    static int dataCenter = 15;

    public static void main(String[] args) {
        registerDiscordUser("dc_user","Dc@12345","BotToken","dc000token","dc_user_001");
    }

    static void registerDiscordUser(String username,String password,String authMethod,String token,String userId) {
        System.out.println("Email: " + email);
        System.out.println("Data Center: " + dataCenter);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Auth Method: " + authMethod);
        System.out.println("Token: " + token);
        System.out.println("User ID: " + userId);
    }
}
