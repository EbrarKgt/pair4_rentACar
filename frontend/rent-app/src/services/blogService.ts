import axios from "axios";

// Blog gönderileri için API URL'si
const API_URL = "http://localhost:8080/api/blogposts";

class BlogService {
    getAll() {
       //get request
        return axios.get(API_URL);
    }

     //create, update, delete eklenebilir
}

export default new BlogService();
