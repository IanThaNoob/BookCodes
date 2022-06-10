public class Main {
    public static void main(String[] args) {
        int int;//doesn't compile
        Int int;//doesn't compile even if Int class existed
        int Int;//perfectly fine
        int
                Int;//perfectly find, since Java ignores whitespace*/
        int Seth;//declaration statement
        Seth = 240;//expression statement, assignment
        if(Seth == 240) System.out.println("Good");//control-flow statement
        ;;;;;;;;;;;;;;;;;;//null statement
        int Seth = 62, Ian = 162;//comma-separated statement
        Seth
                =
                Seth
                +
                        30
        ;//Java ignores whitespace, so this works
        while(Seth < 240)Seth++;//control-flow and expression statements
        System.out.println("Hello, World!");//expression statement
        System.out.println("Hello, World!")//expression, compile-error when standalone
        {
            String insideBlock = "Existing inside block.";
            System.out.println(insideBlock);
        }
        //after the code exits the block, the declared variables are inaccessible and garbage collected
        System.out.println(insideBlock);//Compile-time error as variable doesn't exist
    }
}