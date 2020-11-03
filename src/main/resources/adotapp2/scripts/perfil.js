onload = () => {
    let btn = document.getElementById("btn_processos");
    btn.onclick = atualizarStatus;
}
function atualizarStatus(){
	let user = JSON.parse(localStorage.getItem('usuario_ativo'))
	let req = new XMLHttpRequest;
    req.open("post", "/processos/update", false);
	req.onreadystatechange = () => local(user.email);	
    //identificar o formato do envio das informaÃ§Ãµes
    req.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    req.send(`id=${user.id}`);
}

function local(email){
	let req2 = new XMLHttpRequest;
    req2.open("get", "/recebeUsuario?email=" + email, false);
	req2.onreadystatechange = () => {
		if(req2.readyState == 4 && req2.status == 201){
			localStorage.setItem('usuario_ativo', req2.responseText);
		}
		alert("Atualização Completa!");
		location.href = "./perfilUsuario.html";
	};	
	req2.send();
}
