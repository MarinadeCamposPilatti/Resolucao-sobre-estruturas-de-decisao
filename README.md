# Resolução sobre Estruturas de Decisão
## Segunda lista de exercícios do programa 1000devs da Mesttra em parceria com a Johnson&amp;Johnson, o qual visa formar desenvolvedores back-end

Para esta lista de algoritmos, todos devem ser resolvidos adicionando as estruturas de decisão e sem a utilização de estruturas de repetição (for, while e do while) ou vetores ou matrizes. 

Questão 01: Uma imobiliária vende apenas terrenos retangulares. Faça um algoritmo para imprimir a área do terreno e o valor de venda do mesmo. Para isto será 
necessário o usuário informar as dimensões em metros (frente e lateral) do terreno além do valor cobrado pelo metro quadrado. Caso a diferença de metragem entre a 
frente e a lateral seja menor que 10% da metragem da frente, o cliente terá um acréscimo de 22% no valor final do terreno. Caso a metragem da frente for menor que 40% 
da lateral, o cliente terá um desconto de 12% no valor final do terreno. Caso a metragem da frente for maior que 70% da lateral, o cliente terá um desconto de 15%. 
Caso as medidas não encaixem em nenhuma das regras o valor final do terreno não sofrerá alterações.

Resultado esperado:

#### Dados Entrada
Quantos metros o terreno possui de frente: 100.20 

Quantos metros o terreno possui de lateral: 80.10 

Informe o valor do metro quadrado: R$ 12.50	

#### Dados Saída
Area total do terreno de 100.20 mts de frente com 80.10 mts de lateral e: 8026.02 mts

O terreno recebeu um decrescimo de 15% e custara: R$ 85276.45

#### Dados Entrada
Quantos metros o terreno possui de frente: 100.20 

Quantos metros o terreno possui de lateral: 93.10

Informe o valor do metro quadrado: R$ 13.40	

#### Dados Saída
Area total do terreno de 100.20 mts de frente com 93.10 mts de lateral e: 9328.62 mts

O terreno recebeu um acrescimo de 22% e custara: R$ 152504.27

#### Dados Entrada
Quantos metros o terreno possui de frente: 50.30 

Quantos metros o terreno possui de lateral: 130.34 

Informe o valor do metro quadrado: R$ 10.23	

#### Dados Saída
Area total do terreno de 50.30 mts de frente com 130.34 mts de lateral e: 6556.10 mts

O terreno recebeu um decrescimo de 12% e custara: R$ 59020.64

#### Dados Entrada
Quantos metros o terreno possui de frente: 90.45 

Quantos metros o terreno possui de lateral: 210.34 

Informe o valor do metro quadrado: R$ 10.45	

#### Dados Saída
Area total do terreno de 90.45 mts de frente com 210.34 mts de lateral e: 19025.25 mts

O terreno não recebeu nenhuma alteração e custara: R$ 198813.88

Questão 02: Faça um algoritmo que receba o valor do salário mínimo e o valor do salário de um funcionário, calcule e mostre a quantidade de salários mínimos que ganha 
esse funcionário. Caso o funcionário receba menos que 1 salário mínimo deverá ser apresentado a mensagem “Funcionário ganha menos que um salário mínimo”.

Resultado esperado:

#### Dados Entrada
Informe o valor do salario minimo: 1100.30 

Informe o valor do salario do funcionario: 904.50	

#### Dados Saída
O funcionario ganha menos que um salario minimo!

#### Dados Entrada
Informe o valor do salario minimo: 1200.30 

Informe o valor do salario do funcionario: 1402.34	

#### Dados Saída
O funcionario recebe 1.2 salarios minimos!

Questão 03: Faça um algoritmo para ler três notas de um aluno em uma disciplina e imprimir a sua média ponderada (as notas tem pesos respectivos de 1, 2 e 3). Calcule 
o valor das notas com base em seus pesos e além de apresentar a média, exiba a maior nota entre as 3 notas, ou a mensagem “As 3 notas são iguais”, ou “As notas 1 e 2 
são as maiores”, “As notas 1 e 3 são as maiores”, “As notas 2 e 3 são as maiores” caso exista duas notas iguais e elas sejam as maiores.
 
Resultado esperado:

#### Dados Entrada
Informe o valor da primeira nota: 1 

Informe o valor da segunda nota: 2 

Informe o valor da terceira nota: 3	

#### Dados Saída
A media ponderada das notas 1.00, 2.00 e 3.00 e 2.33.

A nota 3 (3.00) e a maior nota apos o calculo do peso 3 (9.00)

#### Dados Entrada
Informe o valor da primeira nota: 3 

Informe o valor da segunda nota: 2 

Informe o valor da terceira nota: 1	

#### Dados Saída
A media ponderada das notas 3.00, 2.00 e 1.00 e 1.67.

A nota 2 (2.00) e a maior nota apos o calculo do peso 2 (4.00)

#### Dados Entrada
Informe o valor da primeira nota: 4 

Informe o valor da segunda nota: 1 

Informe o valor da terceira nota: 1	

#### Dados Saída
A media ponderada das notas 4.00, 1.00 e 1.00 e 1.50.

A nota 1 (4.00) e a maior nota apos o calculo do peso 1 (4.00)

#### Dados Entrada
Informe o valor da primeira nota: 6 

Informe o valor da segunda nota: 3 

Informe o valor da terceira nota: 1	

#### Dados Saída
A media ponderada das notas 6.00, 3.00 e 1.00 e 2.50.

As notas 1 (6.00) e 2 (3.00) foram as maiores nota apos o calculo do peso 1 (6.00) e peso 2 (6.00)

#### Dados Entrada
Informe o valor da primeira nota: 6 

Informe o valor da segunda nota: 1 

Informe o valor da terceira nota: 2	

#### Dados Saída
A media ponderada das notas 6.00, 1.00 e 2.00 e 2.33.

As notas 1 (6.00) e 3 (2.00) foram as maiores nota apos o calculo do peso 1 (6.00) e peso 3 (6.00)

#### Dados Entrada
Informe o valor da primeira nota: 1 

Informe o valor da segunda nota: 9 

Informe o valor da terceira nota: 6	

#### Dados Saída
A media ponderada das notas 1.00, 9.00 e 6.00 e 6.17.

As notas 2 (9.00) e 3 (6.00) foram as maiores nota apos o calculo do peso 2 (18.00) e peso 3 (18.00)

#### Dados Entrada
Informe o valor da primeira nota: 18 

Informe o valor da segunda nota: 9 

Informe o valor da terceira nota: 6	

#### Dados Saída
A media ponderada das notas 18.00, 9.00 e 6.00 e 9.00. 

As tres notas foram iguais

Questão 04: Faça um algoritmo que calcule e mostre a tabuada de uma operação matemática que deverá ser informada pelo usuário (+, -, * e /) além do número digitado 
pelo usuário para o calculo da operação.

Resultados Esperados

#### Dados Entrada
Informe a operacao desejada [+,-,*,/]: + 

Informe o numero para o calculo da tabuada: 4	

#### Dados Saída
Tabuada do + para o numero 4 

4 + 0 = 4

4 + 1 = 5

4 + 2 = 6

4 + 3 = 7

4 + 4 = 8

4 + 5 = 9

4 + 6 = 10

4 + 7 = 11

4 + 8 = 12

4 + 9 = 13

#### Dados Entrada
Informe a operacao desejada [+,-,*,/]: @ 

Informe o numero para o calculo da tabuada: 3	

#### Dados Saída
Operacao digitada (@) incorreta!

Questão 05: Faça um algoritmo que receba dois números inteiros, calcule e mostre a divisão do maior número pelo menor número. Sabe-se que o segundo número não pode ser 
zero, desta forma se o usuário digitar 0 deverá ser exibido uma mensagem “A operação não pode ser realizada ”.

Resultado esperado:

#### Dados Entrada
Informe o valor 1: 2

Informe o valor 2: 3	

#### Dados Saída
A divisao de 3 por 2 e 1.50

#### Dados Entrada
Informe o valor 1: 3

Informe o valor 2: 2	

#### Dados Saída
A divisao de 3 por 2 e 1.50

#### Dados Entrada
Informe o valor 1: 0

Informe o valor 2: 2	

#### Dados Saída
A operacao nao pode ser realizada.

Questão 06: Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar todos os cavalos comprados para um haras. O usuário devera informar a 
quantidade de cavalos adquiridos e o valor de cada ferradura. Aplique um desconto no valor total conforme a tabela de descontos:

Valor Inicial	/ Valor Final /	Desconto

15000.01	   /   20000.00	    /     10%

20000.01	   /  25000.00	     /   12%

25000.01	    / 30000.00	     /   15%

30000.01	    /  infinito	   /    20%

Resultado esperado:

#### Dados Entrada
Informe quantidade de cavalos: 150 

Informe o valor de cada ferradura R$: 25.3	

#### Dados Saída
A quantidade de ferraduras necessarias: 600

Valor total para a compra das ferraduras: R$ 13662.00

#### Dados Entrada
Informe quantidade de cavalos: 120 

Informe o valor de cada ferradura R$: 25.10	

#### Dados Saída
A quantidade de ferraduras necessarias: 480

Valor total para a compra das ferraduras: R$ 12048.00

#### Dados Entrada
Informe quantidade de cavalos: 300 

Informe o valor de cada ferradura R$: 25.6	

#### Dados Saída
A quantidade de ferraduras necessarias: 1200

Valor total para a compra das ferraduras: R$ 24576.00

#### Dados Entrada
Informe quantidade de cavalos: 250 

Informe o valor de cada ferradura R$: 25.1	

#### Dados Saída
A quantidade de ferraduras necessarias: 1000

Valor total para a compra das ferraduras: R$ 21335.00

Questão 07: Faça um algoritmo que receba o peso de uma pessoa, calcule e mostre:

a)	o novo peso se a pessoa engordar 15% sobre o peso digitado;
b)	o novo peso se a pessoa emagrecer 20% sobre o peso digitado.
c)	Uma mensagem “Você deve procurar uma nutricionista” se a diferença de acréscimo de peso (15%) entre o acréscimo de peso (20%) for maior ou igual a 4,5 kgs.


Resultado esperado:
#### Dados Entrada
Informe o peso em KG: 60	

#### Dados Saída
Caso a pessoa engorde 15% ficara com: 69.00 KG 

Caso a pessoa engorde 20% ficara com: 72.00 KG

#### Dados Entrada
Informe o peso em KG: 90	

#### Dados Saída
Caso a pessoa engorde 15% ficara com: 103.50 KG 

Caso a pessoa engorde 20% ficara com: 108.00 KG

Voce deve procurar uma nutricionista!
 
Questão 08: Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 5%. Após o aumento, desconte 11% de INSS e 8% de FGTS e o % do IR conforme a tabela 
abaixo. Imprima o salário inicial, o salário com o aumento, o salário final, o desconto do INSS, o desconto do FGTS, o desconto do IR e o Total de Descontos 
(INSS+FGTS+IR). O desconto do Imposto de Renda é variável. Quando o salário do funcionário muda de uma faixa de desconto de IR para outra, ele pode mesmo com o aumento 
de 5% receber menos do que quando comparado antes do aumento. O seu algoritmo deve calcular e descobrir se o novo salário (5%) fará com que o usuário receba um salário 
final menor do que antes de aplicar os 5%.

Base de Cálculo IR (R$) /	Alíquota IR (%)

Até 1.903,98	            /                0%

De 1.903,99 até 2.826,65	      /          7,5%

De 2.826,66 até 3.751,05	       /         15%

De 3.751,06 até 4.664,68	        /        22,5%

Acima de 4.664,68	             /       27,5%


Resultado esperado:
#### Dados Entrada
Informe o salario: 1810	

#### Dados Saída
Salario Inicial: 1810.00

Salario Reajustado: 1900.50

Desconto 11% INSS: 209.05

Desconto 8% FGTS: 152.04

Desconto IR: 0.00

Total Descontos INSS+FGTS+IR: 361.09 

Salario Final: 1539.41

#### Dados Entrada
Informe o salario: 1820	

#### Dados Saída
Salario Inicial: 1820.00

Salario Reajustado: 1911.00

Desconto 11% INSS: 210.21

Desconto 8% FGTS: 152.88

Desconto IR: 143.32

Total Descontos INSS+FGTS+IR: 506.42 

Salario Final: 1404.58

O novo salario final e menor do que o salario recebido antes do aumento!

#### Dados Entrada
Informe o salario: 2200	

#### Dados Saída
Salario Inicial: 2200.00

Salario Reajustado: 2310.00

Desconto 11% INSS: 254.10

Desconto 8% FGTS: 184.80

Desconto IR: 173.25

Total Descontos INSS+FGTS+IR: 612.15 

Salario Final: 1697.85

Questão 09: Três amigos, Carlos, André e Felipe. decidiram rachar igualmente a conta de um bar. Faça um algoritmo para ler o valor total da conta e imprimir quanto 
cada um deve pagar, mas faça com que Carlos e André não paguem os centavos, caso os centavos sejam menor ou igual a 30 centavos. Caso os centavos sejam maior que 30 
centavos, a conta deve ser divida igualmente entre os três.

Resultado esperado:
#### Dados Entrada
Informe o valor da conta R$: 23	

#### Dados Saída
Carlos pagara: R$ 7.67 

Andre pagara: R$ 7.67 

Felipe pagara: R$ 7.67

#### Dados Entrada
Informe o valor da conta R$: 21	

#### Dados Saída
Carlos pagara: R$ 7.00 

Andre pagara: R$ 7.00

Felipe pagara: R$ 7.00

#### Dados Entrada
Informe o valor da conta R$: 42.5	

#### Dados Saída
Carlos pagara: R$ 14.00 

Andre pagara: R$ 14.00 

Felipe pagara: R$ 14.50

Questão 10: Faça um algoritmo que leia os dados necessários para calcular e exibir a área:

a)	de um trapézio. Sabe-se que: A = ((base maior + base menor) * altura)/2 ;
b)	de um quadrado. Sabe-se que: A = lado * lado;
c)	de um retangulo. Sabe-se que: A = largura * altura;
d)	de um círculo. Sabe-se que: A = 3.14 * raio * raio;
e)	de um triangulo. Sabe-se que: A = (base * altura) / 2;

O seu algoritmo deve apresentar ao final da execução qual foi o nome do Objeto com a maior área bem como a área deste objeto.

Resultado esperado:
#### Dados Entrada
Area do trapezio:

Informe o valor da base maior: 4 

Informe o valor da base menor: 3 

Informe o valor da altura: 2


Area do quadrado:

Informe o valor de um dos lados: 5


Area do retangulo:

Informe o valor da largura: 4 

Informe o valor da altura: 3


Area do circulo:

Informe o valor do raio: 4

Area do triangulo: 

Informe o valor da base: 3

Informe o valor da altura: 2	

#### Dados Saída
A area do trapezio e: 7.00

A area do quadrado e: 25.00 

A area do retangulo e: 12.00 

A area do circulo e: 50.24

A area do triangulo e: 3.00


O objeto com a maior area e o Circulo com 50.24 de area.

#### Dados Entrada
Area do trapezio:

Informe o valor da base maior: 4 

Informe o valor da base menor: 3 

Informe o valor da altura: 5


Area do quadrado:

Informe o valor de um dos lados: 45


Area do retangulo:

Informe o valor da largura: 3 

Informe o valor da altura: 4


Area do circulo:

Informe o valor do raio: 3


Area do triangulo: 

Informe o valor da base: 4

Informe o valor da altura: 3	

#### Dados Saída
A area do trapezio e: 17.50

A area do quadrado e: 2025.00 

A area do retangulo e: 12.00

A area do circulo e: 28.26 

A area do triangulo e: 6.00

O objeto com a maior area e o Quadrado com 2025.00 de area.

Questão 11: Faça um algoritmo que receba o mes e ano de nascimento de uma pessoa e o mes e ano atual, calcule e mostre a idade desta pessoa em anos, meses e dias. Como 
existe a possibilidade do usuario digitar o ano atual menor do que o ano de nascimento, ou os meses foram do intervalo de 1 à 12, deverá ser exibido a mensagem 
“Impossivel realizar o calculo. Anos e/ou meses invalidos”. Considere para o mes inicial o primeiro dia e para o mes final o ultimo dia do respectivo mês.
 
OBS: considere a quantidade de dias de cada mês. Fevereiro terá sempre 28 idas (ignorar ano bissexto); janeiro, marco, maio, julho, agosto, outubro e dezembro com 31 dias e; abril, junho, setembro, novembro com 30 dias.

Resultado esperado:
#### Dados Entrada
Digite o mes inicial: 1 

Digite o ano inicial: 2019 

Digite o mes final: 1 

Digite o ano final: 2019	

#### Dados Saída
A idade desta pessoa em dias e: 31

#### Dados Entrada
Digite o mes inicial: 1 

Digite o ano inicial: 2019 

Digite o mes final: 2 

Digite o ano final: 2019	

#### Dados Saída
A idade desta pessoa em dias e: 59

#### Dados Entrada
Digite o mes inicial: 1 

Digite o ano inicial: 1982 

Digite o mes final: 3 

Digite o ano final: 1983	

#### Dados Saída
A idade desta pessoa em dias e: 455

#### Dados Entrada
Digite o mes inicial: 5 

Digite o ano inicial: 2019 

Digite o mes final: 2 

Digite o ano final: 2020	

#### Dados Saída
A idade desta pessoa em dias e: 304

#### Dados Entrada
Digite o mes inicial: 1 

Digite o ano inicial: 2019 

Digite o mes final: 1 

Digite o ano final: 2018	

#### Dados Saída
Impossivel	realizar	o	calculo.	Anos	e/ou	Meses inconsistentes

#### Dados Entrada
Digite o mes inicial: 1 

Digite o ano inicial: 2019 

Digite o mes final: -1 

Digite o ano final: 2018	

#### Dados Saída
Impossivel	realizar	o	calculo.	Anos	e/ou	Meses inconsistentes

#### Dados Entrada
Digite o mes inicial: 13 

Digite o ano inicial: 2019 

Digite o mes final: 6 

Digite o ano final: 2020	

#### Dados Saída
Impossivel	realizar	o	calculo.	Anos	e/ou	Meses inconsistentes

Questão 12: Um tonel de refresco é feito com X partes de água mineral e Y partes de suco de maracujá. Faça um algoritmo para calcular quantos litros de água e de suco 
são necessários para se fazer uma certa quantidade de litros de refresco informados pelo usuário. Como a empresa fabrica, o suco para várias marcas diferentes e cada 
marca utiliza uma determinada concentração, será necessário ler do usuário a concentração de suco e agua.

Regras:
a)	O seu algoritmo deve verificar se a somatoria do valor de concentração de suco e agua (lidos a partir do usuário) é igual a 100 (percentual).

Ex: Percentual de água lido: 80, Percentual de suco lido: 20, Total = 100% Percentual água lido: 80, Percentual de suco lido: 15, TOTAL = 95%

b)	Se a somatoria não der 100 o algoritmo deverá perguntar para o usuario se ele deseja enquadrar os valores em percentual (100%). Se o usuário escolher “s” o algoritmo deve enquadrar estes valores, exibir para o usuário os valores enquadrados e seguir com o cálculo.

Ex: Percentual água lido: 80, Percentual de suco lido: 15, TOTAL = 95%
Enquadrando o valor de água lido: 80/(80 + 15) = 0,842105263 (Valor de percentual a ser usado) Enquadrando o valor de suco lido: 15/(80 + 15) = 0,157894737 (Valor de percentual a ser usado)
 
c)	Se o usuário responder “n” o algoritmo deve ser finalizado e informado a mensagem “Valores de concentração incorretos. Processo finalizado! ”

Resultado esperado:
#### Dados Entrada
Digite a QTDE de lts de suco necessaria: 120

Digite o percentual (%) de concentracao da agua: 80 

Digite o percentual (%) de concentracao do suco: 20	

#### Dados Saída
Sera necessario para fazer 120 lts de suco de maracuja:

96.00 lts de agua

24.00 lts de suco concentrado de maracuja

#### Dados Entrada
Digite a QTDE de lts de suco necessaria: 120 

Digite o percentual de concentracao da agua: 80 

Digite o percentual de concentracao do suco: 12

Os valores de concentracao nao totalizam 100%.
Deseja enquadrar os valores em escala de 100% [s|n]?: s	

#### Dados Saída
Novo percentual do Suco: 13.04 

Novo percentual do Agua: 86.96


Sera necessario para fazer 120 lts de suco de maracuja:

15.65 lts de suco

104.35 lts de agua concentrado de maracuja

#### Dados Entrada
Digite a QTDE de lts de suco necessaria: 120 

Digite o percentual de concentracao da agua: 80 

Digite o percentual de concentracao do suco: 23

Os valores de concentracao nao totalizam 100%.

Deseja enquadrar os valores em escala de 100% [s|n]?: n	

#### Dados Saída
Valores de concentracao incorretos. Processo finalizado!

Questão 13: A granja Frangotech possui um controle automatizado de cada frango da sua produção. No pé direito do frango há um anel com um chip de identificação; no pé 
esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. Faça um algoritmo para calcular o gasto total da granja para marcar todos os seus 
frangos que deverá ser informado pelo usuário além do valor do chip de identificação e do chip de alimentação. Caso a diferença de valor dos chips for menor ou igual a 
20% do chip de maior valor, deve ser adicionado mais 20% na quantidade total de chips de menor valor.

Exemplo 01:

Chip de identificação: R$ 4,50 

Chip de Alimento: R$ 2,50

Diferença entre os chips R$: 2,00 (equivale a 44% do chip mais caro (Chip de Identificação)) 

Não adiciona 20% na compra de quantidade do chip mais barato (Chip de Alimento)

Exemplo 02:

Chip de identificação: R$ 4,50 

Chip de Alimento: R$ 4,00

Diferença entre os chips R$: 0,50 (equivale a 11% do chip mais caro (Chip de Identificação)) 

Adiciona 20% na compra de quantidade do chip mais barato (Chip de Alimento)

Exemplo 03:

Chip de identificação: R$ 3,20 

Chip de Alimento: R$ 3,50

Diferença entre os chips R$: 0,50 (equivale a 8% do chip mais caro (Chip de Alimento)) 

Adiciona 20% na compra de quantidade do chip mais barato (Chip de Identificação)

Resultado esperado:
#### Dados Entrada
Digite a QTDE de frangos: 100

Digite o valor do chip de alimentacao R$: 5.50 

Digite o valor do chip de identificacao R$: 5.20


A quantidade do chip de identificacao sofreu aumento de 20% de (100 unidades) para (120 unidades)	

#### Dados Saída
O valor total para identificar os frangos e:

Chip Alimentacao = R$ 1100.00

Chip Identificacao = R$ 520.00	

Adicional 20% = R$ 104.00 

Valor Total = R$ 1724.00

#### Dados Entrada
Digite a QTDE de frangos: 100

Digite o valor do chip de alimentacao R$: 5.20 

Digite o valor do chip de identificacao R$: 5.50


A quantidade do chip de alimentacao sofreu aumento de 20% de (200 unidades) para (240 unidades)	

#### Dados Saída
O valor total para identificar os frangos e:

Chip Alimentacao = R$ 1040.00	

Adicional 20% = R$ 208.00 

Chip Identificacao = R$ 550.00

Valor Total = R$ 1798.00

#### Dados Entrada
Digite a QTDE de frangos: 100

Digite o valor do chip de alimentacao R$: 5.50 

Digite o valor do chip de identificacao R$: 3.40	

#### Dados Saída
O valor total para identificar os frangos e: 

Chip Alimentacao = R$ 1100.00

Chip Identificacao = R$ 340.00 

Valor Total = R$ 1440.00

#### Dados Entrada
Digite a QTDE de frangos: 100

Digite o valor do chip de alimentacao R$: 5.20 

Digite o valor do chip de identificacao R$: 2.10	

#### Dados Saída
O valor total para identificar os frangos e: 

Chip Alimentacao = R$ 1040.00

Chip Identificacao = R$ 210.00 

Valor Total = R$ 1250.00

Questão 14: Entrar com o dia e o mês de uma data e informar quantos dias se passaram desde o início do ano. Esqueça a questão dos anos bissextos. Como existe a 
possibilidade do usuário digitar um dia maior do que existe no respectivo mês, ou os meses estão fora do intervalo de 1 à 12, deverá ser exibido a mensagem “Impossivel 
realizar o calculo. Dia e/ou meses invalidos”

OBS: considere a quantidade de dias de cada mês. Fevereiro terá sempre 28 idas (ignorar ano bissexto); janeiro, marco, maio, julho, agosto, outubro e dezembro com 31 dias e; abril, junho, setembro, novembro com 30 dias.

Resultado esperado:
#### Dados Entrada
Digite o dia final: 25 

Digite o mes final: 11	

#### Dados Saída
Quantidade de dias 329

#### Dados Entrada
Digite o dia final: 2 

Digite o mes final: 1	

#### Dados Saída
Quantidade de dias 2

#### Dados Entrada
Digite o dia final: 30 

Digite o mes final: 03	

#### Dados Saída
Quantidade de dias 89

#### Dados Entrada
Digite o dia final: 29 

Digite o mes final: 2	

#### Dados Saída
Impossivel realizar o calculo. Anos e Meses inconsistentes

#### Dados Entrada
Digite o dia final: 2 

Digite o mes final: 13	

#### Dados Saída
Impossivel realizar o calculo. Anos e Meses inconsistentes

Questão 15: A fábrica de refrigerantes Meia-Cola vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. Se um comerciante compra 
uma determinada quantidade de cada formato, faça um algoritmo para calcular quantos litros de refrigerante ele comprou.

Regra: Se a margem de lucro do total da compra de garrafas de 600ml for maior ou igual a margem de lucro do total de compra das latas de 350ml, apresentar uma 
mensagem: “Considere substituir a compra de X latas de 350 ml por Y garrafas de 600ml e oferecer uma promoção”. A sugestão da quantidade de garrafas de 600ml a serem 
compradas deve equivaler a mesma quantidade de mls que seriam comprados paras as latas de 350ml.


Produto	/ Margem por unidade

Lata 350ml	/ 15%

Garra 600ml	/ 9%


Resultado esperado:
#### Dados Entrada
Digite a quantidade de latas de 350ml: 34 

Digite a quantidade de garrafas de 600ml: 87 

Digite a quantidade de garrafas de 2lts: 39	

#### Dados Saída
A quantidade total de litros e: 142

Considere substituir a compra de:

34 latas de 350 ml por 19.83 garrafas de 600ml e oferecer uma promocao

#### Dados Entrada
Digite a quantidade de latas de 350ml: 34 

Digite a quantidade de garrafas de 600ml: 43 

Digite a quantidade de garrafas de 2lts: 23	

#### Dados Saída
A quantidade total de litros e: 83

Questão 16: Ler um número inteiro positivo de 1, 2, 3 ou 4 dígitos e imprimir a saída da seguinte forma:

MILHARES = x 

CENTENA = x 

DEZENA = x 

UNIDADE = x

Regra: Validar o número digitado e se este número estiver fora do intervalo definido, apresentar uma mensagem de erro “Numero invalido!” e finalizar o algoritmo sem nenhuma cálculo. Para valores de 3 dígitos, imprimir apenas os valores de centenas, dezenas e unidades. Para os valores de 2 dígitos, imprimir apenas os valores de dezenas e unidades e assim para as demais casas de valores.

Resultado esperado:
#### Dados Entrada
Digite um numero de ate 4 digitos: 9792	

#### Dados Saída
Milhares: 9

Centenas: 7

Dezenas: 9

Unidades: 2

#### Dados Entrada
Digite um numero de ate 4 digitos: 392	

#### Dados Saída
Centenas: 3

Dezenas: 9

Unidades: 2

#### Dados Entrada
Digite um numero de ate 4 digitos: 72	

#### Dados Saída
Dezenas: 7

Unidades: 2

#### Dados Entrada
Digite um numero de ate 4 digitos: 2	

Unidades: 2

#### Dados Entrada
Digite um numero de ate 4 digitos: 12411	

#### Dados Saída
Numero invalido!

#### Dados Entrada
Digite um numero de ate 4 digitos: -124	

#### Dados Saída
Numero invalido!

Questão 17: A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de queijo, uma fatia de presunto e uma rodela de hambúrguer. 
Sabendo que cada fatia de queijo ou presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 120 gramas, faça um algoritmo em que o dono forneça a quantidade de 
sanduíches a fazer, e a máquina informe as quantidades (em quilos) de queijo, presunto e carne necessários para compra.

Regra: Pode ocorrer uma situação em que não haja a quantidade total necessária de presunto. Desta forma, após apresentar o resultado para o usuário, o algoritmo deve perguntar a quantidade de presunto disponível. Caso a quantidade de presunto disponível seja maior ou igual a quantidade necessária o algoritmo deve finalizar. Caso não exista a quantidade suficiente, o algoritmo deve apresentar a quantidade inteira de sanduíches que podem ser produzidos com a quantidade de presunto disponível e sugerir a quantidade em Kgs de mortadela que deve ser utilizada para produzir o restante dos sanduíches. Considere que cada fatia de mortadela pesa 70 gramas. Deverá ser apresentado a quantidade de presunto que sobrará.

Resultado esperado:
#### Dados Entrada
Digite a quantidade de sanduiches: 45

Qual a quantidade em Kgs disponivel de presunto? 2.800	

#### Dados Saída
Para produzir 45 sanduiches serao necessarios:

4.500 kgs de mussarela

2.250 kgs de presunto

5.400 kgs de hambuger

#### Dados Entrada
Digite a quantidade de sanduiches: 30


Qual a quantidade em Kgs disponivel de presunto? 1.250	

#### Dados Saída
Para produzir 30 sanduiches serao necessarios:

3.000 kgs de mussarela

1.500 kgs de presunto 

3.600 kgs de hambuger


Sera possivel produzir apenas 25 sanduiches com presunto

Sera necessario 0.450 kgs de mortadela para produzir 5 sanduiches restantes

Da quantidade de presunto disponivel sobrara 0.000 kgs

#### Dados Entrada
Digite a quantidade de sanduiches: 32


Qual a quantidade em Kgs disponivel de presunto? 1.370	

#### Dados Saída
Para produzir 32 sanduiches serao necessarios:

3.200 kgs de mussarela 

1.600 kgs de presunto 

3.840 kgs de hambuger


Sera possivel produzir apenas 27 sanduiches com presunto

Sera necessario 0.450 kgs de mortadela para produzir 5 sanduiches restantes

Da quantidade de presunto disponivel sobrara 0.020 kgs

Questão 18: A empresa Hipotheticus paga R$10,00 por hora normal trabalhada, R$15,00 por hora extra e R$ 90 reais por cada dependente menor que 6 anos. Faça um 
algoritmo que solicite a quantidade de horas normais e extras trabalhadas no mês além da quantidade de dependentes menores que 6 anos. Considere que o salário líquido 
é igual ao salário de horas normais descontando-se 11% de impostos. O salário final é o salário liquido mais o valor recebido por cada dependente mais as horas 
extras. A empresa paga o adicional para no máximo 3 filhos menores que 6 anos. Caso o usuário digite uma quantidade de filhos superior a 3 deverá ser apresentado uma 
mensagem informando. “Salário calculado para apenas 3 dependentes, os demais X dependentes não receberão o auxilio.” X é a quantidade de dependentes acima da 
quantidade permitida.

Resultado esperado:
#### Dados Entrada
Digite a quantidade total de horas normais: 30	
 
Digite a quantidade total de horas extras: 23 

Digite a quantidade total de dependentes: 5	

#### Dados Saída
Horas normais: R$ 300.00

Adicional de Horas Extras: R$ 345.00 

Adicional de Dependentes: R$ 270.00

Salario Liquido (Hrs normais - Desconto): R$ 267.00 

Salario final: R$ 882.00

Salario calculado para apenas 3 dependentes.
Os demais 2 dependentes nao receberao o auxilio.

#### Dados Entrada
Digite a quantidade total de horas normais: 30 

Digite a quantidade total de horas extras: 23 

Digite a quantidade total de dependentes: 2	

#### Dados Saída
Horas normais: R$ 300.00

Adicional de Horas Extras: R$ 345.00 

Adicional de Dependentes: R$ 180.00

Salario Liquido (Hrs normais - Desconto): R$ 267.00 

Salario final: R$ 792.00

Questão 19: Uma loja de decoração precisa aumentar o seu faturamento para o próximo mês em 20%. Esta loja deseja atingir este objetivo aumentando a venda de três produtos. O produto 1 custa R$ 150 o produto 2 R$ 220,00 e o produto 3 R$ 97.00. Faça um algoritmo que receba o valor de faturamento do último mês, o codigo do produto para análise e apresente:

a)	O faturamento do próximo mês para bater a meta de 20%.
b)	A quantidade de peças apenas do produto escolhido necessárias para obter a meta desejada.

Regra: Caso o usuario digite um código de produto incorreto, apresente uma mensagem “Codigo de produto nao encontrado!” e finalize o algoritmo sem realizar nenhum calculo.

Produto /	Codigo
Produto 1 /	101
Produto 2 /	122
Produto 3 /	163

Resultado esperado:
#### Dados Entrada
Digite o valor do faturamento anterior: 34567.40

=== Codigo dos Produtos === 

Produto 1: 101

Produto 2: 122

Produto 3: 163

Digite o codigo do produto que se deseja bater a meta: 453	

#### Dados Saída
Codigo de produto nao encontrado!

#### Dados Entrada
Digite o valor do faturamento anterior: 3453.45

=== Codigo dos Produtos === 

Produto 1: 101

Produto 2: 122

Produto 3: 163

Digite o codigo do produto que se deseja bater a meta: 163	

#### Dados Saída
A meta do proximo mes e: R$ 4144.14 

Um aumento de: R$ 690.69

Quantidade de pecas a serem vendidas para atingirmos a meta:

Produto 3: 7.12 pecas

Questão 20: Uma padaria vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia. Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao 
final do dia, o dono quer saber quanto arrecadou com a venda dos pães e broas (juntos), e quanto deve guardar numa conta de poupança (10% do total arrecadado) para 
realizar uma reforma. Você foi contratado para fazer os cálculos para o dono. Com base nestes fatos, faça um algoritmo para ler as quantidades de pães e de broas, o 
valor da reforma e depois calcule o valor arrecado, o valor a ser depositado na poupança e quantos dias serão necessários, caso mantenha o mesmo faturamento, para 
custear a reforma.
 
Requisito adicional: A quantidade de dias deve ser retornado como um valor inteiro. 

Exemplo: 

3.78 dias deverá retornar 4 dias

9.2 dias deverá retornar 10 dias

10.89 dias deverá retornar 11 dias

Caso o valor de dias necessários para pagar a reforma for superior a 120 dias, o algoritmo deverá apresentar qual deveria ser o valor depositado na poupança d
iariamente para obter o valor da reforma dentro de 120 dias.

Resultado esperado:
#### Dados Entrada
Digite a quantidade de paes vendidos: 34 

Digite a quantidade de broas vendidas: 120 

Digite o valor da reforma: 45000.20

#### Dados Saída
Faturamento com a venda de broas: 192.00 

Faturamento com a venda de paes: 4.08 

Faturamento diario (paes + broas): 196.08 

Valor do deposito na poupanca: 19.61

Para pagar a reforma serao necessarios: 2295 dias

Para realizar a reforma em 120 dias sera necessario depositar diariamente R$: 375.00

#### Dados Entrada
Digite a quantidade de paes vendidos: 120 

Digite a quantidade de broas vendidas: 340 

Digite o valor da reforma: 3450.32	

#### Dados Saída
Faturamento com a venda de broas: 544.00 

Faturamento com a venda de paes: 14.40 

Faturamento diario (paes + broas): 558.40 

Valor do deposito na poupanca: 55.84

Para pagar a reforma serao necessarios: 62 dias

