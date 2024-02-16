import { Requirement } from "./RequirementModel";

export interface ProductModel {
	id: number;
	plate: string;
	kilometer: number;
	dailyPrice: number;
	year: number;
	image: string;
	logo: string;
	modelName: string;
	colorName: string;
	brandName: string;
	seat: number;
	luggage: number;
	fuel: string;
	gear: string;
	requirement: Requirement;
}