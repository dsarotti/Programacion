# Ejercicio 3

## Si se desea manejar información sobre, únicamente, las figuras geométricas punto, recta y circunferencia, ¿qué tipo de relación establecería entre ellas? Justifica tu respuesta.

### Respuesta:
     Clase Punto
        +int x
        +int y

    Clase Recta
        +Punto inicio
        +Punto fin

    Clase Circunferencia 
        +Punto centro
        +Double radio

    La clase punto guarda las coordenadas en 2 dimensiones de un punto concreto
    La clase recta guarda 2 objetos de la clase Punto que representan el inicio y el fin del segmento
    La clase Circunferencia guarda un punto que representa el centro de la circunferencia y el radio para representar su tamaño



## Codifica la solución que hayas propuesto junto con un programa que muestre un menú que permita crear los tres objetos de las clases indicadas y mostrar la información de los mismos.