import React, { useEffect, useState } from 'react'
import { ProductModel } from '../../models/responses/ProductModel'
import ProductService from '../../services/ProductService'
import { useParams } from 'react-router-dom'

type Props = {}

const ProductDetail = (props: Props) => {
  const params = useParams<{ id: string }>()
  const [product, setProduct] = useState<ProductModel>()
  useEffect(() => {
    if (params.id) {
      ProductService.getById(parseInt(params.id)).then(response => {
        setProduct(response.data);
      });
    }
  }, [params.id]);

  return (
    <>
      {/* Car Detail */}
      <div className='container flex flex-col shadow-xl my-12 pt-4'>
        {/* Content */}
        <div className='flex flex-row border-b-2 justify-between '>
          {/* Left Content */}
          <div className='flex flex-col h-96 w-[576px] justify-center'>
            {/* Image */}
            <div className='flex object-fill pl-16'>
              <img src={product?.image} alt="car-image" className='rounded-lg' />
            </div>
          </div>
          {/* Right Content */}
          <div className='flex flex-col w-[500px]'>
            {/* Car Title */}
            <div className='flex flex-row items-center text-2xl font-comfortaa'>
              <img src={product?.logo} alt="car-logo" className='rounded-lg h-24  aspect-3/2 w-[10%] object-contain' />
              <strong className='flex pl-10 '>{product?.brandName}</strong>
              <strong className='flex pl-2'>{product?.modelName}</strong>
            </div>
            {/* Car Info */}
            <div className='flex flex-row gap-10 tracking-wide'>
              {/* Car Properties */}
              <div className='w-56 border-r-2'>
                <div className='text-2xl tracking-wide pb-4'>
                  <p>Car Properties</p>
                </div>
                <div className='text-md font-comfortaa text-gray-600 flex flex-col gap-[14px]'>
                  <div><span className='font-black text-md pr-2'><i className="fa-solid fa-user text-[20px]"></i></span> {product?.seat} Seats</div>
                  <div><span className='font-black text-md pr-[10px]'><i className="fa-solid fa-suitcase-rolling text-[22px]"></i></span> {product?.luggage} Luggage Count</div>
                  <div><span className='font-black text-md pr-[6px]'><i className="fa-solid fa-gear text-[20px]"></i></span> {product?.gear}</div>
                  <div><span className='font-black text-md pr-1'><i className="fa-solid fa-gas-pump text-[22px]"></i></span> {product?.fuel}</div>
                  <div><span className='font-black text-md pr-1'><i className="fa-solid fa-industry text-[20px]"></i></span> {product?.year} Model</div>
                  <div><span className='font-black text-md pr-1'><i className="fa-solid fa-paintbrush text-[20px]"></i></span> {product?.colorName}</div>
                </div>
              </div>
              {/* Requirements */}
              <div className='w-52'>
                <div className='text-2xl tracking-wide pb-4'>
                  <p>Requirements</p>
                </div>
                <div className='text-md font-comfortaa text-gray-600 flex flex-col gap-[14px]'>
                  <div><span className='font-black text-md pr-[10px]'><i className="fa-solid fa-calendar-days text-[22px]"></i></span>Min Age {product?.requirement.minAge}</div>
                  <div><span className='font-black text-md pr-2'><i className="fa-solid fa-id-card text-[19px]"></i></span>Min Driver License {product?.requirement.minLicense}</div>
                  <div><span className='font-black text-md pr-2'><i className="fa-solid fa-credit-card text-[19px]"></i></span>Min Credit Card {product?.requirement.minCredit}</div>
                </div>
              </div>
            </div>
          </div>
        </div>
        {/* Sub Info */}
        <div className='flex flex-row w-full h-24 justify-between items-center '>
          {/* Left Content */}
          <div className='w-150 h-12 flex flex-col justify-center font-comfortaa'>
            <div className='flex flex-row gap-x-4 items-center'>
              <div className='flex flex-col w-36 h-6 ml-4 text-md justify-center '><strong className='text-5xl text-transparent tracking-tight bg-gradient-to-tl bg-clip-text from-cyan-800 from-10% via-gray-300 via-45%  to-cyan-800 to-100%'>REES</strong></div>
              <div className='flex flex-col w-10 h-10 bg-cyan-600 text-rentWhite justify-center items-center text-xl font-comfortaa rounded-3xl'><strong>{product?.requirement.rate}</strong></div>
              <div className='flex flex-col w-20 h-12'>
                <div className='text-lg font-black font-comfortaa'>Good</div>
                <div className='text-xs text-gray-600 -mt-1'>{product?.requirement.review}+ Reviews</div>
              </div>
            </div>
          </div>
          {/* Right Content */}
          <div className='bg-rentWhite flex flex-col justify-end items-center'>
            {/* Price */}
            <div className='flex flex-row items-center'>
            <p className='w-72 flex justify-end items-center pr-4'><i className="fa-solid fa-dollar-sign text-[22px] pr-1 pt-3  "></i><strong className='text-[40px] font-open'>{product?.dailyPrice} <span className='font-comfortaa text-[24px]'>p/day</span></strong></p>
            {/* Hire Button */}
            <button className='w-34 h-12 bg-gray-300 text-[16px] font-open text-rentWhite hover:bg-rentYellow transition duration-700 rounded-full px-4'>Rent Now <i className="fa-solid fa-key pl-1"></i></button>
            </div>
          </div>
        </div>
      </div>
    </>
  )
}

export default ProductDetail