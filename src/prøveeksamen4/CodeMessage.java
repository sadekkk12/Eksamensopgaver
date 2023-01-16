package prøveeksamen4;

import java.util.Arrays;

public class CodeMessage {
    private String plainText;
    private int[] ciphers;
    private String shiftvalue;
public CodeMessage(String plainText){
    this.plainText = plainText;
    convertTekst();
}
public int getShiftvalue(String shiftvalue){
    int convertedValue = 0;
    switch (shiftvalue){
        case "A" -> convertedValue = 1;
        case "B" -> convertedValue = 2;
        case "C" -> convertedValue = 3;
        case "D" -> convertedValue = 4;
        case "E" -> convertedValue = 5;
        case "F" -> convertedValue = 6;
        case "G" -> convertedValue = 7;
        case "H" -> convertedValue = 8;
        case "I" -> convertedValue = 9;
        case "J" -> convertedValue = 10;
        case "K" -> convertedValue = 11;
        case "L" -> convertedValue = 12;
        case "M" -> convertedValue = 13;
        case "N" -> convertedValue = 14;
        case "O" -> convertedValue = 15;
        case "P" -> convertedValue = 16;
        case "Q" -> convertedValue = 17;
        case "R" -> convertedValue = 18;
        case "S" -> convertedValue = 19;
        case "T" -> convertedValue = 20;
        case "U" -> convertedValue = 21;
        case "V" -> convertedValue = 22;
        case "W" -> convertedValue = 23;
        case "X" -> convertedValue = 24;
        case "Y" -> convertedValue = 25;
        case "Z" -> convertedValue = 26;
        default -> convertedValue = 0;
    }
    return convertedValue;


}
public void convertTekst(){
    ciphers = new int[plainText.length()];
    for(int i = 0; i < plainText.length(); i++){
    ciphers[i] = getShiftvalue(String.valueOf(plainText.toUpperCase().charAt(i)));                                       // cipers[i] fx 0 i den første, dvs første element i arrayet
    }
}
    public int[] getCiphers() {
        return ciphers;
    }

    public static void main(String[] args) {
        CodeMessage codeMessage1 = new CodeMessage("dsafafasffa");
        System.out.println(Arrays.toString(codeMessage1.getCiphers()));

    }
}

//TODO sort, comparator, CharAt, split, exceptions, set, oprette array med indhold i, forstå hvorfor converter skal stå i constructor også +
// TODO
