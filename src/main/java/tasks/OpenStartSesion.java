package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;
import userinterface.OpenStartSes;

public class OpenStartSesion implements Task {
    private OpenStartSes openstar;
    public static Performable thePage() { return Tasks.instrumented(OpenStartSesion.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Click.on(openstar.FIRSTNAME_INPUT),
                Enter.theValue("Sergio").into(openstar.FIRSTNAME_INPUT),
                Enter.theValue("Salas").into(openstar.LAST_NAME_INPUT),
                Enter.theValue("Sergio9994@gmail.com").into(openstar.EMAIL_INPUT),
                Click.on(openstar.BMONTH_INPUT),
                Enter.theValue("July").into(By.name("birthMonth")),
                Click.on(openstar.BDAY_INPUT),
                Enter.theValue("9").into(By.name("birthDay")),
                Click.on(openstar.BYEAR_INPUT),
                Enter.theValue("2000").into(By.name("birthYear")),
                Click.on(openstar.L_SPOKEN_INPUT),
                Enter.theValue("spa").into(By.cssSelector("input.ui-select-search")),
                Click.on(openstar. L_SPOKEN_INPUT2)
        );
        actor.attemptsTo(Click.on(openstar.PRESS_NEXT_LOCATION),
                Enter.theValue("Bogot").into(openstar.INPUT_CITY),
                Click.on(openstar.CITY_SELECTOR),
                Enter.theValue("500001").into(openstar.INPUT_ZIP),
                Click.on(openstar.PRESS_NEXT_DEVICES),
                Click.on(openstar.PRESS_LASTSTEP_BUTTON),
                Enter.theValue("FxhDJvkZqT8KfPB").into(openstar.PASSWORD),
                Enter.theValue("FxhDJvkZqT8KfPB").into(openstar.CONFIRMPASSWORD),
                Click.on(openstar.CHECK_BOX),
                Click.on(openstar.CHECK_BOX),
                Click.on(openstar.CHECK_BOX_ERROR),
                Click.on(openstar.CHECK_BOX_ERROR),
                Click.on(openstar.PRESS_COMPLETE_BUTTON)
        );

        actor.attemptsTo(Click.on(openstar.LOG_IN),
                Click.on(openstar.USER),
                Enter.theValue("Sergio9994@gmail.com").into(openstar.USER),
                Click.on(openstar.USER_PASS),
                Enter.theValue("FxhDJvkZqT8KfPB").into(openstar.USER_PASS)

        );

        actor.attemptsTo(Click.on(openstar.SIGN_IN)

        );

    }
}
