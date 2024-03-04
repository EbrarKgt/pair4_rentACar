import React, { useEffect, useState } from 'react'
import { RentalModel } from '../../models/responses/RentalModel';
import ProductService from '../../services/ProductService';
import RentalCard from '../../components/RentalCard/RentalCard';

type Props = {}

const AdminPanel = (props: Props) => {
    const [rentals, setRentals] = useState<RentalModel[]>([]);

    useEffect(() => {
        fetchRentals();
      },[])

    const fetchRentals = () => {
        ProductService.getAllRentals().then((res:any) => {
            console.log(res.data)
            setRentals(res.data)
        })
    }

  return (
    <div className=''>
        <div className='flex flex-row'>
            <div className='w-48  bg-cyan-600'>

            </div>
            <div className='flex flex-col px-12'>
            {
                rentals.map(rental => (
                    <div key={rental.id}>
                        <RentalCard rental={rental} />
                    </div>
                ))
            }
            </div>
            <div>
                
            </div>
        </div>

    </div>
  )
}

export default AdminPanel