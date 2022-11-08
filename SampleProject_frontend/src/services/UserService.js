import axios from "axios";

const USERS_API_BASE_URL = "http://localhost:8080/users";

class UserService{

    getUsers(){
        return axios.get(USERS_API_BASE_URL);
    }

    searchUsers(query){
        return axios.get(`http://localhost:8080/usersBySearch`, { 
            params:{
                query:query
            }
        });
    }

}
export default new UserService()

