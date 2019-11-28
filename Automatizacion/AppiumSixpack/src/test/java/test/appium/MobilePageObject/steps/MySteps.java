package test.appium.MobilePageObject.steps;

import java.net.MalformedURLException;

//import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import test.appium.MobilePageObject.pageObjects.MyPageObjects;

public class MySteps {

	MyPageObjects PgObj;
	
	@Step
	public void iniciarAplicacion() throws MalformedURLException{
		PgObj.iniciarApp();
//		Serenity.takeScreenshot();		
	}
	@Step
	public void seleccionar_plan_de_entrenamiento(String arg1){
		
	    if (arg1.equals("principiante") || arg1.equals("Principiante")) {  
	    	PgObj.clic_btn_inicio_principiante(); 
	      } else if (arg1.equals("intermedio") || arg1.equals("Intermedio")) {  
	        PgObj.clic_btn_inicio_intermedio(); 
	      } else if (arg1.equals("avanzado") || arg1.equals("Avanzado")) {  
	    	PgObj.clic_btn_inicio_avanzado();   
	      } 
	}
	
	@Step
	public void seleccionar_dia(String arg1){
		PgObj.seleccionar_el_dia(arg1);
	}
	
	@Step
	public void iniciar_rutina(){
		PgObj.clic_btn_inicio_rutina();
	}
	
	@Step
	public void validar_inicio_de_rutina(){
		PgObj.validar_inicio_rutina("Preparados");
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
