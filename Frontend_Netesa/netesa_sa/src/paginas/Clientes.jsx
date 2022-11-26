import React, { useEffect, useState } from "react";
import Form from 'react-bootstrap/Form';
import { loadClientes } from "../server/server";

function Clientes() {

    const [listaClientes, setListaClientes] = useState([])
    async function listClientes() {
        try {
            const res = await loadClientes();
            setListaClientes(res);
        } catch (error) {
            console.log(error);
        }
    };
    console.log("lista Clientes", listaClientes);
    useEffect(() => {
        listClientes();
    }, [/* listClientes */]);

    function editar(id){
        console.log("el id es: ",id);
    }

    return (
        <div className="contenedor d-flex">

            <div className="seccion1 w-25 mx-3">
                <h3>Gestion de clientes</h3>
                <div className="row">
                    <div className="col-12">
                        <Form.Group className="mb-3" controlId="formBasicEmail">
                            <Form.Label>Nombre</Form.Label>
                            <Form.Control type="text" placeholder="nombre" />
                        </Form.Group>
                    </div>
                </div>
                <div className="row">
                    <div className="col-12">
                        <Form.Group className="mb-3" controlId="formBasicEmail">
                            <Form.Label>Nit</Form.Label>
                            <Form.Control type="number" placeholder="900....." />
                        </Form.Group>
                    </div>
                </div>
                <div className="row">
                    <div className="col-12">
                        <Form.Group className="mb-3" controlId="formBasicEmail">
                            <Form.Label>Celular</Form.Label>
                            <Form.Control type="number" placeholder="300..." />
                        </Form.Group>
                    </div>
                </div>
                <div className="row">
                    <div className="col-12">
                        <Form.Group className="mb-3" controlId="formBasicEmail">
                            <Form.Label>Correo</Form.Label>
                            <Form.Control type="text" placeholder="a@a.com" />
                        </Form.Group>
                    </div>
                </div>
                <div className="row">
                    <div className="col-12">
                        <Form.Group className="mb-3" controlId="formBasicEmail">
                            <Form.Label>Dirección</Form.Label>
                            <Form.Control type="text" placeholder="cll...." />
                        </Form.Group>
                    </div>
                </div>
                <div className="row">
                    <div className="col-12">
                        <button className="btn btn-block btn-warning mx-2">Agregar</button>
                        <button className="btn btn-block btn-success mx-2">Actualizar</button>
                    </div>
                </div>
            </div>

            <div className="seccion2 w-75 mx-4">
                <h3>Clientes Registrados</h3>
                <table className="table table-bordered">
                    <tr>
                        <td>Nit</td>
                        <td>Nombre</td>
                        <td>Celular</td>
                        <td>Correo</td>
                        <td>Direccion</td>
                        <td>Edit</td>
                    </tr>
                    {listaClientes.map((cliente => (
                        <tr>
                            <td>{cliente.nit}</td>
                            <td>{cliente.nombre}</td>
                            <td>{cliente.celular}</td>
                            <td>{cliente.correo}</td>
                            <td>{cliente.direccion}</td>
                            <td><button className="btn btn-warning btn-sm" onClick={editar(cliente.id)}>
                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-pencil-fill" viewBox="0 0 16 16">
                                    <path d="M12.854.146a.5.5 0 0 0-.707 0L10.5 1.793 14.207 5.5l1.647-1.646a.5.5 0 0 0 0-.708l-3-3zm.646 6.061L9.793 2.5 3.293 9H3.5a.5.5 0 0 1 .5.5v.5h.5a.5.5 0 0 1 .5.5v.5h.5a.5.5 0 0 1 .5.5v.5h.5a.5.5 0 0 1 .5.5v.207l6.5-6.5zm-7.468 7.468A.5.5 0 0 1 6 13.5V13h-.5a.5.5 0 0 1-.5-.5V12h-.5a.5.5 0 0 1-.5-.5V11h-.5a.5.5 0 0 1-.5-.5V10h-.5a.499.499 0 0 1-.175-.032l-.179.178a.5.5 0 0 0-.11.168l-2 5a.5.5 0 0 0 .65.65l5-2a.5.5 0 0 0 .168-.11l.178-.178z" />
                                </svg>
                            </button></td>

                        </tr>
                    )))
                    }
                </table>
            </div>
        </div>
    )
}

export { Clientes }