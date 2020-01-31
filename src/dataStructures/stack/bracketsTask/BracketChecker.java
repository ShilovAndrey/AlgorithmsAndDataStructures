package dataStructures.stack.bracketsTask;

public class BracketChecker {
    private String line;
    public BracketChecker(String inputLine){
        line=inputLine;
    }
    public void check(){
        int size = line.length();
        StackZ theStack = new StackZ(size);
        for(int i=0;i<size;i++){
            char ch = line.charAt(i);
            switch(ch){
                case '{':
                case '(':
                case '[':
                    theStack.push(ch);
                    break;
                case '}':
                case ')':
                case ']':
                    if(!theStack.isEmpty()){
                        char chx=theStack.pop();
                        if((ch=='}'&&chx!='{')||(ch==')'&&chx!='(')||(ch==']'&&chx!='['))
                            System.out.println("Error: "+ch+" at "+i);
                    }
                    else
                        System.out.println("Error: "+ch+" at "+i);
                    break;
                default:
                    break;
            }
        }
        if(!theStack.isEmpty())
            System.out.println("Error: missimg right delimiter");
    }
}
