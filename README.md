# Ejercicio Base
Ejercicio Base:

En su labor como programador de software ha sido elegido para el desarrollo de una aplicación que 
necesita un coordinador académico de un colegio, que desea calcular el promedio de 3 (tres) notas de 
un estudiante en un periodo determinado de un curso determinado. Este colegio evalúa a los 
estudiantes de forma permanente y calcula el promedio general del curso. Como información básica 
de cada estudiante se debe registrar el número de identificación, su nombre y el curso realizado.
Aclaraciones: 
• Se supondrá que la aplicación solo se requiere para calcular el promedio de un único periodo 
especifico.
• Para efectos de mantener la simplicidad del ejemplo no se contemplan manejar persistencia 
en el almacenamiento de los datos.
• No se realiza validación, ni se verifica calidad en los datos ingresados.


## Historia de usuario 

![WhatsApp Image 2023-06-20 at 7 41 52 AM (1)](https://github.com/Julgame/ProyectoJP/assets/136615870/55d81b23-ddef-4480-a385-c4beed7128b2)


## Caso de uso

![WhatsApp Image 2023-06-20 at 8 53 46 AM](https://github.com/Julgame/ProyectoJP/assets/136615870/38b2a9f2-c635-4419-a990-27fea532ee30)


## DFD

![DFG](https://github.com/Julgame/ProyectoJP/assets/136615870/fb60eb61-9c1c-4fc3-b36a-341a1fda78aa)


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

