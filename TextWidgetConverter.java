public class TextWidgetConverter implements TextConverter {
    private final TextWidget product = new TextWidget();

    @Override
    public void convertCharacter(char c) {
        product.addCharacter(c);
    }

    @Override
    public void convertFontChange(String font) {
        if ("UPPERCASE".equalsIgnoreCase(font)) {
            product.convertToUpperCase();
        } else if ("LOWERCASE".equalsIgnoreCase(font)) {
            product.convertToLowerCase();
        } else {
            product.setFont(font);
        }
    }

    @Override
    public void convertParagraph() {
        product.addParagraphBreak();
    }

    public TextWidget getProduct() {
        return product;
    }
}
