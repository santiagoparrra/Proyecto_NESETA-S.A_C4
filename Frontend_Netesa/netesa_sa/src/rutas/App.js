import '../App.css';
import { HashRouter, Route, Routes } from 'react-router-dom';
import { NavBar } from '../componentes/NavBar';
import { HomePage } from "../paginas/HomePage";
import { ContactPage } from "../paginas/ContactoPage";
import { BlogPage } from '../paginas/BlogPage';
import { NotFound } from '../paginas/NotFound';
import { TablaProductos } from '../componentes/TablaProductos';
import { Clientes } from '../paginas/Clientes';
import { Facturadores } from '../paginas/Facturadores';

function App() {
  return (
    <HashRouter>
      <NavBar/>
      <Routes>
        <Route path='/' element={<HomePage/>}/>
        <Route path='/contacto' element={<ContactPage></ContactPage>}/>
        <Route path='/blog' element={<BlogPage></BlogPage>}></Route>
        <Route path='/productos' element={<TablaProductos></TablaProductos>}></Route>
        <Route path='/clientes' element={<Clientes></Clientes>}></Route>
        <Route path='/facturadores' element={<Facturadores></Facturadores>}></Route>
        <Route path='*' element={<NotFound></NotFound>}></Route>
      </Routes>
    </HashRouter>
  );
}

export default App;
