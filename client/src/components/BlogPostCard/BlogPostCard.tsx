import React from 'react';
import { Link } from 'react-router-dom';
import { BlogPostModel } from '../../models/responses/BlogPostModel';

type Props = {
  post: BlogPostModel;
}

const BlogPostCard = ({ post }: Props) => {
  return (
    <Link to={`/blog/${post.id}`}>
      {/* Hover durumunda bütün kartın büyümesini sağlayan transition ve scale transformu */}
      <div className='flex flex-col h-72 w-96 bg-rentWhite shadow-lg transition-transform duration-300 transform hover:scale-110'>
        {/* Blog Post Thumbnail */}
        <div className='h-40 w-full'>
          <img src={post.thumbnail} alt={post.title} className='h-full w-full object-cover rounded-t-lg' />
        </div>
        {/* Blog Post Details */}
        <div className='flex flex-col p-4 h-full justify-between'>
          {/* Title */}
          <h3 className='text-lg font-semibold'>{post.title}</h3>
          {/* Excerpt */}
          <p className='text-sm text-gray-600 flex-grow'>{post.excerpt}</p>
          {/* Read More Button */}
          <div className='text-right'>
            <span className='text-cyan-800 text-sm font-semibold cursor-pointer hover:underline'>Read More</span>
          </div>
        </div>
      </div>
    </Link>
  );
}

export default BlogPostCard;
