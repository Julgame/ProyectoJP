Algoritmo PromedioArreglosalMes
	Definir a, total_arreglos, arreglos, pro Como Real
	Escribir 'Cuantos arregos se hicieron al mes'
	Leer a
	total_arreglos <- 0
	Para i<-1 Hasta a Hacer
		Escribir 'Ingrese el valor de arreglos'
		Leer arreglos
		total_arreglos <- total_arreglos+arreglos
	FinPara
	pro <- total_arreglos/a
	Escribir 'El promedio total de sus arreglos  ', pro
FinAlgoritmo
