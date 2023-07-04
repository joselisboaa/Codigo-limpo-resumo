# Capítulo 3 - Funções
Nesse capítulo o autor foca em dissertar sobre as funções na totalidade, desde o nome da função, até os seus parâmetros e retorno.

## Principais tópicos
- Funções devem ser pequenas
- Devem fazer apenas uma coisa
- Um nível de abstração por função
- Regra decrescente
- Utilize nomes descritivos
- Parâmetros de funções
- Zero Parâmetros > Mônade > Díade > Tríade > Políade
- Não utilizar parâmetros lógicos
- Evite efeitos colaterais
- Exceções são melhores que código de erro
- Extraia os blocos try/catch
- Evite repetição

### Funções devem ser pequenas
Funções pequenas respeitam o princípio de responsabilidade única (SRP), são mais legíveis e revelam o seu propósito.

### Fazer apenas uma coisa
Funções que fazem apenas uma coisa na maioria das vezes respeita o primeiro tópico.

### Um nível de abstração por função
Para termos a confirmação que a nossa função só faz uma coisa precisamos verificar se todas as instruções dentro da função estão
no mesmo nível de abstração, isto é, se não há outros conceitos de níveis diferentes.
Vários níveis de abstração numa função pode gerar confusão.

### Regra decrescente
A leitura do código é geralmente padronizada da forma ocidental, isto é, de cima para baixo e da esquerda para a direita, 
sendo assim, o nosso código também deve seguir esse padrão e as funções devem ser seguidas pelas outras no próximo nível.

### Utilize nomes descritivos
Um bom nome descritivo como vimos no [Capítulo 1](../Capitulo_1/README.md) deixará o código mais legível e revelará o que a função faz.

### Parâmetros de funções
A quantidade ideal de parâmetros de uma função é 0 (em linguagens com paradigma OO), após isso vem Mônades (1 parâmetro),
Díade (2 parâmetros), Tríade (3 parâmetros) e Políade (mais de 3 parâmetros), a quantidade de parâmetros pode confundir o leitor,
pois, por exemplo, numa Tríade provavelmente o leitor teria de verificar os parâmetros que a função recebe para utilizá-la,
assim necessitando de um esforço mental extra e a provável quebra de raciocínio do leitor.

### Mônade x Díade x Tríade x Políade
Quanto menor a quantidade de parâmetros mais fácil será a leitura da função, pois numa políade de 8 parâmetros, por exemplo,
teriamos que "decorar" a ordem dos parâmetros e/ou ficar checando algumas vezes na declaração na função, o que não é nada desejável


### Não utilizar parâmetros lógicos
Esse é um ponto interessante, pois o parâmetro lógico diz mais da função do que ela mesma, pois
muito provavelmente se a função recebe algum parâmetro lógico pode dizer que dentro dela iremos 
ter uma estrutura if que irá fazer algo caso esse parâmetro seja verdadeiro e outra caso seja falso
e com isso caracterizamos que esta função faz mais de uma coisa

### Evite efeitos colaterais
Um efeito colateral é algo que a sua função executa "por baixo dos panos", isso é ela pode fazer ações inesperadas ou até indesejáveis,
e geralmente resulta em acomplamentos e fortes dependências.

### Exceções são melhores que código de erro
Códigos de erro facilitam a criação de estruturas aninhadas, já com exceções o tratamento do erro se resume em bloco try/catch/finally

### Extraia os blocos try/catch
Os blocos try/catch podem ser más caso mal utilizado, pois supondo uma função que utilize no seu corpo um try/catch ela iria ferir
o SRP, pois ela executaria uma ação e, simultaneamente, trataria um erro.

### Evite repetição
A duplicação é um problema, pois amontoa código que caso seja modificado será necessário as mesmas modificações ao longo de toda
a repetição e caso haja um bug ele será replicado mais de uma vez.
