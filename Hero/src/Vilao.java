 public abstract class Vilao extends Cidade {
        private String nome;
        private int poder;

        public Vilao(String nome, String poder){
            super(nome, poder);
            this.nome= nome;
        }
        public void atacar(){
            System.out.println("O Vilão está atacando");
        }
        public String getNome(){
            return nome;
        }
        public void setNome (String nome){
            this.nome= nome;
        }
    }


