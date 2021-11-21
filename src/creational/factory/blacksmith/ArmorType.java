package creational.factory.blacksmith;

public enum ArmorType {
    HELMET("helmet"), CHEST("chest"), LEGS("legs"), FOOTS("foots");

    private String title;

    ArmorType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Armor type: " + title;
    }
}
