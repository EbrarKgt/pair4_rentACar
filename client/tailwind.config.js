/** @type {import('tailwindcss').Config} */
export default {
  content: [
    "./index.html",
    "./src/**/*.{js,ts,jsx,tsx}",
  ],
  theme: {
    container: {
      center: true,
    },
    extend: {
      aspectRatio:{
        '3/2': '3 / 2',
      },
      backgroundSize: {
        'size-200': '200% 200%',
        'size-300': '300% 300%',
        'size-400': '400% 400%',
      },
      backgroundPosition: {
        'pos-0': '0% 0%',
        'pos-100': '100% 100%',
        'pos-200': '200% 200%',
        'pos-300': '300% 300%',
      },
      scale: {
        '85': '.85',
      },
      transitionDuration: {
        '2000': '2000ms',
      },
      screens: {
        '3xl': '1600px',
      },
      colors: {
        rentRed: "#ED1C24",
        rentWhite: "#FDFFFC",
        rentBlue: "#01B5C5",
        rentYellow: "#FCA311",
        rentBlack: "#020100",
      },
      fontFamily: {
        montserrat: ['Montserrat', 'sans-serif'],
        open: ['Open Sans', 'sans-serif'],
        comfortaa: ['Comfortaa', 'sans-serif'],
      },
      spacing: {
        128: '32rem',
        136: '38rem',
        140: '41rem',
        150: '47rem'
      }
    },
  },
  plugins: [],
}

