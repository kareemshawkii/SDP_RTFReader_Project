public class Main {
    public static void main(String[] args) {
        RTFReader rtfReader = new RTFReader();

        // Use ASCIIConverter to build ASCIIText
        ASCIIConverter asciiConverter = new ASCIIConverter();
        rtfReader.setBuilder(asciiConverter);
        rtfReader.parseRTF("Hello World this kareem");
        System.out.println("ASCII Text: " + asciiConverter.getProduct());

        // Use TeXConverter to build TeXText
        TeXConverter texConverter = new TeXConverter();
        rtfReader.setBuilder(texConverter);
        rtfReader.parseRTF("Hello World this kareem");
        System.out.println("TeX Text: " + texConverter.getProduct());

        // Use TextWidgetConverter to build TextWidget
        TextWidgetConverter widgetConverter = new TextWidgetConverter();
        rtfReader.setBuilder(widgetConverter);
        rtfReader.parseRTF("Hello World this kareem");
        widgetConverter.convertFontChange("UPPERCASE");
        System.out.println("Text in Uppercase: " + widgetConverter.getProduct());
        widgetConverter.convertFontChange("LOWERCASE");
        System.out.println("Text in Lowercase: " + widgetConverter.getProduct());
        widgetConverter.convertParagraph();
        System.out.println("Text with Paragraph Break: " + widgetConverter.getProduct());

        // Use TextSearch to search for a word
        TextSearch textSearch = new TextSearch();
        rtfReader.setBuilder(textSearch);
        rtfReader.parseRTF("Hello World this kareem");
        textSearch.searchWord("kareem");
    }
}
