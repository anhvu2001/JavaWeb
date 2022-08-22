/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


function deleteTour(endpoint, id, btn) {
    let r = document.getElementById(`row${id}`);
    let load = document.getElementById(`load${id}`);
    load.style.display = "block";
    btn.style.display = "none";
    fetch(endpoint, {
        method: 'delete'
    }).then(function (res) {
        if (res.status !== 204)
            alert("Something wrong!!!");
        load.style.display = "none";
        r.style.display = "none";
    }).catch(function (err) {
        console.error(err);
        btn.style.display = "block";
        load.style.display = "none";
    });
}


function getTour(endpoint) {
    fetch(endpoint).then(function (res) {
        return res.json();
    }).then(function (data) {
        let d = document.getElementById("adminMyTour");
        if (d !== null) {
            let h = "";
            for (let i = 0; i < data.length; i++)
                h += `
                <tr id="row${data[i].id}">
                    <td>${data[i].id}</td>
                    <td><img src="${data[i].iamge}" width="120" /></td>
                    <td>${data[i].name}</td>
                   
                    <td>
                        <div class="spinner-border text-info" style="display:none" id="load${data[i].id}"></div>
                        <button class="btn btn-danger" onclick="deleteTour('${endpoint + "/" + data[i].id}', ${data[i].id}, this)">DELETE</button>
                    </td>
                </tr>
            `
            d.innerHTML = h;
        }
        let d2 = document.getElementById("loading")
        d2.style.display = "none"
    }).catch(function (err) {
        console.error(err);
    })
}

function loadComments(endpoint) {
    fetch(endpoint).then(function (res) {
        return res.json();
    }).then(function (data) {
        let c = document.getElementById("comments");
        let h = '';
        for (let d of data)
            h += `
        <div style= "margin-top:15px">
            <div class="d-flex flex-start">
                <img class="rounded-circle shadow-1-strong me-3"
                     src="${d.userid.avatar}" alt="avatar" width="60"
                     height="60" />
                <div>
                    <h6 class="fw-bold mb-1">${d.userid.username}</h6>
                    <div class="d-flex align-items-center mb-3">
                        <p class="mb-0">
                            ${moment(d.createdDate).locale("vi").fromNow()}
                            <span class="badge bg-primary">Pending</span>
                        </p>
                        <a href="#!" class="link-muted"><i class="fas fa-pencil-alt ms-2"></i></a>
                        <a href="#!" class="link-muted"><i class="fas fa-redo-alt ms-2"></i></a>
                        <a href="#!" class="link-muted"><i class="fas fa-heart ms-2"></i></a>
                    </div>
                    <p class="mb-0">
                        ${d.content}
                    </p>
                </div>

    </div>
    `;
        c.innerHTML = h;
    });
}

function addComment(endpoint, idtour) {
    fetch(endpoint, {
        method: "post",
        body: JSON.stringify({
            "content": document.getElementById("contentId").value,
            "tourid": idtour
        }),
        headers: {
            "Content-Type": "application/json"
        }
    }).then(function (res) {
        return res.json();
    }).then(function (data) {
        let d = document.querySelector("#comments li:first-child");
        let h = `
                <li class="list-group-item"><em>${data.content}</li>
            `;
        d.insertAdjacentHTML("beforebegin", h);
    });
}

