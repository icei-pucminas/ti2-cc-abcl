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
    req.open("post", "/adicionarUsuario", true)
    //identificar o formato do envio das informações
    req.setRequestHeader("Content-Type", "application/x-www-form-urlencoded")
    req.send(`senha=${senha}&nome=${nome}&sobrenome=${sobrenome}&email=${email}&telefone=${telefone}`)
}



function senhasCheck(i) {
    let senha = document.getElementById("inputSenhaCadastro").value;
    let confirma = document.getElementById("inputSenhaConfirma").value;

    if (senha == confirma) {
        i.preventDefault()
        enviarDados(senha);
        location.href = "./home.html"
    } else {
        alert("SENHAS INCORRETAS!");
        i.preventDefault()
    }
}