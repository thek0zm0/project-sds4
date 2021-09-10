import BarChart from "components/BarChart";
import DataTable from "components/DataTable";
import DonutChart from "components/DonutChart";
import Footer from "components/footer";
import NavBar from "components/navbar";

function Dashboard() {
    return (
        <>
            <NavBar></NavBar>
            <div className="container">
                <h1 className="text-primary py-3">Sales Dashboard</h1>
                <div className="row px-3 ">
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">Success Percentage (%)</h5>
                        <BarChart></BarChart>
                    </div>
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">All Sales</h5>
                        <DonutChart></DonutChart>
                    </div>
                </div>
                <div className="py-3">
                    <h2 className="text-primary">All Sales</h2>
                </div>
                <DataTable></DataTable>
            </div>
            <Footer></Footer>
        </>
    );
}

export default Dashboard;