# Llanquihue Tour App

## Descripción

Proyecto Java desarrollado para la actividad formativa de la semana 4 de Desarrollo Orientado a Objetos I.

El sistema permite leer información de tours turísticos desde un archivo de texto llamado `tours.txt`, crear objetos de tipo `Tour`, almacenarlos en un `ArrayList` y realizar operaciones de recorrido y filtrado.

## Estructura del proyecto

```text
LlanquihueTourApp
│
├── src
│   ├── model
│   │   └── Tour.java
│   │
│   ├── data
│   │   └── GestorDatos.java
│   │
│   └── ui
│       └── Main.java
│
├── resources
│   └── tours.txt
│
└── README.md
Clases del proyecto
Tour.java

Clase ubicada en el paquete model.

Representa un tour turístico y contiene los siguientes atributos:

nombre
tipo
precio

Incluye constructor, getters, setters y método toString().

GestorDatos.java

Clase ubicada en el paquete data.

Se encarga de leer el archivo tours.txt, separar los datos con .split(";"), crear objetos de tipo Tour y almacenarlos en un ArrayList.

Main.java

Clase ubicada en el paquete ui.

Ejecuta el programa principal. Muestra todos los tours cargados desde el archivo y luego aplica filtros para mostrar resultados específicos.

Funcionalidades
Lectura de archivo .txt.
Separación de datos usando .split(";").
Creación de objetos desde datos externos.
Almacenamiento de objetos en un ArrayList.
Recorrido de la colección.
Filtro por tipo de tour.
Filtro por precio mayor a $30.000.
Instrucciones de ejecución
Abrir el proyecto en IntelliJ IDEA.
Verificar que exista la carpeta resources.
Verificar que dentro de resources esté el archivo tours.txt.
Abrir la clase Main.java, ubicada en el paquete ui.
Ejecutar el método main.
Resultado esperado

Al ejecutar el programa, se mostrará en consola el listado completo de tours y luego los tours filtrados según las condiciones definidas en el código.

Autor

Javiera Saavedra