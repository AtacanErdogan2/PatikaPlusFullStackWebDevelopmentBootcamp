import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import Hero from './components/HeroSection/Hero';
import Stat from './components/StatSection/Stat';
import Class from './components/ClassSection/Class';
import { DataProvider } from "./contexts/DataContext";

function App() {
 
  return (
    <DataProvider>
    <Hero />
    <Stat />
    <Class />
    </DataProvider>
  );
}

export default App
