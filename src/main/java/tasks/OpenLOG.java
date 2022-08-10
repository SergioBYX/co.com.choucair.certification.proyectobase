package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.Utestlog;


public class OpenLOG implements Task {
    private Utestlog utestlog;

    public static OpenLOG thePage() {
        return Tasks.instrumented(OpenLOG.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(utestlog.PRESS_JOINTODAY_BUTTON));

    }
    }