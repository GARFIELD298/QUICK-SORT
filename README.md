# Programa de Tabla Hash
Este proyecto lo hice para ordenar una lista de números que vienen en un archivo. Utilizo el algoritmo QuickSort, que es uno de los métodos de ordenamiento más rápidos y eficientes. El programa lee los datos, los ordena y luego los guarda nuevamente en un archivo ya acomodados.

## ¿Qué hace mi programa?
1. Primero abre un archivo llamado Entrada.txt.
2. Cada línea del archivo contiene un número que agrego a una lista.
3. Esa lista se convierte en un arreglo de enteros.
4. Al arreglo le aplico el algoritmo QuickSort para ordenarlo completamente.
5. Ya que termina el ordenamiento, el programa crea un archivo llamado Salida.txt.
6. En ese archivo se guardan todos los números, pero ahora ordenados de menor a mayor.
7. Finalmente, en la consola aparece el mensaje: "Ordenamiento terminado. Revisa Salida.txt".

## ¿Cómo funciona la función hash?
Selecciono como pivote el último elemento del arreglo.
Recorro los demás elementos para colocar a la izquierda los valores menores o iguales al pivote.
Intercambio posiciones para dejar el pivote en el lugar correcto.
Luego aplico QuickSort de manera recursiva a la parte izquierda y derecha del pivote.
Así se va ordenando toda la lista, dividiéndola en segmentos cada vez más pequeños.

Este proceso se repite hasta que ya no quede nada por dividir.

## Formato del archivo Entrada.txt
El archivo debe verse así:
10
3
5
8
16
20
1
4
6
11
7
14
12
15
9
13
18
2
17

Cada número debe ir en una línea diferente, que es como el programa los leerá.

## Archivos generados
Salida.txt → Aquí se guardan los números ya ordenados.
Ejemplo de cómo podría verse:
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
20

## Cómo lo ejecuto
Primero compilo el programa:
Luego lo ejecuto:

Debo asegurarme de que el archivo Entrada.txt esté en la misma carpeta del programa.
Cuando el programa termine, reviso el archivo Salida.txt para ver los números ordenados.


## ¿Para qué me sirve este proyecto?
Este proyecto me ayuda a practicar:
- Cómo funciona el algoritmo QuickSort
- Recursividad
- Métodos de partición
- Intercambio de elementos en un arreglo
- Lectura y escritura de archivos en Java
- Manejo de listas dinámicas y conversión a arreglos

Es un muy buen ejercicio para comprender algoritmos de ordenamiento y mejorar mi lógica de programación.