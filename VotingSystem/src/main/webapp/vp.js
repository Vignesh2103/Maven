const uri = "http://localhost:9090/vp";

function getAllResults() {
    console.log("Display Item");
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            console.log(JSON.parse(xhttp.responseText));
            var response = JSON.parse(xhttp.responseText);
            displaygenderCount(response.genderCount);
             displaynonVoters(response.nonVoters);
            // displaypartyCount(response.partyCount);
        }
    };
    xhttp.open("GET", uri, true);
    xhttp.send();
}

function displaygenderCount(data) {
    const tableBody = document.getElementById('table-body');
    tableBody.innerHTML = ''; // clear the previous contents of the table body
    
    for (const partyName in data) {
        const row = document.createElement('tr');
        const nameCell = document.createElement('td');
        const femaleCell = document.createElement('td');
        const maleCell = document.createElement('td');
  
        nameCell.textContent = partyName;
        femaleCell.textContent = data[partyName].Female || 0;
        maleCell.textContent = data[partyName].Male || 0;
  
        row.appendChild(nameCell);
        row.appendChild(femaleCell);
        row.appendChild(maleCell);
  
        tableBody.appendChild(row);
    }
}
function displaynonVoters(data)
{
    var tableBody = document.querySelector("#votersTable tbody");
    console.log("Display Non Voter");
    console.log(data.length);
    console.log(data);

    for (var i = 0; i < data.length; i++) {
        var voter = data[i];
    
        // Create a table row element
        var row = document.createElement("tr");
    
        // Create table cells for each voter property
        var idCell = document.createElement("td");
        idCell.textContent = voter.voter_id;
        row.appendChild(idCell);
    
        var nameCell = document.createElement("td");
        nameCell.textContent = voter.name;
        row.appendChild(nameCell);
    
        var emailCell = document.createElement("td");
        emailCell.textContent = voter.email;
        row.appendChild(emailCell);
    
        var ageCell = document.createElement("td");
        ageCell.textContent = voter.age;
        row.appendChild(ageCell);
    
        var genderCell = document.createElement("td");
        genderCell.textContent = voter.gender;
        row.appendChild(genderCell);
    
        var wardCell = document.createElement("td");
        wardCell.textContent = voter.ward;
        row.appendChild(wardCell);
    
        // Add the row to the table body
        tableBody.appendChild(row);
      }

}
