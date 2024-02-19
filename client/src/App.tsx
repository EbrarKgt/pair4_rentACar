import { Route, Routes } from "react-router-dom";
import "./App.css";
import Footer from "./components/Footer/Footer";
import Navbar from "./components/Navbar/Navbar";
import Homepage from "./pages/Homepage/Homepage";
import Contact from "./pages/Contact/Contact";
import ProductList from "./pages/ProductList/ProductList";
import Login from "./pages/Login/Login";
import Signin from "./pages/Signin/Signin";
import ProductDetail from "./pages/ProductDetail/ProductDetail";
import NotFound from "./pages/NotFound/NotFound";
import { ReactElement } from "react";
import BlogPage from "./pages/Blogpage/Blogpage";
import ArticlePage from "./pages/Blogpage/ArticlePage";


function App():ReactElement {


  return (
    <>
      <Navbar />
      <Routes>
        <Route path="/" element={<Homepage />}/>
        <Route path="/home" element={<Homepage />}/>
        <Route path="/contact" element={<Contact />}/>
        <Route path="/cars" element={<ProductList />}/>
        <Route path="/login" element={<Login />}/>
        <Route path="/register" element={<Signin />}/>
        <Route path="/cars/:id" element={<ProductDetail />}/>
        <Route path="*" element={<NotFound />}/>
        <Route path="/blog" element={<BlogPage />}/>
        <Route path="/blog/1" element={<ArticlePage />}/>
      </Routes>
      <Footer />
    </>
  )
}

export default App
