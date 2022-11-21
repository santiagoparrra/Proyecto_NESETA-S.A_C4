import React from "react";
import {NavLink} from "react-router-dom"

function Menu(){
    return(
        <nav>
            <ul>
                <li>
                    <NavLink>Inicio</NavLink>
                </li>
                <li>
                    <NavLink>Contactenos</NavLink>
                </li>
                <li>
                    <NavLink>Nuestros Productos</NavLink>
                </li>
            </ul>
        </nav>
    )
}
export{Menu}