public class Main {
	
	public String convertirNumero(int numero){
		String numeroConvertido = "";
		switch(numero){
			case 1: numeroConvertido = "I";
					break;
			case 2: numeroConvertido = "II";
					break;
			case 3: numeroConvertido = "III";
					break;
			case 4: numeroConvertido = "IV";
					break;
			case 5: numeroConvertido = "V";
					break;
			case 6: numeroConvertido = "VI";
					break;
			case 7: numeroConvertido = "VII";
					break;
			case 8: numeroConvertido = "VIII";
					break;
			case 9: numeroConvertido = "IX";
					break;
			case 10: numeroConvertido = "X";
					break;	
		}
		return numeroConvertido;
	}
}