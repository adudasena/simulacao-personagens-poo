public abstract class Cidade {
        public int habitantes;
        public String nome, poder;

        public Cidade(String nome, String poder){
            this.nome = nome;
            this.poder = poder;
        }
        public abstract void atacar();
        public abstract void defender();

        public String getNome() {
            return nome;
        }

        public void setNome(String nome){
            this.nome= nome;
        }

        public String getPoder(){
            return poder;
        }

        public void setPoder(String poder){
            this.poder= poder;
        }
    }

