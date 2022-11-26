import React, { useEffect, useState } from "react";
import { loadProductos } from "../server/server";

function TablaProductos() {

    const [listaProductos, setListaProductos] = useState([])
    async function listProductos() {
        try {
            const res = await loadProductos();
            setListaProductos(res);
        } catch (error) {
            console.log(error);
        }
    };
    console.log("lista productos", listaProductos);
    useEffect(() => {
        listProductos();
    }, [/* listProductos */]);

    return (
        
            <ul>{listaProductos.map((producto=>(
                <li key={producto.id}>{producto.nombre}</li>
            )))
                }
            </ul>
    )
}
export { TablaProductos }