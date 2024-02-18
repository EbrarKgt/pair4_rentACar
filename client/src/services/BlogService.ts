import axios, { AxiosResponse } from "axios";

const BLOG_API_URL = "http://localhost:8080/api/blogs"; // Assuming your blog posts are served from this endpoint

class BlogService {
    getAll(): Promise<AxiosResponse<any, any>> {
        // Assuming the endpoint for fetching all blog posts is "/get-all-blogs"
        return axios.get(BLOG_API_URL + "/get-all-blogs");
    }

    getById(id: number) {
        // Assuming the endpoint for fetching a specific blog post by ID is "/get/{id}"
        return axios.get(BLOG_API_URL + "/get/" + id);
    }
}

export default new BlogService();
