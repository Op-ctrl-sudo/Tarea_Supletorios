Algoritmo Nota_Suficiente_Insuficiente_Satisfactorio
	//definir las variables
	Definir suficiente,insuficiente,satisfactorio,nota Como Real;
	Escribir "Notificar si su nota es insuficiente, suficiente, satisfactorio";
	//Pedimos el ingreso de la nota
	Escribir "Ingrese su nota del 0 al 10";
	Leer nota;
	si nota>=9 Entonces
		Escribir "Su nota es Satisfactorio";
	SiNo
		si nota>=7 y nota<9 Entonces
			Escribir "Su nota es suficiente";
		SiNo
			Escribir "Su nota es insuficiente";
		FinSi
	FinSi
FinAlgoritmo
