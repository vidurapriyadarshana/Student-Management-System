console.log("JS Loded");

document.getElementById("save-btn").addEventListener("click", () => {
  let txtName = document.getElementById("txt-name").value;
  let txtAddress = document.getElementById("txt-address").value;

  let requestBody = {
    name: txtName,
    address: txtAddress,
  };

  fetch("http://localhost:8080/student/create", {
    method: "POST",
    body: JSON.stringify(requestBody),
    headers: new Headers({ "Content-Type": "application/json" }),
  })
    .then((data) => data.json())
    .then((data) => {
      console.log(data);
    });
});

// function btnRegister() {

//     let txtName = document.getElementById("txt-name").value;
//     let txtAddress = document.getElementById("txt-address").value;

//     let requestBody = {
//         "name": txtName,
//         "address": txtAddress
//     };

//     fetch("http://localhost:8080/student/create", {
//         method: 'POST',
//         body: requestBody
//     })
//         .then(data => data.json())
//         .then(data => {
//             console.log(data);
//         });
// }
