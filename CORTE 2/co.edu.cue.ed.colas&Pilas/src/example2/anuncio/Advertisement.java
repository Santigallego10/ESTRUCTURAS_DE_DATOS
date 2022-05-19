package example2.anuncio;

public class Advertisement {

    private String name;
    private String description;
    private int offerValue;

    public Advertisement(String name, String description, int offerValue) {
        this.name = name;
        this.description = description;
        this.offerValue = offerValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getOfferValue() {
        return offerValue;
    }

    public void setOfferValue(int offerValue) {
        this.offerValue = offerValue;
    }

    
    @Override
    public String toString() {
        return "Advertisements{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", offerValue=" + offerValue +
                '}';
    }
}
