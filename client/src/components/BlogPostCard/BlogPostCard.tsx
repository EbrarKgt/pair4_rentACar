import React from 'react';
import { Link } from 'react-router-dom';
import { BlogPostModel } from '../../models/responses/BlogPostModel';

type Props = {
  post: BlogPostModel;
}

const BlogPostCard = ({ post }: Props) => {
  return (
    <Link to={`/blog/${post.id}`}>
      <div className='flex flex-col h-72 w-96 bg-rentWhite shadow-lg transition-transform duration-300 transform hover:scale-110'>
        <div className='h-40 w-full'>
          <img src={post.thumbnail} alt={post.title} className='h-full w-full object-cover rounded-t-lg' />
        </div>
        <div className='flex flex-col p-4 h-full justify-between'>
          <h3 className='text-lg font-semibold'>{post.title}</h3>
          <p className='text-sm text-gray-600 flex-grow'>{post.excerpt}</p>
          <div className='text-right'>
            {/* Güncellenmiş Read More Butonu */}
            <span className='inline-block text-sm font-semibold cursor-pointer hover:bg-cyan-800 hover:text-white py-1 px-3 rounded transition-colors'>Read More</span>
          </div>
        </div>
      </div>
    </Link>
  );
}

export default BlogPostCard;
