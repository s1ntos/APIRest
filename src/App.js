import TarefaForm from './components/TarefaForm';
import TarefaLista from './components/tarefaLista';
import { useState } from 'react';

function App() {
  const [atualizar, setAtualizar] = useState(false);

  return (
    <div className="container">
      <h1>Minhas Tarefas</h1>
      <TarefaForm onAdd={() => setAtualizar(!atualizar)} />
      <TarefaLista key={atualizar} />
    </div>
  );
}

export default App;

