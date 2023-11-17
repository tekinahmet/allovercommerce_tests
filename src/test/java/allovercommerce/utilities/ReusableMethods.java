package allovercommerce.utilities;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class ReusableMethods {
    public static void uploadFile(String pathOfTheFile) {
        try {
            WaitUtils.waitFor(3);
            StringSelection stringSelection = new StringSelection(pathOfTheFile);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
            robot.delay(3000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(3000);
        } catch (Exception ignored) {

        }
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 244bcbba35ca25187966963b1c99518e92fe88c5
