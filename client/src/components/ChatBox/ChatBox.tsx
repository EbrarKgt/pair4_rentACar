import React, { useState } from 'react';

interface ChatboxProps {
  isOpen: boolean;
  onClose: () => void;
  openChatbox: () => void;
}

const Chatbox: React.FC<ChatboxProps> = ({ isOpen, onClose, openChatbox }) => {
  const [message, setMessage] = useState("");
  const [isButtonVisible, setIsButtonVisible] = useState(true);

  const handleMessageChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    setMessage(e.target.value);
  };

  const handleSendMessage = () => {
    console.log("Gönderilen mesaj:", message);
    setMessage("");
  };

  const handleChatboxOpen = () => {
    openChatbox();
    setIsButtonVisible(false); // Düğmeyi gizle
  };

  const handleChatboxClose = () => {
    onClose();
    setIsButtonVisible(true); // Düğmeyi göster
  };

  return (
    <>
      {isOpen && (
        <div className="fixed top-1/4 right-6 transform translate-y-1/2 z-50">
          <div className="bg-white rounded-lg p-8 border border-purple-600" style={{ width: "300px", height: "430px" }}>
            <h2 className="text-2xl font-bold mb-4 text-purple-600 border-b-2 border-purple-600 pb-2">Live Support 🌟</h2>
            <p className="text-gray-600 mb-4 flex items-center">
  <span className="text-purple-600 font-semibold mr-2">Denzel:</span> How can I help you?
</p>

            <div className="overflow-y-auto h-72 mb-4"></div>
            <div className="flex">
              <input type="text" value={message} onChange={handleMessageChange} className="flex-1 border border-gray-300 rounded-l-lg p-2 focus:outline-none" placeholder="Type your message..." />
              <button onClick={handleSendMessage} className="bg-purple-600 hover:bg-purple-700 text-white py-2 px-4 rounded-r-lg">Send</button>
            </div>
            {/* Kapatma butonu */}
            <button onClick={handleChatboxClose} className="absolute top-2 right-2 bg-purple-600 hover:bg-purple-700 text-white py-1 px-2 rounded-full text-xs">X</button>
          </div>
        </div>
      )}

      {/* Düğme göster/gizle */}
      {isButtonVisible && (
        <div className="fixed bottom-6 right-6 p-6 bg-gradient-to-r from-purple-400 to-indigo-500 rounded-full text-white hover:scale-110 transition-transform duration-300 transform cursor-pointer flex items-center justify-center shadow-lg" onClick={handleChatboxOpen} style={{ zIndex: "9999" }}>
          <svg xmlns="http://www.w3.org/2000/svg" className="h-9 w-9" fill="none" viewBox="0 0 24 24" stroke="currentColor">
            <path strokeLinecap="round" strokeLinejoin="round" strokeWidth="2" d="M8 10h.01M12 10h.01M16 10h.01M21 12c0 1.1-.9 2-2 2h-6l-4 5v-5H5c-1.1 0-2-.9-2-2V6c0-1.1.9-2 2-2h14c1.1 0 2 .9 2 2v6z" />
          </svg>
        </div>
      )}
    </>
  );
};

export default Chatbox;
