import React from 'react'
// ProductModel yerine BlogPostModel kullanılacak
import { BlogPostModel } from '../../models/responses/BlogPostModel'

type Props = {
    // product yerine post prop'u kullanılacak
    post: BlogPostModel;
}

const BlogPostCard = (props: Props) => {

    // props.product yerine props.post kullanılıyor
    console.log(props.post.image)
    return (
        <div className=''  style={{"backgroundColor":"#DDDCD8"}}>
            <div className="card m-3 border border-2 border-dark p-2 text-dark bg-opacity-75 rounded-5" style={{"backgroundColor":"#FF7F98"}} >
                {/* Blog gönderisinin resmi */}
                <img src={props.post.image} className="card-img-top rounded-5" style={{"height": "220px", "backgroundColor":"#DDDCD8"}} alt={props.post.title}/>
                <div className="card-body">
                    {/* Blog gönderisinin başlığı */}
                    <h5 className="card-title">{props.post.title}</h5>
                    {/* Blog yazarının adı ve gönderi tarihi */}
                    <div className="card-text d-flex justify-content-between align-items-center mb-3">
                        <div className=''>{props.post.date}</div>
                    </div>
                    {/* Blog gönderisinin özeti veya girişi */}
                    <p className="card-text">{props.post.summary}</p>
                    {/* Blog detay sayfasına link */}
                    <div className='d-flex justify-content-end'>
                        <a href={`/blog/${props.post.id}`} className="btn btn-outline-secondary rounded-5">Blog Detayı</a>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default BlogPostCard
