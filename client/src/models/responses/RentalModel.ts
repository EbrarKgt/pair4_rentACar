import { ProductModel } from "./ProductModel";
import { UserModel } from "./UserModel";

export interface RentalModel {
    id: number;
	startDate: string;
	endDate: string;
	returnDate: string;
	startKilometer: number;
	endKilometer: number;
	totalPrice: number;
	getCarByIdResponse: ProductModel;
    getUserByIdResponse: UserModel;
}