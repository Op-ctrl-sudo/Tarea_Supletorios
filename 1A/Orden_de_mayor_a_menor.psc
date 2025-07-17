Algoritmo Orden_de_mayor_a_menor
	// Definimos las variables
	Definir num1, num2, num3 Como Entero
	Escribir 'Se ordenara los numero de mayor a menor'
	// Pedimos el ingreso de datos
	Escribir 'Ingrese el valor del numero 1'
	Leer num1
	Escribir 'Ingrese el valor del numero 2'
	Leer num2
	Escribir 'Ingrese el valor del numero 3'
	Leer num3
	//Proceso para identificar el mayor y ordenarlos
	Si num1>num2 Y num1>num3 Entonces
		Si num2>num3 Entonces
			//Se indica el orden
			Escribir 'El orden es :', num1, ' ', num2, ' ', num3;
		SiNo
			Escribir 'El orden es :', num1, ' ', num3, ' ', num2;
		FinSi
	SiNo
		Si num2>num1 Y num2>num3 Entonces
			Si num1>num3 Entonces
				Escribir 'El orden es :', num2, ' , ', num1, ' , ', num3;
			SiNo
				Escribir 'El orden es :', num2, ' , ', num3, ' , ', num1;
			FinSi
		SiNo
			Si num1>num2 Entonces
				Escribir 'El orden es :', num3, ' , ', num1, ' , ', num2;
			SiNo
				Escribir 'El orden es :', num3, ' , ', num2, ' , ', num1;
			FinSi
		FinSi
	FinSi
FinAlgoritmo
