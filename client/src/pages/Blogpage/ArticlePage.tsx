import React from 'react';
import { useParams } from 'react-router-dom';
import Chatbox from '../../components/ChatBox/ChatBox';

const ArticlePage = () => {
  // Parametrelerden articleId'yi al
  const { articleId } = useParams();

  

  // Makale verileri - Örnek veri
  const articleData = {
    id: articleId,
    title: 'The Future of Car Rentals',
    content: `
      <p>The car rental industry has come a long way since its inception, and it continues to evolve rapidly with advancements in technology and changing consumer preferences. In this article, we'll explore some key trends shaping the future of car rental and how they're revolutionizing the way we travel.</p>
      <br>
      1. Electric and Autonomous Vehicles
      <br>
      <br>
      <p>One of the most significant trends in the car rental industry is the shift towards electric and autonomous vehicles. As concerns about environmental sustainability grow, more rental companies are expanding their fleets to include electric cars, offering customers a greener alternative to traditional gasoline-powered vehicles. Additionally, the development of autonomous driving technology is paving the way for self-driving rental cars, providing a glimpse into a future where transportation is safer, more efficient, and more convenient than ever before.</p>
      <br>
      2. Mobile Integration and Contactless Services
      <br>
      <br>
      <p>Another major trend in the car rental industry is the integration of mobile technology and contactless rental services. With the proliferation of smartphones, rental companies are investing in mobile apps that enable customers to book, manage, and unlock rental cars directly from their devices. This seamless integration not only enhances the rental experience by eliminating the need for physical paperwork and key exchanges but also provides greater flexibility and convenience for travelers on the go.</p>
      <br>
      3. Personalized Experiences and Subscription Models
      <br>
      <br>
      <p>As consumer preferences continue to evolve, car rental companies are focusing on delivering personalized experiences and flexible subscription models. From curated vehicle selections to tailored service packages, customers now have more options than ever to customize their rental experience according to their specific needs and preferences. Additionally, subscription-based models are gaining popularity, offering customers the convenience of unlimited rentals for a fixed monthly fee.</p>
      <br>
      4. Sustainable Practices and Corporate Responsibility
      <br>
      <br>
      <p>In response to growing environmental concerns, car rental companies are increasingly adopting sustainable practices and demonstrating corporate responsibility. From investing in eco-friendly vehicles to implementing green initiatives in their operations, rental companies are prioritizing sustainability as a core value. By embracing sustainable practices, these companies not only reduce their environmental footprint but also appeal to environmentally conscious consumers who prioritize eco-friendly options.</p>
      <br>
      <p>In conclusion, the future of car rentals is filled with exciting possibilities, driven by innovation, technology, and changing consumer demands. As the industry continues to evolve, we can expect to see further advancements in electric and autonomous vehicles, seamless mobile integration, personalized experiences, and sustainable practices. By staying ahead of these trends and embracing innovation, car rental companies can thrive in a rapidly changing landscape and provide customers with unparalleled experiences.</p>


    `,
    publishDate: '2024-02-15'
  };

  return (
    <div className="container mx-auto py-12">
      <div className="max-w-3xl mx-auto">
        {/* Başlık */}
        <h1 className="text-3xl lg:text-4xl font-bold mb-4">{articleData.title}</h1>
        {/* Yayın tarihi */}
        <div className="text-gray-600 mb-4">
          <span>Published: {articleData.publishDate}</span>
        </div>
        {/* İçerik */}
        <div className="bg-blue-50 p-6 rounded-lg">
          <div className="prose max-w-none" dangerouslySetInnerHTML={{ __html: articleData.content }}></div>
        </div>
      </div>
    </div>

    
  );
};

export default ArticlePage;
