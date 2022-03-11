public class TrumpetPlayer extends Musician{
    String trumpetType;

    TrumpetPlayer(String name, String country, String style, String trumpetType) {
        this.name = name;
        this.country = country;
        this.style = style;
        this.trumpetType = trumpetType;
    }

    @Override
    public void show() {
        System.out.println("Name: " + name + "\n"
                + "Country: " + country + "\n"
                + "Style: " + style + "\n"
                + "Trumpet Type: " + trumpetType + "\n");
    }

    public void setTrumpetType(String type) {
        this.trumpetType = type;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getStyle() {
        return style;
    }

    public String getTrumpetType() {
        return trumpetType;
    }
}
