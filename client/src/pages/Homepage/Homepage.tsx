import React, { useEffect, useState } from 'react'
import { Link } from 'react-router-dom'
import ContentCard from '../../components/ContentCard/ContentCard'
import ProductCard from '../../components/ProductCard/ProductCard'
import { ProductModel } from '../../models/responses/ProductModel'
import ProductService from '../../services/ProductService'
import Footer from '../../components/Footer/Footer'

type Props = {}

const Homepage = (props: Props) => {
  const [products, setProducts] = useState<ProductModel[]>([])

  useEffect(() => {
    fetchProducts();
  }, [])

  const fetchProducts = () => {
    ProductService.getAll().then((response: any) => {
      console.log(response.data)
      setProducts(response.data)
    })
  }


  return (
    <>
      {/* Hero Section */}
      <section className='h-64 md:h-96 lg:h-140 group relative scroll-smooth'>
        {/* Hero Image */}
        <img src='/images/view1.jpg' alt='main image' className='h-full w-full object-cover' />
        {/* Hero Content */}
        <div className='absolute bottom-0 w-full bg-gradient-to-b from-transparent to-cyan-800'>
          {/* Hero Content Container */}
          <div className='container font-comfortaa'>
            <h3 className='text-emerald-100 tracking-widest group-hover:mb-1 duration-500'>
              Reliable, Efficient, Economical, Service
            </h3>
            <h1 className='text-4xl lg:text-6xl text-rentWhite group-hover:mb-1 duration-500'>
              Rees 
            </h1>
            <p className='text-rentWhite group-hover:mb-1 duration-500 text-sm lg:text-base w-3/4 lg:w-2/3'>Discover the perfect blend of speed, ease, and affordability with our car rental service. Enjoy lightning-quick bookings, straightforward processes, and economic options for your effortless journey. Your adventure begins here!</p>
            {/* Detail Container */}
            <div className='flex float-right space-x-8 opacity-0 group-hover:opacity-100 group-hover:mb-5 lg:group-hover:mb-14 duration-1000'>
              <Link to={"#"} className='text-rentWhite text-sm lg:text-base bg-rentYellow rounded-full p-3 hover:p-4 lg:hover:p-5 lg:hover:text-xl transtion duration-1000'>Hire Now <i className="fa-solid fa-key pl-1"></i></Link>
            </div>
          </div>
        </div>
      </section>
      {/* Highlights Section */}
      <section>
        <ContentCard />
      </section>
      {/* Sample Text */}
      <section>
        <div className='container font-comfortaa text-center'>
          <p className='text-lg'>every journey becomes an adventure</p>
          <p className='tracking-wide font-black text-[35px] text-cyan-800'>Discover the ease of mobility with <span className='text-[40px]'>REES</span></p>
        </div>
      </section>
      {/* Sample Car Section */}
      <section>
        <div className='container flex flex-row flex-wrap justify-center gap-x-8 gap-y-6 py-24'>
          {
            products.map(product => (
              <div key={product.id}>
                <ProductCard product={product} />
              </div>
            ))
          }
        </div>
      </section>

    </>
  )
}

export default Homepage