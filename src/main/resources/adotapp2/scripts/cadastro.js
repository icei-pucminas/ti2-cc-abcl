onload = () => {
    let btn = document.getElementById("confirma");
    btn.onclick = senhasCheck;
}

function enviarDados(senha) {
    let nome = document.getElementById("nome").value;
    let sobrenome = document.getElementById("sobrenome").value;
    let email = document.getElementById("email").value;
    let telefone = document.getElementById("telefone").value;

    let req = new XMLHttpRequest;
    req.open("post", "/adicionarUsuario", false);
	req.onreadystatechange = () => local(email);	
    //identificar o formato do envio das informações
    req.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    req.send(`senha=${senha}&nome=${nome}&sobrenome=${sobrenome}&email=${email}&telefone=${telefone}`);
}

function local(email){
	let req2 = new XMLHttpRequest;
    req2.open("get", "/recebeUsuario?email=" + email, false);
	req2.onreadystatechange = () => {
		if(req2.readyState == 4 && req2.status == 201){
			localStorage.setItem('usuario_ativo', req2.responseText);
		}
		location.href = "./home.html";
	};	
	req2.send();
}

function senhasCheck(i) {
    let senha = document.getElementById("inputSenhaCadastro").value;
    let confirma = document.getElementById("inputSenhaConfirma").value;

    if (senha == confirma) {
        i.preventDefault()
        enviarDados(senha);
    } else {
        alert("SENHAS INCORRETAS!");
        i.preventDefault()
    }
}