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
        },
        {
            "id": 4,
            "pergunta": "O que é poder familiar?",
            "resposta": "É o poder de pai e mãe, antes chamado de pátrio poder. O poder de decisão sobre onde a criança vai morar, estudar, por quais médicos será atendida, com quem vai conviver etc. É o dever de protegê-la, educá-la e garantir que nada falte. O termo pátrio poder, que remete a uma sociedade muito mais patriarcal, foi usado até a promulgação do Novo Código Civil, de 2002. O termo poder familiar faz muito mais justiça às famílias da atualidade, já que, de acordo com as últimas pesquisas nacionais por amostras de domicílios (Pnad), hoje as mulheres chefiam quase um terço dos lares brasileiros."
        },
        {
            "id": 5,
            "pergunta": "Se deixarem um bebê na minha porta, eu poderei adotá-lo?",
            "resposta": "Isso vai depender da avaliação do juiz da sua região. O correto é que você leve a criança até o fórum e a entregue para a assistência social. Se você tiver o real desejo de adotá-la, pode solicitar a guarda provisória, enquanto é dado encaminhamento ao processo, mas você corre o risco de criar vínculos e perder a guarda no meio do caminho por decisão do juiz. Lembre-se de que você terá de fazer um cadastro e passar por todas as avaliações pelas quais passam todos os candidatos a adoção. Apesar da sua intenção, o juiz pode determinar que a criança seja entregue a uma família que já aguarda por um bebê há mais tempo.",
        },
        {
            "id": 6,
            "pergunta" : "E se uma gestante me oferecer o filho para adoção?",
            "resposta": "Mesmo assim você deve procurar com ela a vara da infância da região dela para que a mulher seja acompanhada pela assistência social. Esse tipo de adoção, em que a mãe entrega o filho para uma pessoa que ela escolheu, é chamada de adoção pronta, ou consensual. Mesmo nesse caso, você também terá de passar pela avaliação no fórum da sua região para ser habilitado. Vale saber que nem todos os juízes aceitam esse modo de adoção e podem determinar que a criança seja entregue a uma família previamente cadastrada.",
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

