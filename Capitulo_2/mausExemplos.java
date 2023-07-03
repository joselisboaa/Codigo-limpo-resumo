
public class MausExemplosDoCapitulo2 {
    // Pode-se reparar que ao ler essa variável dificilmente saberemos do que ela se trata, há esforço significativo para tentar entendê-la
    private int d;

    // Aqui podemos reparar que essa função pode se tratar de qualquer coisa, não há nada que dê significado a ela.
    public List<int[]> getThem() {
        List<int[]> list1 = new ArrayList<int[]>();

        for(int[] x : theList)
            if (x[0] == 4) {
                list1.add(x);
            }
        return list1;
    }

    // Veja que essas duas variáveis tem nomes bastantes parecidos, sendo difícil de diferenciá-los.
    private produtoMarcadoEmEstoqueForaDaValidadeComDesconto;
    private produtoMarcadoEmEstoqueDentroDaValidadeComDesconto;

    public static void copyChars(char a1[], char a2[]) {
        for (int i = 0; i < a1.length; i++) {
            a2[i] = a1[i];
        }
    }
}

// Pode-se verificar que caso não tivesse o pré-fixo address nos atributos o significado dos mesmos seriam confudidos, adicionando
// um nome significativo à classe excluiriamos esse pré-fixo assim economizando caracteres e mantendo a boa leitura da classe.
public class User {
    private String addressName;
    private String addressZipCode;
    private String addressCity;
}