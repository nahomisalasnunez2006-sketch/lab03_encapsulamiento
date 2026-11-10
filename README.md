# Laboratorio 03 — Encapsulamiento y Modificadores de Acceso

**Unidad:** 3 — Encapsulamiento y Modificadores de Acceso  
**Materia:** Programacion Orientada a Objetos  

---

## Preguntas de Reflexion

### 1. ¿Cual es la diferencia entre `private` y `protected`? ¿En que situacion usarias cada uno?
La diferencia principal esta en el nivel de acceso que le damos a los atributos o metodos:

- **`private`**: Es el nivel mas estricto. Solo la propia clase donde se declara puede ver o modificar ese atributo. Ninguna otra clase externa, ni siquiera las clases hijas que heredan de ella, pueden acceder directamente. Lo uso cuando quiero proteger datos sensibles para que solo se puedan cambiar mediante un setter que tenga validaciones.
- **`protected`**: Permite el acceso dentro de la misma clase, clases del mismo paquete y especificamente desde las **subclases** (clases hijas) mediante herencia. Lo uso cuando estoy diseñando una jerarquia de clases y quiero que las clases derivadas usen directamente un atributo sin pasar por un getter o setter, pero manteniendo la variable oculta para cualquier otra clase fuera de la herencia.

---

### 2. ¿Por que `marca` y `modelo` no tienen setter? ¿Que implica eso en el diseño?
- **Razon:** Un vehiculo no cambia de marca ni de modelo una vez que se fabrica o se crea en el sistema; son datos fijos que definen su identidad.
- **Implicacion en el diseño:** Al no incluir setters, hacemos que esos atributos sean de **solo lectura** despues de asignarse en el constructor. Esto asegura que nadie pueda modificar por error o de forma invalida la marca o el modelo del objeto despues de haber sido creado, manteniendo la informacion consistente durante todo el programa.

---

### 3. ¿Que pasaria si un setter no tuviera validacion y alguien pusiera un año negativo?
Si no le ponemos validaciones a los setters, el programa va a aceptar cualquier valor que coincida con el tipo de dato, guardando cosas sin sentido como un año `-500` o un numero de puertas negativo. 

Esto rompe la **integridad de los datos** del objeto, dejando que existan vehiculos en estados imposibles. Por eso el encapsulamiento es tan importante: los setters sirven como un filtro o barrera que revisa que los datos sean correctos antes de guardarlos en el atributo.