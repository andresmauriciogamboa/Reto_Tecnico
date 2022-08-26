package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterface.PaginaPrincipal.BotonCrear;


public class ClickRegistro implements Task {
    public static ClickRegistro clickregistro() {
        return Tasks.instrumented(ClickRegistro.class);
    }

    public ClickRegistro() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Click.on(BotonCrear)
        );

    }
}
