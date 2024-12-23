class Aresta implements Comparable<Aresta> {
    //Atributos
    public String origem;
    public String destino;
    public int km;
    public int custo;
    public int despesas;//Remover

    //Construtor
    public Aresta(String origem, String destino, int km, int custo, int despesas) {
        this.origem = origem;
        this.destino = destino;
        this.km = km;
        this.custo = custo;
        this.despesas = despesas;
    }

    //CompareTo
    @Override
    public int compareTo(Aresta outraAresta) {
        double pesoCusto = 0.1;
        double pesoDespesas = 0.9;
    
        double pesoAtual = km + custo * pesoCusto + despesas * pesoDespesas;
        double pesoOutra = outraAresta.km + outraAresta.custo * pesoCusto + outraAresta.despesas * pesoDespesas;
    
        return Double.compare(pesoAtual, pesoOutra);
    }
}