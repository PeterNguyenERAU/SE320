import java.util.ArrayList;

//Peter Nguyen SE 320
//Assignment 2 part 1-2

class Main {
    public static void main(String[] args) {
        //2.1
        GenericStack<String> stack = new GenericStack<>();
        stack.push("a");
        System.out.println(stack.toString());
        stack.push("b");
        System.out.println(stack.toString());
        stack.push("c");
        System.out.println(stack.toString());
        stack.push("d");
        System.out.println(stack.toString());
        stack.push("e");
        System.out.println(stack.toString());

        //2.2
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(14);
        list.add(24);
        list.add(14);
        list.add(42);
        list.add(25);
        System.out.println(list);
        ArrayList<Integer> newList = removeDuplicates(list);
        System.out.println(newList);
    }
    
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        ArrayList<E> uniqueList = new ArrayList<E>();
        uniqueList.add(list.get(i)); //add first value

        for(int i=0; i<list.size(); i++){
            int k = 0;
            while(k<i && list.get(i)!=list.get(k)){
                if(k==i-1)
                    uniqueList.add(list.get(i));
                
                k++;
            }
        }
        return uniqueList;
    }

}