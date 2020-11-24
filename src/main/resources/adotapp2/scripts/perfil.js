onload = () => {
	let btn = document.getElementById("btn_processos");
	btn.onclick = atualizarStatus;
}

function atualizarStatus() {
	let user = JSON.parse(localStorage.getItem('usuario_ativo'))
	let req = new XMLHttpRequest;
	req.open("post", "/processos/update", false);
	req.onreadystatechange = () => atualizarUsuario(user);
	//identificar o formato do envio das informações
	req.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
	req.send(`id=${user.id}`);
}

function atualizarUsuario(user) {
	let req2 = new XMLHttpRequest;
	req2.open("post", "/usuarios/update", false);
	req2.onreadystatechange = () => local(user.email);
	//identificar o formato do envio das informações
	req2.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
	req2.send(`id=${user.id}`);
}

function info_() {
	let dados = JSON.parse(this.responseText)
	console.log(dados)
	let filtrado = {
		"nome": dados.nome,
		"sobrenome": dados.sobrenome,
		"id": dados.id,
		"processo_ativo": dados.processo_ativo
	}
	localStorage.setItem('usuario_ativo', JSON.stringify(filtrado));
	location.href = "./home.html";
}

function local(email) {
	let req3 = new XMLHttpRequest;
	req3.open("get", "/recebeUsuario?email=" + email, false);
	req3.onload = info_
	alert("Atualização Completa!");
	location.href = "./perfilUsuario.html";
	req3.send();
}
