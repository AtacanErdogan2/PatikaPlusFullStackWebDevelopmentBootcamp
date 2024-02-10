import { useContext } from 'react';
import { ItemContext } from '../ItemContext';

const Card = () => {
  const { items } = useContext(ItemContext);

  return (
    <div className="items">
      {items.map((item) => (
        <div key={item.id} className="item-wrapper">
          <img className="item-img" src={item.img} alt="item-img" />
          <div className="item-name">{item.name}</div>
          <div className="item-cost">${item.price}</div>

          <div className="item-controls">
            <button disabled="disabled" className="item-sell">
              Sell
            </button>
            <input pattern="\d*" type="number" className="item-input" />
            <button className="item-buy">Buy</button>
          </div>
        </div>
      ))}
    </div>
  );
};

export default Card;