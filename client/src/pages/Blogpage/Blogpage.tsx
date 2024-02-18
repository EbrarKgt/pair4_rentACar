import React from 'react';
import { Link } from 'react-router-dom';
import BlogPostCard from '../../components/BlogPostCard/BlogPostCard';

const BlogPage = () => {
  // Statik blog post verileri
  const blogPosts = [
    {
      id: 1,
      title: 'The Future of Car Rentals',
      thumbnail: '/images/view1.jpg',
      excerpt: 'Explore how technology is transforming the car rental industry.',
      publishDate: '2024-02-15'
    },
    {
      id: 2,
      title: 'Top Travel Destinations for Car Enthusiasts',
      thumbnail: '/images/blog2.jpg',
      excerpt: 'Discover the best places to drive the car of your dreams.',
      publishDate: '2024-01-20'
    },
    {
      id: 3,
      title: 'Eco-Friendly Travel: The Rise of Electric Rentals',
      thumbnail: '/images/blog3.jpg',
      excerpt: 'Learn about the benefits and availability of electric vehicle rentals.',
      publishDate: '2023-12-10'
    },
    {
      id: 1,
      title: 'The Future of Car Rentals',
      thumbnail: '/images/blog1.jpg',
      excerpt: 'Explore how technology is transforming the car rental industry.',
      publishDate: '2024-02-15'
    },
    {
      id: 2,
      title: 'Top Travel Destinations for Car Enthusiasts',
      thumbnail: '/images/blog2.jpg',
      excerpt: 'Discover the best places to drive the car of your dreams.',
      publishDate: '2024-01-20'
    },
    {
      id: 3,
      title: 'Eco-Friendly Travel: The Rise of Electric Rentals',
      thumbnail: '/images/blog3.jpg',
      excerpt: 'Learn about the benefits and availability of electric vehicle rentals.',
      publishDate: '2023-12-10'
    },
    {
      id: 1,
      title: 'The Future of Car Rentals',
      thumbnail: '/images/blog1.jpg',
      excerpt: 'Explore how technology is transforming the car rental industry.',
      publishDate: '2024-02-15'
    },
    {
      id: 2,
      title: 'Top Travel Destinations for Car Enthusiasts',
      thumbnail: '/images/blog2.jpg',
      excerpt: 'Discover the best places to drive the car of your dreams.',
      publishDate: '2024-01-20'
    },
    {
      id: 3,
      title: 'Eco-Friendly Travel: The Rise of Electric Rentals',
      thumbnail: '/images/blog3.jpg',
      excerpt: 'Learn about the benefits and availability of electric vehicle rentals.',
      publishDate: '2023-12-10'
    }
    
  ];

  return (
    <>
      {/* Blog Hero Section */}
      <section className='h-64 md:h-96 lg:h-140 relative bg-cover bg-center' style={{ backgroundImage: "url('/images/view1.jpg')" }}>
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

      <div className="fixed bottom-10 right-10 p-4 bg-blue-500 rounded-full text-white hover:scale-110 transition-transform duration-300 transform cursor-pointer flex items-center justify-center shadow-lg">
        <svg xmlns="http://www.w3.org/2000/svg" className="h-6 w-6" fill="none" viewBox="0 0 24 24" stroke="currentColor">
          <path strokeLinecap="round" strokeLinejoin="round" strokeWidth="2" d="M8 10h.01M12 10h.01M16 10h.01M21 12c0 1.1-.9 2-2 2h-6l-4 5v-5H5c-1.1 0-2-.9-2-2V6c0-1.1.9-2 2-2h14c1.1 0 2 .9 2 2v6z" />
        </svg>
      </div>

    </>
  );
};

export default BlogPage;
