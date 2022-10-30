# ListaAvaliativa2
Lista avaliativa 2 de Java feito por Davi Rocha e Samuel de Angeli

1. Escreva uma classe em Java chamada Estoque. Ela deverá possuir: 

a) os atributos nome (String), qtdAtual (int) e qtdMinima (int). 
b) os métodos com as seguintes assinaturas: 
void mudarNome(String nome) 
void mudarQtdMinima(int qtdMinima) 
void repor(int qtd) 
void darBaixa(int qtd) 
String mostra() 
boolean precisaRepor() 

2. Escreva uma classe UsaEstoque cujo método main instancia os 3 objetos a 
seguir: 

estoque1
nome: Impressora Jato de Tinta
qtdAtual: 13
qtdMinima: 6

estoque2
nome: Monitor LCD 17"
qtdAtual: 11
qtdMinima: 13

estoque3
nome: Mouse
qtdAtual: 6
qtdMinima: 2

Execute as seguintes ações na ordem:
a) Dar baixa em  5 un de estoque1.
b) Fazer Reposição de 7 un de estoque2.
c) Dar baixa em 4 un de estoque3.
d) Exibir saida do metodo precisaRepor dos 3 obj.
e) Exibir saída do método mostra para apresentar as informações.

3. Implemente uma classe chamada “Arquivo” que possua o controle de 
acesso RWX dos Sistemas Unix:
→ O primeiro bit indica que o objeto é um objeto de leitura apenas.
→ O segundo bit indica que o objeto é um objeto de escrita apenas.
→ O terceiro bit indica que o objeto é um objeto executável apenas.
Read Write Execute
1 0 1
Indica um arquivo que permite Leitura e Execução
Forneça os seguintes métodos para os objetos instanciados nessa classe:
→ Construtor da classe:
public Arquivo(byte r, byte w, byte e)
→ Métodos que verificam se o arquivo fornece permissão de leitura, escrita e
execução:
public boolean isReadable();
public boolean isWriteable();
public boolean isExecuteable();
→ Métodos que concedem a troca do atributo de leitura, escrita e execução, 
ou seja, se o arquivo tinha permissão de leitura ao ser chamado o método 
“trocaRead” ele passa a não ter mais a permissão de leitura, e caso ele não 
tenha a permissão passa a ter. 
public byte trocaRead();
public byte trocaWrite();
public byte trocaExecute();
→ Um método que mostra as permissões do arquivo.
public byte mostraEstado();

4. Escreva a classe ConversaoDeUnidadesDeVolume com métodos estáticos 
para conversão das unidades de volume segundo a lista abaixo. Cada 
conversão deve ser realizada por um método que recebe como parâmetro um 
valor para converter.
• 1 litro = 1000 centímetros cúbicos
• 1 metro cúbico = 1000 litros
• 1 metro cúbico = 35.32 pés cúbicos
• 1 galão americano = 231 polegadas cúbicas
• 1 galão americano = 3.785 litros
Depois crie uma classe Teste para realizar a chamada dos métodos criados.

5. Crie uma classe para representar uma conta corrente, com métodos para 
depositar uma quantia, sacar uma quantia e obter o saldo. Para cada saque 
será debitada também uma taxa de operação equivalente à 0,5% do valor 
sacado. Para a criação de objetos dessa classe será possível (opcional) 
informar o valor do saldo da conta.

6. Identifique as classes e implemente um programa para a seguinte 
especificação: “O supermercado vende diferentes tipos de produtos. Cada 
produto tem um preço e uma quantidade em estoque. Um pedido de um cliente é composto de itens, onde cada item especifica o produto que o cliente deseja 
e a respectiva quantidade. Esse pedido pode ser pago em dinheiro, cheque ou 
cartão.”

7. Leia do usuário o tempo em segundos e escreva em horas, minutos e 
segundos. Utilize cinco métodos, para a leitura e escrita de dados e para 
obtenção de horas, minutos e segundos a partir do tempo em segundos.

8. Crie um programa que faça o gerenciamento de um PetShop. Este programa 
deverá ter, no mínimo, 6 classes e, em cada classe, no mínimo, 5 métodos. Ao 
final, no método main, utilize os métodos criados
