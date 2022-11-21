import './App.css';
import { HashRouter, Route, Routes } from 'react-router-dom';
import { Menu } from "./Menu";
import { HomePage } from "./HomePage";

function App() {
  return (
    <HashRouter>
    <Menu/>
    <Routes>
      <Route path="/" element={<HomePage/>}/>
    </Routes>
    </HashRouter>
  );
}

export default App;
