package dataStructures.stack.basedOnArray.bracketsTask;

public class BracketChecker {
    private String line;                          // входная строка
    public BracketChecker(String inputLine){      // конструктор
        line=inputLine;
    }
    public void check(){
        int size = line.length();                 // определение размера стека
        StackZ theStack = new StackZ(size);       // создание стека
        for(int i=0;i<size;i++){                  // последовательное чтение
            char ch = line.charAt(i);             // чтение символа
            switch(ch){
                case '{':                         // открывающие скобки
                case '(':
                case '[':
                    theStack.push(ch);            // занести в стек
                    break;
                case '}':                         // закрывающие скобки
                case ')':
                case ']':
                    if(!theStack.isEmpty()){      // если стек не пуст
                        char chx=theStack.pop();
                        if((ch=='}'&&chx!='{')||(ch==')'&&chx!='(')||(ch==']'&&chx!='['))
                            System.out.println("Error: "+ch+" at "+i);
                    }
                    else                          // преждевременная нехватка элементов
                        System.out.println("Error: "+ch+" at "+i);
                    break;
                default:                          // для других символов действия не выполяняются
                    break;
            }
        }
        // в этой точке все символы обработаны
        if(!theStack.isEmpty())
            System.out.println("Error: missimg right delimiter");
    }
}
