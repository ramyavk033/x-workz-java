class YouTubeUserRegistration {

    static String email = "user@youtube.com";
    static int dataCenter = 17;

    public static void main(String[] args) {
        registerYouTubeUser("yt_user","Yt@12345","Google","yt222token","yt_user_001");
    }

    static void registerYouTubeUser(String username,String password,String authMethod,String token,String userId) {
        System.out.println("Email: " + email);
        System.out.println("Data Center: " + dataCenter);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Auth Method: " + authMethod);
        System.out.println("Token: " + token);
        System.out.println("User ID: " + userId);
    }
}
