package Praktikum.PrakModul3.prak1;

public class Pembalik {
    private Stack stack;
    public Pembalik(int size){
        stack = new Stack(size);
    }

    public String balikKata(String input){
        char[] outpuArray = new char[input.length()];
        int index = 0;

        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);
            stack.push(a);
        }

        while (!stack.isEmpty()){
            char a = stack.pop();
            outpuArray[index++] = a;
        }

        return new String(outpuArray);
    }
}