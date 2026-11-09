import java.io.File;
import java.io.IOException;

public class runDLL {
    public static native void run(String function);

    public static void main(String[] args) {

        if (args.length > 2) {
            System.err.println("needs 2 parameters <dll> <function>");

            if (args.length == 0) {
                System.err.println("nothing to run");
            }
        }

        File dll = new File(args[0]);
        String functionName = args[1];

        if (!dll.exists()) {
            System.err.println(dll + " does not exist");
            System.exit(1);
        }

        try {
            ProcessBuilder pb = new ProcessBuilder(
                    "rundll32.exe",
                    dll.getAbsolutePath() + "," + functionName
            );

            Process process = pb.start();

            process.waitFor();

            System.out.println("dll ran at: " + dll.getAbsolutePath());

        } catch (IOException | InterruptedException e) {
            System.err.println("cant run dll at: " + dll.getAbsolutePath() + " err: " + e.getMessage());
            System.exit(1);
        }
    }
}
