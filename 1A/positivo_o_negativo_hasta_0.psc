Algoritmo positivo_o_negativo_hasta_0
	//Definimos las variables
	Definir num Como Entero;
	Escribir "Se determinara si el numero es positivo o negativo hasta que se ingrese 0";
	//Proceso para repetir hasta que ingrese 0
	Repetir
		//Pedimos el ingreso del numero
		Escribir "Ingrese el numero";
		Leer num;
		si num>0 Entonces
			//Mostramos si el numero es positivo o negativo
			Escribir "El numero ",num," es positivo";
		SiNo
			si num<0 Entonces
			 Escribir "El numero ",num," es negativo";
		    FinSi
		FinSi
	Hasta Que num=0 
FinAlgoritmo
