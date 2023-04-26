const voters = [{"voter_id":"007","party_name":"ADMK","ward":"007"},{"voter_id":"008","party_name":"ADMK","ward":"999"},{"voter_id":"008","party_name":"DMK","ward":"777"},{"voter_id":"007","party_name":"DMK","ward":"777"},{"voter_id":"008","party_name":"CONGRESS","ward":"777"},{"voter_id":"008","party_name":"ADMK","ward":"777"},{"voter_id":"007","party_name":"BJP","ward":"999"}];

const groupedVoters = {};

for (const voter of voters) {
  if (groupedVoters[voter.party_name]) {
    groupedVoters[voter.party_name] += 1;
  } else {
    groupedVoters[voter.party_name] = 1;
  }
}

console.log(groupedVoters);
for (const [key, value] of Object.entries(groupedVoters)) {
    console.log(`${key}: ${value}`);
  }
  const numbers = [1, 2, 3, 4, 5];

// const sum = numbers.reduce((acc, curr) => acc + curr, 0);
sum = numbers.reduce((a,c)=> a+c,10)

console.log(sum); // Output: 15

