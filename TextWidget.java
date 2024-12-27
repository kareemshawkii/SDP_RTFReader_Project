public class TextWidget {
    private StringBuilder content = new StringBuilder();
    private String font;

    public void addCharacter(char c) {
        content.append(c);
    }

    public void setFont(String font) {
        this.font = font;
    }

    public void convertToUpperCase() {
        content = new StringBuilder(content.toString().toUpperCase());
    }

    public void convertToLowerCase() {
        content = new StringBuilder(content.toString().toLowerCase());
    }

    public void addParagraphBreak() {
        content.append("\n\n");
    }

    @Override
    public String toString() {
        return content.toString();
    }
}