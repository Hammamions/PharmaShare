public class Medication {
    private String name;
    private String category;
    private String expirationDate;
    private String location;

    public Medication(String name, String category, String expirationDate, String location) {
        this.name = name;
        this.category = category;
        this.expirationDate = expirationDate;
        this.location = location;
    }

    public String getName() { return name; }
    public String getCategory() { return category; }
    public String getExpirationDate() { return expirationDate; }
    public String getLocation() { return location; }
}


