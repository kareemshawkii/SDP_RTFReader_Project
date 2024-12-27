public class RTFReader {
    private TextConverter builder;
    public void setBuilder(TextConverter builder) {
        this.builder = builder;
    }
    public void parseRTF(String input) {
        for (char c : input.toCharArray()) {
            builder.convertCharacter(c);
        }
    }
}
