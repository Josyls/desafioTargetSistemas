import java.util.Scanner;

public class inverterString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite uma string: ");
        String inputString = scanner.nextLine();

        String reversedString = inverterString(inputString);
        System.out.println("String Invertida: " + reversedString);
    }

    static String inverterString(String input) {
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            // Troca os caracteres nas posições start e end
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            //Aqui estamos Movendo os índices para o próximo par de caracteres
            start++;
            end--;
        }

        //Aqui nós estamos Criando uma nova string a partir do array de caracteres invertidos
        return new String(charArray);

        
        
    }
}
