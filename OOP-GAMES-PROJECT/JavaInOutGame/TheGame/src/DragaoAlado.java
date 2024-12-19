public class DragaoAlado extends PersonagensEspeciais {

    public DragaoAlado(Arma_IF arma) {

        arma = this.arma;

    }

    @Override
    public void falar() {
        InOut.MsgDeInformacao("Disgaea Hour of darkness", "RUGIDO****");

    }

    public void desenhar() {
        InOut.MsgSemIcone("Disgaea Hour of Darkness", "　　　　　　　　　　　　　　 　 　 　 　 　 　 　 ／/　 ／/\r\n" + //
                "　　　　　　　　　　　　　　　　　　　　　/!　／/!　／／\r\n" + //
                "　　　　　　　　　　　　　　　　 　 　 　 | ﾚ',／| ﾚ',／\r\n" + //
                "　　　　　　　　　　　　　　　　　　　 ／~／／~／\r\n" + //
                "　　　　　　　　　　　　　　　　 　 ／　ノ／　ノ\r\n" + //
                "　　　　　　　　　　　　　　　　ノ⌒ツ⌒ゞ\"ﾞツ彡　　　　　　　　　　　　　　　　　　 ＿＿\r\n" + //
                "　　　　　　　　　　　 ノ~ツ⌒777,三≡=／￣/彡　　　　　 　 　 　 　 　 　 　 ノ三二三ﾆ､\r\n" + //
                "　　　　　　　　　　（,,,,,ﾆ（,,,,,,,,,,,,,､ フ三//~　/三彡　　　　　　 　 　 　 　 　 ノ彡ﾉ⌒彡三ﾆ､\r\n" + //
                "　　　ノ⌒ヽ ＿＿,(ﾟﾉ三（ﾟ　　ノ ＾ヾ\"/厶 ノ三三彡　　　　　　　　　　　　彡彡'　　　 彡三ﾆ､\r\n" + //
                "　　(o　o　　）ー､⌒ーゝ三ニ=＾ー三ミ三三三三彡　　　　　　　　　　　　　　　　　　　彡三ﾆ､\r\n" + //
                "　 （ﾉvｗ,,ヽｖv､_､ゝ＝==､,,_三ニ=三ニ=三三三三彡　　　　　　　　　　　　　　　　　　　 彡三ﾆ､\r\n" + //
                "　　　　V~ＷV~w;;;;'⌒ー ､　＼＿ニ=三ニ=三三三彡　　　　　　　　　　　　　　　　　　　　彡三ﾆ､\r\n" + //
                "　　　　　　　　　ヽ　　　;;;;;〉　 ＿_＼三二三二三三彡　　　　　　　　　　　　　　　　　　　　 彡三ﾆi\r\n" + //
                "　　　　　　､～⌒＝　　／ ／　　 ~冫＿＿,ﾉ三二三彡　　　　　　　　　　　　　　　　　　 　 彡三ニi\r\n" + //
                "　　　　　　 ヽｗｗｗ､,ノ　 /　　　　/＿＿,ﾉニ三二三彡　　　　　　　　　　　　　　　　　　　彡三ニ/\r\n" + //
                "　　　　　　　ノ⌒⌒~ヽ／　　　　/＿＿,ﾉニ三二三彡　　　　　　　　　　　　　　　　　　　彡三ニ/\r\n" + //
                "　　　　　　彡　　　　yゝ　　　　/＿＿,ﾉニ三二三彡　　　　　　　　　　　　　　　　　　　彡三ニ/\r\n" + //
                "　　　　　　 \"从ソvツ 　 　 　 /＿＿,ﾉニ三二三彡　　　　　　　　　　　　　　　　　　　彡三ニ/\r\n" + //
                "　　　　　　　　　　　　　　　　/＿＿,ﾉニ三二三彡　　　　　　　　　　　　　　　　　　　彡三ニ/\r\n" + //
                "　　　　　　　　　　　　 　 　 /＿＿,ﾉニ三二三彡　　　　　　　　　　　　　　　　　　　 彡三ニ､\r\n" + //
                "　　　　　　　　　　 　 　 　 /＿＿,ﾉニ三二三彡　　　　　　　　　　　　　　　　　　　 彡三ニ三､");
    }

    public boolean voar() {
        InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                "Ok! quem sou eu para julgar...");
        InOut.MsgDeAviso("Disgaea hour of Darkness",
                "Essa opção lhe rendeu uma chande de 3 em 5 de vencer");
        int opt = InOut.leInt("Digite um número de 1 a 5 ");
        if (opt == 1 || opt == 5 || opt == 2) {
            InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                    "Um voo eficiente e preciso... sem chance para o oponente... Quanto poder!!!");
            return true;
        } else {
            InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                    "Algo inacreditavel aconteceu... seu voo falha (Talvez seja a idade!)");
            return false;
        }
    }

    public boolean gameplayDragao(Arma_IF arma) {
        while (true) {
            desenhar();
            InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                    "Você escolheu o Dragão!!\nVocê possui os seguintes equipamentos:\nBola de fogo e suas Asas!\nO jogo começa agora!");
            falar();
            InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                    "Você se encontra em um sono profundo em seu castelo amaldiçoado...\nVocê escuta um barulho!\nUm cavaleiro idiota querendo se provar...\nMostre para ele porque é temido!!!");
            int opt = InOut.leInt(
                    "[1] - Cuspir FOGO! (Ninguém pode te derrotar...)\n[2] - Usar suas asas e esmagalo com seu peso de toneladas... (Economia no bafo?)");
            if (opt == 1) {
                return arma.usarArma();
            }
            if (opt == 2) {
                return voar();
            }

        }
    }
}
