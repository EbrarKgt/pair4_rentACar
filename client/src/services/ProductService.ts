import axios, { AxiosResponse } from "axios";


const API_URL = "http://localhost:8080/api/cars";
const API_URL_BRAND = "http://localhost:8080/api/brands";
const API_URL_RENTAL = "http://localhost:8080/api/rentals";

class ProductService {
    getAll(): Promise<AxiosResponse<any, any>>{
        
        return axios.get(API_URL + "/get-all-cars");
    }
    getById(id:number) {
        return axios.get(API_URL + "/get/"+ id)
    }
    getAllBrands(): Promise<AxiosResponse<any, any>> {
        return axios.get(API_URL_BRAND + "/get-all-brands");
    }
    getAllRentals(): Promise<AxiosResponse<any, any>> {
        return axios.get(API_URL_RENTAL + "/get-all-rentals")
    }
}


export default new ProductService();