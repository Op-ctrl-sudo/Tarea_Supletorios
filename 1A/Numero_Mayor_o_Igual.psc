Algoritmo Numero_Mayor_o_Igual
	//Definir las variables
	Definir num1,num2 Como Entero;
	Escribir "Identificar cual de los dos numero es mayor";
	//Pedimos el ibgreso de los dos numeros
	Escribir "Ingrese el valor del numero 1";
	Leer num1;
	Escribir "Ingrese le valor del numero 2";
	Leer num2;
	//Proceso para identificar el numero mayor
	si num1>num2 Entonces
		//Se muestra cual es el numero mayor
		Escribir "El numero ",num1," es mayor a ",num2;
	SiNo
		si num1<num2 Entonces
			Escribir "El numero ",num2," es mayor a ",num1;
		SiNo
			Escribir "Los numeros son iguales";
		FinSi
	FinSi
FinAlgoritmo
