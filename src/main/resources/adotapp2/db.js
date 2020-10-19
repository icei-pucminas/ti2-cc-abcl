function adicionaUsuario() { // tela de cadastro -> checa se o usuario já existe, se não: adiciona
    var usuarios = [];
    usuarios = JSON.parse(localStorage.getItem("usuarios") || "[]");

    let emailCadastrado = document.getElementById("inputEmailCadastro").value;

    if(usuarios.length == 0){ //se não tiver nenhum usuario no localStorage
        const usuario = {
            nome: this.inputNome.value,
            sobrenome: this.inputSobrenome.value,
            email: this.inputEmailCadastro.value,
            senha: this.inputSenhaCadastro.value
        }

        usuarios = JSON.parse(localStorage.getItem("usuarios") || "[]");

        usuarios.push(usuario);
        localStorage.setItem("usuarios", JSON.stringify(usuarios));

        localStorage.setItem("indexDoUsuario", JSON.stringify(usuarios.length - 1));
        localStorage.setItem("emailLogado", JSON.stringify(usuario.email));

        //document.getElementById('formCadastro').action = "processo.html";
        
        
        
    }else{                  //se já  tiver usuarios no localStorage
        //console.log("Já existe no minimo um usuario.");

        let  jaFoiCadastrado=false;  //iniciando uma variavel booleana para testar se o email fornecido ja foi cadastrado
        for(i=0 ; i < usuarios.length ; i++){
            if(usuarios[i].email == emailCadastrado){
                alert("Esse email ja foi cadastrado.");
                jaFoiCadastrado = true; // se der verdadeiro ele automaticamente para esse script
                document.getElementById('formCadastro').action = "login.html";
                break;
            }
        }
        if(!jaFoiCadastrado){ // se não tiver sido cadastrado ele cadastra no localStorage
            const usuario = {
                nome: this.inputNome.value,
                sobrenome: this.inputSobrenome.value,
                email: this.inputEmailCadastro.value,
                senha: this.inputSenhaCadastro.value
            }

            usuarios = JSON.parse(localStorage.getItem("usuarios") || "[]");

            usuarios.push(usuario);
            localStorage.setItem("usuarios", JSON.stringify(usuarios));

            localStorage.setItem("indexDoUsuario", JSON.stringify(usuarios.length - 1));
            localStorage.setItem("emailLogado", JSON.stringify(usuario.email));

            //document.getElementById('formCadastro').action = "processo.html";
        }
    }

    
}

function checaUsuario() {    // tela de login -> checa se o usuario já existe, se não: manda para o cadastro

    var usuarios = [];
    usuarios = JSON.parse(localStorage.getItem("usuarios") || "[]");

    var emailParaLogin = document.getElementById("inputEmail").value;
    var senhaParaLogin = document.getElementById("inputPassword").value;


    if(usuarios.length == 0){          // se não tiver nenhum usuario no localStorage não tem como ele ser cadastrado
        alert("Email não cadastrado.");
        document.getElementById('formLogin').action = "cadastro.html";
        
    }else{
        var jaFoiCadastrado=false;  //iniciando uma variavel booleana para testar se o email fornecido ja foi cadastrado

        for(i=0 ; i < usuarios.length ; i++){
            if(usuarios[i].email === emailParaLogin){
                localStorage.setItem("indexDoUsuario", JSON.stringify(i));
                jaFoiCadastrado = true; // se der verdadeiro ele automaticamente para esse script
                if(usuarios[i].senha == senhaParaLogin){
                   //document.getElementById('formLogin').action = "home.html"; // se a senha informada for igual à existente no localstorage, login
                    localStorage.setItem("emailLogado", JSON.stringify(emailParaLogin));
                }
                else alert("Senha incorreta."); // senha fornecida não bate com a cadastrada no localstorage
                
                break;
            }
        }

    
        /*if(!jaFoiCadastrado){
            alert("Email não cadastrado.");
            document.getElementById('formLogin').action = "cadastro.html";  
            
        }*/
    }
}


function mostraUsuario() {

    var arrayUsuarios = JSON.parse(localStorage.getItem("usuarios") || "[]");
/*
    if(document.referrer == "login.html"){

    }else if(document.referrer == "cadastro.html"){
        var nomeUsuario = arrayUsuarios[arrayUsuarios.length-1].nome;
        var sobrenomeUsuario = arrayUsuarios[arrayUsuarios.length-1].sobrenome;
    }*/

    var i = JSON.parse(localStorage.getItem("indexDoUsuario"));

    var nomeUsuario = arrayUsuarios[i].nome;
    var sobrenomeUsuario = arrayUsuarios[i].sobrenome;

    document.getElementById("nomeUsuario").innerHTML = `${nomeUsuario} ${sobrenomeUsuario}`;

    //var nomeUsuario = arrayUsuarios[meuIndex].nome;
    //var sobrenomeUsuario = arrayUsuarios[meuIndex].sobrenome;
    

      /*iterar por cada objeto da lista de usuarios
        o objeto que tiver o email igual ao fornecido vai ser selecionado
        pegar o nome e sobrenome do objeto selecionado

    let objetoEncontrado; // variavel booleana para identificar em qual i em usuarios[i] foi encontrado o email igual

    document.getElementById("nomeUsuario").innerHTML = `${nomeUsuario} ${sobrenomeUsuario}`; */

    if(document.getElementById("nomeUsuario").innerHTML == "" ){
        alert("Você precisa fazer login!");
        // window.location.href = "login.html";
    }
}


function validateForm() {  /* Sistema de enviar emails */
    var name =  document.getElementById('name').value;
    if (name == "") {
        document.querySelector('.status').innerHTML = "O nome não pode ficar vazio";
        return false;
    }
    var email =  document.getElementById('email').value;
    if (email == "") {
        document.querySelector('.status').innerHTML = "O email não pode ficar vazio";
        return false;
    } else {
        var re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
        if(!re.test(email)){
            document.querySelector('.status').innerHTML = "Formato de email inválido";
            return false;
        }
    }
    var subject =  document.getElementById('subject').value;
    if (subject == "") {
        document.querySelector('.status').innerHTML = "Assunto não pode ficar vazio";
        return false;
    }
    var message =  document.getElementById('message').value;
    if (message == "") {
        document.querySelector('.status').innerHTML = "Mensagem não pode ficar vazia";
        return false;
    }
    document.querySelector('.status').innerHTML = "Enviando...";
}
