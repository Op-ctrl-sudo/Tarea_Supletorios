Algoritmo Meses_28_30_31
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
	si mes>12 Entonces
		Escribir "La fecha indicada es incorrecta"
	SiNo
		//Expresamos si la fecha es incorrecta o correcta
		si mes=1 o mes=3 o mes=5 o mes=7 o mes=8 o mes=10 o mes=12 Entonces
			si dia<31 y dia>31 Entonces
				Escribir "La fecha indicada es incorrecta";
			SiNo
				Escribir "La fecha indicada es correcta";
			FinSi
		SiNo
			si mes=2 Entonces
				si dia>28 Entonces
					Escribir "La fecha indicada es incorrecta";
				SiNo
					Escribir "La fecha indicada es correcta";
				FinSi
			SiNo
				si dia>30 Entonces
					Escribir "La fecha indicada es incorrecta";
				SiNo
					Escribir "La fecha indicada es correcta";
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
