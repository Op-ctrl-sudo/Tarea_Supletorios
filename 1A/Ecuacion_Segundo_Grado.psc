Algoritmo Ecuacion_Segundo_Grado
	//Definimos las variables
	Definir a,b,c,x1,x2 Como entero;
	Escribir "Resolucion de ecuaciones de segundo grado";
	//Se pide el ingreso de los datos
	Escribir "Ingrese el valor de a";
	Leer a;
	Escribir "Ingrese el valor de b";
	Leer b;
	Escribir "Ingrese el valor de c";
	Leer c;
	//Se aplica el proceso por el cual se obtienen las respuestas de x 
	si b^2-4*a*c<0 Entonces
		Escribir "No exite respuesta"
	SiNo
		x1=(-b+raiz(b^2-4*a*c))/2*a;
		x2=(-b-raiz(b^2-4*a*c))/2*a;
		//Se muestran las respuestas de la x si existen
		Escribir "La primera respuesta de la ecuacion es de: ",x1;
		Escribir "La segunda respuesta de la ecuacion es de: ",x2;
	FinSi
FinAlgoritmo
