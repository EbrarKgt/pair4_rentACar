import React from 'react';
import { useParams } from 'react-router-dom';

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
      <p>One of the most significant trends in the car rental industry is the shift towards electric and autonomous vehicles. As concerns about environmental sustainability grow, more rental companies are expanding their fleets to include electric cars, offering customers a greener alternative to traditional gasoline-powered vehicles. Additionally, the development of autonomous driving technology is paving the way for self-driving rental cars, providing a glimpse into a future where transportation is safer, more efficient, and more convenient than ever before.</p>
      <br>
      <p>Another major trend reshaping the car rental landscape is the integration of mobile technology and contactless rental services. With the rise of smartphone usage, rental companies are investing in mobile apps that allow customers to book, manage, and unlock rental cars directly from their devices. This seamless integration not only enhances the rental experience by eliminating the need for physical paperwork and key exchanges but also provides greater flexibility and convenience for travelers on the go.</p>
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
