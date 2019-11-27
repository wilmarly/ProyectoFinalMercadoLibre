package test.appium.MobilePageObject.steps;

import java.net.MalformedURLException;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import test.appium.MobilePageObject.pageObjects.PageObjects;

public class LoginSteps {

	PageObjects PgObj;
	
	@Step
	public void iniciarAplicacion() throws MalformedURLException{
		PgObj.iniciarApp();
//		Serenity.takeScreenshot();		
	}
	@Step
	public void seleccionar_plan_de_entrenamiento(String arg1){
		PgObj.clicl_btn_inicio_principiante(arg1);
		PgObj.seleccionar_el_dia(arg1);
		PgObj.clic_btn_inicio_rutina();
		PgObj.waitFor(8).second();
	}
	
	@Step
	public void seleccionar_dia(String arg1){
		PgObj.seleccionar_el_dia(arg1);
	}
	
	@Step
	public void iniciar_rutina(String arg1){
		PgObj.seleccionar_el_dia(arg1);
	}
//	
//	@Step
//	public void loguinConUsuarioYContrasena(String usuario, String contrasena) {
//		Serenity.takeScreenshot();
//		loginPageObjects.ingresarUsuario(usuario);
//		loginPageObjects.ingresarContrasena(contrasena);
//		loginPageObjects.darClicEnBotonIngresar();
//		Serenity.takeScreenshot();
//		
//	}
//
//	@Step
//	public void validarIngreso(String mensaje) {
//		loginPageObjects.validarMensajeSaldo(mensaje);
//		Serenity.takeScreenshot();
//		
//	}
//	
//	@Step
//	public void ingresoAFormulario() {
//		loginPageObjects.darClicEnMakePayment();
//		
//	}
//
//	@Step
//	public void diligenciarPago(String numero, String nombre, String cantidad, String pais) {
//		loginPageObjects.ingresarNumeroTelefonico(numero);
//		loginPageObjects.ingresarNombre(nombre);
//		loginPageObjects.ingresarValorPago(cantidad);
//		loginPageObjects.darClicEnBuscarPais();
//		loginPageObjects.SeleccionarPais(pais);
//		
//	}
}
