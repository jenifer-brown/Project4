public class Guitarist extends Musician {
    int numStrings;

    Guitarist(String name, String country, String style, int numStrings) {
        this.name = name;
        this.country = country;
        this.style = style;
        this.numStrings = numStrings;
    }

    @Override
    public void show() {
        System.out.println("Name: " + name + "\n"
                + "Country: " + country + "\n"
                + "Style: " + style + "\n"
                + "Number of Strings " + numStrings + "\n");
    }

    public void setNumStrings(int num) {
        this.numStrings = num;
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

    public int getNumStrings() {
        return numStrings;
    }
}
