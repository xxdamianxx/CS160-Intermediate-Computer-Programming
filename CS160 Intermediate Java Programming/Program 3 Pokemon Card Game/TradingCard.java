public class TradingCard {

    private String name;
    private String image;

    public TradingCard(String name, String image) {
        this.name = name;
        this.image = image;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the image
     */
    public String getImg() {
        return image;
    }

    public String toString() {
        return name;
    }
}