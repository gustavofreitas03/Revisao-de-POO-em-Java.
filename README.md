# Revisao-de-POO-em-Java.
Teste e Qualidade de Software - ADS 2026.1


QUESTOES:
1. Crie uma classe Employee que inclua três atributos: primeiro nome (String), último nome (String) e
salário mensal (double). Crie um construtor que inicialize os três atributos, e também métodos set e
get para cada um deles. Se o valor do salário, passado para o construtor ou método set, não for
positivo, o atributo não deve ser inicializado. Crie uma classe de teste EmployeeTest para testar as
funcionalidades da classe Employee: instancie dois objetos e exiba na tela o salário anual de cada
um. Em seguida, dê a ambos um aumento de 10% e novamente mostre na tela os salários anuais.

2. Crie uma classe Date que inclua três atributos: dia (int), mês (int) e ano (int). Escreva um construtor
que inicialize os atributos se os valores que lhe foram passados estiverem corretos. Faça o mesmo
para os métodos get e set para cada atributo. Também escreva um método displayDate que exiba
na tela a data no formato DD/MM/YYYY. Escreva uma classe DateTest para testar a classe Date.

3. Crie uma hierarquia de classes usando herança: uma superclasse Quadrilateral, e suas derivadas
Trapezoid, Parallelogram, Rectangle and Square. Crie e use uma classe Point para representar os
pontos em cada uma das formas. Especifique os atributos e métodos de cada classe: os atributos de
Quadrilateral devem ser os quatro pontos de seus vértices. Escreva um programa de teste que
instancie objetos de cada classe e calcule a área de cada uma das figuras.

4. Crie uma classe chamada SavingsAccount. Use uma variável static chamada annualInterestRate para
guardar a taxa de juros anual para todos os correntistas. Cada objeto da classe contém um atributo
savingsBalance que guarda o valor que cada correntista tem em poupança. Escreva um método
calculateMonthlyInterest que calcule o juros mensal multiplicando os valores em savingsBalance e
annualInterestRate e, em seguida, dividindo-os em seguida por 12 – o valor obtido deve ser somado
a savingsBalance. Escreva um método static chamado modifyInterestRate que ajuste o valor de
annualInterestRate. Escreva um programa de teste que instancie dois objetos da classe
SavingsAccount, saver1 e saver2, com valores de poupança de $2000,00 e $3000,00,
respectivamente. Ajuste annualInterestRate para 4%, depois calcule o juros mensal para cada um
dos doze meses do ano e exiba na tela os novos valores de poupança para ambas as contas. Faça o
mesmo, agora ajustando o juros anual para 5%.

5. Uma empresa paga seus funcionários semanalmente. Nela existem quatro tipos de empregados:
assalariados, a quem é paga uma quantia semanal fixa, independente do número de horas
trabalhadas; horistas, que são pagos por hora e recebem valor extra (1,5 o valor da hora regular)
por hora trabalhada que exceda o limite máximo de 40 horas; os que ganham por comissão cujo
valor é uma porcentagem de suas vendas; e os que ganham um salário base fixo mais uma comissão

baseada nas vendas realizadas. Implemente um sistema de pagamento, ilustrado na figura abaixo,
em que:
a. Employee é uma classe abstrata com três atributos: primeiro nome (String), último nome
(String) e número de CPF (String);
b. Employee possui um método abstrato earnings que deve, nas subclasses concretas, retornar
o ganho de cada tipo de empregado.
c. Cada subclasse deve herdar de sua superior.
d. Cada classe deve ter os métodos set e get necessários; cada classe deve ter os atributos
adicionais que lhe forem necessários.
e. Cada classe deve ter um método toString que exiba na tela todos os valores de seus
atributos.
f. Escreva um programa de teste que instancie objetos de cada classe utilizando polimorfismo.
