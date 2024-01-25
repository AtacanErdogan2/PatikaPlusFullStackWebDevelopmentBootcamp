const toDoListDOM = document.querySelector("#list");





function addToDoElement() {
    const li = document.createElement("li");
    const span = document.createElement("span");
    const toastError = document.querySelector(".error");
    const toastSuccess =document.querySelector(".success");
    let input = task.value.trim();
    if (!input) {
        task.value = "";
        var toast = new bootstrap.Toast(toastError);
        toast.show();

        return
    }
    li.textContent = input;
    span.addEventListener('click', function () {
        deleteToDoElement(this);
    });
    li.addEventListener('click', function () {
        selectToDoElement(this);
    });
    span.classList.add("close");
    span.innerHTML="x";
    li.appendChild(span);
    toDoListDOM.appendChild(li);
    task.value = "";
    var toast = new bootstrap.Toast(toastSuccess);
        toast.show();
    let array = [];
    let liStorage = localStorage.setItem("list",array.push(JSON.stringify(li)))
    console.log(liStorage);
    
  
    

}

function deleteToDoElement(element) {
    var listItem = element.parentElement;
   // listItem.style.display = "none";
    listItem.remove();
}

var closeButtons = document.querySelectorAll('.close');
closeButtons.forEach(function (button) {
    button.addEventListener('click', function () {
        deleteToDoElement(this);
    });
});


function selectToDoElement(element) {
    var listItem = element;
    listItem.classList.toggle("checked");
}

var listItems = document.querySelectorAll('li');
listItems.forEach(function (element) {
    element.addEventListener('click', function () {
        selectToDoElement(this);
    });
});