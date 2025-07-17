Algoritmo Numero_multiplo
	//Definir las variables
	Definir num1,num2 Como Entero;
	Escribir "Identificar si un numero es multipli del otro"
	//Pedimos el ingreso de los dos numeros
	Escribir "Ingrese el valor del numero 1";
	Leer num1;
	Escribir "Ingrese el valor del numero 2";
	Leer num2;
	//Proceso para identificar si son multiplos o no
	si num1%num2=0 Entonces
		//Indicar si son multiplos o no
		Escribir "El numero 1 es multiplo del numero 2";
	SiNo
		si num2%num1=0 Entonces
			Escribir "El numero 2 es multiplo del numero 1";
		SiNo
			Escribir "No son multiplos el uno del otro";
		FinSi
	FinSi
FinAlgoritmo
