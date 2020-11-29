onload = () => {
	let btn = document.getElementById("entrar-btn");
	btn.onclick = usuarioCadastrado;
}

function dados() {
	let senha = document.getElementById("senha").value;
	let dados = JSON.parse(this.responseText);
	if (dados.senha == CryptoJS.SHA512(senha)) {
		console.log(dados.senha)
		location.href = "../HTML/home.html";
		let filta = {
			"nome": dados.nome,
			"sobrenome": dados.sobrenome,
			"id": dados.id,
			"email": dados.email,
			"processo_ativo": dados.processo_ativo
		}
		localStorage.setItem('usuario_ativo', JSON.stringify(filta));
	} else {
		$('#senhaIncorreta').fadeIn('fast')
		$('#senhaIncorreta').fadeTo('slow');
	}
}

function usuarioCadastrado() {
	let email = document.getElementById("email").value;
	let req2 = new XMLHttpRequest;
	req2.open("get", "/loginUsuario?email=" + email, true);
	req2.onload = dados;
	req2.send();
}
