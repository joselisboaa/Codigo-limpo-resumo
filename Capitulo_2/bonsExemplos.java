
public class BonsExemplosDoCapitulo2 {
    // Pode-se reparar que esses atributos são bem descritivos, na primeira  leitura você consegue identificar o seu propósito
    private int fileAgeInDays;
    private int elapsedTimeInDays;
    private int daysSinceCreation;
    private int daysSinceModification;

    // Esse exemplo claramente podemos perceber que se trata de algum tipo de jogo de tabuleiro, onde haverão casas
    // marcadas e essa função irá retornar tais casas marcadas
    public List<int[]> getFlaggedCells() {
        List<Cell> flaggedCells = new ArrayList<Cell>();

        for(Cell cell : gameBoard)
            if (cell.isFlagged()) {
                flaggedCells.add(cell);
            }
        return flaggedCells;
    }

    public static void copyChars(char source[], char destiny[]) {
        for (int i = 0; i < source.length; i++) {
            destiny[i] = source[i];
        }
    }

}

public class ZipAddress {
    // Aqui claramente sabemos que os atributos se tratam de um endereço.
    private String firstName;
    private String code;
    private String city;
}
