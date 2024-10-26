# **Proyecto de Transformador de Monedas**

El proyecto consiste en la creación de una aplicación de consola que permite la gestión de monedas.

## 1. **Monedas Soportadas** 🪙

El transformador permite la conversión entre las siguientes monedas:

- 🇦🇷 **ARS** - Peso argentino
- 🇨🇱 **CLP** - Peso chileno
- 🇺🇸 **USD** - Dólar estadounidense
- 🇪🇸 **EUR** - Euro
- 🇲🇽 **MXN** - Peso mexicano

## 2. **Requisitos** 📉

### 2.1. **Requisitos funcionales** 📈 	

* El sistema debe permitir la conversión de dolares a pesos chilenos y viceversa. 💱
* El sistema debe permitir la conversión de euros a pesos chilenos y viceversa. 💱
* El sistema debe permitir la conversión de pesos chilenos a pesos argentinos. 💱
* El sistema debe permitir la conversión de pesos chilenos a pesos mexicanos. 💱

### 2.2. **Requisitos Previos** ⚙️

Antes de proceder, asegurate de tener estos programas en el equipo:

* ☕ **JDK 21**
* 🖥️ **IntelliJ IDEA** (Puede usar cualquier IDE de Java o editor de programación)
* 🌐 **Conexión a Internet** (Para obtener las tasas de cambio en tiempo real)

### 2.3. **Herramientas** 🛠️

* Java: Lenguaje de programación usada en la aplicación.
* Gson: Librería para la manipulación de datos JSON.
* GitHub: Repositorio de GitHub usado para el control de versiones.
* Exchange Rate API: API usada para obtener las tasas de cambio en tiempo real.

### 2.4. **Función de la Aplicación** 🚀

Siga estos pasos para usar el programa:

1. Clona el repositorio y navega al directorio del proyecto:

  ```bash
  mkdir transformador_monedas
  cd transformador_monedas
  git clone https://github.com/blackgoku-97/transformador_monedas.git 
   ```

2. Vaya a esta pagina https://mvnrepository.com/artifact/com.google.code.gson/gson/2.11.0 baja la libreria tiene que hacer click donde dice **.jar** le preguntara donde descargar por defecto en **descargas/downloads**
   (Depende el idioma de su equipo).

3. Abra el proyecto con el IDE ahora donde hay 3 barras como esta **-** ordenadas de arriba hasta abajo se abre **.** en el mismo orden. Se lista la barra en **File** haces click en **Project Structure** se abre unas opciones vas donde dice **Modules** busca la opcion +
   Elija la opcion 1 **JARs of directory** busca la libreria para importarla despues haces click en apply y ok dejas de las opciones.

4. Ahora revisa que este todo bien y ejecuta.

## 3. 🔄 **Funcionamiento**

La aplicación solicita una cantidad para el cambio de moneda. Utiliza la API **ExchangeRate-API** para obtener la tasa de conversión a tiempo real, con la ayuda de **Gson**, procesa la información en formato JSON. La transformación se realiza de manera eficiente, brindando resultados precisos y rápidos.

## 4. **Licencia** 📝

Este proyecto está licenciado bajo los términos de la [MIT License](LICENSE).
