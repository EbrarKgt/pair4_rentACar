import React, { useState } from 'react';
import { Link } from 'react-router-dom';
import BlogPostCard from '../../components/BlogPostCard/BlogPostCard';
import Chatbox from '../../components/ChatBox/ChatBox'; // Chatbox bileşenini import edin

const BlogPage = () => {
  const [isChatboxOpen, setIsChatboxOpen] = useState(false);

  const openChatbox = () => {
    setIsChatboxOpen(true);
  };

  const closeChatbox = () => {
    setIsChatboxOpen(false);
  };

  // Statik blog post verileri (1 adet)
  const blogPosts = [
    {
      id: 1,
      title: 'The Future of Car Rentals',
      thumbnail: '/images/view1.jpg',
      excerpt: 'Explore how technology is transforming the car rental industry.',
      publishDate: '2024-02-15'
    },
    {
      id: 1,
      title: 'The Future of Car Rentals',
      thumbnail: '/images/view1.jpg',
      excerpt: 'Explore how technology is transforming the car rental industry.',
      publishDate: '2024-02-15'
    },
    {
      id: 1,
      title: 'The Future of Car Rentals',
      thumbnail: '/images/view1.jpg',
      excerpt: 'Explore how technology is transforming the car rental industry.',
      publishDate: '2024-02-15'
    },{
      id: 1,
      title: 'The Future of Car Rentals',
      thumbnail: '/images/view1.jpg',
      excerpt: 'Explore how technology is transforming the car rental industry.',
      publishDate: '2024-02-15'
    },
    {
      id: 1,
      title: 'The Future of Car Rentals',
      thumbnail: '/images/view1.jpg',
      excerpt: 'Explore how technology is transforming the car rental industry.',
      publishDate: '2024-02-15'
    },
    {
      id: 1,
      title: 'The Future of Car Rentals',
      thumbnail: '/images/view1.jpg',
      excerpt: 'Explore how technology is transforming the car rental industry.',
      publishDate: '2024-02-15'
    },{
      id: 1,
      title: 'The Future of Car Rentals',
      thumbnail: '/images/view1.jpg',
      excerpt: 'Explore how technology is transforming the car rental industry.',
      publishDate: '2024-02-15'
    },
    {
      id: 1,
      title: 'The Future of Car Rentals',
      thumbnail: '/images/view1.jpg',
      excerpt: 'Explore how technology is transforming the car rental industry.',
      publishDate: '2024-02-15'
    },
    {
      id: 1,
      title: 'The Future of Car Rentals',
      thumbnail: '/images/view1.jpg',
      excerpt: 'Explore how technology is transforming the car rental industry.',
      publishDate: '2024-02-15'
    }
  ];

  return (
    <>
      {/* Blog Hero Section */}
      <section className='h-64 md:h-96 lg:h-140 relative bg-cover bg-center' style={{ backgroundImage: "url('/images/image4.jpg')" }}>
        <div className='absolute inset-0 bg-black bg-opacity-50'>
          <div className='container mx-auto flex justify-center items-center h-full'>
            <div className='text-center'>
              <h1 className='text-4xl lg:text-6xl text-white font-bold'>Insights & Updates</h1>
              <p className='text-white text-lg mt-4'>Explore the latest trends, tips, and stories in the world of car rentals and travels.</p>
            </div>
          </div>
        </div>
      </section>

      {/* Blog Posts Section */}
      <section className='container mx-auto py-12'>
        <div className='grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-8'>
          {blogPosts.map((post) => (
            <BlogPostCard key={post.id} post={post} />
          ))}
        </div>
      </section>

      {/* Call to Action Section */}
      <section className='bg-cyan-800 text-center py-12 text-white'>
        <h2 className='text-3xl mb-4 font-semibold'>Join Our Community</h2>
        <p className='mb-6'>Stay updated with the latest posts and insights.</p>
        <Link to='/subscribe' className='inline-block bg-yellow-500 text-cyan-900 rounded-full px-8 py-3 text-lg transition duration-300 hover:bg-yellow-400'>Subscribe Now</Link>
      </section>

      
      
      {/* Chatbox */}
      <Chatbox isOpen={isChatboxOpen} onClose={closeChatbox} openChatbox={openChatbox} />


      
    </>
  );
};

export default BlogPage;
