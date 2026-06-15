PaCEMan - Estructura Java

Como compilar
=============

Este proyecto usa Java puro, sin Maven ni Gradle. Para compilarlo desde la
raiz del proyecto, ejecuta en PowerShell:

    $files = Get-ChildItem -Recurse -Filter *.java -Path src | ForEach-Object { $_.FullName }
    javac -d out $files

El comando genera los archivos .class dentro de la carpeta out.

Requisitos
==========

- Tener Java JDK instalado.
- Verificar que javac este disponible:

    javac -version

Como ejecutar
=============

Actualmente el proyecto contiene la estructura de paquetes y clases del
diagrama, pero no incluye una clase Main obligatoria.
