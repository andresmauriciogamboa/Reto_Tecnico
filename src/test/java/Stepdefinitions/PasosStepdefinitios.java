package Stepdefinitions;


import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.ClickRegistro;
import userinterface.PaginaPrincipal;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static userinterface.PaginaRegistro.*;

public class PasosStepdefinitios {


    @Managed(driver = "chrome")
    private WebDriver navegador;


    private Actor actor = Actor.named("Andres");
    private PaginaPrincipal paginaPrincipal = new PaginaPrincipal();



    @Dado("^que un usuario accede hasta la pagina de inscripcion$")
    public void queUnUsuarioAccedeHastaLaPaginaDeInscripcion() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(paginaPrincipal));

    }

    @Cuando("^da clic en la opción de registro$")
    public void daClicEnLaOpciónDeRegistro() {
        OnStage.theActorCalled("Andres").wasAbleTo(ClickRegistro.clickregistro());

    }

    @Entonces("^realizar el diligenciamiento del formulario de creacion de usuario$")
    public void realizarElDiligenciamientoDelFormularioDeCreacionDeUsuario() {
    actor.should(seeThat(the(Firs_name),isPresent()));
    actor.should(seeThat(the(Last_name),isPresent()));
    actor.should(seeThat(the(Date_month),isPresent()));
    actor.should(seeThat(the(Date_day),isPresent()));
    actor.should(seeThat(the(Date_year),isPresent()));

    }




}
