package produtos;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int estoque;

    public Produto(int id, String nome, double preco, int estoque) {
        if(nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome do produto não pode ser null nem vazio");
        }
        if(preco < 0 ) {
            throw new IllegalArgumentException("Preço do produto não pode ser negativo");
        }
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public Produto(String nome, double preco, int estoque) {
        if(nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome do produto não pode ser null nem vazio");
        }
        if(preco < 0 ) {
            throw new IllegalArgumentException("Preço do produto não pode ser negativo");
        }

        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome do produto não pode ser null ou vazio");
        }
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco < 0){
            throw new IllegalArgumentException("Preço do produto não pode ser negativo.");
        }
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }



    @Override
    public String toString() {
        return "{ nome:  " + nome + " - preco: RS" + preco + " - estoque: "+estoque + " } \n";
    };
}
