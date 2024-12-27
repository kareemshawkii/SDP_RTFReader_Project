public class TexSearch {
    private final StringBuilder content = new StringBuilder();
    public void addCharacter(char c) {
        content.append(c);
    }
    public void search(String word) {
        if (content.toString().contains(word)) {
            System.out.println("Word found: " + word);
        } else {
            System.out.println("Word not found: " + word);
        }
    }
    @Override
    public String toString() {
        return content.toString();
    }
}
