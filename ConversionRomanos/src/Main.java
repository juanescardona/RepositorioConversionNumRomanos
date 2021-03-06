public class Main {
	
	public String convertirNumero(int numero){
		
		String numeroString = String.valueOf(numero);	//N�mero a convertir representado en String
		String numeroConvertido = "";					//variable que contiene la respuesta final(numero romano)
		String unidad = "";								//Almacena la unidad del n�mero	a convertir
		String decena = "";								//Almacena la decena del n�mero a convertir
		String centena = "";							//Almacena la centena del n�mero a convertir
		
		//En el siguiente switch case se toma la unidad del n�mero para hacer la respectiva conversi�n de la unidad a romano
		switch(numeroString.substring(numeroString.length()-1)){
			case "1": unidad = "I";
					break;
			case "2": unidad = "II";
					break;
			case "3": unidad = "III";
					break;
			case "4": unidad = "IV";
					break;
			case "5": unidad = "V";
					break;
			case "6": unidad = "VI";
					break;
			case "7": unidad = "VII";
					break;
			case "8": unidad = "VIII";
					break;
			case "9": unidad = "IX";
					break;
			case "0": unidad = "";
					break;
		}
		
		//En el siguiente switch case se toma la decena del n�mero para hacer la respectiva conversi�n de la decena a romano
		if (numeroString.length() > 1){
			switch(numeroString.substring(numeroString.length()-2, numeroString.length()-1)){
				case "1": decena = "X";
						break;
				case "2": decena = "XX";
						break;
				case "3": decena = "XXX";
						break;
				case "4": decena = "XL";
						break;
				case "5": decena = "L";
						break;
				case "6": decena = "LX";
						break;
				case "7": decena = "LXX";
						break;
				case "8": decena = "LXXX";
						break;
				case "9": decena = "XC";
						break;
				case "0": decena = "";
						break;
			}
		}
		
		//En el siguiente switch case se toma la centena del n�mero para hacer la respectiva conversi�n de la centena a romano
		if (numeroString.length() > 2){
			switch(numeroString.substring(numeroString.length()-3, numeroString.length()-2)){
				case "1": centena = "C";
						break;
				case "2": centena = "CC";
						break;
				case "3": centena = "CCC";
						break;
				case "4": centena = "CD";
						break;
				case "5": centena = "D";
						break;
				case "6": centena = "DC";
						break;
				case "7": centena = "DCC";
						break;
				case "8": centena = "DCCC";
						break;
				case "9": centena = "CM";
						break;
				case "0": centena = "";
						break;
			}
		}
		if(numero == 1000){
			return "M";
		}
		
		numeroConvertido = centena + decena + unidad; //Se concatena las respectivas conversiones a romano para representar el n�mero completo
		return numeroConvertido;
	}
}