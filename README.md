# Ejercicio Grep

**Repositorio Github**: https://github.com/TingusC/process_grep

### Enunciado: 
>Escribir en la entrada de un proceso desde el programa padre.
El proceso padre lanzará el comando grep de Linux con el argumento "psp" (grep PSP) y escribirá en la entrada del proceso hijo el siguiente contenido (en diferentes lineas): 

>Me gusta PSP y java
PSP se programa en java
es un módulo de DAM
y se programa de forma concurrente en PSP
PSP es programación

### Explicación del código:

Se inicia creando un proceso utilizando *Runtime* que recibe un array de String (*String[]*) con el comando a ejecutar. Posteriormente ejecuta dos metodos consecutivamente. Uno para mandar el texto deseado al proceso, este caso *grep*, y otro para recoger la salida del mismo. Finalmente comprueba que todo el proceso se ha realizado correctamente devolviendo los resultados en tal caso o un mensaje de error en caso contrario.

Se han realizado dos tres metodos:

- ~~writeOnProcess()~~ *escribir()*: recibe el proceso previamente creado y un array de String con los mensajes a escribir en el proceso.

- ~~getImputProcess~~ *obtenerSalida()*: recibe el proceso y devuleve un String con la salida de este.

- *obtenerComandoFinal()*: rcibira el array de String con los comandos y el String parametro y los une para obtener el comando final que utilizara el programa.

### Notas:

1. No se han configurado los Test de *JUnit* aunque se agregaron las dependencias al archivo *pom*.

1. Se han realizado algunos cambios tras las sugerencias en el repaso en clase.

1. El metodo *obtenerComandoFinal()* creo que no es el más eficiente ni el más correcto.