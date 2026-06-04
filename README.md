# Calculadora Básica en Java

Calculadora de consola desarrollada en Java con operaciones encadenadas, historial por día y control de excepciones.

## Características

- Operaciones encadenadas con acumulador (el resultado de cada operación es la entrada de la siguiente)
- Suma, resta, multiplicación, división, potencias y raíces
- Historial de operaciones con hora y fecha
- Historial guardado en archivos `.txt` organizados por día
- Opción de listar y eliminar historiales anteriores
- Control de excepciones para entradas no válidas

## Estructura del proyecto

| Clase | Responsabilidad |
|-------|----------------|
| `Main` | Coordina el flujo del programa |
| `Calculadora` | Gestiona la lógica de cada operación |
| `Operaciones` | Métodos matemáticos (suma, resta, multiplicar, dividir, potencia, raíz) |
| `Historial` | Guarda, carga, lista y elimina historiales |
| `Menu` | Muestra el menú por pantalla |
| `Entrada` | Lectura segura de datos del usuario |

## Ejemplo de historial
18:30:07 | 1,00 + 2,00 = 3,00
18:30:11 | 3,00 * 5,00 = 15,00
18:30:19 | 15,00 / 3,00 = 5,00

## Tecnologías

- Java 21
