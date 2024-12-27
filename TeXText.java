public class TeXText {
    private final StringBuilder content = new StringBuilder();
    public void addCharacter(char c) {
        content.append(c);
    }
    @Override
    public String toString() {
        return content.toString();
    }
}