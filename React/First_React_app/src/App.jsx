import"./App.css";
import ProductTab from "./ProductTab.jsx";
import MsgBox from "./MsgBox.jsx";

function App() {
  return (
    <>
      <MsgBox userName="Harshada" textColor="Pink"/>
      <MsgBox userName="Harshu" textColor="Black"/>
      <ProductTab/>
    </> 
  );
}

export default App
