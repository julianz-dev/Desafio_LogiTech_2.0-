# Actividad 3 - Java POO

Proyecto académico de **Programación Orientada a Objetos (POO) en Java)**.

Esta actividad trabaja principalmente los conceptos de:

- Herencia.
- Superclase y subclases.
- `extends`.
- `super`.
- Encapsulamiento.
- Sobrescritura de métodos.
- `@Override`.
- Polimorfismo.
- `ArrayList`.
- Validaciones.

## Ejercicios desarrollados

### 1. Transporte

`Transporte` es la **clase padre o superclase** de la actividad.

La clase contiene los siguientes atributos privados:

- `idTransporte`
- `combustible`
- `capacidadCarga`

Cuenta con un constructor que permite inicializar los datos principales del transporte.

También implementa los siguientes métodos:

- `setCombustible()`: permite establecer el nivel de combustible aplicando las validaciones indicadas en el ejercicio.
- `setCapacidadCarga()`: valida que la capacidad de carga no sea negativa.
- `viajar()`: realiza el consumo de combustible de acuerdo con la regla indicada en el enunciado.

La clase mantiene sus atributos como `private`, aplicando el principio de **encapsulamiento**.

### 2. CamionDeReparto

`CamionDeReparto` es una **subclase de `Transporte`**.

La clase contiene el atributo:

- `tieneRefrigeracion`

Utiliza `extends` para heredar de `Transporte`.

Su constructor utiliza `super(...)` para inicializar los atributos pertenecientes a la superclase:

```java
super(idTransporte, combustible, capacidadCarga);
```

La clase sobrescribe el método:

```java
viajar(int distancia)
```

utilizando la anotación:

```java
@Override
```

Cuando el camión tiene la refrigeración activa, el consumo de combustible es el doble del comportamiento normal establecido para `Transporte`.

Cuando la refrigeración no está activa, utiliza el comportamiento normal de la superclase mediante `super.viajar(...)`.

### 3. BuqueCarga

`BuqueCarga` es otra **subclase de `Transporte`**.

La clase contiene el atributo:

- `cantidadContenedores`

Su constructor utiliza `super(...)` para inicializar los atributos heredados de `Transporte` y posteriormente inicializa `cantidadContenedores`.

También implementa el método:

```java
atracarEnPuerto()
```

Este método muestra un mensaje indicando que el buque está listo para la descarga e incluye su identificador de transporte.

La clase también implementa:

```java
mostrarDatos()
```

para mostrar información básica del buque.

El enunciado solicita además calcular el **Costo de Viaje en USD**. Sin embargo, la fórmula, tarifa o base necesaria para realizar este cálculo **no aparece en la información disponible del ejercicio**, por lo que no se ha inventado una fórmula y este punto queda pendiente de confirmación con el profesor.

## Polimorfismo

La actividad demuestra el **polimorfismo** mediante una colección cuyo tipo de referencia corresponde a la superclase:

```java
ArrayList<Transporte> flota = new ArrayList<>();
```

En esta lista se pueden almacenar objetos de las subclases:

```java
flota.add(camion);
flota.add(buque);
```

Posteriormente, mediante un ciclo `for`, se invoca:

```java
transporte.viajar(100);
```

Aunque la variable utilizada en el ciclo es de tipo `Transporte`, Java ejecuta el comportamiento correspondiente al objeto real.

En el caso de `CamionDeReparto`, se ejecuta el método `viajar()` sobrescrito mediante `@Override`.

Esto permite demostrar la relación entre:

- Herencia.
- Sobrescritura.
- Tipo de referencia.
- Tipo real del objeto.
- Comportamiento dinámico.

## Estructura del proyecto

```text
src/
└── main/
    └── java/
        └── com/
            └── example/
                ├── Transporte.java
                ├── CamionDeReparto.java
                ├── BuqueCarga.java
                └── Main.java
```

## Conceptos de POO trabajados

- Clases y objetos.
- Encapsulamiento.
- Atributos privados.
- Constructores.
- Herencia.
- Superclase.
- Subclases.
- `extends`.
- `super`.
- Sobrescritura.
- `@Override`.
- Polimorfismo.
- `ArrayList`.
- Validaciones.

## Tecnologías utilizadas

- **Java**
- **Maven**
- **Visual Studio Code**
- **Git**
- **GitHub**

## Objetivo académico

Esta actividad busca fortalecer la comprensión de la **herencia y la reutilización de código** mediante la creación de una superclase y diferentes subclases.

También permite aplicar la **sobrescritura de métodos** y comprender el **polimorfismo** mediante referencias de tipo `Transporte` que pueden representar diferentes tipos de vehículos.

El objetivo es continuar desarrollando la capacidad de diseñar y relacionar clases utilizando los principios fundamentales de la **Programación Orientada a Objetos en Java**.
