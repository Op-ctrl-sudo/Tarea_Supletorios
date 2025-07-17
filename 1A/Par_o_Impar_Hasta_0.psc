Algoritmo Par_o_Impar_Hasta_0
	//Definimos las variables
	Definir num Como Entero;
	Escribir "Se determinara si el numero es par o impar hasta que se ingrese 0";
	//Proceso para repetir hasta que ingrese 0
	Repetir
		//Pedimos el ingreso del numero
		Escribir "Ingrese el numero";
		Leer num;
		si num<>0 Entonces
			si num%2=0 Entonces
				//Mostramos si el numero es par o impar
				Escribir "El numero ",num," es par";
			SiNo
				Escribir "El numero ",num," es impar";
				
			FinSi
		FinSi
	Hasta Que num=0 
FinAlgoritmo
