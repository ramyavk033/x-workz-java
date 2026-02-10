class ZoomUserRegistration {

    static String email = "user@zoom.com";
    static int dataCenter = 12;

    public static void main(String[] args) {
        registerZoomUser("zoom_user","Zm@12345","MeetingID","zm777token","zm_user_001");
    }

    static void registerZoomUser(String username,String password,String authMethod,String token,String userId) {
        System.out.println("Email: " + email);
        System.out.println("Data Center: " + dataCenter);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Auth Method: " + authMethod);
        System.out.println("Token: " + token);
        System.out.println("User ID: " + userId);
    }
}
