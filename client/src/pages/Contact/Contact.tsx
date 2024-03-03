import React from "react";

type Props = {};

const Contact: React.FC<Props> = () => {
  return (
    <div className="container my-24 mx-auto md:px-6">
      {/* Section: Design Block */}
      <section className="mb-32 text-center">
        <div className="py-12 md:px-12">
          <div className="container mx-auto xl:px-32">
            <div className="grid items-center lg:grid-cols-2">
              <div className="mb-12 md:mt-12 lg:mt-0 lg:mb-0">
<<<<<<< HEAD
                <div className="relative z-[1] block rounded-lg bg-[hsla(0,0%,100%,0.55)] px-6 py-12 shadow-[0 2px 15px -3px rgba(0, 0, 0, 0.07), 0 10px 20px -2px rgba(0, 0, 0, 0.04)] backdrop-blur-[30px] dark:bg-[hsla(0,0%,5%,0.7)] dark:shadow-black/20 md:px-12 lg:-mr-14 shadow-2xl">
=======
                <div className="relative z-[1] block rounded-lg bg-[hsla(0,0%,100%,0.55)] px-6 py-12 shadow-[0 2px 15px -3px rgba(0, 0, 0, 0.07), 0 10px 20px -2px rgba(0, 0, 0, 0.04)] backdrop-blur-[30px] dark:bg-[hsla(0,0%,5%,0.7)] dark:shadow-black/20 md:px-12 lg:-mr-14">
>>>>>>> refs/remotes/origin/main
                  <h2 className="mb-12 text-3xl font-bold">Contact us</h2>
                  <form>
                    <div className="relative mb-6" data-te-input-wrapper-init>
                      <input
                        type="text"
                        className="peer block min-h-[auto] w-full rounded border-0 bg-transparent py-[0.32rem] px-3 leading-[1.6] outline-none transition-all duration-200 ease-linear focus:placeholder:opacity-100 peer-focus:text-primary data-[te-input-state-active]:placeholder:opacity-100 motion-reduce:transition-none dark:text-neutral-200 dark:placeholder:text-neutral-200 dark:peer-focus:text-primary [&:not([data-te-input-placeholder-active])]:placeholder:opacity-0"
                        id="exampleInput90"
                        placeholder="Name"
                      />
                      <label
                        className="pointer-events-none absolute top-0 left-3 mb-0 max-w-[90%] origin-[0_0] truncate pt-[0.37rem] leading-[1.6] text-neutral-500 transition-all duration-200 ease-out peer-focus:-translate-y-[0.9rem] peer-focus:scale-[0.8] peer-focus:text-primary peer-data-[te-input-state-active]:-translate-y-[0.9rem] peer-data-[te-input-state-active]:scale-[0.8] motion-reduce:transition-none dark:text-neutral-200 dark:peer-focus:text-primary"
                        htmlFor="exampleInput90"
                      >
                        Name
                      </label>
                    </div>
                    <div className="relative mb-6" data-te-input-wrapper-init>
                      <input
                        type="email"
                        className="peer block min-h-[auto] w-full rounded border-0 bg-transparent py-[0.32rem] px-3 leading-[1.6] outline-none transition-all duration-200 ease-linear focus:placeholder:opacity-100 peer-focus:text-primary data-[te-input-state-active]:placeholder:opacity-100 motion-reduce:transition-none dark:text-neutral-200 dark:placeholder:text-neutral-200 dark:peer-focus:text-primary [&:not([data-te-input-placeholder-active])]:placeholder:opacity-0"
                        id="exampleInput91"
                        placeholder="Email address"
                      />
                      <label
                        className="pointer-events-none absolute top-0 left-3 mb-0 max-w-[90%] origin-[0_0] truncate pt-[0.37rem] leading-[1.6] text-neutral-500 transition-all duration-200 ease-out peer-focus:-translate-y-[0.9rem] peer-focus:scale-[0.8] peer-focus:text-primary peer-data-[te-input-state-active]:-translate-y-[0.9rem] peer-data-[te-input-state-active]:scale-[0.8] motion-reduce:transition-none dark:text-neutral-200 dark:peer-focus:text-primary"
                        htmlFor="exampleInput91"
                      >
                        Email address
                      </label>
                    </div>
                    <div className="relative mb-6" data-te-input-wrapper-init>
                      <textarea
                        className="peer block min-h-[auto] w-full rounded border-0 bg-transparent py-[0.32rem] px-3 leading-[1.6] outline-none transition-all duration-200 ease-linear focus:placeholder:opacity-100 data-[te-input-state-active]:placeholder:opacity-100 motion-reduce:transition-none dark:text-neutral-200 dark:placeholder:text-neutral-200 [&:not([data-te-input-placeholder-active])]:placeholder:opacity-0"
                        id="exampleFormControlTextarea1"
                        rows={3}
                        placeholder="Your message"
                      ></textarea>
                      <label
                        htmlFor="exampleFormControlTextarea1"
                        className="pointer-events-none absolute top-0 left-3 mb-0 max-w-[90%] origin-[0_0] truncate pt-[0.37rem] leading-[1.6] text-neutral-500 transition-all duration-200 ease-out peer-focus:-translate-y-[0.9rem] peer-focus:scale-[0.8] peer-focus:text-primary peer-data-[te-input-state-active]:-translate-y-[0.9rem] peer-data-[te-input-state-active]:scale-[0.8] motion-reduce:transition-none dark:text-neutral-200 dark:peer-focus:text-primary"
                      >
                        Message
                      </label>
                    </div>
                    <div className="mb-6 inline-block min-h-[1.5rem] justify-center pl-[1.5rem] md:flex items-center">
                      <input
                        className="peer appearance-none h-[1.125rem] w-[1.125rem] rounded-[0.25rem] border-[0.125rem] border-solid border-neutral-300 outline-none dark:border-neutral-600"
                        type="checkbox"
                        id="exampleCheck96"
                        checked
                      />
                      <label
                        className="cursor-pointer ml-[6px] text-sm text-neutral-700 dark:text-neutral-200"
                        htmlFor="exampleCheck96"
                      >
                        Send me a copy of this message
                      </label>
                    </div>

                    <button className="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded-full">
                      Send
                    </button>
                  </form>
                </div>
              </div>
              <div className="md:mb-12 lg:mb-0">
                <div className="relative h-[700px] rounded-lg shadow-lg dark:shadow-black/20">
                  <iframe
                    src="https://maps.google.com/maps?q=miami&t=&z=13&ie=UTF8&iwloc=&output=embed"
                    className="absolute left-0 top-0 h-full w-full rounded-lg"
                    allowFullScreen
                  ></iframe>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
    </div>
  );
};

<<<<<<< HEAD
export default Contact;
=======
export default Contact;
>>>>>>> refs/remotes/origin/main
