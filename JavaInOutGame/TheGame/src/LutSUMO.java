public class LutSUMO extends Personagem implements Habilidades {

    public LutSUMO(Arma_IF arma) {

        this.arma = arma;
    }

    @Override
    public void falar() {
        InOut.MsgDeInformacao("Disgaea Hour of Darkness", "Lutador de Sumo diz: Preciso de dunuts");
    }

    @Override
    public void desenhar() {
        InOut.MsgSemIcone("Disgaea Hour of Darkness", "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢋⢉⡩⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + //
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣽⣿⣾⠛⢽⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣯⣽⣿⣿⡏⡍⣽⣟⡭⣽⢟⣿⣿⣿⣿\r\n" + //
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡯⢴⡾⣿⣷⢶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⡎⣿⡝⢿⣷⣧⣿⣝⡇⡏⢸⣿⢏⣿⣿\r\n" + //
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⣼⣿⣿⣿⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⣿⣿⣶⣿⣿⣿⣿⣶⣿⣾⣷⣾⣿⣿\r\n" + //
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠉⣿⣷⣿⣿⣿⣿⣿⡟⡉⠀⠀⠀⠀⠀⠀⠈⠉⠛⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + //
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣾⣿⣿⣿⣿⣿⠏⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + //
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣏⠀⣶⣦⣄⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + //
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠋⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣤⣀⣶⡶⠛⠉⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + //
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆⣠⣾⣿⣿⣿⣿⣿⣿⣿⠟⠛⢋⣻⣿⣿⣿⡟⠁⠀⠀⠀⠀⠀⣀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n" + //
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣠⡉⢻⣷⣷⣾⣿⣿⠿⠁⠀⠀⠀⠀⠀⠺⡿⠁⠀⠀⢹⣿⣿⣿⣿⣿⣿\r\n" + //
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠙⠻⠿⠟⠁⠀⠀⠀⠀⠀⠀⣠⣾⡀⠀⠀⠀⠀⣹⣿⣿⣿⣿⣿\r\n" + //
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⣿⣿⣿⣟⣉⣉⢉⣯⡀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣾⣿⣿⣷⣤⣤⣶⣿⡿⠁⠀⠹⣿⣿\r\n" + //
                "⣿⠯⠉⠛⠻⠿⣿⢿⣿⣿⣿⣿⣿⠋⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣤⣤⣤⣤⣶⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠋⠀⠀⠀⠀⠸⣿\r\n" + //
                "⣿⣆⠡⣟⠗⠀⡀⠀⠉⠻⠛⠋⠁⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⢻⣿⣿⣿⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⣿\r\n" + //
                "⣿⣿⣿⣶⡁⠈⠱⡀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⣠⣿⣿⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼\r\n" + //
                "⣿⣿⣿⣿⣿⣶⣤⣬⣤⣠⣤⣤⣤⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿\r\n" + //
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿\r\n" + //
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿\r\n" + //
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣀⡀⠀⠀⠀⠀⠀⢰⣾⣿⣿⣿\r\n" + //
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠈⠻⣿⣿⣿\r\n" + //
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠈⠻⣿\r\n" + //
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⠀⠀⠀⠀⠀⢹\r\n" + //
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡀⠀⠀⠀⠀\r\n" + //
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠀⠀⠀\r\n" + //
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡀⠀");
    }

    @Override
    public boolean correr() {

        InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                "Se falhar nisso não lhe resta mais nada...");
        InOut.MsgDeAviso("Disgaea hour of Darkness",
                "Essa opção lhe rendeu uma chande de 4 em 5 de vencer");
        int opt = InOut.leInt("Digite um número de 1 a 5 ");
        if (opt == 1 || opt == 5 || opt == 2 || opt == 3) {
            InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                    "Mesmo tendo o físico de um lutador de sumô... você se acovarda e corre... (ironico)");
            return true;
        } else {
            InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                    "Você tropeça... machuca a espinha... (sem comentários)");
            return false;
        }

    }

    public boolean gameplayLutadorSumo(Arma_IF arma) {

        while (true) {
            desenhar();
            InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                    "Você escolheu o Lutador de Sumo!\nVocê não possui nenhum tipo de equipamento!\nO jogo começa agora!");
            falar();
            InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                    "Você está em um torneio de Sumo!, Sem tempo para pensar...\nVocê avista seu próximo oponente... o mais forte... (Você um verdadeiro covarde!)\nVocê sabe que a humilhação é eminente...\nHora da escolha...");
            int opt = InOut.leInt(
                    "[1] - Lutar como homem! (Honroso!)\n[2] - Correr (Sério?)");
            if (opt == 1) {
                return arma.usarArma();
            }

            if (opt == 1) {

                return arma.usarArma();
            }
            if (opt == 2) {
                return correr();
            }
        }
    }
}