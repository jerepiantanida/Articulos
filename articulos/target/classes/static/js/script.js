/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//VA A LLAMAR EL METODO CERRAR DESPUDES DE 3 EGIMDP
//TODO ELEMENTO QUE TENGA LA CLASE ALERT DESPUDES DE UN RETRASO DE 3 SEGUNDO VA A EJECURTAR UNA ANIMACION DE MEDIO SEGUNDO
//Y VA A EJECUTARSE UN HIDE(EJECUTAR) EL CUAL BUSCA LA CLASE ALERT EN EL LIST
setInterval('cerrar()', 3000);

function cerrar() {
    $(".alert").delay(300).slideUp(50, function() {
        $(this).hide();
    });
}



