#Author: Wilmar Sánchez
@login
Feature: prueba de ingreso a la app

  @tag1
  Scenario Outline: CP002_niciar rutina en modo principiante
    Given Ingreso a la aplicacion
    When seleccionar plan de entrenamiento en modo "<dificultad>"
    And seleccionar el "<dia>" de entrenamiento
    And iniciar la rutina
    Then validar inicio de la rutina

    Examples: 
      | dificultad   | dia |
      | principiante |   1 |

