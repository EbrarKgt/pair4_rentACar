import axios from 'axios';
import { Field, Form, Formik } from 'formik';
import React, { useState } from 'react'
import "./Reserve.css"
import Repair from '../Repair/Repair';
import DatePicker from "react-datepicker";

import "react-datepicker/dist/react-datepicker.css";

type Props = {
    setOpen: React.Dispatch<React.SetStateAction<boolean>>,
    carId: number | undefined,
}

const Reserve = (props: Props) => {
    // const [startDate, setStartDate] = useState(new Date());
    // console.log(startDate);
    

    const initialValues = {
        startDate: "",
        endDate: "",
    }

    const [rental, setRental] = useState({
        startDate: "",
        endDate: "",
        carId: 0,
        userId: 1,
    });


    const handleSubmit = (values: any) => {
        console.log(values.startDate);
        const rentalData = {
            startDate: values.startDate,
            endDate: values.endDate,
            carId: props.carId,
            userId: rental.userId,
        }
        console.log(rentalData);
        axios.post("http://localhost:8080/api/rentals/add", rentalData)
            .then((response) => {
                console.log(response);
            })
            .catch((error: any) => {
                if (error.response) {
                    console.log(error)
                }
            })
    }


    return (
        <>
            <div className='fixed left-0 top-0 bg-black flex justify-center items-center h-screen w-screen bg-opacity-60'>
                <div className='h-[250px] w-[900px] bg-rentWhite text-black shadow-md flex flex-col rounded-3xl relative'>
                    <div className='w-full'>
                        <div className='flex flex-row justify-end text-[30px] pr-2 text-black '>
                            <button onClick={() => props.setOpen(false)} className='hover:text-rentRed transition duration-400'><i className="fa-solid fa-circle-xmark"></i></button>
                        </div>
                    </div>
                    <div>
                        {/* Formik */}
                        <Formik initialValues={initialValues} onSubmit={handleSubmit}>
                            <Form>
                                {/* Dates */}
                                <div className='flex gap-8 pl-16 font-comfortaa'>
                                    <div className='flex flex-col'>
                                        <div className='text-[20px]'>Start Date</div>
                                        <div className='border-2'>
                                            <Field type="date" name="startDate" id="startDate" />
                                        </div>  
                                    </div>
                                    <div className='flex flex-col'>
                                        <div className='text-[20px]'>End Date</div>
                                        <div className='border 2'>
                                            <Field type="date" name="endDate" id="endDate" placeholder="EndDate" />
                                        </div>
                                    </div>
                                </div>
                                <div className='flex absolute right-4 bottom-4 h-10 w-32 rounded-full bg-zinc-300 justify-center hover:bg-rentYellow hover:scale-105 transition duration-500 font-comfortaa text-rentWhite'>
                                    <button type='submit' className='tracking-wider'><strong>Reservation</strong></button>
                                </div>
                            </Form>
                        </Formik>
                        {/* <div>
                            <div>
                                <DatePicker placeholderText='Start Date' selected={startDate} onChange={(date:any) => setStartDate(date)} dateFormat="yyyy/MM/dd" dateFormatCalendar="yyyy/MM/dd"/>
                            </div>  
                        </div> */}
                        <Repair />
                    </div>
                </div>
            </div>
        </>
    )
}

export default Reserve