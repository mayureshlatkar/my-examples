public class CmdArgs{
    public static void main(String[] args){
        int len = args.length;
        if(len > 0){
            for(String s : args){
                System.out.println("arguements are :" + s);
            }
        }
        else{
            System.out.println(" no arguements provided ");
        }
    }
}