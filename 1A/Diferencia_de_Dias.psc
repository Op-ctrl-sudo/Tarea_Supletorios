Algoritmo Diferencia_de_D�as
	//Definimos las variables
	Definir dia1,dia2,mes1,mes2,a�o1,a�o2,dias,meses,a�os,diferencia Como Entero
	//Pedimos el ingreso de las dos fechas
	Escribir "Ingrese el dia de la primera fecha en numeros";
	Leer dia1
	Escribir "Ingrese el mes de la primera fecha en numeros";
	Leer mes1
	Escribir "Ingrese el a�o de la primera fecha";
	Leer a�o1
	Borrar Pantalla
	Escribir "Ingrese el dia de la segunda fecha en numeros";
	Leer dia2
	Escribir "Ingrese el mes de la segunda fecha en numeros";
	Leer mes2
	Escribir "Ingrese el a�o de la segunda fecha";
	Leer a�o2
	//Proceso para identificar la diferencia de dias
	si mes1>12 o mes2>12 o dia1>30 o dia2>30 Entonces
		Escribir "Fecha invalida"
	SiNo
		si a�o1=a�o2 Entonces
			a�os=0
		SiNo
			si a�o1>a�o2 Entonces
				a�os=(a�o1-a�o2)*12;
			SiNo
				a�os=(a�o2-a�o1)*12
		FinSi
		FinSi
		si mes1=mes2 Entonces
			meses=0
		SiNo
			si mes1>mes2 Entonces
				meses=(mes1-mes2)*30;
			SiNo
				meses=(mes2-mes1)*30;
			FinSi
		FinSi
		si dia1=dia2 Entonces
			dias=0
		SiNo
			si dia1>dia2 Entonces
				dias=dia1-dia2;
			SiNo
				dias=dia2-dia1;
			FinSi
		FinSi
		diferencia=a�os+meses+dias
		Escribir "La diferencia de dias es de: ",diferencia," Dias";
	FinSi
FinAlgoritmo
