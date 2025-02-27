let senhasNor = []; 
let senhasPri = []; 
let atendidos = []; 

function imprimirSenhaNormal() {
    const numeroSenha = senhasNor.length + 1;  
    senhasNor.push("N-" + numeroSenha);  
    mostrarMensagem("Senha normal gerada: N-" + numeroSenha);
}

function imprimirSenhaPri() {
    const numeroSenha = senhasPri.length + 1;  
    senhasPri.push("P-" + numeroSenha);  
    mostrarMensagem("Senha prioridade gerada: P-" + numeroSenha);
}

function atenderPaciente() {
    if (senhasPri.length > 0) {
        const senhaAtendida = senhasPri.shift();  
        atendidos.push(senhaAtendida);  
        mostrarMensagem("Paciente com a senha " + senhaAtendida + " foi atendido.");
    } else if (senhasNor.length > 0) {
        const senhaAtendida = senhasNor.shift();  
        atendidos.push(senhaAtendida);  
        mostrarMensagem("Paciente com a senha " + senhaAtendida + " foi atendido.");
    } else {
        mostrarMensagem("Não há senhas para atendimento.");
    }
}

function exibirRelatorio() {
    let relatorio = "<h3>Relatório de Atendimentos:</h3>";
    relatorio += "<h4>Senhas Normais:</h4><ul>";
    senhasNor.forEach(s => relatorio += "<li>" + s + "</li>");
    relatorio += "</ul>";

    relatorio += "<h4>Senhas Prioritárias:</h4><ul>";
    senhasPri.forEach(s => relatorio += "<li>" + s + "</li>");
    relatorio += "</ul>";

    relatorio += "<h4>Atendidos:</h4><ul>";
    atendidos.forEach(s => relatorio += "<li>" + s + "</li>");
    relatorio += "</ul>";

    document.getElementById("relatorio").innerHTML = relatorio;
}

function mostrarMensagem(mensagem) {
    document.getElementById("mensagem").innerText = mensagem;
}

function mostrarMenu() {
    let menuHTML = `
        <h2>Menu de Opções:</h2>
        <ul>
            <li><a href="javascript:void(0);" onclick="executarComando(1)">1 - Imprimir Nova Senha Normal</a></li>
            <li><a href="javascript:void(0);" onclick="executarComando(2)">2 - Imprimir Nova Senha Prioritária</a></li>
            <li><a href="javascript:void(0);" onclick="executarComando(3)">3 - Relatório</a></li>
            <li><a href="javascript:void(0);" onclick="executarComando(4)">4 - Atender Paciente</a></li>
            <li><a href="javascript:void(0);" onclick="executarComando(5)">5 - Sair</a></li>
        </ul>
    `;
    document.getElementById("menu").innerHTML = menuHTML;
}

function executarComando(opcao) {
    switch(opcao) {
        case 1:
            imprimirSenhaNormal();
            break;
        case 2:
            imprimirSenhaPri();
            break;
        case 3:
            exibirRelatorio();
            break;
        case 4:
            atenderPaciente();
            break;
        case 5:
            sair();
            break;
        default:
            mostrarMensagem("Opção inválida.");
    }
}

function sair() {
    mostrarMensagem("Sistema finalizado. Até logo!");
    document.getElementById("menu").innerHTML = "";
}
