package scoobydoo;

import com.objogate.wl.swing.AWTEventQueueProber;
import com.objogate.wl.swing.driver.ComponentDriver;
import com.objogate.wl.swing.driver.JFrameDriver;
import com.objogate.wl.swing.driver.JLabelDriver;
import com.objogate.wl.swing.gesture.GesturePerformer;
import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

import static org.hamcrest.Matchers.equalTo;

@SuppressWarnings("unchecked")
public class WeHaveSmokeStepdefs {


    private ApplicationDriver driver;

    @Before
    public void setDriver(){
        driver = new ApplicationDriver();
    }

    @After
    public void confirm(){
        driver.dispose();
    }

    @Given("our application is running")
    public void ourApplicationIsRunning(){
        ApplicationLauncher.main();
    }

    @When("i access the application status")
    public void whatsTheStatus(){
    }

    @Then("i should get back a valid response")
    public void shouldHaveValidResponse(){
        driver.confirmApplicationStatusIs(ApplicationFrame.Status.RUNNING);
    }
}

class ApplicationDriver extends JFrameDriver {

    public ApplicationDriver(){
        super(new GesturePerformer(), new AWTEventQueueProber(), showingOnScreen());
    }

    public void confirmApplicationStatusIs(ApplicationFrame.Status status){
        new JLabelDriver(this, ComponentDriver.named(StatusLabel.NAME)).hasText(equalTo(status.toString()));
    }
}
