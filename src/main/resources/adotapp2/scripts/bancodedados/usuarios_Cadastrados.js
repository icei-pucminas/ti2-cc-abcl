onload = () => {
    let btn = document.getElementById("entrar-btn");
    btn.onclick = usuarioCadastrado;
}

function usuarioCadastrado() {
    let email = document.getElementById("email").value;
    let senha = document.getElementById("senha").value;

	let req2 = new XMLHttpRequest;
	    req2.open("get", "/loginUsuario?email=" + email + "&senha=" + senha, true);
		req2.onreadystatechange = () => {
			if(req2.readyState == 4 && req2.status == 201){
				let string = req2.responseText;
				window.location.href = "../HTML/home.html";
				localStorage.setItem('usuario_ativo', string);
			}
		};	
		req2.send();
}
