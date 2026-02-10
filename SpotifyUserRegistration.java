class SpotifyUserRegistration {

    static String email = "user@spotify.com";
    static int dataCenter = 10;

    public static void main(String[] args) {
        registerSpotifyUser("sp_user","Sp@12345","OAuth","sp555token","sp_user_001");
    }

    static void registerSpotifyUser(String username,String password,String authMethod,String token,String userId) {
        System.out.println("Email: " + email);
        System.out.println("Data Center: " + dataCenter);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Auth Method: " + authMethod);
        System.out.println("Token: " + token);
        System.out.println("User ID: " + userId);
    }
}
