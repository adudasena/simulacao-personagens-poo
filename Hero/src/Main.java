public class Main {
    public static void main(String[] args) {
        Vilao vilao = new Vilao("Thanos", "Destruir o universo") {
            @Override
            public void defender() {
                System.out.println("O vilão está defendendo a cidade");
            }
        };

        Heroi heroi = new Heroi("Homem de Ferro",  "Armadura") {
            @Override
            public void atacar() {
                System.out.println("O vilão está atacando");
            }
        };

        System.out.println("Nome do Herói: "+heroi.getNome());
        System.out.println("Poder do Herói: "+heroi.getPoder());

        System.out.println("Nome do Vilão: "+vilao.getNome());
        System.out.println("Poder do Vilão: "+vilao.getPoder());

        heroi.defender();
        vilao.atacar();

    }
}