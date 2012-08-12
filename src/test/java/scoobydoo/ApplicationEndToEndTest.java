package scoobydoo;

import org.junit.Test;

public class ApplicationEndToEndTest {

    @Test
    public void confirmApplicationIsRunning(){
        ApplicationLauncher.main();
        ApplicationDriver driver = new ApplicationDriver();
        driver.confirmApplicationStatusIs(ApplicationFrame.Status.RUNNING);
        driver.dispose();
    }
}
