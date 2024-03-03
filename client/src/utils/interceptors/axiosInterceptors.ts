import axios from "axios";
import toastr, { error } from "toastr";

const axiosInstance = axios.create({ 
    baseURL: "http://localhost:8080/api/", 
});

axiosInstance.interceptors.request.use((config:any) => {
    const token = localStorage.getItem("jwtToken") || [];
    if(token) {
        config.headers.Authorization = `Bearer ${token}`;
        console.log(`Bearer ${token}`);
        console.log(config)
        return config;
    }}
    , error => {
        return Promise.reject(error);
    }
);

axiosInstance.interceptors.response.use(
    value => {
    console.log("Başarıllı bir cevap alındı..");
    return value;
    },
    error => {
        console.log("Bir hata ile karşılaşıldı",error);
        toastr.error(error.message);
        return error;
    },
);


export default axiosInstance;