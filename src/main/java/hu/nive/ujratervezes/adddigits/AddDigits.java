package hu.nive.ujratervezes.adddigits;

public class AddDigits {

    public int addDigits(String input) {
        if (input == null || input.equals("")) {
            return -1;
        }

        int total = 0;

        String trimmedInput = trimNonNumericValues(input);

        for (int i = 0; i < trimmedInput.length(); i++) {
            total += Character.getNumericValue(trimmedInput.charAt(i));
        }

        return total;
    }

    public String trimNonNumericValues(String input) {
        return input.replaceAll("[^\\d.]", "");
    }
}
