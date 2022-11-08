import React, { useEffect, useState } from "react";
import Form from "react-bootstrap/Form";
import UserService from "../services/UserService";
import "./Searchbar.css";
import InputGroup from "react-bootstrap/InputGroup";


function SearchBar() {
  const [query, setQuery] = useState("");
  const [users, setUsers] = useState([]);
  const [filteredUsers, setFilteredUsers] = useState(users);

  useEffect(() => {
    getUsers();
  }, []);

  const getUsers = () => {
    UserService.getUsers().then((response) => {
      setUsers(response.data);
      setFilteredUsers(response.data);
    });
  };

  const handleQuery = (event) => {
    setQuery(event.target.value);
  };
  const handleSearch = (e) => {
    e.preventDefault();
    UserService.searchUsers(query).then((response) => {
      setFilteredUsers(response.data);
    });
  };

  return (
    <div className="searchComponent">
      <div className="searchContainer">
        <InputGroup size="lg" className="mb-3">
          <Form.Control
            className="formSearch"
            placeholder="Search for healthcare providers..."
            aria-label="Recipient's username"
            aria-describedby="basic-addon2"
            onChange={handleQuery}
          />
          <button
            className="searchBtn"
            variant="outline-secondary"
            onClick={handleSearch}
            id="button-addon2"
          >
            Search
          </button>
        </InputGroup>
      </div>

      <div className="homeContainer">
        {filteredUsers.map((user) => (
          <div className="vertical">
            <div className="HCPcard" key={user.id}>
              <img src="/pcpIcon.svg" alt="" className="img" />
              <div className="hcpInfo">
                <div className="alignleft">
                  <h3 className="HCPName">
                    {user.full_name}, {user.designation}
                  </h3>
                  <p>{user.qualification}</p>
                  <br></br>
                  <p>{user.address_line1}</p>
                  <p>{user.address_line2}</p>
                  <p>{user.phoneNo}</p>
                  <p className="PName">
                    0.7 Miles Away <br></br>
                    View Additional Location(6)<br></br>
                    View Enrollment information
                  </p>
                </div>
                <div className="alignright">
                  <p>
                    Not Evaluated from Premium Care<br></br>
                    Accepting All Patients
                  </p>
                </div>
              </div>
            </div>
            <div className="Offc">
              <p>
                Office Visit - Primary Doctor - Esatblished Patient - Moderate
                Complexity
              </p>
            </div>
            <br></br>
            <br></br>
          </div>
        ))}
      </div>
    </div>
  );
}

export default SearchBar;
