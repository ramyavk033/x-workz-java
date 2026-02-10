class TelegramUserRegistration {

    static String email = "user@telegram.com";
    static int dataCenter = 18;

    public static void main(String[] args) {
        registerTelegramUser("tg_user","Tg@12345","OTP","tg333token","tg_user_001");
    }

    static void registerTelegramUser(String username,String password,String authMethod,String token,String userId) {
        System.out.println("Email: " + email);
        System.out.println("Data Center: " + dataCenter);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Auth Method: " + authMethod);
        System.out.println("Token: " + token);
        System.out.println("User ID: " + userId);
    }
}
