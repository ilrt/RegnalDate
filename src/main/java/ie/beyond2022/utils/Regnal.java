package ie.beyond2022.utils;

public abstract class Regnal {

    private final String originalText;


    protected Regnal(String originalText) {
        this.originalText = originalText;
    }


    public String getOriginalText() {
        return originalText;
    }
}
