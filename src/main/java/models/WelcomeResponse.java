package models;

public class WelcomeResponse {
    private String message;
    private String version;
    private String author;
    private String repo;

    public WelcomeResponse(String message, String version, String author, String repo){
        this.message = message;
        this.version = version;
        this.author = author;
        this.repo = repo;
    }


    public String getVersion() {
        return version;
    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }

    public String getRepo() {
        return repo;
    }
}
