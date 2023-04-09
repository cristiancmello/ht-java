# Exception Handling

- O que é uma Exception?
  É uma condição anormal que um código pode alcançar em run-time.
  Logo, uma exception é um **Erro de runtime**.

- Existe alguma outra forma de tratar erros?
  Tradicionalmente, em linguagens que não suportam exceptions, como Assembly e C,
  devemos verificar e tratar manualmente através de error code. É uma tarefa muito dolorosa.

- [] Testes unitários
  - Como testar com lançamento de Exceptions?

- [] Exception-Handling Fundamentals
  - Blocks try, catch, throw, throws e finally
  - Block try-with-resources (Cap 13)

- [] Exception Types
  - Throwable
    - Exception
      - RuntimeException
    - Error

- [] Uncaught Exceptions (Exceções Nao-Capturadas)
  - Division-by-zero error
    - ArithmeticException
  - Simple stack trace
  - Call Stack é útil para debugging

- [] Using try and catch
  - try : atua como monitor de run-time error
  - catch : cláusula que processa Exceptions geradas
    - Objetivo importante do "catch": permitir que o código prossiga como se nada tivesse acontecido

- [] Displaying a Description of an Exception
  - Throwable faz override em toString()
  - Mostrar descrição de erro na cláusula "catch"

- [] Multiple catch Clause
  - Situação onde mais de uma exception pode ser lançada num block try

- [] Nested try Statements
  - Block try pode estar dentro de outro block try
  - Problemas gerados com inner block try e outer block try

- [] throw
  - Lançamento de exception explicitamente com "throw"
  - Só se pode lançar objetos do tipo Throwable e/ou suas subclasses
  - int, char: não são throwables
  - String, Object: não pode ser usados em exceptions

- [] throws
  - Usado quando um método não é capaz de lidar com uma exception porque não pode tratá-la
  - Inclusão na declaração do método

- [] finally
  - Block finally é executada mesmo que haja ou não lançamento de exception
  - Qual tipo de problema pode ajudar a tratar?
    - Quando o código segue fluxo não-linear que altera o fluxo normal do método.
      O código pode parar ir para "return" de forma prematura.
    - Dê um exemplo onde esse comportamento não-linear é crítico?
      - Exemplo 1: Método inicia a abertura de um arquivo e, em seguida, uma exception é lançada.
        Não desejamos que o arquivo continue aberto. É desejável encerrá-lo de qualquer forma. "finally" pode ajudar neste caso.
      - Exemplo 2: TODO busque alguma situação onde o finally pode ser muito útil.

- [] Java's Built-in Exceptions
  - Package "java.lang" há inúmeras classes de Exception
  - Maioria são subclasses de RuntimeException
  - Quais situações são potenciais para lançar estas exceptions? TODO: procure.

- [] Creating Your Own Exception Subclasses
  - Defina apenas uma subclasse de Exception
  - Exception herda de Throwable

- [] Chained Exceptions
  - Qual cenário pode ocorrer?
    - Exemplo 1: Erro de divisão por zero devido a erro de I/O

- [] Three Additional Exception Features
  - Trazidos por Recursos de Java 7 e superiores
  - First try-with-resources
  - Second multi-catch
  - Third final rethrow / more precise rethrow

- [] Using Exceptions
  - Não considere exception-handling como mecanismo geral para nonlocal branching
