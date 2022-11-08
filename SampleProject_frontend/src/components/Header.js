import React from "react";
import { Link, Navigate } from "react-router-dom";
import "./header.css";
import { useAuth } from "../utils/auth";

const Header = () => {
  const auth = useAuth();
  const handleLogout = () => {
    auth.logout();
    return <Navigate to="/" />;
  };

  return (
    <div className="home">
      <div className="header">
        <Link to="/search">
          <h2 className="header--title">Rally Health India</h2>
        </Link>

        <div className="header--profile">
          <button className="header-ProfileBtn" onClick={handleLogout} type="">
            Logout
          </button>
        </div>
      </div>

      <div className="container">
          <p>Hello {auth.user}, Who are you looking for?</p>
      </div>
    </div>
  );
};

export default Header;
