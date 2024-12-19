public class BoladeFogo implements Arma_IF {

    @Override
    public boolean usarArma() {

        InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                "Sem essa! incenerar o alvo é eficiente!!!");
        InOut.MsgDeAviso("Disgaea hour of Darkness",
                "Essa opção lhe rendeu uma chande de 4 em 5 de vencer");
        int opt = InOut.leInt("Digite um número de 1 a 5 ");
        if (opt == 1 || opt == 5 || opt == 2 || opt == 4) {
            InOut.MsgDeInformacao("Disgaea Hour of Darkness", "A luta termina cedo... sem chance para o oponente...");
            return true;
        } else {
            InOut.MsgDeInformacao("Disgaea Hour of Darkness", "Acabou o gas do fogão... a lenda está perdida...");
            return false;
        }

    }

}
