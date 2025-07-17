Algoritmo Area_Circulo
	//Definimos las variables
	Definir radio, area Como Real;
	Escribir "Calcular el área del circulo"
	//Pedimos el ingreso de datos
	Escribir "Ingrese el radio del circulo";
	Leer radio;
	//Realizamos el proceso para calcular el area del circulo
	area=pi*radio^2;
	//Se representa lo solicitado
	Escribir "El area del circulo es de: ",redon(area*100)/100;
FinAlgoritmo
