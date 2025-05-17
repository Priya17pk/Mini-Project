import "./Navbar.css";

import { Link } from "react-router-dom";

function Navbar() {
  return (
    <>
      <div className="navbar">
        
        

        <nav className="navbar navbar-expand-lg bg-body-tertiary">
          <div className="container-fluid">
            <span className="navbar-brand">Election</span>
            <button
              className="navbar-toggler"
              type="button"
              data-bs-toggle="collapse"
              data-bs-target="#navbarNav"
              aria-controls="navbarNav"
              aria-expanded="false"
              aria-label="Toggle navigation"
            >
              <span className="navbar-toggler-icon"></span>
            </button>

            <div className="collapse navbar-collapse" id="navbarNav">
              <ul className="navbar-nav">
                <li className="nav-item">
                  <button className="nav-link active" id="home">
                   <Link to="/home">home</Link>
                  </button>
                </li>

                <li className="nav-item">
                  <button className="nav-link active" id="home">
                   <Link to="/CandidateName">Add Candidate</Link>
                  </button>
                </li>
                <li className="nav-item">
                  <button className="nav-link" id="result">
                    View-Result
                  </button>
                </li>
                <li className="nav-item">
                  <button className="nav-link disabled" aria-disabled="true">
                    View-Votes
                  </button>
                </li>
              </ul>
            </div>
          </div>
        </nav>
      </div>
    </>
  );
}

export default Navbar;
