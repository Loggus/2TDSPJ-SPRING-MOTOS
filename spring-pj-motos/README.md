# Concessionárias Benezinho 🏍️🤓👍🏾

SIMULADO - **Java Advanced** aplicado em 06/03/2024.


| ![](documentacao/fiap.jpg)               | **Java Advanced** |
|------------------------------------------|-------------------|
| **ALUNO:**                               | **TURMA:** 2TDSPJ |
| **PROFESSOR:** Benefrancis do Nascimento | 06/03/2024        |
| **SIMULADO**                      | ****              |

# Sumário


[Estudo de caso ](#_Estudo_de_caso)

[O que deverá ser feito? ](#_O_que_devera_ser_feito)

[Diagrama de Classes ](#_Diagrama_de_Classes)

[Como Entregar ](#_Entrega)

[Correção da Prova ](#_Correcao)

<a id="_Estudo_de_caso"></a>

# Estudo de caso
![GSX1300RRM3_GRY_single_seat_cowl_Diagonal_2400x1600.png](documentacao%2Ffotos%2FGSX1300RRM3_GRY_single_seat_cowl_Diagonal_2400x1600.png)
![GSX1300RRM3_GRY_single_seat_cowl_Right_2400x1500.png](documentacao%2Ffotos%2FGSX1300RRM3_GRY_single_seat_cowl_Right_2400x1500.png)

A Holding Benezinho está interessada em investir na abertura de concessionárias de motos premium no Brasil em 2024. Este investimento pode oferecer diversas vantagens para o empresário, especialmente considerando o contexto econômico e social do país. Entre as principais vantagens destacam-se:
 

1. Margens de lucro mais elevadas: Motos premium geralmente têm preços mais altos e, portanto, podem oferecer margens de lucro mais generosas em comparação com modelos mais básicos. Isso pode resultar em maiores retornos financeiros para a concessionária.

2. Público-alvo específico: Clientes interessados em motos premium geralmente têm maior poder aquisitivo e estão dispostos a pagar mais por qualidade, desempenho e exclusividade. Isso pode resultar em um público-alvo mais fiel e menos sensível a flutuações econômicas.

3. Prestígio da marca: Representar marcas premium pode conferir prestígio à concessionária e aumentar sua reputação no mercado. Isso pode atrair clientes em busca de uma experiência de compra diferenciada e associar a concessionária a valores de qualidade e sofisticação.

4. Menos concorrência direta: O mercado de motos premium pode ser menos saturado do que o mercado de motos de massa, o que significa que a concorrência direta pode ser menor. Isso pode permitir que a concessionária estabeleça uma posição mais forte no mercado e capture uma fatia maior do público-alvo.

5. Oportunidades de serviços adicionais: Clientes de motos premium muitas vezes procuram um atendimento ao cliente excepcional e serviços personalizados. Isso pode abrir oportunidades para a concessionária oferecer serviços adicionais, como personalização de motos, eventos exclusivos para proprietários e programas de fidelidade.


Com o objetivo de fazer este negócio dar certo, idealizamos o desenvolvimento de um Sistema de Gestão de veículos a serem comercializados pelas lojas da rede.

Criaremos, nesta aula, um Produto Mínimo Viável (PMV) de uma API Rest para um sistema para Sistema de Gestão de veículos a serem comercializados.



Nossa equipe de analistas desenvolveu o Diagrama de Classes abaixo, e a sua missão aqui é realizar o Mapeamento Objeto Relacional das classes de Entidade. Usaremos a JPA e o Hibernate como ferramentas de Mapeamento Objeto Relacional.

Na sprint atual, você foi incumbido de fazer:

1. O Mapeamento Objeto Relacional das primeiras classes envolvidas neste projeto de software;

2. A criação automatizada das tabelas no banco de dados Oracle;

3. A persistência de todos os dados, e;

4. A criação dos Seguintes Repositorios :

   1. LojaRepository
   2. VeiculoRepository
   3. AcessorioRepository
   4. TipoDeVeiculoRepository

5. A criação dos Seguintes Resources:

   1. **VeiculoResource** com as seguintes ROTAS e VERBOS:
      1. "localhost/veiculos" - **GET**, **POST**
      2. "logalhost/veiculos/{id}" - **GET**
      3. "logalhost/veiculos/{id}/acessorios" - **GET**, **POST**

   2. **AcessorioResource** com as seguintes ROTAS e VERBOS:
      1. "localhost/acessorio" - **GET**, **POST**
      2. "logalhost/acessorio/{id}" - **GET**
      
   3. **LojaResource** com as seguintes ROTAS e VERBOS:
      1. "localhost/loja" - **GET**, **POST**
      2. "logalhost/loja/{id}" - **GET**
      3. "logalhost/loja/{id}/veiculos" - **GET**, **POST**
      
   4. **TipoVeiculoResource** com as seguintes ROTAS e VERBOS:
      1. "localhost/tipo-de-veiculo" - **GET**, **POST** 
      2. "logalhost/tipo-de-veiculo/{id}" - **GET**


<a id="_O_que_devera_ser_feito"></a>

# O que deverá ser feito?


**Você deverá:**

**Fazer o fork do projeto do github.**:

[https://github.com/Benefrancis/spring-pj-motos](https://github.com/Benefrancis/spring-pj-motos)

Caso o github esteja indisponível, você deverá pegar o projeto no diretório compartilhado.

Alterar o arquivo contido em  **documentacao/equipe.txt** para incluir os RMs e nomes e turma da dupla que fará esta atividade.

**OBS:** Será com base nos nomes contidos neste aquivo que eu irei atribuir a nota.

1. **(0,5 Ponto)** acessar o arquivo **application.yml** e incluir as configurações para **persistencia** para que seja possível conectar-se ao banco de dados Oracle da FIAP com o seu usuário e senha (manter o seu usuário e senha ativo é sua responsabilidade). Não utilize o usuário e senha de outro aluno. Caso tenha problema para autenticar, comunique o professor.

## No pacote entity, criar as seguintes classes

2. **(1 Pontos)** Criar a classe **Veiculo** e adicionar corretamente as anotações JPA.

    Lembre-se que:


    1. Existe relacionamento **Muitos para Um** entre **Veiculo** e **TipoVeiculo** no atributo tipo.
    2. Existe relacionamento **Muitos para Muitos** entre **Veiculo** e **Acessorio** no atributo acessorios. 


3. **(0,5 Ponto)** Criar a classe **Loja** e adicionar corretamente as anotações JPA.
    

   Lembre-se que:

    1. Existe relacionamento **Muitos para Muitos** entre **Loja** e **Veiculo** a no atributo veiculosComercializados.


4. **(0,5 Ponto)** Criar a classe **Acessorio** e adicionar corretamente as anotações JPA.


5. **(0,5 Ponto)** Criar a classe **TipoVeiculo** e adicionar corretamente as anotações JPA.


## No pacote resources criar as seguintes classes

6. **(6 Ponto)**  A perfeita criação dos Seguintes Resources no pacote resources:

   1. **(2 Pontos)** VeiculoResource com as seguintes ROTAS e VERBOS:
      1. "localhost/veiculos" - **GET**;
      2. "localhost/veiculos" - **POST**
      3. "logalhost/veiculos/{id}" - **GET**
      4. "logalhost/veiculos/{id}/acessorios" - **GET**;
      5. "logalhost/veiculos/{id}/acessorios" - **POST**

   2. **(1 Ponto)** AcessorioResource com as seguintes ROTAS e VERBOS:
      1. "localhost/acessorio" - **GET**;
      2. "localhost/acessorio" - **POST**
      3. "logalhost/acessorio/{id}" - **GET**

   3. **(2 Pontos)** LojaResource com as seguintes ROTAS e VERBOS:
      1. "localhost/loja" - **GET**;
      2. "localhost/loja" - **POST**
      3. "logalhost/loja/{id}" - **GET**
      4. "logalhost/loja/{id}/veiculos" - **GET**;
      5. "logalhost/loja/{id}/veiculos" - **POST**

   4. **(1 Ponto)** TipoVeiculoResource com as seguintes ROTAS e VERBOS:
      1. "localhost/tipo-de-veiculo" - **GET**;
      2. "localhost/tipo-de-veiculo" - **POST**;
      3. "logalhost/tipo-de-veiculo/{id}" - **GET**


## No pacote repository criar as seguintes interfaces

7. **(1 Ponto)** A criação dos Seguintes Repositories :

   1. **(0,25 Ponto)** VeiculoRepository
   2. **(0,25 Ponto)** LojaRepository
   3. **(0,25 Ponto)** TipoVeiculoRepository
   4. **(0,25 Ponto)** AcessorioRepository


<a id="_Diagrama_de_Classes"></a>

# Diagrama de Classes

![diagrama-classes-motos.png](documentacao%2Fdiagramas%2Fdiagrama-classes-motos.png)

 
<a id="_Entrega"></a>

# Como Entregar

**A entrega deverá ser feita pelo Teams**, porém não se esqueça de fazer o **commit** e **push** do projeto no github.


<a id="_Correcao"></a>

# Correção da Prova

Nos próximos dias, a correção da prova será disponibilizada no github do professor (branch correcao):

Para acessar digite no prompt:

```shell
git clone https://github.com/Benefrancis/spring-pj-motos && cd spring-pj-motos && git checkout correcao
```


A avaliação é em dupla.


Boa avaliação.
