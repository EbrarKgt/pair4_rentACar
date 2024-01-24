import React from 'react'

type Props = {}

const ContentCard = (props: Props) => {
    return (
        <div>
            {/* Highlights Content */}
            <div className="container flex flex-row justify-center space-x-8 lg:space-x-16 py-12 lg:py-24 bg-rentWhite">
                {/* Left Content */}
                <div className='group h-40 w-48 lg:h-80 lg:w-96 flex flex-col justify-center align items-center shadow-2xl hover:bg-cyan-800 hover:text-rentWhite transition duration-500 '>
                    {/* Icon */}
                    <div className='flex justify-center'>
                        <i className="fa-solid fa-headset text-cyan-500 group-hover:text-rentWhite  text-4xl lg:text-8xl pb-8 group-hover:scale-110 transition duration-500">
                        </i>
                    </div>
                    {/* Header */}
                    <div className='flex justify-center'>
                        <h3 className='font-comfortaa font-bold text-sm lg:text-2xl pb-2'>24/7 Customer Service</h3>
                    </div>
                    {/* Text */}
                    <div className='flex justify-center'>
                        <p className='hidden lg:block px-12 font-comfortaa text-center text-xs'>
                            Our committed 24/7 customer service team is here to assist you promptly. Your satisfaction remains our top priority!
                        </p>
                    </div>
                </div>
                {/* Mid Content */}
                <div className='group h-40 w-48 lg:h-80 lg:w-96 flex flex-col justify-center align items-center shadow-2xl hover:bg-cyan-800 hover:text-rentWhite transition duration-500 '>
                    {/* Icon */}
                    <div className='flex justify-center'>
                        <i className="fa-brands fa-bitcoin text-cyan-500 group-hover:text-rentWhite text-4xl lg:text-8xl pb-8 group-hover:scale-110 transition duration-500">
                        </i>
                    </div>
                    {/* Header */}
                    <div className='flex justify-center'>
                        <h3 className='font-comfortaa font-bold text-sm lg:text-2xl pb-2'>Easy Payments</h3>
                    </div>
                    {/* Text */}
                    <div className='flex justify-center'>
                        <p className='hidden lg:block px-12 font-comfortaa text-center text-xs'>
                            Enjoy effortless payments with Bitcoin and other secure methods. Choose from a variety of options for quick and reliable transactions.
                        </p>
                    </div>
                </div>
                {/* Right Content */}
                <div className='group h-40 w-48 lg:h-80 lg:w-96 flex flex-col justify-center align items-center shadow-2xl hover:bg-cyan-800 hover:text-rentWhite transition duration-500 '>
                    {/* Icon */}
                    <div className='flex justify-center'>
                        <i className="fa-solid fa-tag text-cyan-500 group-hover:text-rentWhite text-4xl lg:text-8xl pb-8 group-hover:scale-110 transition duration-500">
                        </i>
                    </div>
                    {/* Header */}
                    <div className='flex justify-center'>
                        <h3 className='font-comfortaa font-bold text-sm lg:text-2xl pb-2'>Budget Friendly</h3>
                    </div>
                    {/* Text */}
                    <div className='flex justify-center'>
                        <p className='hidden lg:block px-12 font-comfortaa text-center text-xs'>
                            Affordable Adventures Await! Rent a car at unbeatable prices for your next journey. Explore more for less with our budget-friendly rental options.
                        </p>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default ContentCard