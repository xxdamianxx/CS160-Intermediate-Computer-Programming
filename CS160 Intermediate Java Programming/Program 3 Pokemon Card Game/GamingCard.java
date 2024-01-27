public class GamingCard extends TradingCard {

    private String category;
    private String game;

    public GamingCard(String name, String image, String category, String game) {
        super(name, image);
        this.category = category;
        this.game = game;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @return the game
     */
    public String getGame() {
        return game;
    }

    public String toString() {
        String s = super.toString();
        s += ": ";
        s += game;
        s += " character";
        return s;
    }
}