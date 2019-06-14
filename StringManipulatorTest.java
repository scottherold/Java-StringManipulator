public class StringManipulatorTest {
    public static void main(String[] args) {
        // trim and concat
        StringManipulator manipulator = new StringManipulator();
        System.out.println(manipulator.trimAndConcat("    Hello     ","     World    "));

        // print the character index or null -- char must use single quotes!
        System.out.println(manipulator.getIndexOrNull("bob", 'o'));
        // print the substring index or null
        System.out.println(manipulator.getIndexOrNull("Hello", "ell"));

        // concat substring plus second string
        System.out.println(manipulator.concatSubstring("Hello", 1, 2, "world"));
    }
}