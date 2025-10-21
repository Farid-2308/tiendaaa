/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

import java.util.List;

/**
 *
 * @author Farid
 */
public class ProxyEnServivioClientes implements ServicioClientesProxy {
    private final ServicioClientes servicioReal;

    public ProxyEnServivioClientes(RepositorioClientes repo) {
        this.servicioReal = new ServicioClientes(repo);
    }    
        
    public void crearCliente(Cliente c){
        servicioReal.crearCliente(c);
    }

    @Override
    public void editarCliente(String id, String nombre, String email, String tel) {
        servicioReal.editarCliente(id, nombre, email, tel);
    }

    @Override
    public void eliminarCliente(String id) {
        servicioReal.eliminarCliente(id);
    }

    @Override
    public List<Cliente> listarClientes() {
        return servicioReal.listarClientes();
    }

    @Override
    public void agregarMetodoPago(String idCliente, MetodoPago mp) {
        servicioReal.agregarMetodoPago(idCliente, mp);
    }

    @Override
    public void eliminarMetodoPago(String idCliente, int metodoId) {
        servicioReal.eliminarMetodoPago(idCliente, metodoId);
    }
}
