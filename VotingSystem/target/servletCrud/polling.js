const uri = "http://localhost:9090/polling";
function addItem() {
    console.log("polling aditem");
    const item = {
        voter_id: document.getElementById("voter_id").value,
        ward: document.getElementById("ward").value,
        party_name: document.getElementById("party_name").value,
    };
    var xhttp = new XMLHttpRequest();
    xhttp.open("POST", uri, true);
    xhttp.setRequestHeader("Content-type", "application/json");
    xhttp.send(JSON.stringify(item));
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
          //  getItems(); 
          alert("Your vote was Successfully added");
          window.location.replace("http://localhost:9090/result.html");
        }
      }

}