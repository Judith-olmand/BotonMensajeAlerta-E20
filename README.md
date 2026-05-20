# Comunicación Mediante Diálogos de Alerta (Ejercicio 20)

Este proyecto implementa el uso de la clase `Alert`, la herramienta estándar de JavaFX para mostrar mensajes críticos, confirmaciones o información importante de forma modal y simplificada.

## 🚀 Funcionalidades
* **Diálogos Modales:** Utiliza ventanas de tipo `Alert` que bloquean la interacción con la ventana principal hasta que son cerradas, asegurando que el mensaje sea leído.
* **Tipos de Alerta:** Configura alertas de tipo `INFORMATION` para mensajes de confirmación positivos.
* **Personalización de Diálogo:** Define el título, el texto de cabecera (`headerText`) y el contenido del mensaje de forma independiente.
* **Control de Flujo:** Implementa el método `showAndWait()`, que pausa la ejecución del hilo de la interfaz hasta que el usuario pulsa "Aceptar".

## 🛠️ Estructura técnica
El código destaca por la eficiencia en el uso de componentes predefinidos:
* **`Alert(AlertType.INFORMATION)`**: Clase de alto nivel que ya incluye iconos y botones estándar (como el botón "OK") sin necesidad de crearlos manualmente.
* **`setHeaderText(null)`**: Técnica para simplificar el diseño visual de la alerta, eliminando la sección de encabezado para un mensaje más directo.
* **Instanciación Previa**: El objeto `Alert` se define fuera del evento del botón para optimizar recursos, disparando únicamente su visualización en la lambda.
* **Integración en Scene Graph**: A diferencia de los `Stage` manuales, las alertas no necesitan añadirse a un layout, ya que se gestionan como diálogos nativos del sistema.