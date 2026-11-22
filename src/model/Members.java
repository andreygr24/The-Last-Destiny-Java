package model;

public class Members {

    private final String name;
    private final String wowClass;
    private final boolean active;
    private final String rank;

    public Members(String name, String wowClass, boolean active, String rank){

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid Name.");
        }
        if (wowClass == null || wowClass.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid Class.");
        }
        if (rank == null || rank.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid Rank.");
        }

        this.name = name;
        this.active = active;
        this.wowClass = wowClass;
        this.rank = rank;

    }

    public String getName() {return name;}

    public boolean isActive() {return active;}

    public String getRank() {return rank;}

    public String getWowClass() {return wowClass;}
}
