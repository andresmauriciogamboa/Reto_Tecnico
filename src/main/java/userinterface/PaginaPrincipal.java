package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://utest.com/")
public class PaginaPrincipal extends PageObject {

    public static final Target BotonCrear = Target.the("El boton para ingresar a la creacion de usuario").located(By.className("unauthenticated-nav-bar__sign-up"));

}
