// src/components/ComicForm.jsx
import { useState } from 'react';
import { addComic } from '../services/comicService';

function ComicForm({ onSave }) {
  const [comic, setComic] = useState({
    titulo: '',
    autor: '',
    precio: ''
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setComic(prev => ({ ...prev, [name]: value }));
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    addComic(comic).then(() => {
      setComic({ titulo: '', autor: '', precio: '' });
      onSave(); // recarga la lista
    });
  };

  return (
    <form onSubmit={handleSubmit}>
      <h2>Agregar Cómic</h2>
      <input name="titulo" placeholder="Título" value={comic.titulo} onChange={handleChange} required />
      <input name="autor" placeholder="Autor" value={comic.autor} onChange={handleChange} required />
      <input name="precio" type="number" placeholder="Precio" value={comic.precio} onChange={handleChange} required />
      <button type="submit">Guardar</button>
    </form>
  );
}

export default ComicForm;