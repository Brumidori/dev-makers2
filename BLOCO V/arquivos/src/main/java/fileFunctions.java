import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileFunctions {
    public static void main(String[] args) throws IOException {
        // Contando o número de palavras no arquivo
        BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
        String line;
        int wordCount = 0;
        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+");
            wordCount += words.length;
        }
        reader.close();
        System.out.println("Número de palavras: " + wordCount);

        // Contando o número de linhas no arquivo
        reader = new BufferedReader(new FileReader("arquivo.txt"));
        int lineCount = 0;
        while (reader.readLine() != null) {
            lineCount++;
        }
        reader.close();
        System.out.println("Número de linhas: " + lineCount);

        // Substituindo todas as ocorrências de uma determinada palavra por outra
        String palavraAntiga = "maçã";
        String palavraNova = "banana";
        reader = new BufferedReader(new FileReader("arquivo.txt"));
        FileWriter writer = new FileWriter("arquivo_modificado.txt");
        while ((line = reader.readLine()) != null) {
            line = line.replaceAll(palavraAntiga, palavraNova);
            writer.write(line + "\n");
        }
        reader.close();
        writer.close();
    }
}
