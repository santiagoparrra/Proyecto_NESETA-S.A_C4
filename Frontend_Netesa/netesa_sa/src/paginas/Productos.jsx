import { React, useEffect, useState } from "react";

function PruebaPage(){

    const [listaProductos, setListaProductos] = useState([])
    function listProductos(){
        const options = {method:'GET'}
        fetch('http://localhost:8080/productos', options)
            .then(response => response.json())
            /* .then(json => console.log(json)) */
            .then(response => {
                setListaProductos(response);
            })
            .catch(err => console.error(err));
    }

        useEffect(()=>{
            listProductos();
        },[])

    return(
        <div className="container mt-4">
            <table class="table table-bordered table-info">
                <tr>
                    <td>Nombre</td>
                    <td>Marca</td>
                    <td>Precio</td>
                </tr>
                {listaProductos.map((producto)=>(
                    <tr>
                    <td>{producto.nombre}</td>
                    <td>{producto.marca}</td>
                    <td>{producto.precio}</td>
                    </tr>
                ))}
            </table>
        </div>
    )
}

export { PruebaPage }