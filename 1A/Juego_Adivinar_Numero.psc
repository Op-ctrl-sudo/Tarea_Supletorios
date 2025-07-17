Algoritmo Juego_Adivinar_Numero
	//Definir las variables
	Definir N,num Como Entero;
	Escribir "Creamos un juego de adivinar el numero";
	//Pedimos el numero a adivinar
	Escribir "Ingrese el numero que se va a adivinar";
	Leer N;
	//Proceso para adivinar
	Escribir "Ingrese un numero"
	Repetir
		Leer num;
		si num>N Entonces
			Escribir "Ingrese un numero menor";
		SiNo
			si num<N Entonces
				Escribir "Ingrese un numero mayor";
			SiNo
				si num=N Entonces
					Escribir "Adivino el numero";
				FinSi
			FinSi
		FinSi
	Hasta Que N=num 
FinAlgoritmo
