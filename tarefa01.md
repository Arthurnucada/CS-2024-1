# Rest API

### O que é REST

O conceito de REST foi definido pela primeira em 2000 por Roy Fielding em sua dissertação de doutorado, o REST proporciona mais flexibilidade e liberdade para desenvolvedores. Essa flexibilidade é uma razão pela qual as APIs de REST são um método comunmente usado para conectar componentes e aplicativos na arquitetura de microsserviços.

A arquitetura REST é simples e fornece acesso aos recursos para que o cliente REST acesse e renderize os recursos no lado do cliente.

Esta arquitetura usa várias representações tipo, como XML, JSON, Texto, Imagens.

### Definição Rest API

Uma API, ou interface de programação aplicativos, é um conjunto de instruções que definem como aplicativos ou dispositivos conectam e comunicam uns com os outros. Uma API de REST é uma API que se adéqua aos princípios de design do REST(Representational State Transfer). Por esta razão, as APIs de REST são muitas vezes chamadas de APIs de RESTful.

### Como funcionam

Durante sua execução APIs de REST se comunicam via solicitações de HTTP para executar funções padrão no banco de dados como criar, ler, atualizar e excluir registros. Todos os métodos HTTP podem ser usados em chamadas da API. Uma API de REST bem projetada é parecida com um website executado em um navegador da web que suporte as funcionalidade HTTP.

As informações levadas pelas Rest API's podem ser entregues a um cliente em praticamente qualquer formato, como JavaScript Object Notation (JSON), HTML, Python ou texto simples. O JSON é o formato mais utilizado, porque é legível tanto para seres humanos quanto para máquinas, além de ser uma programação de linguagem independente.

### Princípios

  1. **Interface Uniforme:**  Todas as solicitações da API para o mesmo recurso devem ser iguais, independentemente da origem. A API deve garantir que a mesma parte dos dados do usuário, pertença a apenas um identificador de recurso uniforme (URI). Os recursos devem conter todas as informações que o cliente pode precisar.

  2.  **Desacoplamento cliente-servidor:** Os aplicativos cliente e servidor devem ser completamente independentes. A única informação que o aplicativo cliente deve receber é o URI do recurso solicitado. O cliente não pode interagir com o aplicativo servidor de qualquer outra forma e vice versa, exceto para transferi-los aos dados solicitados via HTTP.

  3.  **Sem estado definido:** As APIs não possuem estado definido, isso significa que cada solicitação precisa incluir todas as informações necessárias para processá-la, ou seja, não requerem nenhuma sessão do lado do servidor e os aplicativos do servidor não têm permissão para armazenar nenhum dado relacionado a uma solicitação de cliente.

  4.  **Capacidade de armazenamento em cache:** Os recursos devem ser armazenados em cache pelo cliente ou servidor. As respostas do servidor também precisam conter informações sobre as permissões de cache do recurso fornecido.

  5.  **Aruitetura de sistemas em camadas:** As chamadas e respostas passam por diferentes camadas. Sem permitir que os aplicativos cliente e servidor se conectem diretamente um ao outro. Pode haver uma série de intermediários diferentes no loop de comunicação. Assim, as APIS'sprecisam ser projetadas para que nem o cliente e nem o servidor saibam com que, se comunicam.
