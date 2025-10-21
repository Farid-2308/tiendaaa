/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Clientes;

import java.util.List;

/**
 *
 * @author Farid
 */
public interface ServicioClientesProxy {
    void crearCliente(Cliente c);
    void editarCliente(String id, String nombre, String email, String tel);
    void eliminarCliente(String id);
    List<Cliente> listarClientes();
    void agregarMetodoPago(String idCliente, MetodoPago mp);
    void eliminarMetodoPago(String idCliente, int metodoId);
}
