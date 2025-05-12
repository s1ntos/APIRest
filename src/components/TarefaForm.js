import { useState } from 'react';
import api from '../services/api';

export default function TarefaForm({ onAdd }) {
  const [descricao, setDescricao] = useState('');
  const [hora, setHora] = useState(0);

  const handleSubmit = async (e) => {
    e.preventDefault();
    const nova = { descricao, hora, completa: false };
    await api.post('', nova);
    setDescricao('');
    setHora(0);
    onAdd();
  };

  return (
    <form onSubmit={handleSubmit}>
      <input value={descricao} onChange={(e) => setDescricao(e.target.value)} placeholder="Descrição" />
      <input type="number" value={hora} onChange={(e) => setHora(e.target.value)} placeholder="Hora" />
      <button type="submit">Adicionar</button>
    </form>
  );
}
