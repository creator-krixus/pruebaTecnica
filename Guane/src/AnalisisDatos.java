//Analisis de los datos ingresados al sistema

public class AnalisisDatos extends IngresoDatos{
	
	public void mostrar() {
		
		if(temperatura.equalsIgnoreCase(zero) || temperatura.equalsIgnoreCase(one) || temperatura.equalsIgnoreCase(two)
				|| temperatura.equalsIgnoreCase(three)	|| temperatura.equalsIgnoreCase(four) || temperatura.equalsIgnoreCase(five)
				|| temperatura.equalsIgnoreCase(six) || temperatura.equalsIgnoreCase(seven) || temperatura.equalsIgnoreCase(eight)
				|| temperatura.equalsIgnoreCase(nine)) {
			
			switch(temperatura.toLowerCase()) {
			
			case "one":
				System.out.println("La temperatura es de "+ 1 +" "+"grados");
				break;
			case "two":
				System.out.println("La temperatura es de "+ 2 +" "+"grados");
				break;
			case "three":
				System.out.println("La temperatura es de "+ 3 +" "+"grados");
				break;
			case "four":
				System.out.println("La temperatura es de "+ 4 +" "+"grados");
				break;
			case "five":
				System.out.println("La temperatura es de "+ 5 +" "+"grados");
				break;
			case "six":
				System.out.println("La temperatura es de "+ 6 +" "+"grados");
				break;
			case "seven":
				System.out.println("La temperatura es de "+ 7 +" "+"grados");
				break;
			case "eight":
				System.out.println("La temperatura es de "+ 8 +" "+"grados");
				break;
			case "nine":
				System.out.println("La temperatura es de "+ 9 +" "+"grados");
				break;	
			default:
				System.out.println("La temperatura es de "+ 0 +" "+"grados");
				break;
			}
		
		}else if(temperatura.equalsIgnoreCase(Uno) || temperatura.equalsIgnoreCase(Cero) || temperatura.equalsIgnoreCase(Tres)
				|| temperatura.equalsIgnoreCase(Dos)	|| temperatura.equalsIgnoreCase(Cuatro) || temperatura.equalsIgnoreCase(Cinco)
				|| temperatura.equalsIgnoreCase(Seis) || temperatura.equalsIgnoreCase(Siete) || temperatura.equalsIgnoreCase(Ocho)
				|| temperatura.equalsIgnoreCase(Nueve)){
			
						System.out.println("La temperatura es de "+ temperatura +" "+ "grados");
				
			
		}else if(temperatura.equalsIgnoreCase(nombreUno) || temperatura.equalsIgnoreCase(nombreCero) || temperatura.equalsIgnoreCase(nombreTres)
				|| temperatura.equalsIgnoreCase(nombreDos)	|| temperatura.equalsIgnoreCase(nombreCuatro) || temperatura.equalsIgnoreCase(nombreCinco)
				|| temperatura.equalsIgnoreCase(nombreSeis) || temperatura.equalsIgnoreCase(nombreSiete) || temperatura.equalsIgnoreCase(nombreOcho)
				|| temperatura.equalsIgnoreCase(nombreNueve)) {
			
				switch(temperatura.toLowerCase()) {
				
				case "uno":
					System.out.println("La temperatura es de "+ 1 +" "+"grados");
					break;
				case "dos":
					System.out.println("La temperatura es de "+ 2 +" "+"grados");
					break;
				case "tres":
					System.out.println("La temperatura es de "+ 3 +" "+"grados");
					break;
				case "cuatro":
					System.out.println("La temperatura es de "+ 4 +" "+"grados");
					break;
				case "cinco":
					System.out.println("La temperatura es de "+ 5 +" "+"grados");
					break;
				case "seis":
					System.out.println("La temperatura es de "+ 6 +" "+"grados");
					break;
				case "siete":
					System.out.println("La temperatura es de "+ 7 +" "+"grados");
					break;
				case "ocho":
					System.out.println("La temperatura es de "+ 8 +" "+"grados");
					break;
				case "nueve":
					System.out.println("La temperatura es de "+ 9 +" "+"grados");
					break;	
				default:
					System.out.println("La temperatura es de "+ 0 +" "+"grados");
					break;
				}
		}else {
			System.out.println(" ERROR SOLO SE ADMITE UN NUMERO DECIMAL ENTERO\n"
		+ " DE 0~9 O SU RESPECTIVO NOMBRE EN INGLES O ESPA�OL");
		}
	}
	
}


