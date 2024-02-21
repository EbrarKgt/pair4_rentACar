import { useEffect, useState } from 'react';
import { BrandModel } from '../../models/responses/BrandModel'
import { ProductModel } from '../../models/responses/ProductModel';
import ProductService from '../../services/ProductService';

type Props = {
    brand: BrandModel[];
    filterProducts: any; 
    setFilteredProducts: any;
}

const FilterSection = (props: Props) => {
    const [products, setProducts] = useState<ProductModel[]>([]);
        

    useEffect(() => {
        fetchProducts();
      },[])

    const fetchProducts = () => {
        ProductService.getAll().then((response:any) => {
          console.log(response.data);
          setProducts(response.data);
        })
      }

    return (
        <>
            {
                props.brand.map((brand: BrandModel) => (
                    <div className='flex flex-col gap-6 hover:bg-slate-200 ' key={brand.name}>
                        <button  className=' w-[86px] h-20 flex flex-row items-center justify-center'
                        onClick={() => props.filterProducts(brand.name)}>
                             {brand.name}
                        </button>
                    </div>
                ))
            }
            <div className='flex items-center justify-center w-full hover:bg-slate-200  '>
                <button className='w-16 h-12'
                onClick={() => props.setFilteredProducts(products)}>All</button>
            </div>

        </>
    )
}

export default FilterSection