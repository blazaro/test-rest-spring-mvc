# test-rest-spring-mvc
Código de ejemplo del tutorial publicado en http://www.adictosaltrabajo.com/tutoriales/tutoriales.php?pagina=test-rest-spring-mvc para hacer tests del los servicios REST y su semántica asociada al protocolo HTTP

Los casos de prueba utilizados son:

- El servicio devolverá la fecha en la que es invocado.
- El servicio recibirá un parámetro de entrada "input" y lo devolverá en la respuesta junto con la fecha de entrada.
- El servicio atenderá ls peticiones por GET devolviendo un HTTP Status 200 OK si se procesan correctamente.
- El servicio atenderá ls peticiones por POST devolviendo un HTTP Status 200 OK si se procesan correctamente.
- El servicio devolverá un HTTP Status 405 Method Not Allowed, si se invoca por otro verbo HTTP a los aceptados.
- El servicio invocado por GET espera recibir un parámetro "input" de forma obligatoria. Si no se recibe este parámetro se debe devolver un HTTP Status 400 Bad Request.
- El servicio invocado por POST espera recibir un parámetro "input" de forma obligatoria. Si no se recibe este parámetro se debe devolver un HTTP Status 400 Bad Request.
