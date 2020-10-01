let pergunta = {
    "perguntas":[
        {
        "id": 1,
        "pergunta": "Quem pode adotar?",
        "resposta": "Toda pessoa com mais de 18 anos de idade, seja ela casada, solteira ou em união estável, pode adotar uma criança ou um adolescente. O adotante deve ser pelo menos 16 anos mais velho que a criança ou o adolescente que pretende adotar."
        },
        {
        "id": 2,
        "pergunta": "Quais são os requisitos que tornam apto quem pretende adotar?",
        "resposta": "Além de ter idade acima de 18 anos, o pretendente deve possuir idoneidade moral e motivação idônea para a adoção. A lei também prevê a frequência a curso preparatório para adoção, onde serão prestados esclarecimentos e efetuadas as avaliações correspondentes, que definirão se a pessoa está apta ou inapta a adotar."
        },
        {
        "id": 3,
        "pergunta": "O processo de adoção custa caro?",
        "resposta": "Não custa nada. Tanto o processo de habilitação à adoção quanto a adoção propriamente dita são isentos de custas judiciais. Além disso, não é preciso contratar advogado e os requerimentos podem ser formulados diretamente em cartório pelos interessados."
        }
    ]
};

onload = () => {
    function perguntas (){
        let p = document.getElementsByClassName('pergunta');
        for(i = 0 ; i < p.length; i++){
            p[i].innerHTML = pergunta.perguntas[i].pergunta;
        }
    }
    perguntas();

    function respostas(){
        let r = document.getElementsByClassName('resposta');
        for(i = 0 ; i < r.length; i++){
            r[i].innerHTML = pergunta.perguntas[i].resposta;
        }
    }

    respostas();
}

