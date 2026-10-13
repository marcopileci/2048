# 2048	
	 	
# Introducción

El juego 2048 es un popular rompecabezas para un solo jugador en el que el jugador desliza fichas numeradas en una cuadrícula para combinarlas y crear una ficha con el número 2048. El juego se juega en una cuadrícula de 4 × 4; cada movimiento desplaza todas las fichas hacia arriba, abajo, izquierda o derecha y fusiona las fichas del mismo valor si chocan. El desafío consiste en administrar el espacio sabiamente y planificar los movimientos cuidadosamente para evitar quedarse atascado.

# Estructura del juego
Se deberá generar un tablero de 4 x 4 (Aunque esto se podría hacer para que sea más flexible, permitiendo ajustar el tamaño de la cuadrícula a la deseada). Al iniciar el juego, se generará un cuadrado de valor 2 en un lugar aleatorio del tablero.
Cada ficha tendrá su posición guardadas en coordenadas (X, Y como entero).
El jugador mueve todos los bloques hasta los extremos según la dirección en donde movió el dedo. Cada vez que se hace un movimiento, el juego deberá de generar una ficha nueva en una posición aleatoria de la cuadrícula con valor de 2. 
Cuando dos bloques del mismo valor numérico se chocan, se fusionaran en uno solo y se sumarán dependiendo de su valor (Ej: si dos 4 se chocan, se fusionaran en un solo bloque de valor 8).


Se deberá asimismo comprobar que ninguna ficha se sobreponga, que si chocan con una ficha que no es del mismo valor, esta no se fusione. Cuando el tablero se sature de fichas, habrá que verificar que el jugador al moverse en las cuatros direcciones no este avanzando, disparar la pantalla de Game Over.

El juego contará con variables de Puntaje, Contador de movimientos, e Historial de mejor puntaje.
Dependiendo del valor de las fichas que se funcione. Al jugador se le sumará una cantidad de puntos al puntaje actual.  


# CONTROL DE VERSIONES:
El control de versiones de este proyecto se manejara por versiones semántico.

¿Cuándo cambiar de versión? 

Cuando se resolvió un problema.
Cuando se agregó una función.
Cuando se resolvió un problema de seguridad.
Cuando se quiere probar algo que podría romper otras cosas uh que julepe.

# Repositorio de Github
Se creará un repositorio público en Github en donde se subirá las diferentes versiones del juego y en donde se aportarán los cambios e implementaciones realizadas por los distintos miembros del proyecto. 

# Sobre el uso de IA
Este proyecto está hecho con el fin de aprender el lenguaje Java y el uso de Android Studio.
La IA puede ser una herramienta de investigación útil y puede ser utilizada para aprender a como solucionar ciertos problemas, pero no reemplaza el juicio humano necesario para comprender e implementar correctamente lo que se está construyendo. El código que no entiendas no es código escrito por ti.
Haz lo que quieras, pero seguramente no se acepte código que tu no entiendas su funcionamiento, o que no funcione correctamente con el resto del codigo.




