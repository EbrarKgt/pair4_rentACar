import React from 'react'
import { RentalModel } from '../../models/responses/RentalModel'

type Props = {
    rental: RentalModel
}

const RentalCard = (props: Props) => {
  return (
    <>
    <div className='flex flex-row w-[700px]'>
       <div className='flex'>
            <div className='h-16 object-fill' >
            <img src={props.rental.getCarByIdResponse.image} alt="" />
            </div>
            <div className='flex flex-row'>
                <div>
                    <div>Start Date</div>
                    <div>{props.rental.startDate}</div>
                </div>
                <div>
                    <div>End Date</div>
                    <div>{props.rental.endDate}</div>
                </div>
                <div>
                    <div>Total Price</div>
                    <div>{props.rental.totalPrice}</div>
                </div>
                <div>
                    <div>Driver Name</div>
                    <div>{props.rental.getUserByIdResponse.name}</div>
                </div>
                <div>
                    <div>Driver Surname</div>
                    <div>{props.rental.getUserByIdResponse.surname}</div>
                </div>
            </div>
       </div>
    </div>
    </>
  )
}

export default RentalCard