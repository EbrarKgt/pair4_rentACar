import { ReactElement } from 'react';
import './App.css';
import logo from "./pair4ImageTest.jpg"
import "bootstrap/dist/css/bootstrap.css"

function App(): ReactElement {
  return (
    <div className='App App-header'>
      <img src={logo} className='border border-5 App-logo' alt="logo" />
      <p>PAIR 4 RENT A CAR</p>
    </div>
  );
}

export default App;
