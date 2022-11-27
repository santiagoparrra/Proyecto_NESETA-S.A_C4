import { React } from "react";
import { NavLink } from "react-router-dom";

function NavBar() {
    return (
        <nav className="navbar navbar-expand-lg navbar-light bg-light">
            <div className="collapse navbar-collapse" id="navbarNav">
                <ul className="navbar-nav">
                    <li className="nav-item active">
                        <NavLink className="nav-link" to="/">Home</NavLink>
                    </li>
                    <li className="nav-item">
                        <NavLink className="nav-link" to="/contacto">Contacto</NavLink>
                    </li>
                    <li className="nav-item">
                        <NavLink className="nav-link" to="/blog">Blog</NavLink>
                    </li>
                    <li className="nav-item">
                        <NavLink className="nav-link" to="/productos">Productos</NavLink>
                    </li>
                    <li className="nav-item">
                        <NavLink className="nav-link" to="/clientes">Clientes</NavLink>
                    </li>
                    <li className="nav-item">
                        <NavLink className="nav-link" to="/facturadores">Gst. Facturadores</NavLink>
                    </li>
                    
                </ul>
            </div>
        </nav>
    )
}

export { NavBar }