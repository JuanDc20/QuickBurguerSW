import axios from 'axios';

const API_URL = 'http://localhost:8080/api/comics';

export const getComics = () => axios.get(API_URL);