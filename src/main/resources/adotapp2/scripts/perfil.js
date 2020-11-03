onload = () => {
    let btn = document.getElementById("btn_processos");
    btn.onclick = atualizarStatus;
}

function atualizarStatus(){
	let user = JSON.parse(localStorage.getItem('usuario_ativo'))
	let req = new XMLHttpRequest;
    req.open("post", "/processos/update", false);
	req.onreadystatechange = () => atualizarUsuario(user);	
    //identificar o formato do envio das informações
    req.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    req.send(`id=${user.id}`);
}

function atualizarUsuario(user){
	let req2 = new XMLHttpRequest;
    req2.open("post", "/usuarios/update", false);
	req2.onreadystatechange = () => local(user.email);
    //identificar o formato do envio das informações
    req2.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    req2.send(`id=${user.id}`);
}

function local(email){
	let req3 = new XMLHttpRequest;
    req3.open("get", "/recebeUsuario?email=" + email, false);
	req3.onreadystatechange = () => {
		if(req3.readyState == 4 && req3.status == 201){
			localStorage.setItem('usuario_ativo', req3.responseText);
		}
		alert("Atualiza��o Completa!");
		location.href = "./perfilUsuario.html";
	};	
	req3.send();
}
