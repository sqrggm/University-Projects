public class Desarmado implements Arma_IF {

    @Override
    public boolean usarArma() {

        InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                "Todo foco para a batalha! você vai colocar seus punhos para funcionar");
        InOut.MsgDeAviso("Disgaea hour of Darkness",
                "Essa opção lhe rendeu uma chande de 2 em 5 de vencer");
        int opt = InOut.leInt("Digite um número de 1 a 5 ");
        if (opt == 1 || opt == 2) {
            InOut.MsgDeInformacao("Disgaea Hour of Darkness", "Um soco certeiro! Você se surpreende com sigo mesmo...");
            return true;
        } else {
            InOut.MsgDeInformacao("Disgaea Hour of Darkness", "Você erra e acerta a própria cara...");
            return false;
        }

    }

}
