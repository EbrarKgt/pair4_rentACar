import { AxiosResponse } from "axios";
import axiosInstance from "../utils/interceptors/axiosInterceptors";




class ProductService {
    getAll(): Promise<AxiosResponse<any, any>>{
        
        return axiosInstance.get("cars/get-all-cars");
    }
    getById(id:number) {
        return axiosInstance.get("cars/get/"+ id)
    }
    getAllBrands(): Promise<AxiosResponse<any, any>> {
        return axiosInstance.get("brands/get-all-brands");
    }
    getAllRentals(): Promise<AxiosResponse<any, any>> {
        return axiosInstance.get("rentals/get-all-rentals")
    }
}


export default new ProductService();