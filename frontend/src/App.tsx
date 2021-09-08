import DataTable from "components/DataTable";
import Footer from "components/footer";
import NavBar from "components/navbar";

function App() {
  return (
    <>
      <NavBar></NavBar>
      <div className = "container">
        <h1 className="text-primary">Hello World</h1>
        <DataTable></DataTable>
      </div>
      <Footer></Footer>
    </>
  );
}

export default App;
