package tasks;

import javafx.scene.control.Tab;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.thucydides.core.requirements.ParentRequirementsProvided;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import userinterface.Utest;

public class OpenUp implements Task {
    private Utest utest;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
                actor.attemptsTo(Open.browserOn(utest));

    }

}
