package validate_classes;

import validate_email.EmailExample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassesExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String CLASSES_REGEX = "^[ACP][0-9]{4}[GHIK]$";

    public ClassesExample() {
        pattern = Pattern.compile(CLASSES_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return  matcher.matches();
    }
}
