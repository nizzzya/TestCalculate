package tests;

public enum Operation {
    Add("Add"),
    Subtract("Subtract"),
    Multiply("Multiply"),
    Divide("Divide"),
    Concatenate("Concatenate");

    public final String value;

    private Operation(String value) {
        this.value = value;
    }
}