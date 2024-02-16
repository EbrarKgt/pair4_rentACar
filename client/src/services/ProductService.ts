import axios, { AxiosResponse } from "axios";


const API_URL = "http://localhost:8080/api/cars";

class ProductService {
    getAll(): Promise<AxiosResponse<any, any>>{
        
        return axios.get(API_URL + "/get-all-cars");
    }
    getById(id:number) {
        return axios.get(API_URL + "/get/"+ id)
    }
}


export default new ProductService();