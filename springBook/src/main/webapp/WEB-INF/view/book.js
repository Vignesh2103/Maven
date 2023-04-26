const uri = "http://localhost:9090/list";

function getAllBooks() {
    console.log("Display Item");
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            console.log(JSON.parse(xhttp.responseText));
            var response = JSON.parse(xhttp.responseText);
            displayBookList(response);
             
        }
    };
    xhttp.open("GET", uri, true);
    xhttp.send();
}


function displayBookList(data){
    console.log(data);
    const tableBody = document.getElementById('book-table');
   
    
    for (const book in data) {
        const row = document.createElement('tr');
        const id = document.createElement('td');
        const title = document.createElement('td');
        const author = document.createElement('td');
        const price = document.createElement('td');
  
        id.textContent = book.id;
        title.textContent = book.title;
        author.textContent = book.author;
        price.textContent = book.price;
     
  
        row.appendChild(id);
        row.appendChild(title);
        row.appendChild(author);
        row.appendChild(price);
  
        tableBody.appendChild(row);
    }

}