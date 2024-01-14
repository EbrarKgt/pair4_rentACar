import React, { useEffect, useState } from 'react'
import ProductCart from '../../components/ProductCard/ProductCart'
import productService from '../../services/productService'
import { ProductModel } from '../../models/responses/ProductModel'

type Props = {}

const Homepage = (props: Props) => {

  const [products, setProducts] = useState<ProductModel[]>([])

  useEffect(() => {
    fetchProducts();
  }, [])

  const fetchProducts = () => {
    productService.getAll().then((response:any) => {
      console.log(response.data)
      setProducts(response.data)
    })
  }


  return (
    <div className='container mt-5' style={{backgroundColor:"#ba9e80"}}>
      <div className="row">
        {
          products.map(product => (
            <div key={product.id} className="col-lg-4 col-md-6 col-12 mb-5">
              <ProductCart product={product} />
            </div>
          ))
        }
      </div>
    </div>
  )
}

export default Homepage