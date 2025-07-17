Algoritmo Numero_Cuadrado
	//defnimos las variables
	Definir num Como real;
	Escribir "Mostrar el cuadrado del numero hasta que salga 0"
	//Proceso para repetir hasta que el numero sea negativo
	Repetir
		//Pedimos el ingreso de los numeros
		Escribir "Ingrese un numero";
		Leer num;
		si num>=0 Entonces
			//Indicamos el cuadrado del numero
			num=num^2;
			Escribir "El cuadrado del numero es: ",num;
		FinSi
	hasta que num<0
FinAlgoritmo
