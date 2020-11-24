var questionario = [
    {
        "pergunta": "Você já sabe quais são ou já possui todos os documentos necessários?"
    },

    {
        "pergunta": "Você já iniciou a sua petição?"
    },

    {
        "pergunta": "Você já fez a entrevista preliminar?"
    },

    {
        "pergunta": "Você já participa ou completou as aulas de capacitação parental?"
    }
];
function togglePopup(){
    document.getElementById("popup-1").classList.toggle("active");
  }
function togglePopup2(){
    document.getElementById("popup-2").classList.toggle("active");
}
  

onload = () => {
    // mostraUsuario();
    // atualizaTabela();
    /*
    if(window.location.href == "home.html"){
        atualizaTabela();
    }*/

    /*var titulo = document.getElementById("pergunta");
    document.querySelector(".respostas").style.display = "none";

    let radioNao = document.getElementById("nao");
    let radioSim = document.getElementById("sim");
    */
    // let email = JSON.parse(localStorage.getItem("emailLogado"));

    // let respostas = [];
    // let i=0;
    // document.querySelector("#proximo").onclick = () => {
    //     if(i == questionario.length){
    //         if(radioSim.checked) respostas.push(true);
    //         else if(radioNao.checked) respostas.push(false);

    //         let usuarios = JSON.parse(localStorage.getItem("usuarios"));
    //         console.log(usuarios);

    //         for(c=0 ; c < usuarios.length ; c++){
    //             if(usuarios[c].email == email) usuarios[c].progresso = respostas;
    //         }

    //         localStorage.setItem("usuarios", JSON.stringify(usuarios));

    //         document.getElementById("display").innerHTML = `Você completou o questionário!`;
    //         setTimeout(function(){window.location="home.html";}, 3000);
    //     }
    //     if(i < questionario.length){
    //         console.log(respostas);
    //         titulo.innerHTML = questionario[i].pergunta;
    //         if(radioSim.checked) respostas.push(true);
    //         else if(radioNao.checked) respostas.push(false);

    //         i++;

    //         radioNao.checked = false;
    //         radioSim.checked = false;
    //         document.querySelector(".respostas").style.display = "block";
    //     }
    // }        
}

function atualizaTabela() {
    var x = JSON.parse(localStorage.getItem("indexDoUsuario"));
    var usuarios = [];
    usuarios = JSON.parse(localStorage.getItem("usuarios") || "[]");

    for(i=0 ; i < 4 ; i++){
        console.log(usuarios[x].progresso[i]);
        if(usuarios[x].progresso[i]){
            document.getElementById("progresso" + (i+1)).style.width = "100%";
            document.getElementById("progressoDetalhe" + (i+1)).innerText = "Completo!";
        }
        else{
            document.getElementById("progresso" + (i+1)).style.width = "1%"
            // document.getElementById("progressoDetalhe" + (i+1)).innerHTML = ``;
        }
    }
}

function realizado(i) {
    var x = JSON.parse(localStorage.getItem("indexDoUsuario"));
    var usuarios = [];
    usuarios = JSON.parse(localStorage.getItem("usuarios") || "[]");

    usuarios[x].progresso[i-1] = true;

    document.getElementById("progresso" + i).style.width = "100%";
    document.getElementById("progressoDetalhe" + i).innerText = "Completo!";

    localStorage.setItem("usuarios", JSON.stringify(usuarios));
}

const date = new Date();



document.querySelector(".prev").addEventListener("click", () => {
  date.setMonth(date.getMonth() - 1);
  renderCalendar();
});

document.querySelector(".next").addEventListener("click", () => {
  date.setMonth(date.getMonth() + 1);
  renderCalendar();
});

renderCalendar();


var etapa1 = [
    {
        "id": 0,
        "descricao": "Você decidiu adotar. Então, procure a Vara de Infância e Juventude do seu município e saiba quais documentos deve começar a juntar. A idade mínima para se habilitar à adoção é 18 anos, independentemente do estado civil, desde que seja respeitada a diferença de 16 anos entre quem deseja adotar e a criança a ser acolhida.",
        "titulo": "Tomar a decisao",
        "titulo2": "Documentação"
    }
]
