let documentos = [
    "Cópias autenticadas: da Certidão de nascimento ou casamento, ou declaração relativa ao período de união estável",
    "Cópias da Cédula de identidade e da Inscrição no Cadastro de Pessoas Físicas (CPF)",
    "Comprovante de renda e de residência",
    "Atestados de sanidade física e mental",
    "Certidão negativa de distribuição cível",
    "Certidão de antecedentes criminal",
    "Comprovante de conclusão das aulas preparativas"
];

let locaisDocs = [
    "Cartório do Registro Civil e Notas",
    "Agência dos Correios",
    "Portal online do Registro Civíl",
    "Unidade de Atendimento Integral local",
    "Profissional qualificado análises psicológicas",
    "Receita Federal",
    "Polícial Federal"
];


onload = () => {
    let docs = "";

    for(i=0 ; i < documentos.length ; i++){
        if(i < 6){
            docs += `
            <div class="custom-control custom-checkbox documentoPrevio">
                <input class="custom-control-input" id="customCheck${i+1}" type="checkbox">
                <label class="custom-control-label" for="customCheck${i+1}">${documentos[i]}</label>
            </div>
            `;
        }else{
            docs += `
            <div class="custom-control custom-checkbox documentoApos">
                <input class="custom-control-input" id="customCheck${i+1}" type="checkbox">
                <label class="custom-control-label" for="customCheck${i+1}">${documentos[i]}</label>
            </div>
            `;
        }
    }

    document.getElementById("listaDocumentos").innerHTML = docs;


    let locais = "";

    for(i=0 ; i < locaisDocs.length ; i++){
        locais += `<li>${locaisDocs[i]}</li>`;
    }

    document.getElementById("listaLocais").innerHTML = locais;
}