package prøveeksamen4;

public class CodeMessage {
    private String plainText;
    private int[] ciphers;
    private String shiftValue;
    public CodeMessage(String plainText, String shiftValue){
        this.plainText = plainText;
        this.shiftValue = shiftValue;
    }

    public int[] getCiphers() {
        return ciphers;
    }

    public String getPlainText() {
        return plainText;
    }

    public String getShiftValue() {
        return shiftValue;
    }
    public void Converter(){
        plainText = plainText.replaceAll("a-zA-Z", " ");
    }
}
