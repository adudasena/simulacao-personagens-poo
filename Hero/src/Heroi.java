public abstract class Heroi extends Cidade{
        public String nome;
        private int poder;

    public Heroi(String nome, String poder){
            super(nome, poder);
            this.nome= nome;
        }
        public void defender(){
            System.out.println("O Heroi está defendendo");
        }
        public String getNome(){
            return nome;
    }
        public void setNome (String nome){
            this.nome=nome;

        }
    }

