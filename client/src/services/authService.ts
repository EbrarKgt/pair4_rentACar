import axiosInstance from "../utils/interceptors/axiosInterceptors";

class AuthService {
    login(loginModel:any){
        return axiosInstance.post("auth/login", loginModel);
    }
    register(registerModel:any){
        return axiosInstance.post("auth",registerModel);
    }
}

export default new AuthService();