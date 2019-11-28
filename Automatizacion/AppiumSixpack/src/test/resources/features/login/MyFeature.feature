#Author: Wilmar Sánchez
@login
Feature: prueba de ingreso a la app

  @tag1
  Scenario Outline: CP002_niciar rutina en modo principiante
    Given Ingreso a la aplicacion
    When Iniciar plan de entrenamiento en modo "<dificultad>" y seleccionar el "<dia>" de entrenamiento
    Then validar inicio de la rutina

    Examples: 
      | dificultad   | dia |
      | principiante |   1 |
      | intermedio   |   2 |
      | avanzado     |   3 |
