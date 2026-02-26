class Movie {

    static String title;
    static String director;
    static String genre;
    static double rating;
    static int duration;  
    static int releaseYear;
    static boolean isHit; 

    
    public static void createMovie(String t, String dir, String g, double r,
                                   int dur, int year, boolean hit) {
        title = t;
        director = dir;
        genre = g;
        rating = r;
        duration = dur;
        releaseYear = year;
        isHit = hit;
    }

    public static void getMovieDetails() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
        System.out.println("Duration: " + duration + " min");
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Hit Movie: " + isHit);
        System.out.println("----------------------------------");
    }
}