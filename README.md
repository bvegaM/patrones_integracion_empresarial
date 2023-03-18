# Patrones de integración empresarial - Ejercicios

### Ejercicio 1: Solución de integracion de aplicaciones

**Problema**

La empresa XYZ ha implementado hace más de tres años una solución de ERP opensource Odoo, la cual la ha utilizado inicialmente on-premise, han tenido un crecimiento constante, paso de tener una oficina a tener 20 oficinas en todo el país, además de abrir presencia en plataformas para masificar sus productos y atraer a más clientes utilizando Facebook y WhatsApp para empresas, en donde de igual manera ha tenido una gran acogida; se empezaron a presentar problemas relacionado a la versión que tiene la empresa por lo que ha optado con migrar a la versión comercial en la nube del fabricante de Odoo, reduciendo los problemas de lentitud e intermitencia que tenían entre las diferentes oficinas, pero sin resolver los siguientes problemas:

* Facturación electrónica, provista por un proveedor local que dispone de una plataforma web, el proveedor ofrece su plataforma en la modalidad plataforma como servicio.
* Medios de pago, la empresa necesita recibir pagos por medio de transferencias bancarias, además con la finalidad de reducir los tiempos de respuesta en procesar pagos y despachar las ordenes de compra, la empresa XYZ logró conseguir que la institución financiera ABC le provee el botón de pagos para recibir pagos con tarjetas de débito y crédito, el botón de pagos tiene dos métodos para que la empresa XYZ pueda utilizarlo, ofrece una API y un plugin listo para usar en Odoo.
* Manejo de redes sociales, la empresa necesita una solución que le permita poder publicar productos y recibir pedidos por redes sociales, ya que actualmente utilizan Facebook y WhatsApp para empresas, que le permiten presentar sus productos y contactarse con los clientes para tomar sus pedidos, ya que actualmente si la empresa ofrece un nuevo producto una persona encargada de las redes realiza la publicación manual en la página de Facebook, si un cliente se contacta por medio de WhatsApp, de igual manera si la persona que maneja el dispositivo móvil con la cuenta empresarial revisa podrá ver que alguien escribió solicitando algún producto  o información, pero los clientes escriben no solo en horario laboral por lo que se necesita dar una respuesta a estos clientes.

Con este escenario establezca los posibles tipos de integración que se puede realizar entre los sistemas y plataformas, para presentar de una mejor manera su solución debe elaborar un diagrama utilizando el modelo C4, de igual manera para explicar mejor el como funcionará  y por que se tomó determinada opción, documente sus decisiones utilizando el formato ADR.

----

### Ejercicio 2: Integración fuera de linea

**Problema**

La empresa comercial XYZ tiene una cartera de clientes amplia a nivel nacional, más de 60 mil clientes, a sus clientes se les entrega una tarjeta de afiliación por medio de la cual los cliente realizan compras a crédito y tiene que de manera mensual realizar los pagos de sus compras, la cartera no se recupera de manera rápido teniendo deudas pendientes de cobrar, por lo que la empresa decide compartir información del historial de pagos con un empresa ML1 especializada en elaborar modelos de predicción para determinar si un cliente realizará o no el pago que le corresponde en el mes; la empresa ML1 le solicita información demográfica, la cantidad de días en los que realizó el pago, valores que tenia que pagar y el valor real del pago, posterior a establecer el intercambio de información, las empresas llegan a un acuerdo para que  de manera mensual la empresa XYZ genere la información en archivos planos y se los coloque en un buzón STP de la empresa ML1, posterior la empresa ML1 lee la información de este archivo para cargar en una data de datos y realizar el procesamiento.

Diseñe e implemente por medio de la utilización un framework de integración el proceso de lectura del archivo en formato CSV para posterior a realizar algunas validaciones básicas se ingrese esta información a la base de datos.


* El valor de la factura a pagar no puede ser menor o igual a cero.
* El valor pagado no puede ser menor o igual a cero.

Al finalizar la carga se solicita que se presente un log o registros en el cual se especifique la cantidad de información que se carga y la que presento errores de validación

---