# 🍽️ Restaurante – Patrón Abstract Factory

Este proyecto implementa un sistema de menús para un restaurante aplicando el patrón de diseño **Abstract Factory**.  

El restaurante ofrece tres tipos de menús:  

- 🥗 **Vegetariano**  
- 🍷 **Gourmet**  
- 🥦 **Saludable**  

Cada menú está compuesto por: **Entrada, Plato principal, Bebida y Postre**.  

El diseño permite **desacoplar la creación de los diferentes productos** de cada menú, de manera que el restaurante puede generar distintos tipos de menús sin depender de clases concretas.  
Esto facilita la extensión del sistema para incorporar nuevos menús en el futuro.  

📊 **Diagrama UML del sistema:**

![Diagrama UML](Restaurante.png)
