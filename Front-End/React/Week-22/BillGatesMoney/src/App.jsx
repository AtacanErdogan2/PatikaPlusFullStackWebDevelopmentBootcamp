import Header from "./components/Header";
import Money from "./components/Money";
import Card from "./components/Card";
import Spree from "./components/Spree";
import { ItemProvider } from "./ItemContext";

function App() {
  return (
    <ItemProvider>
      <div className="container">
        <Header />
        <Money />
        <Card />
        <Spree />
      </div>
    </ItemProvider>
  );
}

export default App;
