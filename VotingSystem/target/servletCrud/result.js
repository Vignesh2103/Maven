// const uri = "http://localhost:9090/result";
// let pollingDetails = [];

// let updateIndex = 0;
// function getAllVotes() {
//     console.log("Display Item");
//     var xhttp = new XMLHttpRequest();
//     xhttp.onreadystatechange = function () {
//         if (this.readyState == 4 && this.status == 200) {
//             console.log(JSON.parse(xhttp.responseText));
//             var response = JSON.parse(xhttp.responseText);
//             // _displayItems(response.nonPollingList);
//             // _displayPartyCounts(response.partyCounts);
//             // _displaygenderCount(response.genderCount);
//             _displaysortedPartyCount(response.sortedPartyCount);

//         }
//     };
//     xhttp.open("GET", uri, true);
//     xhttp.send();
// }
// function _displayItems(data) {
//     pollingDetails = data;
//     console.log(data);
//     var html = "<table border='1|1'>";
//     for (var i = 0; i < data.length; i++) {
//         html += "<tr>";
//         html += "<td>" + data[i].voter_id + "</td>";
//         html += "<td>" + data[i].name + "</td>";
//         html += "</tr>";
//     }
//     html += "</table>";
//     document.getElementById("nonPollingList").innerHTML = html;
// }
// function _displayPartyCounts(data) {
//     console.log(data);
//     var html = "<table border='1|1'>";
//     html += "<tr>";
//     html += "<th>Party Name</th>";
//     html += "<th>Count</th>";
//     html += "</tr>";
//     Object.entries(data).forEach(([key, value]) => {
//         html += "<tr>";
//         html += "<td>" + key + "</td>";
//         html += "<td>" + value + "</td>";
//         html += "</tr>";
//     });
//     html += "</table>";
//     document.getElementById("partyCounts").innerHTML = html;
// }

// function _displaygenderCount(data) {
//     console.log(data);
//     var html = "<table border='1|1'>";
//     html += "<tr>";
//     html += "<th>Gender</th>";
//     html += "<th>Count</th>";
//     html += "</tr>";
//     Object.entries(data).forEach(([key, value]) => {
//         html += "<tr>";
//         html += "<td>" + key + "</td>";
//         html += "<td>" + value + "</td>";
//         html += "</tr>";
//     });
//     html += "</table>";
//     document.getElementById("genderCount").innerHTML = html;
// }

// function _displaysortedPartyCount(data) {
//     const partyCounts = data;
//     console.log(partyCounts);
//     // var html = "<table border='1|1'>";
//     // html += "<tr>";
//     // html += " <th>Ward</th>";
//     // html += "<th>Party</th>";
//     // html += "<th>Count</th>";
//     // html += "</tr>";
//     // Object.entries(data).forEach(([ward, parties]) => { 
//     //     Object.entries(parties).forEach(([party, count]) => { 
//     //     html += "<tr>"; 
//     //     html += "<td>" + ward + "</td>"; 
//     //     html += "<td>" + party + "</td>";
//     //     html += "<td>" + count + "</td>"; 
//     //     html += "</tr>"; }); });
//     // html += "</table>";
//     // Get the table body
//     const tbody = document.querySelector('#party-count tbody');

//     // Loop through the data and create table rows
//     partyCounts.forEach((partyCount) => {
//         const row = document.createElement('tr');
//         const partyCell = document.createElement('td');
//         partyCell.textContent = partyCount.party;
//         row.appendChild(partyCell);
//         const countCell = document.createElement('td');
//         countCell.textContent = partyCount.count;
//         row.appendChild(countCell);
//         tbody.appendChild(row);
//     });
//     document.getElementById("party-count").innerHTML = html;
// }



const uri = "http://localhost:9090/result";
let pollingDetails = [];

function getAllVotes() {
    console.log("Display Item");
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            console.log(JSON.parse(xhttp.responseText));
            var response = JSON.parse(xhttp.responseText);
            displayNonPollingList(response.nonPollingList);
            displayPollingList(response.pollingList);
            displayPartyCounts(response.partyCounts);
            displayGenderCount(response.genderCount);
            displayPartyCount(response.partyCount);
        }
    };
    xhttp.open("GET", uri, true);
    xhttp.send();
}

function displayNonPollingList(data) {
    console.log(data);
    var html = "<table border='1|1'>";
    for (var i = 0; i < data.length; i++) {
        html += "<tr>";
        html += "<td>" + data[i].voter_id + "</td>";
        html += "<td>" + data[i].name + "</td>";
        html += "</tr>";
    }
    html += "</table>";
    document.getElementById("nonPollingList").innerHTML = html;
}

function displayPollingList(data) {
    console.log(data);
    var html = "<table border='1|1'>";
    for (var i = 0; i < data.length; i++) {
        html += "<tr>";
        html += "<td>" + data[i].voter_id + "</td>";
        html += "<td>" + data[i].name + "</td>";
        html += "<td>" + data[i].ward + "</td>";
        html += "<td>" + data[i].party + "</td>";
        html += "</tr>";
    }
    html += "</table>";
    document.getElementById("pollingList").innerHTML = html;
}

function displayPartyCounts(data) {
    console.log(data);
    var html = "<table border='1|1'>";
    html += "<tr>";
    html += "<th>Party Name</th>";
    html += "<th>Count</th>";
    html += "</tr>";
    Object.entries(data).forEach(([key, value]) => {
        html += "<tr>";
        html += "<td>" + key + "</td>";
        html += "<tr>"
    });
}