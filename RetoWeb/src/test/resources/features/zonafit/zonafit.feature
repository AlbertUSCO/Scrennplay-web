# language: es
    Característica:realizar compra
      Yo como cliente de la pagina
      Quiero comprar productos en oferta
      Para obtener descuentos ahorrando dinero

      Antecedentes:
        Dado que el usuario se encuentra en el sitio web de ofertas

      Escenario: seleccion de productos en oferta
        Cuando El cliente agrega los productos al carrito
        Entonces El cliente podra visualizar los products en el carrito

      Escenario:realizar la compra
        Cuando El cliente selecciona los productos y finaliza la compra
        Entonces llenara el formulario, aceptara los terminos y tendra un numero de pedido



