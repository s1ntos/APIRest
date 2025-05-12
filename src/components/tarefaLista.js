import { useEffect, useState } from 'react';
import api from '../services/api';

export default function TarefaLista() {
  const [tarefas, setTarefas] = useState([]);

  const carregarTarefas = async () => {
    const response = await api.get('');
    setTarefas(response.data);
  };

  const deletarTarefa = async (id) => {
    await api.delete(`/${id}`);
    carregarTarefas();
  };

  useEffect(() => {
    carregarTarefas();
  }, []);

  return (
    <ul className="tarefa-lista">
      {tarefas.map((tarefa) => (
        <li key={tarefa.id} className="tarefa-item">
          <span>{tarefa.descricao} às {tarefa.hora}h</span>
          <button onClick={() => deletarTarefa(tarefa.id)}>Remover</button>
        </li>
      ))}
    </ul>
  );
}
