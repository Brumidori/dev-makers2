import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileNio {
    public static void main(String[] args) throws IOException {
        // Copiando um arquivo de um diretório para outro
        BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
        FileWriter writer = new FileWriter("copia/arquivo_copiado.txt");
        String line;
        while ((line = reader.readLine()) != null) {
            writer.write(line + "\n");
        }
        reader.close();
        writer.close();

        // Convertendo todas as letras minúsculas em letras maiúsculas
        reader = new BufferedReader(new FileReader("arquivo.txt"));
        writer = new FileWriter("arquivo_modificado.txt");
        while ((line = reader.readLine()) != null) {
            line = line.toUpperCase();
            writer.write(line + "\n");
        }
        reader.close();
        writer.close();

        // Removendo todas as linhas em branco
        reader = new BufferedReader(new FileReader("arquivo.txt"));
        writer = new FileWriter("arquivo_modificado.txt");
        while ((line = reader.readLine()) != null) {
            if (!line.trim().isEmpty()) {
                writer.write(line + "\n");
            }
        }
        reader.close();
        writer.close();

        // Imprimindo na tela as palavras que começam com uma determinada letra
        reader = new BufferedReader(new FileReader("arquivo.txt"));
        char letra = 'a';
        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (word.startsWith(Character.toString(letra))) {
                    System.out.println(word);
                }
            }
        }
        reader.close();
    }
}
}
