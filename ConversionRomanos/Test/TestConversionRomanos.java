import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;


public class TestConversionRomanos {

	Main conversorRomano;
	String numeroConvertido;
	
	@Before
	public void init(){
		conversorRomano = new Main();
		numeroConvertido = "";
	}
	
	
	@Test
	public void testNumeroUno() {
		numeroConvertido = conversorRomano.convertirNumero(1);
		Assert.assertEquals("I", numeroConvertido);
	}
	
	@Test
	public void testNumeroDos() {
		numeroConvertido = conversorRomano.convertirNumero(2);
		Assert.assertEquals("II", numeroConvertido);
	}
	
	@Test
	public void testNumeroTres() {
		numeroConvertido = conversorRomano.convertirNumero(3);
		Assert.assertEquals("III", numeroConvertido);
	}
	
	@Test
	public void testNumeroCuatro() {
		numeroConvertido = conversorRomano.convertirNumero(4);
		Assert.assertEquals("IV", numeroConvertido);
	}
	
	@Test
	public void testNumeroCinco() {
		numeroConvertido = conversorRomano.convertirNumero(5);
		Assert.assertEquals("V", numeroConvertido);
	}
	
	@Test
	public void testNumeroSeis() {
		numeroConvertido = conversorRomano.convertirNumero(6);
		Assert.assertEquals("VI", numeroConvertido);
	}
	
	@Test
	public void testNumeroSiete() {
		numeroConvertido = conversorRomano.convertirNumero(7);
		Assert.assertEquals("VII", numeroConvertido);
	}
	
	@Test
	public void testNumeroOcho() {
		numeroConvertido = conversorRomano.convertirNumero(8);
		Assert.assertEquals("VIII", numeroConvertido);
	}
	
	@Test
	public void testNumeroNueve() {
		numeroConvertido = conversorRomano.convertirNumero(9);
		Assert.assertEquals("IX", numeroConvertido);
	}
	
	@Test
	public void testNumeroDiez() {
		numeroConvertido = conversorRomano.convertirNumero(10);
		Assert.assertEquals("X", numeroConvertido);
	}
	
	@Test
	public void testNumeroQuince() {
		numeroConvertido = conversorRomano.convertirNumero(15);
		Assert.assertEquals("XV", numeroConvertido);
	}
	
	@Test
	public void testNumeroVeinte() {
		numeroConvertido = conversorRomano.convertirNumero(20);
		Assert.assertEquals("XX", numeroConvertido);
	}
	
	@Test
	public void testNumeroTreinta() {
		numeroConvertido = conversorRomano.convertirNumero(30);
		Assert.assertEquals("XXX", numeroConvertido);
	}
	
	@Test
	public void testNumeroCuarenta() {
		numeroConvertido = conversorRomano.convertirNumero(40);
		Assert.assertEquals("XL", numeroConvertido);
	}
	
	@Test
	public void testNumeroCincuenta() {
		numeroConvertido = conversorRomano.convertirNumero(50);
		Assert.assertEquals("L", numeroConvertido);
	}
	
	@Test
	public void testNumeroSesenta() {
		numeroConvertido = conversorRomano.convertirNumero(60);
		Assert.assertEquals("LX", numeroConvertido);
	}
	
	@Test
	public void testNumeroSetenta() {
		numeroConvertido = conversorRomano.convertirNumero(70);
		Assert.assertEquals("LXX", numeroConvertido);
	}
	
	@Test
	public void testNumeroOchenta() {
		numeroConvertido = conversorRomano.convertirNumero(80);
		Assert.assertEquals("LXXX", numeroConvertido);
	}
	
	@Test
	public void testNumeroNoventa() {
		numeroConvertido = conversorRomano.convertirNumero(90);
		Assert.assertEquals("XC", numeroConvertido);
	}
	
	@Test
	public void testNumeroCien() {
		numeroConvertido = conversorRomano.convertirNumero(100);
		Assert.assertEquals("C", numeroConvertido);
	}
	
	@Test
	public void testNumeroDoscientos() {
		numeroConvertido = conversorRomano.convertirNumero(200);
		Assert.assertEquals("CC", numeroConvertido);
	}
	
	@Test
	public void testNumeroTrescientos() {
		numeroConvertido = conversorRomano.convertirNumero(300);
		Assert.assertEquals("CCC", numeroConvertido);
	}
	
	@Test
	public void testNumeroCuatroscientos() {
		numeroConvertido = conversorRomano.convertirNumero(400);
		Assert.assertEquals("CD", numeroConvertido);
	}
	
	@Test
	public void testNumeroQuinientos() {
		numeroConvertido = conversorRomano.convertirNumero(500);
		Assert.assertEquals("D", numeroConvertido);
	}
	
	@Test
	public void testNumeroSeiscientos() {
		numeroConvertido = conversorRomano.convertirNumero(600);
		Assert.assertEquals("DC", numeroConvertido);
	}
	
	@Test
	public void testNumeroSetescientos() {
		numeroConvertido = conversorRomano.convertirNumero(700);
		Assert.assertEquals("DCC", numeroConvertido);
	}
	
	@Test
	public void testNumeroOchoscientos() {
		numeroConvertido = conversorRomano.convertirNumero(800);
		Assert.assertEquals("DCCC", numeroConvertido);
	}
	
	@Test
	public void testNumeroNovescientos() {
		numeroConvertido = conversorRomano.convertirNumero(900);
		Assert.assertEquals("CM", numeroConvertido);
	}
	
	@Test
	public void testNumeroMil() {
		numeroConvertido = conversorRomano.convertirNumero(1000);
		Assert.assertEquals("M", numeroConvertido);
	}
	
	@Test
	public void testNumeroCincuentaSeis() {
		numeroConvertido = conversorRomano.convertirNumero(56);
		Assert.assertEquals("LVI", numeroConvertido);
	}
	
	@Test
	public void testNumeroSetescientoOchentaDos() {
		numeroConvertido = conversorRomano.convertirNumero(782);
		Assert.assertEquals("DCCLXXXII", numeroConvertido);
	}
}