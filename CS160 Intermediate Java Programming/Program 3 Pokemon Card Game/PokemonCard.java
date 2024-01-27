public class PokemonCard extends GamingCard {

    private String type;
    private int pokedex;
    private String ability;

    public PokemonCard(String name, String image, String category, String game, String type, int pokedex, String ability) {
        super(name, image, category, game);
        this.type = type;
        this.pokedex = pokedex;
        this.ability = ability;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the pokedex
     */
    public int getPokedex() {
        return pokedex;
    }

    /**
     * @param pokedex the pokedex to set
     */
    public void setPokedex(int pokedex) {
        this.pokedex = pokedex;
    }

    /**
     * @return the ability
     */
    public String getAbility() {
        return ability;
    }

    /**
     * @param ability the ability to set
     */
    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String toString() {
        String s = super.toString();
        s += ", ";
        s += pokedex;
        s += ", a ";
        s += type + "-type with ";
        s += ability + " ability.";
        return s;
    }
}