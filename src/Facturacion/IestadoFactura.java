/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Facturacion;

/**
 *
 * @author nazar
 */
public interface IestadoFactura {
    void emitir(Factura factura);
    void anular(Factura factura);
    void pagar(Factura factura);
}
