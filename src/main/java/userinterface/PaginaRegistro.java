package userinterface;


import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class PaginaRegistro extends PageObject {

    public static final Target Firs_name = Target.the("Nombre usuario").located(By.id("firstName"));
    public static final Target Last_name = Target.the("Apellido usuario").located(By.id("lastNamep"));
    public static final Target Email = Target.the("Correo usuario").located(By.id("email"));
    public static final Target Date_month = Target.the("Mes de nacimiento").located(By.id("birthMonth"));
    public static final Target Date_day = Target.the("dia de nacimiento").located(By.id("birthDay"));
    public static final Target Date_year = Target.the("año de nacimiento").located(By.id("birthYear"));


}
