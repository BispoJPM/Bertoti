const apiURL = 'http://localhost:8080/chas'; // URL do seu backend

// Função para carregar todos os chás
function loadChas() {
    axios.get(apiURL)
        .then(response => {
            const chaTableBody = document.getElementById('chasTable').getElementsByTagName('tbody')[0];
            chaTableBody.innerHTML = ''; // Limpar a tabela antes de popular

            response.data.forEach(cha => {
                const row = chaTableBody.insertRow();
                row.innerHTML = `
                    <td>${cha.id}</td>
                    <td>${cha.nome}</td>
                    <td>${cha.tipo}</td>
                    <td>
                        <button onclick="setUpdateFields('${cha.id}', '${cha.nome}', '${cha.tipo}')">Editar</button>
                        <button onclick="deleteCha('${cha.id}')">Deletar</button>
                    </td>
                `;
            });
        })
        .catch(error => console.error('Erro ao carregar os chás:', error));
}

// Função para adicionar um novo chá
document.getElementById('addChaForm').addEventListener('submit', function(e) {
    e.preventDefault();
    const nome = document.getElementById('nome').value;
    const tipo = document.getElementById('tipo').value;

    axios.post(apiURL, { nome, tipo })
        .then(() => {
            loadChas();
            document.getElementById('addChaForm').reset();
        })
        .catch(error => console.error('Erro ao adicionar chá:', error));
});

// Função para atualizar um chá
document.getElementById('updateChaButton').addEventListener('click', function() {
    const id = document.getElementById('updateId').value;
    const nome = document.getElementById('updateNome').value;
    const tipo = document.getElementById('updateTipo').value;

    axios.put(`${apiURL}/${id}`, { nome, tipo })
        .then(() => {
            loadChas();
            clearUpdateFields();
        })
        .catch(error => console.error('Erro ao atualizar chá:', error));
});

// Função para deletar um chá
function deleteCha(id) {
    axios.delete(`${apiURL}/${id}`)
        .then(() => loadChas())
        .catch(error => console.error('Erro ao deletar chá:', error));
}

// Função para preencher os campos de atualização
function setUpdateFields(id, nome, tipo) {
    document.getElementById('updateId').value = id;
    document.getElementById('updateNome').value = nome;
    document.getElementById('updateTipo').value = tipo;
}

// Função para limpar os campos de atualização
function clearUpdateFields() {
    document.getElementById('updateId').value = '';
    document.getElementById('updateNome').value = '';
    document.getElementById('updateTipo').value = '';
}

// Carregar a lista de chás ao abrir a página
loadChas();
