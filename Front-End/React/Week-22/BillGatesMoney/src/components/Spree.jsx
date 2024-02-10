const Spree = () => {
  return (
    <div className='spree-wrapper'>
      <div className="spree-headline">Your Receipt</div>
      <div className="spree-items">
        <div className="spree-item-name">Big Mac</div>{" "}
        <div className="spree-item-amount">x0</div>{" "}
        <div className="spree-item-cost">$0</div>
      </div>
      <div className="spree-total">
        <span>TOTAL</span>
        <div className="spree-total-money">$850,000,000</div>
      </div>
    </div>
  );
};

export default Spree;
