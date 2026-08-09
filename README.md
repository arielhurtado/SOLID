# Principios SOLID - Ejemplos en Código

[![Licencia MIT](https://img.shields.io/badge/Licencia-MIT-blue.svg)](LICENSE)

Este repositorio contiene ejemplos prácticos y didácticos para ilustrar cada uno de los **5 principios SOLID** de la programación orientada a objetos. Su objetivo es servir como guía de referencia y estudio, mostrando tanto implementaciones correctas como ejemplos de "código con olor" (symptom) que violan cada principio.

## 📚 Principios Incluidos

Cada principio se encuentra en su propia carpeta, con dos versiones:

| Principio | Descripción | Carpeta Correcta | Carpeta con Síntoma |
| :--- | :--- | :--- | :--- |
| **S** - Responsabilidad Única | Una clase debe tener una única razón para cambiar. | `1_UnicaRazon` | `1_UnicaRazon_Symptom` |
| **O** - Abierto/Cerrado | Las entidades deben estar abiertas para su extensión, pero cerradas para su modificación. | `2_ExtiendeNoModifiques` | `2_ExtiendeNoModifiques_Symptom` |
| **L** - Sustitución de Liskov | Los objetos de una clase derivada deben poder sustituir a objetos de su clase base sin alterar el comportamiento del programa. | `3_TalPadreTalHijo` | `3_TalPAdreTalHijoSol` |
| **I** - Segregación de Interfaces | Es mejor tener muchas interfaces específicas que una interfaz general. | `4_NoDependasNoNecesites` | `4_NoDependasNoNecesites_Symptom` |
| **D** - Inversión de Dependencias | Depender de abstracciones, no de implementaciones concretas. | `5_AbstractoBueno` | `5_AbstractoBueno_Symptom` |

> **Nota**: Los nombres de las carpetas son una representación nemotécnica del principio que ilustran.

## 🚀 Cómo Usar Este Repositorio

1.  **Clona el repositorio** en tu máquina local:
    ```bash
    git clone https://github.com/arielhurtado/SOLID.git
