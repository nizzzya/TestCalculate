package tests;

public enum Build {
    Prototype("0"),
    Build_1("1"),
    Build_2("2"),
    Build_3("3"),
    Build_4("4"),
    Build_5("5"),
    Build_6("6"),
    Build_7("7"),
    Build_8("8"),
    Build_9("9");

    public final String value;

    private Build(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
