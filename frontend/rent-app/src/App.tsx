import { ReactElement } from 'react';
import './App.css';
import "bootstrap/dist/css/bootstrap.css"
import Navbar from './components/Navbar/Navbar';
import { Route, Routes } from 'react-router-dom';
import Homepage from './pages/Homepage/Homepage';
function App(): ReactElement {
  return (
    <div style={{backgroundColor:"#DDDCD8"}}>
      <Navbar />
      <Routes>
        <Route path='/' element={<Homepage />}></Route>
      </Routes>
    </div>
  );
}

export default App;
