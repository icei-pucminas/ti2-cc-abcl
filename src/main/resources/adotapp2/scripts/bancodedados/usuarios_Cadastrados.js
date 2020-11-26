onload = () => {
    let btn = document.getElementById("entrar-btn");
    btn.onclick = usuarioCadastrado;
}

function usuarioCadastrado() {
    let email = document.getElementById("email").value;
    let senha = document.getElementById("senha").value;

	let req2 = new XMLHttpRequest;
	    req2.open("get", "/loginUsuario?email=" + email + "&senha=" + senha, true);
		req2.onload = () => {
			if(req2.readyState == 4 && req2.status == 201){
				let dados = JSON.parse(req2.responseText);
				window.location.href = "../HTML/home.html";
				let filta = {
					"nome": dados.nome,
					"sobrenome": dados.sobrenome,
					"id": dados.id,
					"email": dados.email,
					"processo_ativo": dados.processo_ativo
				}
				localStorage.setItem('usuario_ativo', JSON.stringify(filta));
			}else{
				$('#senhaIncorreta').fadeIn('fast')
				$('#senhaIncorreta'),delay(200).fadeTo("slow");
			}
		};	
		req2.send();
}
