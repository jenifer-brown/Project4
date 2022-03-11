public class Vocalist extends Musician {
    String range ;

    Vocalist(String name, String country, String style, String range) {
        this.name = name;
        this.country = country;
        this.style = style;
        this.range = range;
    }

    @Override
    public void show() {
        System.out.println("Name: " + name + "\n"
                + "Country: " + country + "\n"
                + "Style: " + style + "\n"
                + "Range: " + range + "\n");
    }

    public void setRange(String range) {
        this.range = range;
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

    public String getRange() {
        return range;
    }
}
