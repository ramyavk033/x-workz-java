class DropboxUserRegistration {

    static String email = "user@dropbox.com";
    static int dataCenter = 11;

    public static void main(String[] args) {
        registerDropboxUser("db_user","Db@12345","OAuth","db666token","db_user_001");
    }

    static void registerDropboxUser(String username,String password,String authMethod,String token,String userId) {
        System.out.println("Email: " + email);
        System.out.println("Data Center: " + dataCenter);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Auth Method: " + authMethod);
        System.out.println("Token: " + token);
        System.out.println("User ID: " + userId);
    }
}
