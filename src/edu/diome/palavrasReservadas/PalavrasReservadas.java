package edu.diome.palavrasReservadas;

public class PalavrasReservadas {
    /*
    abstract - OK
    assert - OK
    boolean - OK
    break - OK
    byte - OK
    case - OK
    catch - OK
    char - OK
    class - OK
    const
    continue - OK
    default
    do
    double - OK
    else
    extends - OK
    final - OK
    finally - OK
    float - OK
    for
    goto
    if
    implements - OK
    import - OK
    instanceof
    int - OK
    interface - OK
    long - OK
    native - OK
    new - OK
    package - OK
    private - OK
    protected - OK
    public - OK
    return
    short - OK
    static - OK
    strictfp - OK
    super
    switch
    synchronized - OK
    this
    throw - OK
    throws - OK
    transient - OK
    try - OK
    void - OK
    volatile - OK
    while
     */

    /**
     * CONTROLE DE PACOTE
     * - import: importa pacortes e classes para dentro do código;
     * - package: especifica a que pacote todas as classes de um arquivo pertencem;
     */
    /**
     * MODIFICADORES DE ACESSO
     * - public: acesso de qualquer classe;
     * - private: acesso apenas dentro da classe;
     * - protected: acesso por classes no mesmo pacote e subclasse;
     */
    /**
     * PRIMITIVOS
     * - boolean: um valor indicando verdadeiro ou falso;
     * - byte: um inteiro de 8 bites (signed);
     * - char: um character unicode (16-bit unsigned);
     * - double: um número de ponto flutuante de 64 bits (signed);
     * - float: um número de ponto flutuante de 32 bits (signed);
     * - int: um inteiro de 32 bits (signed);
     * - long: um inteiro de 64 bits (signed);
     * - short: um inteiro de 32 bits (signed);
     * - void: indica que os métodos não tem retorno de valor;
     */
    /**
     * MODIFICADORES DE CLASSES, VARIÁVEIS E MÉTODOS
     * - abstract: classe que não pode ser instanciada ou métodos que precisa ser
     *             implementado por uma subclasse não abstrata; '
     * - class: especifica uma classe;
     * - extends: indica a superclasse que a subclasse está estendendo;
     * - final: impossibilita que uma classe seja estendida, que um métodos seja
     *          sobrescrito ou que uma variável seja reinicializada;
     * - implements: indica as interfaces que uma classe irá implementar;
     * - interface: especifica uma interface;
     * - native: indica que um métodos está escrito em uma linguagem dependente de
     *           plataforma, como o C;
     * - new: instancia um novo objeto, chamado de construtor;
     * - static: faz um métodos ou variável pertencer à classe ao invés de às instâncias;
     * - strictfp: usado em frente a um métodos ou classe  para indicar que os
     *             números de um ponto flutuante seguirão as regras de ponto flutuante
     *             em todas as expressões;
     * - synchronized: indica que um métodos só pode ser acessadp por uma thread de cada vez;
     * - transient: impede a serialização de campos;
     * - volatile: indica que uma variável pode ser alterada durante o uso de threads;
     */
    /**
     * CONTROLE DE FLUXO DENTRO DE UM BLOCO DE CÓDIGO
     * - break: sai do bloco de código em que ele está;
     * - case: executa um bloco de código dependendo do teste de switch;
     * - continue: pula a execução do código que viria após essa linha e vai para a
     *             próxima passagem de loop;
     */
    /**
     * TRATAMENTOS DE ERROS
     * - assert: testa uma expressão condicional para verificar uma suposição do programador;
     * - catch: declara o bloco de códigos usado para tratar uma exceção;
     * - finally: bloco de código, após um try-catch, que é executado independentemente
     *            do fluxo de programa seguido ao lidar com uma exceção;
     * - throw: usado para passar uma exceção para o métodos que o chamou;
     * - throws: indica que um métodos pode passar uma exceção para o métodos
     *           que o chamou;
     * - try: bloco de código que tentará ser executado, mas que pode causar uma exceção;
     */
    /**
     * VARIÁVEIS DE REFERÊNCIA
     * - super: refere-se a superclasse imediata;
     * - this: refere-se a instância atual do objeto;
     */

    /*ESCOPO DE USO*/
    /**
     * USO - ARQUIVO
     * - Palavras: package, import e static:
     * USO - CLASSE
     * - Palavras: public ou protected ou private + final ou abstract + extends ou implements
     * USO - MÉTODOS
     * - Palavras: public ou protected ou private + static ou final ou abstract + void e return
     * USO - ATRIBUTO
     * - Palavras: public ou protected ou private + static ou final + tipo primitivo
     */
}
