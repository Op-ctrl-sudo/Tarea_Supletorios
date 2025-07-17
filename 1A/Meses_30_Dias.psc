Algoritmo Meses_30_Dias
	//Definir las variables
	Definir mes,dia,año Como Entero
	Escribir "Indicar si la fecha es correcta";
	//Ingrese la fecha
	Escribir "Ingrese el dia de la fecha en numeros";
	Leer dia;
	Escribir "Igrese el mes de la fecha en numeros";
	Leer mes;
	Escribir "Ingrese el año de la fecha";
	Leer año;
	//Determinamos si la fecha es correcta teniendo en cuenta que los meses tiene 30 dias
	si dia<=30 Entonces
		//Mostramos si la fecha es correcta o no
		si mes<=12 Entonces
			Escribir "La fecha indica es correcta";
		SiNo
			Escribir "La fecha indica es incorrecta";
		FinSi
	SiNo
		Escribir "La fecha indica es incorrecta";
	FinSi
FinAlgoritmo
