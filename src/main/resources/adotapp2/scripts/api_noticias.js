const key = '0268970874de443aaf0e96bb4d490f4f'

onload = () => {
    alert()
}

function exibir(){
    let tela = document.getElementById('tela')
    let texto = ''

    let dados = JSON.parse(this.responseText)

    for(i = 0; i < dados.articles.length; i++){
        let noticia = dados.articles[i];
        let data = new Date (noticia.publishedAt);

        texto = texto + `
        <div class="row box_noticias">
        <div class="col-4">
          <img
            src="${noticia.urlToImage}"
            style=" max-width: 100%; margin-top: 10px;" alt="">
        </div>
        <div class="col-8">
          <div class="card " style="max-width: 100%; margin-top: 10px;">
            <div class="card-body">
              <h2 class="card-title">${noticia.title}</h2>
              <p>${data.toLocaleDateString ()} ${noticia.source.name}Por ${noticia.author}</p>
              <p class="card-text">${noticia.content} ...</p>
              <a target="_blank"
                href="${noticia.url}"
                class="btn btn-primary">Continuar lendo</a>
            </div>
          </div>
        </div>
      </div>        
        `;
    };

    // Preencher a DIV com o texto HTML
    divTela.innerHTML = texto;
}

function executaPesquisa () {
    alert()
    let xhr = new XMLHttpRequest ();
    xhr.onload = exibe;
    xhr.open ('GET', `https://newsapi.org/v2/everything?q=adoção&apiKey=${API_KEY}`);
    xhr.send ();
}