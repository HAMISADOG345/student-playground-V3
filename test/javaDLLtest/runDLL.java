public class runDLL {
    public static void main(String[] args) {
        try {
            System.load("C:/Users/rowan/OneDrive/Documentos/student-playground-V3/test/javaDLLtest/test.dll");
            System.out.println("it works");
        } catch (UnsatisfiedLinkError e) {
            System.err.println("it doe not work:" + e);
            System.exit(1);
        }
    }
}
