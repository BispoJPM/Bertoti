const apiUrl = 'http://localhost:8080/Cha';

document.addEventListener('DOMContentLoaded', () => {
    loadCha();

    document.getElementById('addChaForm').addEventListener('submit', (event) => {
        event.preventDefault();
        const tipo = document.getElementById('tipo').value;
        const sabor = document.getElementById('sabor').value;
        addCha({ tipo, sabor });
    });

    document.getElementById('updateChaButton').addEventListener('click', () => {
        const id = document.getElementById('updateId').value;
        const tipo = document.getElementById('updatetipo').value;
        const sabor = document.getElementById('updatesabor').value;
        updateCha(id, { tipo, sabor });
    });
});

function loadCha() {
    fetch(apiUrl)
        .then(response => response.json())
        .then(Cha => {
            const tableBody = document.querySelector('#ChaTable tbody');
            tableBody.innerHTML = '';
            Cha.forEach(Cha => {
                const row = document.createElement('tr');
                row.dataset.id = Cha.id;
                row.innerHTML = `
                    <td>${Cha.tipo}</td>
                    <td>${Cha.sabor}</td>
                    <td>
                        <button class="selectChaButton">Selecionar</button>
                        <button class="deleteChaButton">Excluir</button>
                    </td>
                `;
                tableBody.appendChild(row);
            });

            document.querySelectorAll('.selectChaButton').forEach(button => {
                button.addEventListener('click', (event) => {
                    const row = event.target.closest('tr');
                    const id = row.dataset.id;
                    const tipo = row.children[0].textContent;
                    const sabor = row.children[1].textContent;
                    document.getElementById('updateId').value = id;
                    document.getElementById('updatetipo').value = tipo;
                    document.getElementById('updatesabor').value = sabor;
                });
            });

            document.querySelectorAll('.deleteChaButton').forEach(button => {
                button.addEventListener('click', (event) => {
                    const row = event.target.closest('tr');
                    const id = row.dataset.id;
                    deleteCha(id);
                });
            });
        })
        .catch(error => console.error('Erro ao carregar chas:', error));
}

function addCha(Cha) {
    fetch(apiUrl, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(Cha)
    })
    .then(response => response.json())
    .then(() => {
        loadCha();
        document.getElementById('tipo').value = '';
        document.getElementById('sabor').value = '';
    })
    .catch(error => console.error('Erro ao adicionar cha:', error));
}

function updateCha(id, Cha) {
    fetch(`${apiUrl}/${id}`, {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(Cha)
    })
    .then(response => response.json())
    .then(() => {
        loadCha();
        document.getElementById('updateId').value = '';
        document.getElementById('updatetipo').value = '';
        document.getElementById('updatesabor').value = '';
    })
    .catch(error => console.error('Erro ao atualizar cha:', error));
}

function deleteCha(id) {
    fetch(`${apiUrl}/${id}`, {
        method: 'DELETE'
    })
    .then(() => {
        loadCha();
    })
    .catch(error => console.error('Erro ao excluir cha:', error));
}
