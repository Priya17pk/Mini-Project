
import './App.css'
import Navbar from './pages/Navbar';

import {Routes, Route } from "react-router-dom";

import Home from "./pages/Home";

import Age from './pages/Age';
import AddVoter from './pages/AddVoter';



function App() {

  return (
    <>
    <Navbar></Navbar>
    
    
    <>
      <Routes>
        
        
          <Route path="/CandidateName"element={<AddVoter/>} />
          <Route path="Age" element={<Age/>} />
          <Route path="/home" element={<Home/>} />
          
         
       
      </Routes>
    </>
    
    </>

    

  )
}


export default App
