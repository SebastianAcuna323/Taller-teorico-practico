#Ejercicios de programación II - Clase 5/08/2025

En este archivo .md tendra actividades tanto teoricas como practicas sobre git y java.

#Contenido
* Actividades teoricas de investigación sobre git
* Actividades teoricas de investigación sobre java
* Ejercicios practicos en java (se veran en los archivos de los codigos)


#Parte teorica 

##Git

1. ¿Qué es un repositorio en Git y cómo se diferencia de un proyecto “normal”?

    *Un repositorio en git es un espacio donde se puede almacenar un proyecto, donde se puede ver el historial de cambios, diferentes versiones, registros de cambios entre mas cosas, con el fin de poder ver quien realiza cambios y poder revertir estos

    *La diferencia entre un proyecto normal a uno de git es que un proyecto normal no se puede manejar versiones es decir que al hacer cambios un proyecto normal no guardara el registro para saber que cambios se hicieron lo que causa que para en encontrar los cambios haya que revisar detalladamente el proyecto y cambiarlos manualmente, por otro lado el proyecto en git hace esto automaticamente dando mas facilidad a la hora de hacer cambios

2. ¿Cuáles son las tres áreas principales de Git (working directory, staging area/index y
repository) y qué papel cumple cada una?

**Working Directory**
    Es donde se trabaja directamente con los archivos, donde se crea, edita o elimina codigo o documentos.
    Su papel es detectar los cambios que se hacen comparandolos con la ultima version que hay guardada del proyecto

**Staging Area/Index**
    Es donde se quedan seleccionados los archivos que se desean incluir en proximo commit .
    Su papel es preparar los cambios que se hicieron en el proyecto para posteriormente guardarlos

**Repository**
    Es donde git almacena de forma permanente las versiones del proyecto que se van subiendo.
    Su papel es guardar los cambios que se ralizaron para tenerlos registrados

3. ¿Cómo representa Git los cambios internamente? (objetos blob, tree, commit y tag).

    **Blob**
    Con el blob representa el contenido es decir guarda exactamente los datos de cada archivo
    **Tree**
    Tree representa un carpeta o directorio, organiza y conecta los blob y otras carpetas (tree)
    **Commit**
    Representa un version del proyecto, guarda la ultima version
    **Tag**
    Representa un marcador para los commits con el fin de identificar una versión especifica

4. ¿Cómo se crea un commit y qué información almacena un objeto commit?


    para crear un commit hay que hacer una serie de pasos, primero hay que iniciar git en la terminal, posteriormente registrar las credenciales del usuario, conectarse con el repositorio, ahora si siguen los pasos del commit seria escribir git add y luego se guarda el cambio con git commit -m, esto genera un nuevo registro.
    El commit almacena el proyecto que se esta creando junto a el autor, la fecha y la hora, en el caso que ya haya un proyecto almacena, referencias al commit anterior y un mensaje que relate los cambios

5. ¿Cuál es la diferencia entre git pull y git fetch?

    La diferencia es que git fetch descarga los cambios del repositorio remoto pero no los aplica a la rama actual, git pull descarga los cambios y los fusiona automaticamente los cambios remotos a la rama actual

6. ¿Qué es un branch (rama) en Git y cómo Git gestiona los punteros a commits?

    Un branch es un puntero que señala un commit especifico del historial del proyecto.
    Git gestiona estos punteros moviendolos automaticamente al ultimo commit que se hizo

7. ¿Cómo se realiza un merge y qué conflictos pueden surgir? ¿Cómo se resuelven?

    Primero que nada un merge se realiza cuando se desea combinar los cambios de una rama con otra, se realiza primero asegurando se de que la rama sea la correcta, luego con el codigo git merge "nombre de la rama", esto le idica a git que combine la rama actual con la rama especificada.
    Los conflictos pueden ser archivos eliminados en una rama lo que causa que se modifique tambien en otra, cambios incompatibles en la estructura del proyecto, las dos ramas hayan modificado una linea de diferente forma, entre otras.
    La principal manera para resolver esto es editando los archivos con los conflictos para asi dejar la version correcta

8. ¿Cómo funciona el área de staging (git add) y qué pasa si omito este paso?

    Funciona como ina zona de preparacion para el proximo commit, cuando se realizan cambios git no los registra automaticamente hasta que se les indique con el git add espera al commit para registrarlos.
    Si este paso se omite los cambios no se incluiran en el commit aunque esten en el proyecto

9. ¿Qué es el archivo .gitignore y cómo influye en el seguimiento de archivos?

    El archivo .gitignore se un archivo que indica qué archivos o carpetas deben ser ignorados por el sistema de control de versiones lo que quiere decir que no los incluira en el area staging ni en proximos commits.
    Influye ya que este le indica que archivo no debe incluir en el historial del proyecto

10. ¿Cuál es la diferencia entre un “commit amend” (--amend) y un nuevo commit?

    La diferencia es que el commit amend modifica el ultimo commit sin crear uno nuevo, se puede corregir el mensaje commit anterior o añadir cambios que se olvidaron, un nuevo commit agrega un nuevo registro al historial del proyecto

11. ¿Cómo se utiliza git stash y en qué escenarios es útil?

    El git stash se usa para guardar temporalmente cambios que hay en el directorio de trabajo y en el area staging sin necesidad de hacer commit.
    Algunos escenarios en los que puede ser util pueden ser, probar un cambio urgente en otro punto del proyecto sin hacer commit, cambiar de rama sin perder el trabajo actual, evitar commits innecesarios, entre otras

12. ¿Qué mecanismos ofrece Git para deshacer cambios (por ejemplo, git reset, git
revert, git checkout)?

**Git reset**
Mueve puntero de la rama a un commit anterior, segun cada opcion usada se puede modificar o descartar cambios en el area staging y en el directorio de trabajo
**Git revert**
Crea un nuevo commit con el fin de revertir los cambios que se hicieron en un commit anterior manteniendo el historial intacto
**Git checkout**
Este permite restaurar archivos individuales a un estado anterior o moverse a otro commit sin alterar el historial general
**Git restore**
Este comando se puede usar en reemplazo de git checkout ya que permite descartar cambios del area de trabajo o restaurarlos desde un commit anterior
**Git clean**
Elimina archivos no rastreados y que no están en .gitignore, es muy útil para limpiar el directorio de trabajo
**Git reflog**
Permite ver todo el historial de movimientos de punteros y esto facilita recuperar commits perdidos

13. ¿Cómo funciona la configuración de remotos (origin, upstream) y qué comandos uso
para gestión de forks?

**Origin**
Es el remoto principal del cual se clona el repositorio en el se hace el push y pull
**Upstream**
Se usa cuando se trabaja un fork, sirve para mantener una copia sincronizada con los cambios del proyecto original

**Comandos para gestion de forks**

+ git remote add upstream "url"

*Esto te permite acceder a los cambios del repositorio original desde el que hiciste el fork*

+ git remote -v

*Muestra los remotos actuales y sus url*

+ git fetch upstream

*Trae los commits más recientes de upstream*

+ git merge upstream/main

*Fusiona los cambios de upstream en la rama local*

14.  ¿Cómo puedo inspeccionar el historial de commits (por ejemplo, git log, git
diff, git show)?

**Git log**
El nos muestra una lista de los commits realizados en el repositorio
**Git diff**
El nos muestra las diferentes versiones de archivos 
**Git show**
El nos muestra informacion detallada de un commit especifico
**Git reflog**
Nos muestra el historial reciente de todos los movimientos incluyendo commits eliminados

##Programación

15. ¿Cuáles son los tipos de datos primitivos en Java?
    
    En java existen 8 tipos de datos primitivos estos son:
    + Byte
    + Short
    + Int
    + Long
    + Float
    + Double
    + Char
    + Boolean

16. ¿Cómo funcionan las estructuras de control de flujo como if, else, switch y bucles en
Java?

  **If**
  Se usa para tomar decisiones, evalua una condicion booleana, en base a dos condiciones true o false
  **Else**
  Se usa junto al if para indicar que se hace cuando la condicion del if no se cumple 
  **Else if**
  Permite agregar condiciones adicionales entre un if y un else
  **Switch**
  Se usa cuando se quiere comparar una misma variable con varios valores posibles
  **For**
  Se usa para saber cuantas veces se quiere repetir una accion en el codigo
  **While**
  Ejecuta un bucle de codigo mientras la condicion sea verdadera
  **Do while**
  Es parecido al while, pero en este caso, el bucle se ejecuta primero, y la condición se evalúa después, esto quiere decir que el codigo se ejecuta al menos una vez sin importar que sea verdadera o falsa.

17.  ¿Por qué es importante usar nombres significativos para variables y métodos?

    Es importante porque asi queda mas claro que significa cada variable o metodo, evita confusiones, errores, ayuda a buenas practicas y puede facilitar el mantenimiento del codigo.

18.  ¿Qué es la Programación Orientada a Objetos (POO)?

    Es un estilo de programación que organiza el codigo en objetos, los cuales representan cosas del mundo real, cada objeto cuenta con atributos los cuales son datos y caracteristicas, y los metodos que son las acciones que van a hacer

19.  ¿Cuáles son los cuatro pilares de la Programación Orientada a Objetos?

    Los cuatro pilares del poo son:

    + Encapsulamiento
      Este consiste en ocultar datos internos de un objeto y controlar el acceso a ellos mediante metodos

    + Abstracción
      Permite mostrar solo lo esencial de un objeto y ocultar detalles mas complejos
    
    + Herencia
      Consiste en heredar atributos o metodos de otra clase

    + Polimorfismo
      Permite que un mismo metodo actue de formas distintas segun el objeto que lo utilice

20.  ¿Qué es la herencia en POO y cómo se utiliza en Java?

    Como ya se habia dicho en el punto anterior, la herencia en poo es un pilar que su funcion es heredar atributos o metodos de otra clase.
    Se utiliza con la palabra extens, esta se coloca al definir una clase para indicarle que hereda otra, lo que quiere decir que heredara atributos o metodos de la clase "padre" todo esto sin necesidad de volver a escribir el codigo

21.  ¿Qué son los modificadores de acceso y cuáles son los más comunes en Java?
    
    Son palabras claves que definen el nivel de acceso que tienen las clases, metodos y atributos desde otras partes del programa, esto sirve para proteger la informacion

    Los modificadores mas comunes en java son:

    **Public**
    Este significa que es accesible desde cualquier parte del programa 

    **Private**
    Significa que solo es accesible dentro de la misma clase

    **Protected**
    Significa que es accesible desde la misma clase, el mismo paquete y también desde las subclases

22. ¿Qué es una variable de entorno y por qué son importantes para Java o la
programación en general?

    Es un valor definido en el sistema operativo que influye en cómo se ejecutan los procesos o programas. Funciona como una especie de configuración global que los programas pueden leer para adaptar su comportamiento sin modificar su código.
    Son importantes porque permiten configurar aspectos clave del entorno de ejecución sin necesidad de modificar el código fuente, además, estas variables se usan para definir rutas, credenciales o configuraciones específicas que hacen que una aplicación sea más segura, portable y fácil de mantener
