package HomeWork.Log;

import java.io.IOException;

public class MainLog {
    public static void main(String[] args) throws IOException {
     /* TextAndFilleLogger textAndFilleLogger = new TextAndFilleLogger();
      textAndFilleLogger.log("Start Log");
      textAndFilleLogger.log("Open website");
      textAndFilleLogger.log("Login user");
      textAndFilleLogger.log("Open my account");*/

     FilleLogger filleLogger = new FilleLogger();
     filleLogger.toFile("Start browser2");
     filleLogger.toFile("Open website2");


        //  testLogin();
    }

    private static void testLogin() throws IOException {
        Log log1 = new Log();
        log1.log("Start browser");
        log1.log("Open website");
        log1.log("Login user");
        log1.log("Open my account");
    }
}
