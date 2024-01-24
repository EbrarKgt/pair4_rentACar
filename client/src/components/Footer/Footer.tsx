import React from 'react'

type Props = {}

const Footer = (props: Props) => {
  return (
    <>
      <section className="h-64 md:h-96 lg:h-140 bg-[url('/images/view3.jpg')] bg-cover relative group">
        <div className='h-96 w-full flex items-center justify-center font-comfortaa pl-5'>
          <p className='text-4xl lg:text-6xl font-bold text-transparent bg-gradient-to-tr bg-clip-text from-rentWhite from-20%  to-black to-95%'>REES</p>
        </div>
        {/* Links */}
        <div className='absolute left-80 bottom-20 text-gray-200  gap-4 text-[26px] flex flex-col'>
          <div className='flex flex-row opacity-0 group-hover:opacity-100 transition duration-200' ><i className="fa-brands fa-instagram "></i></div>
          <div className='flex flex-row opacity-0 group-hover:opacity-100 transition duration-300'><i className="fa-brands fa-x-twitter"></i></div>
          <div className='flex flex-row opacity-0 group-hover:opacity-100 transition duration-500'><i className="fa-brands fa-youtube"></i></div>
          <div className='flex flex-row opacity-0 group-hover:opacity-100 transition duration-700'><i className="fa-regular fa-envelope"></i></div>
          <div className='flex flex-row opacity-0 group-hover:opacity-100 transition duration-1000'><i className="fa-solid fa-phone"></i></div>
        </div>
        {/* Scrool to Top */}
        <div className='flex absolute pl-8 inset-x-0 bottom-20 justify-center'>
          <button onClick={() => {
            const scrollToTop = () => {
              const currentPosition = document.documentElement.scrollTop;
              if (currentPosition > 0) {
                window.scrollTo(0, currentPosition - 16); // Adjust the value (20) for desired scroll speed
              } else {
                clearInterval(scrollInterval);
              }
            };

            const scrollInterval = setInterval(scrollToTop, 10); // Adjust the interval (12) for desired smoothness
          }}>
            <div className='h-36 w-20 bg-transparent'>
            </div>
          </button>
        </div>
        {/* Address */}
        <div className='absolute right-40 bottom-50  font-comfortaa text-gray-200'>
          <h2 className='text-[20px] font-normal tracking-wide opacity-0 group-hover:opacity-100 transition duration-500 text-center '>SHOWROOM LOCATION</h2>
          <p className='font-thin text-[14px] opacity-0 group-hover:opacity-100 transition duration-1000 text-center '>8600 Pheasant St.
            Miami, Florida FL 33177</p>
        </div>
        {/* Copyright */}
        <div className='absolute inset-x-0 pl-6 bottom-1 text-gray-200 font-comfortaa text-[10px] text-center'>
          <p>COPYRIGHT © 2024 REES Reliable, Efficient, Economical, Service. All rights reserved.</p>
        </div>
      </section>
    </>
  )
}

export default Footer