import { useEffect, useState } from 'react';
import { getComics } from '../services/comicService';

function ComicList() {
  const [comics, setComics] = useState([]);

  useEffect(() => {
    getComics()
      .then(res => {
        console.log('Respuesta del backend:', res.data);
        setComics(res.data);
      })
      .catch(err => console.error('Error al obtener cómics:', err));
  }, []);
  return (
    <div>
      <h2>Listado de Cómics</h2>
      <ul>
        {comics.map((comic) => (
          <li key={comic.id}>
            {comic.titulo} - {comic.autor} - ${comic.precio}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default ComicList;