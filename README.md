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

2. Descarga la biblioteca Gson:

* Ve a Maven Repository - Gson - Gson 2.11.0.

* Haz clic en el enlace .jar para descargar la biblioteca. El archivo se descargará en la carpeta predeterminada de descargas/downloads depende el idioma de tu equipo.

3. Importa la biblioteca Gson en tu IDE:

* Abre el proyecto con tu IDE.

* Ve a la opción File > Project Structure.

* En el panel Modules, selecciona el signo + y elige JARs or directories.

* Busca la biblioteca Gson descargada y selecciónala para importarla.

* Haz clic en Apply y OK para confirmar.

4. Verifica la configuración y ejecuta el proyecto:

* Asegúrate de que todas las configuraciones estén correctas.

* Ejecuta el proyecto desde tu IDE.

## 3. 🔄 **Funcionamiento**

La aplicación solicita una cantidad para el cambio de moneda. Utiliza la API **ExchangeRate-API** para obtener la tasa de conversión a tiempo real, con la ayuda de **Gson**, procesa la información en formato JSON. La transformación se realiza de manera eficiente, brindando resultados precisos y rápidos.

## 4. **Licencia** 📝

Este proyecto está licenciado bajo los términos de la [MIT License](LICENSE).
