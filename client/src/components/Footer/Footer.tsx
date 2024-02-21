import React, { useState } from 'react'
import { Link } from 'react-router-dom';

type Props = {}

const Footer = (props: Props) => {

  const [click, setclick] = useState(false);
  console.log(click)

  return (
    <>
      <section className={`h-64 md:h-96 lg:h-150 bg-[url('/images/view3.jpg')] bg-cover ${click ? 'scale-85 opacity-80 transition duration-[2000ms] ease' : 'scale-100 transition duration-[2000ms]'} relative group`}>
        <div className='h-96 w-full flex items-center justify-center font-comfortaa pl-5'>
          <p className={`text-4xl lg:text-6xl font-bold text-transparent bg-gradient-to-b bg-clip-text from-stone-800 via-rentWhite to-stone-600 transition-all duration-1000 bg-size-400 ${click ?  'bg-pos-200' : ' bg-pos-0'} `}>REES</p>
        </div>
        {/* Links */}
        <div className='absolute left-[390px] bottom-[220px] text-gray-200  gap-4 text-[26px] flex flex-col'>
          <Link to={'https://www.instagram.com/'} target='_blank'>
          <div className='flex flex-row opacity-0 group-hover:opacity-100 hover:text-rentYellow transition duration-200 text-[30px]' ><i className="fa-brands fa-instagram "></i></div>
          </Link>
          <Link to={'https://twitter.com/'} target='_blank'>
          <div className='flex flex-row opacity-0 group-hover:opacity-100 hover:text-rentYellow transition duration-300 '><i className="fa-brands fa-x-twitter"></i></div>
          </Link>
          <Link to={'https://youtube.com/'} target='_blank'>
          <div className='flex flex-row opacity-0 group-hover:opacity-100 hover:text-rentYellow transition duration-500'><i className="fa-brands fa-youtube"></i></div>
          </Link>
          <Link to={'https://mail.google.com/'} target='_blank'>
          <div className='flex flex-row opacity-0 group-hover:opacity-100 hover:text-rentYellow transition duration-700'><i className="fa-regular fa-envelope"></i></div>
          </Link>
          <Link to={'#'}>
          <div className='flex flex-row opacity-0 group-hover:opacity-100 hover:text-rentYellow transition duration-1000'><i className="fa-solid fa-phone"></i></div>
          </Link>
        </div>
        {/* Scrool to Top */}
        <div className='flex absolute left-[682px] inset-x-0 bottom-[230px] justify-center w-48'>
          <button onClick={() => {
            setclick(true)
            setTimeout(() => {
              const scrollToTop = () => {
              const currentPosition = document.documentElement.scrollTop;
              if (currentPosition > 0) {
                window.scrollTo(0, currentPosition - 2); // Adjust the value (20) for desired scroll speed
              } else {
                clearInterval(scrollInterval);
                setclick(false)
              }
            };

            const scrollInterval = setInterval(scrollToTop, 1); // Adjust the interval (16) for desired smoothness
          }, 1000);
          }}>
            <div className='h-[132px] w-[64px]'>
            </div>
          </button>
        </div>
        {/* Address */}
        <div className='absolute right-40 bottom-50  font-comfortaa text-gray-200'>
          <h2 className='text-[20px] font-normal tracking-wide opacity-0 group-hover:opacity-100 transition duration-500 text-center '>SHOWROOM LOCATION</h2>
          <p className='font-thin text-[14px] opacity-0 group-hover:opacity-100 transition duration-1000 text-center '><i className="fa-solid fa-location-dot pr-5 text-[20px]"></i>8600 Pheasant St.
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