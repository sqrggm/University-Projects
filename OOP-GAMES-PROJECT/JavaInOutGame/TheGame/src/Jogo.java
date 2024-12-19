public class Jogo {
    public static void main(String[] args) throws Exception {

        InOut.MsgDeAviso("Disgaea Hour of Darkness", // Mensagem Inicial
                "For maximum gaming enjoyment, play in a dark room, sit as close to the TV as possible, and never take breaks!");

        while (true) { // Menu Inicial
            int opt = InOut.leInt("[1] - Start\n[2] - Leave");
            if (opt == 2) {
                break;
            }
            if (opt == 1) { // Escolha de personagem
                InOut.MsgDeAviso("Disgaea Hour of Darkness",
                        "Choose a character\n(Choose carefully...)");
                opt = InOut.leInt("[1] - Soldado - [2] - General - [3] - Sumo");
                if (opt == 1) { // Gameplay Soldado
                    Faca faca = new Faca();
                    Revolver revolver = new Revolver();
                    Soldado soldado = new Soldado(revolver, faca);
                    boolean jogo = soldado.gameplaySoldado(revolver, faca);
                    if (jogo == false) {
                        InOut.MsgDeErro("Disgaea Hour of Darkness", "Fim de jogo... você perdeu!");
                        break;
                    }
                    if (jogo == true) {
                        InOut.MsgDeInformacao("Disgaea hour of Darkness",
                                "Após derrotar o suposto monstro (um velho urso em sua caverna...)\nVocê decide descansar e esperar pelo resgate, que vem... e você retorna para a casa");
                        try { // tratamento de excessão (Opção Invalida)
                            while (true) {

                                int optExtra = InOut
                                        .leInt("Você desbloqueou novos personagens!\n[1] - Dragão - [2] - Mago - [3] - sair");
                                if (optExtra == 1) {
                                    BoladeFogo boladeFogo = new BoladeFogo();
                                    DragaoAlado dragao = new DragaoAlado(boladeFogo);
                                    dragao.gameplayDragao(boladeFogo);
                                    break;
                                }
                                if (optExtra == 2) {
                                    Magia magia = new Magia();
                                    Mago mago = new Mago(magia);
                                    mago.gameplayMago(magia);
                                    break;
                                }
                                if (optExtra == 3) {
                                    break;
                                } else {
                                    throw new IllegalArgumentException("Opção inválida. Por favor, escolha 1, 2 ou 3.");
                                }

                            }
                        } catch (IllegalArgumentException e) {
                            System.out.println("Erro: " + e.getMessage());
                        } catch (Exception e) {
                            InOut.MsgDeErro("Disgaea Hour of Darkness",
                                    "Erro: Entrada inválida. Por favor, insira um número entre 1 e 3.");
                        }
                    }

                }

            }
            if (opt == 2) { // gameplay General
                Fuzil fuzil = new Fuzil();
                Revolver revolver = new Revolver();
                General general = new General(fuzil, revolver);
                boolean jogo = general.gameplayGeneral(fuzil, revolver);
                if (jogo == true) {
                    InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                            "O bom e velho general sobrevive...\n(A vitória se aproxima!)");
                    try { // tratamento de excessão (Opção Invalida)
                        while (true) {

                            int optExtra = InOut
                                    .leInt("Você desbloqueou novos personagens!\n[1] - Dragão - [2] - Mago - [3] - sair");
                            if (optExtra == 1) {
                                BoladeFogo boladeFogo = new BoladeFogo();
                                DragaoAlado dragao = new DragaoAlado(boladeFogo);
                                dragao.gameplayDragao(boladeFogo);
                                break;
                            }
                            if (optExtra == 2) {
                                Magia magia = new Magia();
                                Mago mago = new Mago(magia);
                                mago.gameplayMago(magia);
                                break;
                            }
                            if (optExtra == 3) {
                                break;
                            } else {
                                throw new IllegalArgumentException("Opção inválida. Por favor, escolha 1, 2 ou 3.");
                            }

                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    } catch (Exception e) {
                        InOut.MsgDeErro("Disgaea Hour of Darkness",
                                "Erro: Entrada inválida. Por favor, insira um número entre 1 e 3.");
                    }
                }
                if (jogo == false) {
                    InOut.MsgDeErro("Disgaea Hour of Darkness", "Fim de jogo... você perdeu!");
                    break;
                }
            }
            if (opt == 3) { // gameplay Lutador de Sumo
                Desarmado punhos = new Desarmado();
                LutSUMO sumo = new LutSUMO(punhos);
                boolean jogo = sumo.gameplayLutadorSumo(punhos);
                if (jogo == true) {
                    InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                            "Incrivel! você não contava com essa...");
                    try { // tratamento de excessão (Opção Invalida)
                        while (true) {

                            int optExtra = InOut
                                    .leInt("Você desbloqueou novos personagens!\n[1] - Dragão - [2] - Mago - [3] - sair");
                            if (optExtra == 1) {
                                BoladeFogo boladeFogo = new BoladeFogo();
                                DragaoAlado dragao = new DragaoAlado(boladeFogo);
                                dragao.gameplayDragao(boladeFogo);
                                break;
                            }
                            if (optExtra == 2) {
                                Magia magia = new Magia();
                                Mago mago = new Mago(magia);
                                mago.gameplayMago(magia);
                                break;
                            }
                            if (optExtra == 3) {
                                break;
                            } else {
                                throw new IllegalArgumentException("Opção inválida. Por favor, escolha 1, 2 ou 3.");
                            }

                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    } catch (Exception e) {
                        InOut.MsgDeErro("Disgaea Hour of Darkness",
                                "Erro: Entrada inválida. Por favor, insira um número entre 1 e 3.");
                    }
                }
                if (jogo == false) {
                    InOut.MsgDeErro("Disgaea Hour of Darkness", "Fim de jogo... você perdeu!");
                    break;
                }

            }

        }
    }

}
