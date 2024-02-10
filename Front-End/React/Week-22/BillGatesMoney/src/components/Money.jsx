import React, { useContext } from 'react';
import { ItemContext } from '../ItemContext';

const Money = () => {
  const { items } = useContext(ItemContext);

  // Calculate the total value of items
  const totalValue = items.reduce((acc, item) => acc + item.amount * item.price, 0);

  // Initial amount of money
  const initialMoney = 100000000000;

  // Remaining money after deducting the total value of items
  const remainingMoney = initialMoney - totalValue;

  return (
    <div className="money-bar">
      ${remainingMoney.toLocaleString()}
    </div>
  );
};

export default Money;
