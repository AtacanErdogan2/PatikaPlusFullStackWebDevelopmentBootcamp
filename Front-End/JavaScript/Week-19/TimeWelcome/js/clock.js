let namePrompt = prompt("Please enter your name");

let nameDOM = document.querySelector("#myName");

nameDOM.innerHTML = namePrompt;

function showTime() {
    const date = new Date();
    let d = getDayName();
    let h = date.getHours();
    let m = date.getMinutes();
    let s = date.getSeconds();
    m = checkTime(m);
    s = checkTime(s);
    document.getElementById('myClock').innerHTML =  h + ":" + m + ":" + s + " " + d;
    setTimeout(showTime, 500);
  }
  
  function checkTime(i) {
    if (i < 10) {i = "0" + i};  // add zero in front of numbers < 10
    return i;
  }

  function getDayName(date = new Date(), locale = 'en-US') {
    return date.toLocaleDateString(locale, {weekday: 'long'});
  }