/**
 * UC7: OOPS Banner App with CharacterPatternMap Inner Class
 * 
 * Demonstrates modular, reusable approach for displaying "OOPS" in banner format
 * using OOP principles like encapsulation, modularity, and inner classes.
 */
public class OOPSBannerApp {

    /**
     * Inner Static Class to store character pattern.
     * Encapsulates a character and its corresponding 7-line banner pattern.
     */
    public static class CharacterPatternMap {
        private char character;
        private String[] pattern; // 7 lines representing the banner



        /**
         * Constructor to initialize character and its pattern.
         * 
         * @param character Character to be displayed
         * @param pattern Array of 7 strings representing banner lines
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter method for the character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter method for the banner pattern
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    // --- Part 3: Utility Static Methods ---

    /**
     * Retrieve CharacterPatternMap object for a given character.
     * Currently supports O, P, S
     * @param c Character to display
     * @return CharacterPatternMap object
     */
    public static CharacterPatternMap getCharacterPattern(char c) {
        switch (c) {
            case 'O':
                return new CharacterPatternMap('O', new String[]{
                        " **** ",
                        "*    *",
                        "*    *",
                        "*    *",
                        "*    *",
                        "*    *",
                        " **** "
                });
            case 'P':
                return new CharacterPatternMap('P', new String[]{
                        "***** ",
                        "*    *",
                        "*    *",
                        "***** ",
                        "*     ",
                        "*     ",
                        "*     "
                });
            case 'S':
                return new CharacterPatternMap('S', new String[]{
                        " **** ",
                        "*     ",
                        "*     ",
                        " **** ",
                        "     *",
                        "     *",
                        " **** "
                });
            default:
                return new CharacterPatternMap(' ', new String[]{
                        "      ",
                        "      ",
                        "      ",
                        "      ",
                        "      ",
                        "      ",
                        "      "
                });
        }
    }

    /**
     * Display a banner for a string using stored CharacterPatternMap
     * @param text The string to display in banner format
     */
    public static void displayBanner(String text) {
        // Create an array of CharacterPatternMap objects
        CharacterPatternMap[] patterns = new CharacterPatternMap[text.length()];
        for (int i = 0; i < text.length(); i++) {
            patterns[i] = getCharacterPattern(text.charAt(i));
        }

        // Use StringBuilder to efficiently build each row of the banner
        for (int row = 0; row < 7; row++) { // 7 lines per character
            StringBuilder line = new StringBuilder();
            for (CharacterPatternMap cpm : patterns) {
                line.append(cpm.getPattern()[row]).append("  "); // space between letters
            }
            System.out.println(line);
        }
    }

    // --- Part 4: Main Method ---
    public static void main(String[] args) {
        String word = "OOPS";
        displayBanner(word);
    }
}
