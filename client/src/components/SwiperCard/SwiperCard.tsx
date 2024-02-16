import { Swiper, SwiperSlide } from 'swiper/react';
import {  Pagination, EffectCoverflow } from 'swiper/modules';

import 'swiper/css';
import 'swiper/css/effect-coverflow';
import 'swiper/css/pagination';
import './SwiperCard.css';

type Props = {}

const SwiperCard = (props: Props) => {
  return (
    <>
      <div className='pb-24 pt-12'>
        <Swiper
          effect={"coverflow"}
          grabCursor={true}
          centeredSlides={true}
          slidesPerView={"auto"}
          coverflowEffect={{
            rotate: 50,
            stretch: 0,
            depth: 100,
            modifier: 1,
            slideShadows: true,
          }}
          pagination={true}
          modules={[EffectCoverflow, Pagination]}
          className="mySwiper"
        >
        
          <SwiperSlide>
              <img src="/images/bugatti6.jpeg" alt="newest car" />
          </SwiperSlide>
          <SwiperSlide>
            <div className='flex object-fill'>
              <img src="/images/bugatti3.jpg" alt="newest car" />
            </div>
          </SwiperSlide>
          <SwiperSlide>
              <img src="/images/bugatti7.jpeg" alt="newest car" />
          </SwiperSlide>
          <SwiperSlide>
              <img src="/images/bugatti5.jpeg" alt="newest car" />
          </SwiperSlide>
          <SwiperSlide>
              <img src="/images/bugatti8.jpeg" alt="newest car" />
          </SwiperSlide>
          <SwiperSlide>
              <img src="/images/bugatti10.jpeg" alt="newest car" />
          </SwiperSlide>
          <SwiperSlide>
              <img src="/images/bugatti9.jpeg" alt="newest car" />
          </SwiperSlide>
        </Swiper >
      </div>
    </>
  );
};
export default SwiperCard