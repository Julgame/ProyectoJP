# Arreglos
Este programa se basa en el promedio de arreglos que se realizan en el mes, teniendo e cuenta cuantos arreglos se realizaron, cual fue el valor de cada arreglo y al final mostrar el promedio de arreglos, esto lo utilizamos para llevar un manejo y control de ventas y arreglos realizados.

## Historia de usuario 

![WhatsApp Image 2023-06-20 at 7 41 52 AM (1)](https://github.com/Julgame/ProyectoJP/assets/136615870/55d81b23-ddef-4480-a385-c4beed7128b2)


## Caso de uso

![WhatsApp Image 2023-06-20 at 8 53 46 AM](https://github.com/Julgame/ProyectoJP/assets/136615870/38b2a9f2-c635-4419-a990-27fea532ee30)


## DFD
![WhatsApp Image 2023-06-20 at 7 44 22 AM](https://github.com/Julgame/ProyectoJP/assets/136615870/eb4c55d1-ce83-4683-af4f-f9a78a6834bd)


## Pseudocódigo
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
Escribir 'El promedio total de sus arreglos: ', pro

Escribir 'Cuantas veces desea repetir el proceso?'
Leer repeticiones

Para j <- 1 Hasta repeticiones Hacer
    total_arreglos <- 0

    Para i <- 1 Hasta a Hacer
        Escribir 'Ingrese el valor de arreglos'
        Leer arreglos

        total_arreglos <- total_arreglos+arreglos

    FinPara

    pro <- total_arreglos/a
    Escribir 'El promedio total de sus arreglos: ', pro

FinPara

