import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";

type Props = {};

const Signin = (props: Props) => {
  const testimonials = [
    {
      id: 1,
      content:
        "Top-notch car rental site! The hassle-free online reservation, prompt service, and well-detailed vehicle information make it my go-to choice for renting cars.",
      author: "Luna Storm",
    },
    {
      id: 2,
      content:
        "Quality seekers, look no further! This site is your one-stop destination for top-notch car rentals, offering a seamless blend of reliability, variety, and excellent service.",
      author: "Maverick Phoenix",
    },
    {
      id: 3,
      content:
        "Exceptional car rental experience! The website's user-friendly interface and extensive vehicle options made the reservation process seamless and enjoyable.",
      author: "Skyler Blaze",
    },
  ];

  const [currentTestimonial, setCurrentTestimonial] = useState(0);

  const handleNextTestimonial = () => {
    setCurrentTestimonial((prev) => (prev + 1) % testimonials.length);
  };

  useEffect(() => {
    const intervalId = setInterval(() => {
      handleNextTestimonial();
    }, 5000);

    return () => clearInterval(intervalId);
  }, [currentTestimonial]);

  return (
    <>
      <div className="flex min-h-full flex-1 lg:flex-row">
        {/* Sol Yarısı (Form) */}
        <div className="flex-1 flex-col justify-center px-6 py-20 lg:px-8">
          <div className="sm:mx-auto sm:w-full sm:max-w-sm">
            <h2 className="mt-10 text-center text-2xl font-bold leading-9 tracking-tight text-gray-900">
              Welcome To Rees!
            </h2>
          </div>

          <div className="mt-10 sm:mx-auto sm:w-full sm:max-w-sm">
            <form className="space-y-6" action="#" method="POST">
              <div>
                <label
                  htmlFor="email"
                  className="block text-sm font-medium leading-6 text-gray-900"
                >
                  Email address
                </label>
                <div className="mt-2">
                  <input
                    id="email"
                    name="email"
                    type="email"
                    autoComplete="email"
                    required
                    className="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset sm:text-sm sm:leading-6"
                  />
                </div>
              </div>

              <div>
                <div className="flex items-center justify-between">
                  <label
                    htmlFor="password"
                    className="block text-sm font-medium leading-6 text-gray-900"
                  >
                    Password
                  </label>
                  <div className="text-sm">
                    <a
                      href="#"
                      style={{ color: "#fca311" }}
                      className="hover:text-rentYellow cursor-pointer transition duration-500"
                    >
                      Forgot password?
                    </a>
                  </div>
                </div>
                <div className="mt-2">
                  <input
                    id="password"
                    name="password"
                    type="password"
                    autoComplete="current-password"
                    required
                    className="block w-full rounded-md border-0 py-1.5 text-gray-900 shadow-sm ring-1 ring-inset ring-gray-300 placeholder:text-gray-400 focus:ring-2 focus:ring-inset sm:text-sm sm:leading-6"
                  />
                </div>
              </div>

              <div>
                <button
                  type="submit"
                  style={{ backgroundColor: "#164e63" }}
                  className="flex w-full justify-center rounded-md bg-indigo-600 px-3 py-1.5 text-sm font-semibold leading-6 text-white shadow-sm hover:bg-indigo-500 focus-visible:outline focus-visible:outline-2 focus-visible:outline-offset-2 focus-visible:outline-indigo-600"
                >
                  Login
                </button>
              </div>
            </form>

            <p className="mt-5 text-center text-sm text-gray-500">
              <Link
                to={"/signin"}
                className="hover:text-rentYellow cursor-pointer transition duration-500"
              >
                Not a member?{" "}
              </Link>
            </p>
          </div>
        </div>

        {/* Sağ Yarısı (Fotoğraf ve Metin) */}
        <div className="hidden lg:flex flex-1 relative">
          <div className="w-full h-full object-cover">
            <section className="h-96 md:h-96 lg:h-140 group relative scroll-smooth">
              <img
                className="w-full h-full object-cover"
                src="/images/login.jpg"
                alt="main image"
              />
            </section>
          </div>
          {/* Text over Image */}
          <div className="absolute inset-0 flex flex-col items-center justify-center bg-black opacity-70 p-6">
            <div className="flex items-center justify-between container font-comfortaa h-full text-center">
              <p className="text-white text-lg mb-4 font-bold shadow-xl">
                {testimonials[currentTestimonial].content}
                <br />
                <span className="text-gray-400">
                  - {testimonials[currentTestimonial].author}
                </span>
              </p>
            </div>
          </div>
        </div>
      </div>
    </>
  );
};

export default Signin;
