import React, { useEffect, useState } from 'react'
import { ProductModel } from '../../models/responses/ProductModel';
import ProductService from '../../services/ProductService';
import ProductCard from '../../components/ProductCard/ProductCard';
import FilterSection from '../../components/FilterSection/FilterSection';
import { BrandModel } from '../../models/responses/BrandModel';

type Props = {}

const ProductList = (props: Props) => {

  const [products, setProducts] = useState<ProductModel[]>([]);
  const [brands, setBrands] = useState<BrandModel[]>([]);
  const [filteredProducts, setFilteredProducts] = useState<ProductModel[]>([]);

 
  
  useEffect(() => {
    fetchProducts();
    fetchBrands();
  },[])

  const fetchProducts = () => {
    ProductService.getAll().then((response:any) => {
      console.log(response.data);
      setProducts(response.data);
      setFilteredProducts(response.data)
    })
  }
  const fetchBrands = () => {
    ProductService.getAllBrands().then((response:any) => {
      setBrands(response.data)
    })
  }

  const filterProducts = (brand:any) => {   
    
    const filteredItems =products.filter(item => 
      (item.brandName).includes(brand))

    console.log("filtered items");
    console.log(filteredItems);
    console.log("***products***");
    console.log(products);
        
    setFilteredProducts(filteredItems);
    
  }

  return (
    <>
    <div className='pb-12 pt-8 flex justify-center pl-[70px]'>
      <div className='pr-12 w-[1150px] '>
      <h1 className='text-[44px] font-comfortaa tracking-wider py-4 text-slate-700'><strong>OUR CARS</strong></h1>
      <p className='font-comfortaa text-slate-500 border-b-2 pb-4 '>
        Welcome to our car collection page. Here, you can explore a variety of
        cars from different brands and models. Browse through our inventory and find the perfect
        car for your needs.
      </p>
      </div>
    </div>
    <div className='flex flex-row gap-48 pl-48 min-h-150'>
    {/* Filter Section */}
    <section>
      <div className='h-[500px] w-[180px]  flex flex-col items-center justify-start pt-4 '>
        <div className='h-12 font-comfortaa tracking-wider flex pb-2 pl-4 text-[18px] '><strong className='border-b-2'>Select Brands</strong></div>
        <div className='flex flex-row gap-x-0 gap-y-0 flex-wrap pl-2'>
              <FilterSection 
               brand={brands}
               filterProducts={filterProducts}
               setFilteredProducts={setFilteredProducts}
               />
        </div>
      </div>
    </section>
      {/* Car List */}
      <section className=' flex justify-center '>
        <div className='container flex flex-row flex-wrap  gap-x-8 gap-y-[30px] py-12 w-[900px]'>
        {
          filteredProducts.map(filteredProducts => (
            <div key={filteredProducts.id}>
              <ProductCard product={filteredProducts} />
            </div>
          ))
        }
        </div>
      </section>
    </div>
    </>
  )
}

export default ProductList