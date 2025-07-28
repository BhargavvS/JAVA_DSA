package stack;

public class DynamicStack extends CustomStack{
    DynamicStack(){
        super();
    }
    DynamicStack(int size){
        super(size);
    }


    public void push(int item) {
        if(this.isFull()){
            int[] temp = new int[data.length * 2];
            for (int i=0;i<data.length;i++){
                temp[i] = data[i];
            }

            data = temp;
        }

        data[++top] = item;
    }

    public void display(){
        for (int i = 0; i < top; i++) {
            System.out.print(data[i] + "<-");
        }
        System.out.println(data[top]);
    }
}
