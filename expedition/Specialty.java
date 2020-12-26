package expedition;

public enum Specialty {

    BIOLOGIST ("биолог"),
    PHYSICIST ("физик"),
    METEOROLOGIST ("метеоролог"),
    GEOLOGIST ("геолог"),
    MECHANIC ("механик"),
    PILOT ("пилот"),
    RADIO_OPERATOR ("радио оператор"),
    NAVIGATOR ("шарит в навигации"),
    WRITER ("публицист");

    private String title;

    Specialty(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Specialty{" +
                "title='" + title + '\'' +
                '}';
    }
}
