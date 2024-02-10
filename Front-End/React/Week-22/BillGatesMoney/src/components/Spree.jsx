import React, { useContext } from 'react';
import { ItemContext } from '../ItemContext';

const Spree = () => {
  const { items } = useContext(ItemContext);

  // Filter items with amount greater than 0
  const filteredItems = items.filter((item) => item.amount > 0);

  // Calculate the total value of items
  const totalValue = filteredItems.reduce((acc, item) => acc + item.amount * item.price, 0);

  // Conditionally render Spree component
  if (filteredItems.length === 0) {
    return null; // If no items, return null (component won't be rendered)
  }

  return (
    <div className='spree-wrapper'>
      <div className="spree-headline">Your Receipt</div>
      {filteredItems.map((item) => (
        <div key={item.id} className="spree-items">
          <div className="spree-item-name">{item.name}</div>
          <div className="spree-item-amount">x{item.amount}</div>
          <div className="spree-item-cost">${item.amount * item.price}</div>
        </div>
      ))}
      <div className="spree-total">
        <span>TOTAL</span>
        <div className="spree-total-money">${totalValue.toLocaleString()}</div>
      </div>
    </div>
  );
};

export default Spree;
