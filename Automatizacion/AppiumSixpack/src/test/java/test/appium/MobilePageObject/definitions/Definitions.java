package test.appium.MobilePageObject.definitions;

import java.net.MalformedURLException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.appium.MobilePageObject.steps.LoginSteps;

public class Definitions {

	@Steps
	LoginSteps step;
	
	@Given("^Ingreso a la aplicacion$")
	public void ingresoALaAplicacion() throws MalformedURLException {
	    step.iniciarAplicacion();
	}

	@When("^seleccionar plan de entrenamiento en modo \"([^\"]*)\"$")
	public void seleccionar_plan_de_entrenamiento_en_modo(String arg1) {
		step.seleccionar_plan_de_entrenamiento(arg1);
	}

	@When("^seleccionar el \"([^\"]*)\" de entrenamiento$")
	public void seleccionar_el_de_entrenamiento(String arg1) {
		step.seleccionar_dia(arg1);
	}

	@When("^iniciar la rutina$")
	public void iniciar_la_rutina() {
		
	}

	@Then("^validar inicio de la rutina$")
	public void validar_inicio_de_la_rutina() {

	}


//	@When("^ingreso usuario \"([^\"]*)\" y contrasena \"([^\"]*)\"$")
//	public void ingresoUsuarioYContrasena(String usuario, String contrasena) {
//		loginSteps.loguinConUsuarioYContrasena(usuario,contrasena);
//	}
//
//	@Then("^valido ingreso a la aplicacion \"([^\"]*)\"$")
//	public void validoIngresoALaAplicacion(String mensaje) {
//		loginSteps.validarIngreso(mensaje);
//	}
//	
//	@When("^ingreso al formulario ingresar pago$")
//	public void ingresoAlFormularioIngresarPago() {
//	    loginSteps.ingresoAFormulario();
//	}
//
//
//	@When("^diligencio formulario de pago con numero \"([^\"]*)\" nombre \"([^\"]*)\" cantidad \"([^\"]*)\" pais \"([^\"]*)\"$")
//	public void diligencioFormularioDePagoConNumeroNombreCantidadPais(String numero, String nombre, String cantidad, String pais) {
//	    loginSteps.diligenciarPago(numero,nombre,cantidad,pais);
//	}
//
//	@Then("^valido pago exitoso$")
//	public void validoPagoExitoso() {
//
//	}
}
