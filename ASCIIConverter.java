public class ASCIIConverter implements TextConverter {
    private final ASCIIText product = new ASCIIText();

    @Override
    public void convertCharacter(char c) {
        product.addCharacter((int) c);
    }
    @Override
    public void convertFontChange(String font) {
        // Not used in this case
    }
    @Override
    public void convertParagraph() {
        // Not used in this case
    }
    public ASCIIText getProduct() {
        return product;
    }
}
