onload = () => {
    let btn = document.getElementById("btn_processos");
    btn.onclick = atualizarStatus;
}
function atualizarStatus(){
	let user = JSON.parse(localStorage.getItem('usuario_ativo'))
}
