import java.util.Random;

public class RandomStringGenerator {
    private final Random random;

    public RandomStringGenerator(Random randomSeed) {
        this.random = randomSeed;
    }

    public String generateAlphaNumeric(int length) {
        return (new Generex("[a-zA-Z0-9]{" + length + "}")).random();
    }

    public String generateAlphaOnly(int length) {
        return (new Generex("[a-zA-Z]{" + length + "}")).random();
    }

    public String generateStringOfWords(int numOfWords) {
        StringBuilder sb = new StringBuilder();

        for (int x = 1; x <= numOfWords; ++x) {
            sb.append(listOfWords[this.random.nextInt(listOfWords.length)]);
            sb.append(" ");
        }

        return sb.toString().trim();
    }

    public String generateRandomWord() {
        String var10000 = SYLLABLES1[this.random.nextInt(SYLLABLES1.length)];
        return var10000 + SYLLABLES2[this.random.nextInt(SYLLABLES2.length)] + SYLLABLES3[this.random.nextInt(SYLLABLES3.length)];
    }

    public String generateStringOfRandomWords(int length) {
        StringBuilder sb = new StringBuilder();

        for (int x = 1; x <= length; ++x) {
            if (x == 1) {
                sb.append(this.generateRandomWord());
            } else {
                sb.append(this.generateRandomWord().toLowerCase());
            }

            sb.append(" ");
        }

        return sb.toString().trim();
    }

    public String generateSafePassword(int length) {
        return (new Generex("[a-zA-Z0-9()?!=.\\(\\)]{" + length + "}")).random();
    }

    public String generateFromRegex(String regex) {
        return (new Generex(regex)).random();
    }

    public String generateTechCompanyName() {
        return techCompanyWordBank[this.random.nextInt(techCompanyWordBank.length)];
    }

    public String generateProductName() {
        return productWordBank[this.random.nextInt(productWordBank.length)];
    }
}
