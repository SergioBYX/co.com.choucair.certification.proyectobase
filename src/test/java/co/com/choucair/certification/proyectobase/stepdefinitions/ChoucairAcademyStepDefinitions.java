package co.com.choucair.certification.proyectobase.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.OpenLOG;
import tasks.OpenUp;
import tasks.OpenStartSesion;


public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^ingresar a la pagina web de utest$")
    public void ingresarALaPaginaWebDeUtest() {
        OnStage.theActorCalled("Sergio").wasAbleTo(OpenUp.thePage());
    }


    @When("^iniciar sesion en un test$")
    public void iniciarSesionEnUnTest() {
        OnStage.theActorCalled("Sergio").wasAbleTo(OpenLOG.thePage());
    }

    @Then("^me registro en la pagina de utest y realizo el llenado de campos e iniciar sesion$")
    public void meRegistroEnLaPaginaDeUtestYRealizoElLlenadoDeCamposEIniciarSesion() {
        OnStage.theActorCalled("Sergio").wasAbleTo(OpenStartSesion.thePage());

    }
}
