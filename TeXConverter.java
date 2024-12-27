public class TeXConverter implements TextConverter {
    private final TeXText product = new TeXText();
    private static final int SHIFT = 3; // Number of positions to shift for ciphering
    @Override
    public void convertCharacter(char c) {
        char cipheredChar = cipherCharacter(c);
        product.addCharacter(cipheredChar);
    }
    @Override
    public void convertFontChange(String font) {
        // not used in this case
    }
    @Override
    public void convertParagraph() {
        // not used in this case
    }
    private char cipherCharacter(char c) {
        if (Character.isLetter(c)) {
            // Shift letters (handle both upper and lower case)
            char base = Character.isLowerCase(c) ? 'a' : 'A';
            return (char) ((c - base + SHIFT) % 26 + base);
        } else {
            return c;
        }
    }
    public TeXText getProduct() {
        return product;
    }
}
