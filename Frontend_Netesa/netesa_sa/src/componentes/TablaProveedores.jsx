import React, { useEffect, useState } from "react";
import { loadProveedores } from "../server/server";

function TablaProveedores() {

    const [listaProveedores, setListaProveedores] = useState([])
    async function listProveedores() {
        try {
            const res = await loadProveedores();
            setListaProveedores(res);
        } catch (error) {
            console.log(error);
        }
    };
    console.log("lista Proveedores", listaProveedores);
    useEffect(() => {
        listProveedores();
    }, [/* listProveedores */]);

    return (
        
            <ul>{listaProveedores.map((proveedor=>(
                <li key={proveedor.id}>{proveedor.nombre}</li>
            )))
                }
            </ul>
    )
}
export { TablaProveedores }
