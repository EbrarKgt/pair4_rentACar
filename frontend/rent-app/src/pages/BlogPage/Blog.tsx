import React, { useEffect, useState } from 'react'
import BlogPostCard from '../../components/BlogPostCard/BlogPostCard'
import blogService from '../../services/blogService'
import { BlogPostModel } from '../../models/responses/BlogPostModel'

type Props = {}

const BlogPage = (props: Props) => {

  const [blogPosts, setBlogPosts] = useState<BlogPostModel[]>([])

  useEffect(() => {
    fetchBlogPosts();
  }, [])

  const fetchBlogPosts = () => {
    blogService.getAll().then((response:any) => {
      console.log(response.data)
      setBlogPosts(response.data)
    })
  }


  return (
    <div className='container mt-5' style={{backgroundColor:"#DDDCD8"}}>
      <div className="row">
        {
          blogPosts.map(post => (
            <div key={post.id} className="col-lg-4 col-md-6 col-12 mb-5">
              {}
              <BlogPostCard post={post} />
            </div>
          ))
        }
      </div>
    </div>
  )
}

export default BlogPage
