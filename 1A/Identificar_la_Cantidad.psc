Algoritmo Identificar_la_Cantidad
	//Definir las variables
	Definir num Como Entero;
	Escribir "Determinar la cantidad de digitos que tiene el numero"
	//Pedir que escoja un numero
	Escribir "Escoja un numero entre el 0 y 9.999";
	Leer num;
	si num<10 Entonces
		Escribir "El numero tiene: 1 cifra";
	SiNo
		si num<100 Entonces
			Escribir "El numero tiene: 2 cifras";
		SiNo
			si num<1000 Entonces
				Escribir "El numero tiene: 3 cifras";
			SiNo
				si num<10000 Entonces
					Escribir "El numero tiene: 4 cifras"
				FinSi
			FinSi
	    FinSi
	FinSi
	si num>=10000 Entonces
		Escribir "Numero no valido";
	FinSi
FinAlgoritmo
