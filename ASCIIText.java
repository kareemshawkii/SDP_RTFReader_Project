public class ASCIIText {
    private final StringBuilder content = new StringBuilder();
    public void addCharacter(int asciiCode) {
        content.append(asciiCode).append(" ");
    }
    @Override
    public String toString() {
        return content.toString();
    }
}

