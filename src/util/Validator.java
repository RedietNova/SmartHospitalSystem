package util;

public class Validator {

    public static boolean isValidName(String name) {
        return name != null && !name.trim().isEmpty();
    }
}