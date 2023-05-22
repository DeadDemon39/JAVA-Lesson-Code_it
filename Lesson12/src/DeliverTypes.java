public enum DeliverTypes {
    AERO("Авто доставка стоит 200р."),
    STEP("Пешая доставка стоит 100р."),
    AUTO("Доставка на самолете стоит 300р.");
    private String value;

    DeliverTypes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
