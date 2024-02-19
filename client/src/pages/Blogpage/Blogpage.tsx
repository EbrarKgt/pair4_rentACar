import React, { useState } from 'react';
import { Link } from 'react-router-dom';
import BlogPostCard from '../../components/BlogPostCard/BlogPostCard';
import Chatbox from '../../components/ChatBox/ChatBox'; 

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
      thumbnail: '/images/carimage1.jpg',
      excerpt: 'Explore how technology is transforming the car rental industry.',
      publishDate: '2024-02-15'
    },
    {
      id: 1,
      title: 'Discover Scenic Routes',
      thumbnail: '/images/carimage2.jpg',
      excerpt: 'Explore breathtaking landscapes and hidden gems with our premium car rental services.',
      publishDate: '2024-02-15'
    },
    {
      id: 1,
      title: 'Road Trip Essentials',
      thumbnail: '/images/carimage3.jpg',
      excerpt: 'Plan the ultimate road trip adventure with our essential tips and advice for a smooth journey.',
      publishDate: '2024-02-15'
    },{
      id: 1,
      title: 'Long-Term Rentals',
      thumbnail: '/images/carimage4.jpg',
      excerpt: 'Enjoy flexibility with our long-term car rental options. Discover the benefits of extended stays..',
      publishDate: '2024-02-15'
    },
    {
      id: 1,
      title: 'Safe Driving Tips',
      thumbnail: '/images/carimage5.jpg',
      excerpt: 'Stay safe on the road with our essential tips for defensive driving and accident prevention.',
      publishDate: '2024-02-15'
    },
    {
      id: 1,
      title: 'The Future of Car Rentals',
      thumbnail: '/images/carimage6.jpg',
      excerpt: 'Explore how technology is transforming the car rental industry.',
      publishDate: '2024-02-15'
    },{
      id: 1,
      title: 'Off-Road Adventures',
      thumbnail: '/images/carimage7.jpg',
      excerpt: 'Embark on thrilling off-road adventures with our specialized vehicle rentals.',
      publishDate: '2024-02-15'
    },
    {
      id: 1,
      title: 'Budget-Friendly Rentals',
      thumbnail: '/images/carimage8.jpg',
      excerpt: 'Travel smart with our budget-friendly rental options for your next adventure.',
      publishDate: '2024-02-15'
    },
    {
      id: 1,
      title: 'Joy of Open Roads with Our Rentals',
      thumbnail: '/images/carimage9.jpg',
      excerpt: 'Unlock unforgettable adventures and seamless journeys with our top-notch car rental services.',
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
