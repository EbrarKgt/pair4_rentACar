import ReactDOM from 'react-dom/client'
import App from './App.tsx'
import './index.css'
import { BrowserRouter } from 'react-router-dom'
import ScrollToTop from './components/ScrollToTop/ScrollToTop.tsx'
import { Provider } from 'react-redux'
import { store } from './store/configureStore.ts'
import "toastr/build/toastr.css"

ReactDOM.createRoot(document.getElementById('root')!).render(
  
  // Redux Toolkit
  <Provider store={store}>
    <BrowserRouter>
      <ScrollToTop />
      <App />
    </BrowserRouter>
  </Provider>
  ,
)
