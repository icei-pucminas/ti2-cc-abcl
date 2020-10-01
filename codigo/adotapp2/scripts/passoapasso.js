let passos = [
    `Procure o Fórum ou a Vara da Infância e da Juventude da sua cidade ou região com os <a href="documentacao.html">documentos necessários</a>.`,
    "Aguarde até que os documentos sejam autuados pelo cartório e analisados pelo promotor de Justiça.",
    "Você irá participar de uma avaliação por parte de uma equipe profissional, visando analisar suas condições financeiras e psicológicas.",
    "Em seguida, você será submetido a aulas de preparação para adoção, com o intuito de lhe passar todo conhecimento necessário para o sucesso no procedimento.",
    "Após tudo isso, seu requerimento será análisado pelas autoridades judiciárias. Aqui será levado em conta o seu resultado frente a todos os últimos passos.",
    "Obtendo sucesso, você ingressará ao Sistema Nacional de Adoção e Acolhimento, constando como aprovado no processo adotivo.",
    "O perfil familiar traçado para você agora será utilizado para encontrar uma criança correspondente, só lhe resta aguardar. Caso encontre uma criança, você poderá se aproximar dela fazendo visitas enquanto o processo se dá continuidade.",
    "Caso a aproximação seja bem-sucedida, você passará a viver com a criança por um período de 90 dias, sendo acompanhados de uma equipe técnica orientada pelo poder Judiciário.",
    "Depois desse tempo, você poderá propor a adoção, e, após as verificações do juiz responsável, você finalmente terá permissão para adotar a criança!"
];

onload = () => {
    let conteudo = "";

    for(i=0 ; i < passos.length ; i++){
        conteudo += `<li>${passos[i]}</li>`;
    }

    document.getElementById("listaPassos").innerHTML = conteudo;
}