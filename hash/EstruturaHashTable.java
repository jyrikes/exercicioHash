package hash;
public class EstruturaHashTable implements EstruturaDeDados{
    
    private Integer tabela[];
    

    public EstruturaHashTable() {
        tabela = new Integer[1000];
    }

    @Override
    public boolean insert(int chave) {
        // TODO quando inserir, se a posição estiver ocupada, o elemento NÃO é inserido e retorna false. Caso contrário, o elemento é inserido na posição calculada e retorna true.
        int hash = hash(chave);
        if(this.tabela[hash] == null){
            this.tabela[hash] = chave;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean delete(int chave) {
        // TODO quando inserir, se a posição estiver ocupada, torna o elemento da posição como null e retorna true. Caso contrário, retorna false.
        int hash = hash(chave);
        if(this.tabela[hash] != null && this.tabela[hash] == chave){
            this.tabela[hash] = null;
            return true;
        }else{
            return false;
        }   
    }

    @Override
    public boolean search(int chave) {
        // TODO se a posição estiver ocupada e valor é o mesmo (ou seja, tem que ser ambos), retorna true. Caso contrário, retorna true.
        int hash = hash(chave);
        if(this.tabela[hash] != null && this.tabela[hash] == chave){
            return true;
        }else{
            return false;
        }
        
    }
    public int hash(int chave){
        return chave % 1000;
    }
    
}
