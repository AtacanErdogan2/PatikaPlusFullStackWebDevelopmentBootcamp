import React, { useState, useEffect } from 'react';

const Class = () => {
  const [activeCategory, setActiveCategory] = useState('Yoga');

  const [content, setContent] = useState([
    {
      id: 1,
      img: "src/assets/yoga.jpg",
      category: "Yoga",
      text: "Lorem ipsum dolor sit amet consectetur adipisicing elit. Reiciendis beatae veritatis, asperiores eveniet est nesciunt sequi ipsum dolorum?",
    },
    {
      id: 2,
      img: "src/assets/group.webp",
      category: "Group",
      text: "Lorem ipsum dolor sit amet consectetur adipisicing elit. Unde accusantium perferendis voluptatum delectus culpa at reiciendis facere quidem.",
    },
    {
      id: 3,
      img: "src/assets/solo.jpg",
      category: "Solo",
      text: "Lorem ipsum, dolor sit amet consectetur adipisicing elit. Possimus corporis sit deserunt est totam culpa repellat cumque expedita.",
    },
    {
      id: 4,
      img: "src/assets/stret.webp",
      category: "Stretching",
      text: "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Impedit temporibus soluta ratione sapiente sequi illo est doloribus molestiae?",
    },
  ]);

  useEffect(() => {
    const defaultButton = document.querySelector('[data-category="Yoga"]');
    defaultButton.click();
  }, []);

  const handleButtonClick = (selectedCategory) => {
    setActiveCategory(selectedCategory);

    const selectedContent = content.find((item) => item.category === selectedCategory);

    // Manipulate the DOM or use state to update the content here
    // For simplicity, let's assume you have a state variable to store the content
    // and a function setContent to update the state.

    setContent({
      category: selectedContent.category,
      text: selectedContent.text,
      img: selectedContent.img,
    });
  };

  return (
    <div className="features" id="features">
      {content.map((item) => (
        <button
          key={item.category}
          data-category={item.category}
          className={activeCategory === item.category ? 'features-btn-active' : ''}
          onClick={() => handleButtonClick(item.category)}
        >
          {item.category}
        </button>
      ))}
      {/* Render the content based on the selected category */}
      {/* Use the state or DOM manipulation logic from the handleButtonClick function */}
    </div>
  );
};

export default Class;
