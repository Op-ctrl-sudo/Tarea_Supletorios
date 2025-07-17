Algoritmo Determinar_si_es_o_no_un_Palindromo
	//Definir las variables
	Definir num,rev,c Como Entero;
	Definir a,b Como Caracter;
	Escribir "Determinar si el numero es un palindromo";
	//Pedimos que escoja un numero
	Escribir "Seleccione un numero del 0 al 9.999";
	Leer num;
	//Proceso para invertir el numero
	a=ConvertirATexto(num);
	rev=Longitud(a);
	b= "";
	mientras rev >0 Hacer
		b=b + Subcadena(a,rev,rev)
		rev=rev - 1;
	FinMientras
	c=ConvertirANumero(b)
	//Mostramos si es palindromo o no
	si num=c Entonces
		Escribir "El numero: ",num," es palindromo";
	SiNo
		Escribir "El numero: ",num," no es palindromo";
	FinSi
FinAlgoritmo
