import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class OptionalTest {
    public static void main(String[] args) {
        ProcessHandle handle = ProcessHandle.current();
        ProcessHandle.Info info = handle.info();
        System.out.println("handle.pid() " + handle.pid());
        var startTime= info.startInstant().orElse(Instant.now());
        var startTimeFormat = new SimpleDateFormat("yyMMdd-HHmmss");
        var startTimeFormated = startTimeFormat.format(Date.from(startTime));
        System.out.println("startTimeFormated " + startTimeFormated);
        System.out.println(Instant.now().toString());
        var commandArgs = '"' + String.join(" ", info.arguments().orElse(new String[0])) + '"';
//        System.out.println(args[0]);
//        var commandArgs = info.arguments().isEmpty() ? "" : info.arguments().get();
//        var commandArgs = info.arguments().map(Objects::toString).orElse("");
        System.out.println("info.arguments() " + info.arguments());
//        var processName = info.command().get().endsWith("java.exe") ? "java.exe" : "";
        var processName2 = info.command().map(s -> {
            if (s.endsWith("java.exe"));
            return "java.exe";
        }).orElse("");
        System.out.println(processName2);

//        String javaCmd = ProcessUtils.getJavaCmd().getAbsolutePath();
//        ProcessBuilder processBuilder = new ProcessBuilder(javaCmd, "-version");
//        Process process = processBuilder.inheritIO().start();
//        ProcessHandle processHandle = process.toHandle();

//        Stream<ProcessHandle> liveProcesses = ProcessHandle.allProcesses();
//        liveProcesses.filter(ProcessHandle::isAlive)
//                .forEach(ph -> {
//                    System.out.println("PID: " + ph.pid());
//                    System.out.println("Instance: " + ph.info().startInstant());
//                    System.out.println("User: " + ph.info().user());
//                });
    }

}
