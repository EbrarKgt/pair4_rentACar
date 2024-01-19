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
      screens:{
        '3xl': '1600px',
      },
      colors:{
        rentRed: "#ED1C24",
        rentWhite: "#FDFFFC",
        rentBlue: "#01B5C5",
        rentYellow: "#FCA311",
        rentBlack: "#020100",
      },
      fontFamily:{
        montserrat: ['Montserrat', 'sans-serif'],
        open: ['Open Sans', 'sans-serif'],
        comfortaa: ['Comfortaa', 'sans-serif'],
      }
    },
  },
  plugins: [],
}

