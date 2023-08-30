package validate_classes;

public class ClassesExampleTest {

    private static ClassesExample classesExample;
    private static final String[] validClasses = new String[]{"C0623K", "A0315I", "P0123G"};
    private static final String[] invalidClasses = new String[]{"123", "B0193K", "C0125Y"};

    public static void main(String[] args) {
        classesExample = new ClassesExample();
        for (String classes : validClasses) {
            boolean isvalid = classesExample.validate(classes);
            System.out.println("Classes is "+ classes + " is valid " +isvalid);
        }
        for (String classes : invalidClasses) {
            boolean isvalid = classesExample.validate(classes);
            System.out.println("Classes is "+ classes + " is valid " +isvalid);
        }
    }
}
