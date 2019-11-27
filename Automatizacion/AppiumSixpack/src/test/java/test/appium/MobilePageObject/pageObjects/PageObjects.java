package test.appium.MobilePageObject.pageObjects;

import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.webdriver.WebDriverFacade;
//import com.mifmif.common.regex.Generex;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.WebElementFacade;



public class PageObjects  extends MobilePageObject{

	public PageObjects(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	String btn_inicio_Principiante = "(//*[@resource-id='sixpack.sixpackabs.absworkout:id/tv_start'])[1]";
	String btn_inicio_Intermedio = "(//*[@resource-id='sixpack.sixpackabs.absworkout:id/tv_start'])[2]";
	String btn_inicio_Avanzado = "(//*[@resource-id='sixpack.sixpackabs.absworkout:id/tv_start'])[3]";
	
	String publicidad = "//*[@class='android.webkit.WebView']";
	
	String select_dia="(//android.widget.RelativeLayout//android.widget.RelativeLayout//androidx.viewpager.widget.ViewPager//android.view.ViewGroup//androidx.recyclerview.widget.RecyclerView//*[@class='android.view.ViewGroup'])[2]";
  
	String btn_inicio_rutina="//*[@resource-id='sixpack.sixpackabs.absworkout:id/btn_start']";
	
	String edtUsuario = "com.experitest.ExperiBank:id/usernameTextField";
    String edtContrasena = "com.experitest.ExperiBank:id/passwordTextField";
    String btnIngresar = "com.experitest.ExperiBank:id/loginButton";
    String btnPagos = "com.experitest.ExperiBank:id/makePaymentButton";
    String txtSaldo = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View\r\n";
    
    String btnRealizarPago = "com.experitest.ExperiBank:id/makePaymentButton";
    String edtTelefono = "com.experitest.ExperiBank:id/phoneTextField";
    String edtNombre = "com.experitest.ExperiBank:id/nameTextField";
    String edtValor = "com.experitest.ExperiBank:id/amountTextField";
    String btnBuscarPais = "com.experitest.ExperiBank:id/countryButton"; 
    String btnPais = "//android.widget.ListView/android.widget.TextView[@text = \"Colombia\"]";
    
    WebDriverWait wait = new WebDriverWait(getDriver(), 10);
    
	public void iniciarApp() throws MalformedURLException {
		//iniciar app
	}

	public void clicl_btn_inicio_principiante(String arg1) {
		System.out.println(arg1);
		element(By.xpath(btn_inicio_Principiante)).click();		
	}

	public void seleccionar_el_dia(String arg1) {
		System.out.println(arg1);
		element(By.xpath(select_dia)).click();
	}
	
	public void clic_btn_inicio_rutina() {
		swipe(3);
		element(By.xpath(btn_inicio_rutina)).click();
		
	}

	public void validarMensajeSaldo(String mensaje) {
		waitFor(4).seconds();
		String mensajeAValidar = element(By.xpath(this.txtSaldo)).getText().toString();
		System.out.println("mensaje: "+mensajeAValidar+" mensaje feature: "+mensaje);
		assertTrue(mensajeAValidar.contains(mensaje));
	}
	
	public void darClicEnMakePayment() {
		MobileElement btnRealizarPago =(MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id(this.btnRealizarPago)));
		btnRealizarPago.click();
	}

	public void ingresarNumeroTelefonico(String numero) {
		MobileElement btnTelefono = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(this.edtTelefono)));
		btnTelefono.sendKeys(numero);
		
	}







	@SuppressWarnings("rawtypes")
	public void swipe(int arg1) {
		for (int i =0 ; i<arg1 ; i++) {
		waitFor(2).seconds();
		Dimension size = getDriver().manage().window().getSize();
		WebDriver facade = getDriver();
		WebDriver driver = ((WebDriverFacade)facade).getProxiedDriver();
		
		int startY = (int) (size.height*0.8);
		int endY = (int) (size.height*0.2);
		int pointX = (int) (size.width*0.5);
		
		//System.out.println("x: "+pointX+" y1: "+startY+" y2: "+endY);
		TouchAction ta = new TouchAction((PerformsTouchActions) driver);
		ta.press(new PointOption().withCoordinates(pointX, startY)).waitAction().moveTo(new PointOption().withCoordinates(pointX, endY)).release().perform();
		//getDriver().quit();
		}
	}
	
}
