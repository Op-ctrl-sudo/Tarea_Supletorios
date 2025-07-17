Algoritmo Diferencia_de_Días
	//Definimos las variables
	Definir dia1,dia2,mes1,mes2,año1,año2,dias,meses,años,diferencia Como Entero
	//Pedimos el ingreso de las dos fechas
	Escribir "Ingrese el dia de la primera fecha en numeros";
	Leer dia1
	Escribir "Ingrese el mes de la primera fecha en numeros";
	Leer mes1
	Escribir "Ingrese el año de la primera fecha";
	Leer año1
	Borrar Pantalla
	Escribir "Ingrese el dia de la segunda fecha en numeros";
	Leer dia2
	Escribir "Ingrese el mes de la segunda fecha en numeros";
	Leer mes2
	Escribir "Ingrese el año de la segunda fecha";
	Leer año2
	//Proceso para identificar la diferencia de dias
	si mes1>12 o mes2>12 o dia1>30 o dia2>30 Entonces
		Escribir "Fecha invalida"
	SiNo
		si año1=año2 Entonces
			años=0
		SiNo
			si año1>año2 Entonces
				años=(año1-año2)*12;
			SiNo
				años=(año2-año1)*12
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
		diferencia=años+meses+dias
		Escribir "La diferencia de dias es de: ",diferencia," Dias";
	FinSi
FinAlgoritmo
