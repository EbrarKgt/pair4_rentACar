import React from 'react'
import { ProductModel } from '../../models/responses/ProductModel'

type Props = {
    product: ProductModel;
}

const ProductCart = (props: Props) => {
    // const IMG_URL = "../../assets/images/"
    // const LOGO_URL = "../../assets/logos/"   its not working

    console.log(props.product.image)
    return (
        <div className=''  style={{"backgroundColor":"#DDDCD8"}}>
            <div className="card m-3 border border-2 border-dark p-2 text-dark bg-opacity-75" style={{"backgroundColor":"FF7F98"}} >
                <img src={require(`../../assets/images/${props.product.image}`)} className="card-img-top" style={{"height": "220px", "backgroundColor":"#DDDCD8"}} alt="..."/>
                    <div className="card-body">
                        <h5 className="card-title">{props.product.modelName}</h5>
                        <div className="card-text d-flex align-items-center" style={{"marginBottom": "16px"}}>
                            <div className=''>{props.product.brandName}</div>
                            <div className='ms-auto'>
                                <img src={require(`../../assets/logos/${props.product.logo}`)}style={{height:"15%", width:"15%"}} />
                            </div>
                        </div>
                        <p className="card-text">{props.product.dailyPrice}</p>
                        <p className="card-text">{props.product.colorName}</p>
                        <p className="card-text">{props.product.kilometer}</p>
                        <p className="card-text">{props.product.plate}</p>
                        <div className='d-md-flex justify-content-md-end'>
                        <a href="#" className="btn btn-outline-secondary">Araç Detayı</a>
                        </div>
                    </div>
            </div>
        </div>
    )
}

export default ProductCart