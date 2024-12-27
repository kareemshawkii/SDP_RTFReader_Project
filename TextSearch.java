public class TextSearch implements TextConverter {
    private final TexSearch product = new TexSearch();
    @Override
    public void convertCharacter(char c) {
        product.addCharacter(c);
    }
    @Override
    public void convertFontChange(String font) {
        // Not used in this case
    }
    @Override
    public void convertParagraph() {
        // Not used in this case
    }
    public void searchWord(String word) {
        product.search(word);
    }
    public TexSearch getProduct() {
        return product;
    }
}
